package Mihir;

public class Executive extends StoreKossCoMembership{
    public String name;
    public String age;
    public int initialPoints = 1000;
    public int finalPoints = 0;
    // constructor
    Executive(String name, String age) {
        this.name = name;
        this.age = age;
    }
    // points calculator method
    void PointsCalculation(double cost, String purchaseOrReturn) {
        if ("Purchase".equalsIgnoreCase(purchaseOrReturn)) {
            finalPoints = (int) (initialPoints + 1.5 * cost);
            initialPoints = finalPoints;
            System.out.println("Your New point balance is " + initialPoints);
        }

        else if ("return".equalsIgnoreCase(purchaseOrReturn)) {
            finalPoints = (int) (initialPoints - 1.5 * cost);
            initialPoints = finalPoints;
            System.out.println("Your New point balance is " + initialPoints);
        }
    }

    // redeem calculator method

    double PointsReedeem(int points) {
        return (.01) * points;
    }

    // welcome message method

    void welcomeMessage() {
        System.out.println("Congrats! You are Now a Executive member of KossCo!");
        System.out.println("Your Points balance is " + initialPoints);
    }
    // choiceGiver method

    void choices() {

        System.out.println("1-Purchase");

        System.out.println("2-return");

        System.out.println("3. Redeem");

        System.out.println("4.-Different New Member");

    }
}
