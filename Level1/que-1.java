//que 1
import java.util.Scanner;
class multiple_of_5 {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("number");
		int no =sc.nextInt();
		if(no%5==0){
			System.out.println("The number "+no+" divisible by 5");
		}
		else{
			System.out.println("he number "+no+" not divisible by 5");
		}
	}
}