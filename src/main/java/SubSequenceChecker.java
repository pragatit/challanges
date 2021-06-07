import java.util.Scanner;

public class SubSequenceChecker {

    public boolean checkImpact(String virusComposition, String bloodComposition) {

        if(bloodComposition.length() > virusComposition.length()) return false;

        char[] vca = virusComposition.toCharArray();
        char[] bca = bloodComposition.toCharArray();

        int bclength = bca.length;
        int current = 0 ;

        for (char vcd: vca) {
            if(vcd == bca[current]) current++;
            if(current == bclength) return true;
        }

        return false;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String virusComposition = scanner.next();
        int numberOfPeople = scanner.nextInt();
        String[] bloodCompositionArray = new String[numberOfPeople];
        for(int i = 0; i < numberOfPeople; i++){
            bloodCompositionArray[i] = scanner.next();
        }
        scanner.close();

        SubSequenceChecker subSequenceChecker = new SubSequenceChecker();

        for (String bc: bloodCompositionArray) {
            if(subSequenceChecker.checkImpact(virusComposition, bc)){
                System.out.println("POSITIVE");
            }else{
                System.out.println("NEGATIVE");
            }
        }

    }
}
