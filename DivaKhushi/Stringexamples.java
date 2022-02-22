package DivaKhushi;

public class Stringexamples {
    public static void main(String[] args) {
        String str[] = {"Khushi Sheth", "Tejas Shah", "Diva Patel", "Shlok Sheth", "Laxit Shah",
         "Dhyani Sheth"};
        String surname = "Sheth";
        int surnamelen = surname.length();
        int size = str.length;

        for(int j = 0; j < size; j++){
            int namelength = str[j].length();
            String subStr = str[j].substring(namelength - surnamelen);

            if(subStr.equals(surname)) // Sheth = Sheth -> == & .equals() same??????
            {
                System.out.println(str[j]);
            }
        }
    }
}
