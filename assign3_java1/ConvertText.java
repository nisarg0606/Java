package assign3_java1;

public class ConvertText {
    private String text;
    private char replacementForVowels;
    private char replacementForSymbols;

    public ConvertText(String text) {
        this.text = text;
        this.replacementForVowels = '$';
        this.replacementForSymbols = '%';
    }

    public ConvertText(String text, char replacementForVowels, char replacementForSymbols) {
        this.text = text;
        this.replacementForVowels = replacementForVowels;
        this.replacementForSymbols = replacementForSymbols;
    }

    private String replaceWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    sb.append(replacementForVowels);
                } else {
                    sb.append(c);
                }
            } else {
                sb.append(replacementForSymbols);
            }
        }
        return sb.toString();
    }

    public String replaceText() {
        StringBuilder sb = new StringBuilder();
        String[] words = text.split("\\s+");
        for (String word : words) {
            sb.append(replaceWord(word));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public String toString() {
        return text + "\n" + replaceText();
    }

    public static void main(String[] args) {
        ConvertText ct = new ConvertText("Hello, world! I am a student.");
        System.out.println(ct);
        ct = new ConvertText("Hello, world! I am a student.", '#', '*');
        System.out.println(ct);
    }
}
