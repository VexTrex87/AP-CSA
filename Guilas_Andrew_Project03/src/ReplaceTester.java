
public class ReplaceTester {

	public static void main(String[] args) {
		String originalWord = "Mississippi";
		String modifiedWord = originalWord.replace("i", "!").replace("s", "$");
		
		System.out.println("Original: " + originalWord);
		System.out.println("Modified: " + modifiedWord);
	}

}
