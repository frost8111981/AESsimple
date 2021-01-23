package frost;
import java.util.Scanner;

public class Crypt {
    String input;
    Crypt(String input){
        this.input = input;
    }

    public static String decrypt(String input){
        Scanner scan = new Scanner(System.in);
        input = scan.nextLine();
        for (char symbol : input.toCharArray()) {
            if (symbol != ' ') {
                symbol = (char) (symbol - 3);
            }
            System.out.print(symbol);
        }
        return input;
    }

    public static String encrypt(String input){
        for (char symbol : input.toCharArray()) {
            if (symbol != ' ') {
                symbol = (char) (symbol + 3);
            }
            System.out.print(symbol);
        }
        return input;
    }
}
