package Practice;

public class HelloWorld {
    public static void main(String[] args) {
        String a = "apple";
        StringBuilder stringBuildera = new StringBuilder(a);
        String b = "mango";
        StringBuilder stringBuilderb = new StringBuilder(b);
        StringBuilder c = new StringBuilder();
        int flag = 1;
        while (flag != 0) {
            try {
                if (stringBuildera.charAt(0) - stringBuilderb.charAt(0) > 0) {
                    c.append(stringBuilderb.charAt(0));
                    stringBuilderb.deleteCharAt(0);
                } else {
                    c.append(stringBuildera.charAt(0));
                    stringBuildera.deleteCharAt(0);
                }
                System.out.println(stringBuildera);
                System.out.println(stringBuilderb);
            } catch (IndexOutOfBoundsException e) {
                flag = 0;
            }
        }
        if (stringBuildera.length() > stringBuilderb.length()) {
            c.append(stringBuildera);
        } else {
            c.append(stringBuilderb);
        }
        System.out.println(c);
    }
}