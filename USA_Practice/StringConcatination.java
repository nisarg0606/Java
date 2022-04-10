package USA_Practice;

public class StringConcatination {
    public static void main(String[] args) {
        String hi = "Hi, ";
        String mom = "mom.";
        System.out.println(hi.concat(mom));
        StringBuffer stringBuffer = new StringBuffer(hi);
        stringBuffer.append(mom);
        System.out.println(stringBuffer);
        String concatString = hi + mom;
        System.out.println(concatString);
    }
}
