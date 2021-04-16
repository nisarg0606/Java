package MethodOverriding;

public class Test {
    public static void main(String[] args) {
        AxisBank axisBank = new AxisBank();
        System.out.println("AxisBank-GetRtofIntrst - " + axisBank.getRtofIntrst());
        SbiBank sbiBank = new SbiBank();
        System.out.println("SbiBank-GetRtofIntrst - " + sbiBank.getRtofIntrst());

        BobBank bobBank = new BobBank();
        System.out.println("BobBank-GetRtofIntrst - " + bobBank.getRtofIntrst());
    }
}