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
        // if the other dragon is a red dragon, then attack by 120% of normal
        if (obOther instanceof RedDragon) {
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
        // if the other dragron is a white dragon, then attack by 90% of normal
        else if (obOther instanceof WhiteDragon) {
            switch (obOther.nSize) {
                case SMALL:
                    obOther.nHitPoints -= (int) (Math.random() * 9 + 1);
                    break;
                case MEDIUM:
                    obOther.nHitPoints -= (int) (Math.random() * 13 + 1);
                    break;
                case LARGE:
                    obOther.nHitPoints -= (int) (Math.random() * 17 + 1);
                    break;
            }
        } else {
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
        return "GreenDragon [nHitPoints=" + nHitPoints + ", nSize=" + nSize + ", sName=" + sName + "]";
    }
}
