package RahulSir;

public class StringComparision {
	public static void main(String[] args) {
		String name1 = "Nisarg";
		String name2 = "Shah";
		String name3 = "Nisarg";
		String name4 = name1 + "Shah";
		String name5 = name2;

		System.out.println("Name1 : " + name1 + " - " + name1.hashCode());
		System.out.println("Name2 : " + name2 + " - " + name2.hashCode());
		System.out.println("Name3 : " + name3 + " - " + name3.hashCode());
		System.out.println("Name4 : " + name4 + " - " + name4.hashCode());
		System.out.println("Name5 : " + name5 + " - " + name5.hashCode());
		System.out.println("name1==name2 - " + (name1 == name2));
		System.out.println("name1==name3 - " + (name1 == name3));

		String name11 = new String("Nisarg");
		String name22 = new String("Shah");
		String name33 = new String("Nisarg");
		System.out.println("Eqquals: ");
		System.out.println(name11.equals(name33));
		System.out.println(name22.equals(name33));

		System.out.println("Reference:");
		System.out.println(name11 == name22);
		System.out.println(name11 == name33);

	}
}