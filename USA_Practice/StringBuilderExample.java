package USA_Practice;
// synonized / Thread Safe
public class StringBuilderExample {
    public static void main(String[] args) {
        String s = "I Love Java";
        StringBuilder br = new StringBuilder(s);
        StringBuffer bf = new StringBuffer(s);
        br.append(".Thats why I am learning string Builder");
        bf.append(". bla bla bla");
        br.deleteCharAt(11);
        bf.deleteCharAt(11);
        System.out.println(bf);
        // sb.compareTo(s);
        // let's take 2 strings. Let it be apple mango
        /*
            String a = "apple";
            String b = "mango";
            String c = "";
            then create stringbuffer/builder
            1) a - m = a ----> a - pple                 b - mango
            2) p - m = m ----> a - pple                 b - ango
            3) p - a = a ----> a - pple                 b - ngo
            4) p - n = n ----> a - pple                 b - go
            5) p - g = g ----> a - pple                 b = o
            6) p - o = o ----> a - pple                 b = 
            Final Output ->                c - amango
        */
    }
}