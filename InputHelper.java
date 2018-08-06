import java.util.Scanner;

public class InputHelper {
    public static int readNumber(String prompt){
        System.out.print(prompt);
        Scanner inputScanner = new Scanner(System.in);
        return inputScanner.nextInt();
    }
}