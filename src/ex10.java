import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("숫자 1 : ");
		int a1 = input.nextInt();
		
		System.out.println(("숫자 2 : "));
		int a2 = input.nextInt();
		
		System.out.println("합계 : "+(a1+a2));
		System.out.println("평균 : "+(a1+a2)/2);
		
	}

}
