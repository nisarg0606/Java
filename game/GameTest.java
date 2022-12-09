package game;

public class GameTest {
    /*
     *  Create an Array to hold 36 Dragons
     *  Generate 3 sample Dragons for each Dragon color/size and place them in the
     * array.
     * For example, you will generate 3 small Green Dragons, 3 medium Green Dragons,
     * etc.
     *  Have the Dragons battle each (every Dragon must face every other dragon) by
     * calling the method battleRound repeatedly with different dragons. You must
     * track how well each of the dragons does.
     *  After each battle round reset the called dragon’s hit points by calling
     * their resurrect method.
     *  After all the fights are over, Rank the dragons in terms of how many fights
     * they have won.
     *  Sort the array with the dragons that have won the most
     *  Print this array out.
     * 
     */

    public static void main(String[] args) {
        Dragon[] obDragons = new Dragon[36];
        for (int i = 0; i < 36; i++) {
            if (i < 3) {
                obDragons[i] = new GreenDragon("Small-Green " + i, DragonSize.SMALL);
            } else if (i < 6) {
                obDragons[i] = new GreenDragon("Medium-Green" + i, DragonSize.MEDIUM);
            } else if (i < 9) {
                obDragons[i] = new GreenDragon("Large-Green" + i, DragonSize.LARGE);
            } else if (i < 12) {
                obDragons[i] = new RedDragon("Small-Red" + i, DragonSize.SMALL);
            } else if (i < 15) {
                obDragons[i] = new RedDragon("Medium-Red" + i, DragonSize.MEDIUM);
            } else if (i < 18) {
                obDragons[i] = new RedDragon("Large-Red" + i, DragonSize.LARGE);
            } else if (i < 21) {
                obDragons[i] = new WhiteDragon("Small-White" + i, DragonSize.SMALL);
            } else if (i < 24) {
                obDragons[i] = new WhiteDragon("Medium-White" + i, DragonSize.MEDIUM);
            } else if (i < 27) {
                obDragons[i] = new WhiteDragon("Large-White" + i, DragonSize.LARGE);
            } else if (i < 30) {
                obDragons[i] = new BlackDragon("Small-Black" + i, DragonSize.SMALL);
            } else if (i < 33) {
                obDragons[i] = new BlackDragon("Medium-Black" + i, DragonSize.MEDIUM);
            } else if (i < 36) {
                obDragons[i] = new BlackDragon("Large-Black" + i, DragonSize.LARGE);
            }
        }

        for (int i = 0; i < 36; i++) {
            for (int j = 0; j < 36; j++) {
                if (i != j) {
                    Dragon obWinner = battleRound(obDragons[i], obDragons[j]);
                    if (obWinner == obDragons[i]) {
                        obDragons[i].nWins++;
                    } else if (obWinner == obDragons[j]) {
                        obDragons[j].nWins++;
                    }
                    obDragons[i].resurrect();
                    obDragons[j].resurrect();
                }
            }
        }

        for (int i = 0; i < 36; i++) {
            for (int j = 0; j < 36; j++) {
                if (obDragons[i].nWins > obDragons[j].nWins) {
                    Dragon obTemp = obDragons[i];
                    obDragons[i] = obDragons[j];
                    obDragons[j] = obTemp;
                }
            }
        }

        for (int i = 0; i < 36; i++) {
            System.out.println(obDragons[i].toString());
        }

    }

    public static Dragon battleRound(Dragon obDragon1, Dragon obDragon2) {
        /*
         * This method will simulate the dragons fighting against each other using a
         * turn-based approach. Essentially dragons fight over several turns until one
         * of the Dragons is killed. Each of the turns will follow this pattern:
         */
        //  The dragon with the higher initiative will go first (if same initiative,
        // select one randomly).
        //  The first dragon will attack the other by calling the doAttack method for
        // the other dragon. This attack method is described else-where but will have
        // the effect of reducing the attacked dragon’s hit points by a certain amount.
        // If the attacked dragon is killed, then the game is over and a Reference to
        // the winning dragon returned.
        //  The second dragon will than attack the other using the same procedure as
        // just described.
        //  This will repeat for each dragon if they can still attack that turn. Small
        // dragons can attack up to 3 times per turn while large dragons can attack only
        // once. So, if we have a small green dragon (3 attacks per turn, high
        // initiative) fighting a large red dragon (1 attack per turn, low initiative)
        // the turn cycle would be (Green Attacks, Red Attacks, Green Attacks, Green
        // Attacks).
        //  The turn cycle as described above repeats until one of the dragons is
        // killed.

        while (obDragon1.nHitPoints > 0 && obDragon2.nHitPoints > 0) {
            if (obDragon1.nInitiative > obDragon2.nInitiative) {
                obDragon1.doAttack(obDragon2);
                obDragon2.doAttack(obDragon1);
            } else if (obDragon1.nInitiative < obDragon2.nInitiative) {
                obDragon2.doAttack(obDragon1);
                obDragon1.doAttack(obDragon2);
            } else {
                if (Math.random() > 0.5) {
                    obDragon1.doAttack(obDragon2);
                    obDragon2.doAttack(obDragon1);
                } else {
                    obDragon2.doAttack(obDragon1);
                    obDragon1.doAttack(obDragon2);
                }
            }
        }

        if (obDragon1.nHitPoints > 0) {
            return obDragon1;
        } else {
            return obDragon2;
        }

    }
}
