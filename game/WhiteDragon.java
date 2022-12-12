package game;

public class WhiteDragon extends Dragon {
    /*
     * White dragons are effective against green dragons but are at a disadvantage
     * when fighting red dragons.
     */
    String sName;
    DragonSize nSize;

    WhiteDragon(String sName, DragonSize nSize) {
        this.sName = sName;
        this.nSize = nSize;
    }

    @Override
    public void doAttack(Dragon obOther) {
        // if the other dragon is a green dragon, then attack by 110% of normal
        if (obOther instanceof GreenDragon) {
            switch (obOther.nSize) {
                case SMALL:
                    obOther.nHitPoints -= (int) (Math.random() * 11 + 1);
                    break;
                case MEDIUM:
                    obOther.nHitPoints -= (int) (Math.random() * 16 + 1);
                    break;
                case LARGE:
                    obOther.nHitPoints -= (int) (Math.random() * 21 + 1);
                    break;
            }
        }
        // if the other dragon is a red dragon, then attack by 80% of normal
        else if (obOther instanceof RedDragon) {
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
        return "WhiteDragon [nHitPoints=" + nHitPoints + ", nSize=" + nSize + ", sName=" + sName + "]";
    }
}