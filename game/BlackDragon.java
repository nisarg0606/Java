package game;

public class BlackDragon extends Dragon {
    /*
     * Black dragons are magical. Black dragons attack other dragons with 100% of
     * their attack capability but are curiously weak against white dragons, who
     * they can only attack with 75% of their attack ranking.
     */
    String sName;
    DragonSize nSize;

    BlackDragon(String sName, DragonSize nSize) {
        this.sName = sName;
        this.nSize = nSize;
    }

    @Override
    public void doAttack(Dragon obOther) {
        // if the other dragon is a white dragon, then attack by 75% of normal
        if (obOther instanceof WhiteDragon) {
            switch (obOther.nSize) {
                case SMALL:
                    obOther.nHitPoints -= (int) (Math.random() * 7 + 1);
                    break;
                case MEDIUM:
                    obOther.nHitPoints -= (int) (Math.random() * 10 + 1);
                    break;
                case LARGE:
                    obOther.nHitPoints -= (int) (Math.random() * 13 + 1);
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
        return "BlackDragon [nHitPoints=" + nHitPoints + ", nSize=" + nSize + ", sName=" + sName + "]";
    }
}
