package RahulSir;

public class StringLiteralNewKeyword {
    public static void main(String[] args) {
        String name1 = "royal";
        String name2 = "royal";
        String name3 = new String("royal");
        String name4 = new String("royal").intern();

        System.out.println("name1.hashCode() - " + name1.hashCode());
        System.out.println("name2.hashCode() - " + name1.hashCode());
        System.out.println("name3.hashCode() - " + name1.hashCode());
        System.out.println("name4.hashCode() - " + name1.hashCode());

        System.out.println("(name1.equals(name2)) value---> " + (name1.equals(name2)));
        System.out.println("(name1 == name2) reference---> " + (name1 == name2));

        System.out.println("(name1.equals(name3)) value---> " + (name1.equals(name3)));
        System.out.println("(name1 == name3) reference---> " + (name1 == name3));

        System.out.println("name1==name4 - " + (name1 == name4));
    }
}