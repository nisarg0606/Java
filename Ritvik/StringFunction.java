package Ritvik;

public class StringFunction {
    public static void main(String[] args) {
        String name = "Ritvik";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(2));
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 6));
        System.out.println(name.contains("a"));
        String surname = "Kannan";
        System.out.println(surname);
        String fullname = String.join(",", name, surname);
        System.out.println(fullname);

        String date = String.join("/", "22", "3", "2022");
        String time = String.join(":", "7", "15", "10");
        System.out.println(date + " " + time);
        System.out.println(name.replaceFirst("i", "a"));
        System.out.println(name.replace("a", "i"));
        System.out.println(name.replaceAll("i", "a"));

        System.out.println(name.indexOf("t"));
    }
}
