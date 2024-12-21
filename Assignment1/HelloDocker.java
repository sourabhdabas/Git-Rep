import java.util.Scanner;
public class HelloDocker{
	public static void main(String []args){
		System.out.println("Hello Docker!!!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number 1:");
		int num1 = sc.nextInt();
		System.out.println("Enter your number 2:");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("Number 1 is "+num1);
		System.out.println("Sum of two number is = "+sum);
		sc.close();
		
	}
}
