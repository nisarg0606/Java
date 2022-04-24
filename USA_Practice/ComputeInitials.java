package USA_Practice;

public class ComputeInitials {
    public static void main(String[] args) {
        String myName = "quick brown fox climbs the wall faster";
        // Quick Brown Fox Climbs The Wall Faster
        String myInitials = new String();
        String newName = new String();
        String tempString[] = myName.split(" ");
        for (String string : tempString) {
            String temp = string.toString();
            int lengh = temp.length();
            myInitials = myInitials + temp.substring(0, 1).toUpperCase();
            newName = newName + temp.substring( 0, 1).toUpperCase() + temp.substring(1, lengh) + " ";
        }
        // int length = myName.length();
        // StringBuffer myInitials = new StringBuffer();
        // for (int i = 0; i < length; i++) {
        // if (Character.isUpperCase(myName.charAt(i))) {
        // myInitials.append(myName.charAt(i));
        // }
        // }
        System.out.println("My Name is :" + myName);
        System.out.println("My initials are: " + myInitials);
        System.out.println(newName);
        // Reyaansh a e i o u
        // output --> 3
    }
}