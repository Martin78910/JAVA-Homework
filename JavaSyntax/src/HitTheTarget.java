import java.util.Scanner;

public class HitTheTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <= 20 ; j++) {
                if ( i + j == target){
                    System.out.printf("%d + %d = %d\r\n", i, j, target);
                }
                if (i - j == target) {
                    System.out.printf("%d - %d = %d\r\n", i, j, target);
                }
            }
        }
	}

}
