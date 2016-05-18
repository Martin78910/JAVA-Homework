import java.util.Scanner;

public class ConvertFromDecimalSystemToBaseSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int number = input.nextInt();
 
        String baseSevenNumber = Integer.toString(number, 7);
        System.out.println(baseSevenNumber);
	}

}
