import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RandomizeNumbersFromNToM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = Math.min(n, m); i <= Math.max(n, m) ; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        for (Integer number: numbers){
            System.out.print(number);
            System.out.print(" ");
        }
        System.out.println();
	}

}
