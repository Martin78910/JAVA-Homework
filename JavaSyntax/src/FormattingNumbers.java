import java.util.Scanner;

public class FormattingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = input.nextDouble();
        double c = input.nextDouble();
        String binary = Integer.toString(a,2);
 
        System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|",
                a, Integer.parseInt(binary), b, c);
	}

}
