//que 3
import java.util.Scanner;
class largest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Number 1:");
		int no1=sc.nextInt();
		System.out.println("Number 2:");
		int no2=sc.nextInt();
		System.out.println("Number 3:");
		int no3=sc.nextInt();
		if(no1==no2 || no1==no3 || no2==no3){
			System.out.println("repeating numbers detected!");
		}else if(no1>no2){
			if(no1>no3){
				System.out.println("the first number the largest "+no1);
			}else{
				System.out.println("the third number the largest "+no3);
			}
		}
		else{
			if(no2>no3){
				System.out.println("the second number the largest "+no2);
			}else{
				System.out.println("the third number the largest "+no3);
			}
		}
	}
}