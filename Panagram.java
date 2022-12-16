public class Panagram {
    public static void main(String[] args) {
        Panagram p = new Panagram();
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPanagram = p.checkPanagram(sentence);
        System.out.println("isPanagram = " + isPanagram);
    }

    public boolean checkPanagram(String sentence) {
        sentence = sentence.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (sentence.indexOf(c) < 0)
                return false;
        }
        return true;
        //time complexity: O(n)
        //space complexity: O(1)
    }
}
