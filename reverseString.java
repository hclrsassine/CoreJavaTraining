public class reverseString {
    public static void main(String[] args) {
        String word = "Rachid";
        String currWord = "";
        char wordChar;
        System.out.println("Unreversed word: " + word);

        for(int i = 0;i < word.length();i++)
        {
            wordChar = word.charAt(i);
            currWord = wordChar + currWord;
        }

        System.out.println("Reversed Word : " + currWord);
    }
}
