package quetion1;
import java.util.Scanner;
public class NumOfOccur {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] sequence = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sequence[i] = Integer.parseInt(numbers[i]);
        }
        System.out.print("Enter the target number: ");
        int target=scanner.nextInt();
        int count=0;
        for(int num:sequence){
            if(num==target){
                count++;
            }

        }
        System.out.println("The target number occured "+ count+" times ");
    }
}
