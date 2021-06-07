import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxDifferenceCalculator {

     public List<Integer> getPrimeNumbers(int minimum, int maximum){
         List<Integer> primeNumbers = new ArrayList<Integer>();
         for(int i = minimum; i <= maximum; i++){
             if(i <= 3){
                 primeNumbers.add(i);
             }else if(i % 2 != 0){
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

     public int maxDifference(List<Integer> primeNumbers){
         if(primeNumbers.size() == 0){
             return -1;
         }else {
             return primeNumbers.get(primeNumbers.size() -1 ) - primeNumbers.get(0);
         }
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberTestCase = scanner.nextInt();
        int[][] rangeArr = new int[numberTestCase][2];
        for (int i = 0; i < numberTestCase; i++) {
            rangeArr[i][0] = scanner.nextInt();
            rangeArr[i][1] = scanner.nextInt();
        }
        scanner.close();

        MaxDifferenceCalculator maxDifferenceCalculator = new MaxDifferenceCalculator();

        for (int[] range: rangeArr) {
            System.out.println(maxDifferenceCalculator.maxDifference(
                    maxDifferenceCalculator.getPrimeNumbers(range[0], range[1])));
        }
    }
}