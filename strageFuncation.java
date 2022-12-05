public class strageFuncation {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            if( i == 1)
                continue;
            else if(i % 2 != 0)
                System.out.println(i);
        }
    }
}
