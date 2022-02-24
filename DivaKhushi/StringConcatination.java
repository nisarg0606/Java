package DivaKhushi;

public class StringConcatination {
    public static void main(String[] args) {
        String s = "Khushi" + " Sheth ";
        // String s = (new StringBuilder()).append("Khushi").append("
        // Sheth").toString();
        System.out.println(s);
        // String to int ---> String s= 80;
        // int a = (Integer)s;
        String s1 = "Sachin";
        String s2 = " Tendulkar";

        String s3 = s1.concat(s2);
        System.out.println(s3);

        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder(" World");

        // System.out.println("Sb1: "+sb1);
        // StringBuilder sb = sb1.append(sb2);
        // System.out.println("Sb2: "+sb2);
        // System.out.println("Sb1: "+sb1);

        // System.out.println(sb);

        // String str = String.format("%s", sb1);

        // System.out.println(str);

        String str = String.join("Khushi ", sb1, sb2);

        System.out.println(str);
    }
}