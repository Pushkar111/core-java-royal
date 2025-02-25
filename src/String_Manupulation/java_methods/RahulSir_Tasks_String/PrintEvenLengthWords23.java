package String_Manupulation.java_methods.RahulSir_Tasks_String;

public class PrintEvenLengthWords23 {

	public static void PrintEvenLengthWords(String str) {
		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (word.length() % 2 == 0) {
				System.out.println(word);
			}
		}
	}

	public static void main(String[] args) {
		String str = "I am a Java Developer";

		PrintEvenLengthWords(str);
	}
}
