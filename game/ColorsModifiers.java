package game;

public class ColorsModifiers {
    /*
     * The following table illustrates how you modify the attack ranking of various
     * dragons based upon the color of the dragon. Suppose you have a Green Dragon
     * attacking a Red Dragon. The green will attack with 120% of its normal attack
     * rating. As another example consider you have a Black dragon attacking a white
     * dragon; it will only attack with 75% of its attack rating.
     * Defend/Attack Red Green White Black
     * Red 100% 80% 120% 100%
     * Green 120% 100% 90% 100%
     * White 80% 110% 100% 100%
     * Black 100% 100% 75% 100%
     * 
     */
    public static final int RED = 0;
    public static final int GREEN = 1;
    public static final int WHITE = 2;
    public static final int BLACK = 3;
    public static final int[][] ATTACK_MODIFIERS = {
            {100, 80, 120, 100},
            {120, 100, 90, 100},
            {80, 110, 100, 100},
            {100, 100, 75, 100}
    };

    public static final int[][] DEFEND_MODIFIERS = {
            {100, 120, 80, 100},
            {90, 100, 110, 100},
            {120, 80, 100, 100},
            {100, 100, 75, 100}
    };

    public static int getAttackModifier(int nColor, int nOtherColor) {
        return ATTACK_MODIFIERS[nColor][nOtherColor];
    }

    public static int getDefendModifier(int nColor, int nOtherColor) {
        return DEFEND_MODIFIERS[nColor][nOtherColor];
    }

    public static String getColorName(int nColor) {
        switch (nColor) {
            case RED:
                return "Red";
            case GREEN:
                return "Green";
            case WHITE:
                return "White";
            case BLACK:
                return "Black";
            default:
                return "Unknown";
        }
    }

    public static int getColor(String sColor) {
        if (sColor.equalsIgnoreCase("red")) {
            return RED;
        } else if (sColor.equalsIgnoreCase("green")) {
            return GREEN;
        } else if (sColor.equalsIgnoreCase("white")) {
            return WHITE;
        } else if (sColor.equalsIgnoreCase("black")) {
            return BLACK;
        } else {
            return -1;
        }
    }

    public static String getAttackModifierName(int nColor, int nOtherColor) {
        int nModifier = getAttackModifier(nColor, nOtherColor);
        if (nModifier == 100) {
            return "Normal";
        } else if (nModifier > 100) {
            return "Superior";
        } else {
            return "Inferior";
        }
    }

    public static String getDefendModifierName(int nColor, int nOtherColor) {
        int nModifier = getDefendModifier(nColor, nOtherColor);
        if (nModifier == 100) {
            return "Normal";
        } else if (nModifier > 100) {
            return "Superior";
        } else {
            return "Inferior";
        }
    }

    
}
