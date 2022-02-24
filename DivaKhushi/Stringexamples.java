package DivaKhushi;

public class Stringexamples {
    public static void main(String[] args) {
        String str[] = {"Khushi Sheth", "Tejas Shah", "Diva Patel", "Shlok Sheth", "Laxit Shah",
         "Dhyani Sheth", "Khushi Shah", "Khushi Makvana"};
        String surname = "Sheth";
        int surnamelen = surname.length();
        System.out.println("Last name is: " + surname);
        for(int j = 0; j < str.length; j++){
            int namelength = str[j].length();
            String subStr = str[j].substring(namelength - surnamelen);

            if(subStr.equals(surname)) // Sheth = Sheth -> == & .equals() same??????
            {
                System.out.println(str[j]);
            }
        }
        String FirstName = "Khushi";
        System.out.println();
        System.out.println("First Name "+ FirstName);
        int firstnamelen = FirstName.length();

        for(int i = 0; i < str.length; i++)
        {
            String subStr = str[i].substring(0, firstnamelen);

            if(subStr.equals(FirstName))
            {
                System.out.println(str[i]);
            }
        }
    }
}
