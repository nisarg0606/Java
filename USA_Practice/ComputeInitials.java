package USA_Practice;

public class ComputeInitials {
    public static void main(String[] args) {
        String myName = "nisarg h shah";
        // Nisarg H Shah
        String myInitials = new String();
        String tempString[] = myName.split(" ");
        for (String string : tempString) {
            String temp = string.toString();
            myInitials =  myInitials +  temp.substring(0, 1).toUpperCase();
        }
        // int length = myName.length();
        // StringBuffer myInitials = new StringBuffer();
        // for (int i = 0; i < length; i++) {
        //     if (Character.isUpperCase(myName.charAt(i))) {
        //         myInitials.append(myName.charAt(i));
        //     }
        // }
        System.out.println("My Name is :" + myName);
        System.out.println("My initials are: " + myInitials);
    }
}