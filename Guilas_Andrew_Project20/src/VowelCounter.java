public class VowelCounter {
    public int count(String word) {
        int vowelCount = 0;

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' ||
                word.charAt(i) == 'e' ||
                word.charAt(i) == 'i' ||
                word.charAt(i) == 'o' ||
                word.charAt(i) == 'u' ||
                word.charAt(i) == 'y'
            ) {
                vowelCount += 1;
            }
        }

        return vowelCount;
    }
}
