import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        char[] digits = Integer.toString(number).toCharArray();
        double sum = 0;
        for (char digit:
             digits) {
            int dg = Character.digit(digit, 10);
            sum+=Math.pow(dg,3);
        }
        System.out.println(sum == number? "True" : "False");
    }
}
