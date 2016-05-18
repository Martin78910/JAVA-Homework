import java.util.Scanner;

public class CovertFromBaseSevenToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		 
        String baseSevenNumber = input.nextLine();
        int number = Integer.valueOf(baseSevenNumber, 7);
        System.out.println(number);
	}

}
