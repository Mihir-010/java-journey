import java.util.Scanner;

public class WordCharCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String text = scanner.nextLine();
        String[] words = text.split(" ");

        System.out.println("\nCharacters : "+text.length());
        System.out.println("\nWords : "+words.length);
    }
}
