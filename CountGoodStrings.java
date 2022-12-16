public class CountGoodStrings {
    public int countGoodStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            boolean isGood = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (!allowed.contains(words[i].substring(j, j + 1))) {
                    isGood = false;
                    break;
                }
            }
            if (isGood)
                count++;
        }
        return count;
        /*
         * time complexity: O(n * m) where n is the number of words and m is the length
         * of each word
         * space complexity: O(1)
         */
    }

    public static void main(String[] args) {
        CountGoodStrings cgs = new CountGoodStrings();
        String allowed = "ab";
        String[] words = { "ad", "bd", "aaab", "baa", "badab" };
        int count = cgs.countGoodStrings(allowed, words);
        System.out.println("count = " + count);
    }
}