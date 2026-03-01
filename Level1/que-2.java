//que2
import java.util.Scanner;
class fst_smallest{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("1st number");
		int no1=sc.nextInt();
		System.out.println("2nd number");
		int no2=sc.nextInt();
		System.out.println("3rd number");
		int no3=sc.nextInt();
		if(no1==no2 || no1==no3){
			System.out.println("the first number is repeated "+no1);
		}
		else if (no1<no2){
			if(no1<no3){
				System.out.println("the first number the smallest "+no1);
			}else{
				System.out.println("the third number the smallest "+no3);
			}
		}else{
			System.out.println("the first number is not the smallest "+no1);
		}
	}
}