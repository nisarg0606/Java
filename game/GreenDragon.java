package game;

public class GreenDragon extends Dragon {
    /*
     * Green dragons are very effective against red dragons but are weak against
     * white Dragons.
     */
    String sName;
    DragonSize nSize;

    GreenDragon(String sName, DragonSize nSize) {
        this.sName = sName;
        this.nSize = nSize;
    }

    @Override
    public void doAttack(Dragon obOther) {
        switch (obOther.nSize) {
            case SMALL:
                obOther.nHitPoints -= (int) (Math.random() * 10 + 1);
                break;
            case MEDIUM:
                obOther.nHitPoints -= (int) (Math.random() * 15 + 1);
                break;
            case LARGE:
                obOther.nHitPoints -= (int) (Math.random() * 20 + 1);
                break;
        }
    }

    @Override
    public void defend(Dragon obOther) {
        switch (obOther.nSize) {
            case SMALL:
                nHitPoints -= (int) (Math.random() * 5 + 1);
                break;
            case MEDIUM:
                nHitPoints -= (int) (Math.random() * 10 + 1);
                break;
            case LARGE:
                nHitPoints -= (int) (Math.random() * 15 + 1);
                break;
        }

    }
}
