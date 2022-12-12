package game;

/*
 * Red dragons are flame based dragons that are very effective 
 * against white (ice) dragons, but not very effective against green dragons (poison). 
 */
public class RedDragon extends Dragon {
    String sName;
    DragonSize nSize;

    RedDragon(String sName, DragonSize nSize) {
        this.sName = sName;
        this.nSize = nSize;
    }


    @Override
    public void doAttack(Dragon obOther) {
        // if the other dragon is a white dragon, then attack by 120% of normal
        if (obOther instanceof WhiteDragon) {
            switch (obOther.nSize) {
                case SMALL:
                    obOther.nHitPoints -= (int) (Math.random() * 12 + 1);
                    break;
                case MEDIUM:
                    obOther.nHitPoints -= (int) (Math.random() * 18 + 1);
                    break;
                case LARGE:
                    obOther.nHitPoints -= (int) (Math.random() * 24 + 1);
                    break;
            }
        }
        // if the other dragon is a green dragon, then attack by 80% of normal
        else if (obOther instanceof GreenDragon) {
            switch (obOther.nSize) {
                case SMALL:
                    obOther.nHitPoints -= (int) (Math.random() * 8 + 1);
                    break;
                case MEDIUM:
                    obOther.nHitPoints -= (int) (Math.random() * 12 + 1);
                    break;
                case LARGE:
                    obOther.nHitPoints -= (int) (Math.random() * 16 + 1);
                    break;
            }
        } 
        else {
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

    @Override
    public String toString() {
        return "RedDragon [nHitPoints=" + nHitPoints + ", nSize=" + nSize + ", sName=" + sName + "]";
    }
}
