import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minimum = scanner.nextInt();
        int maximum = scanner.nextInt();
        scanner.close();

        System.out.println(getPrimeNumbers(minimum, maximum).size());

    }

    public static List<Integer> getPrimeNumbers(int minimum, int maximum){
        List<Integer> primeNumbers = new ArrayList<Integer>();
        for(int i = minimum; i <= maximum; i++){
            if(i > 1 && i <= 3){
                primeNumbers.add(i);
            }else if(i> 3 && i % 2 != 0){
                boolean prime = true;
                for (int j = 2; j * j <= i; ++j) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if(prime)primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
