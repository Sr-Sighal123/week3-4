//que 2
import java.util.Scanner;
class bonus{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double total;
		System.out.println("Salary");
		int sal=sc.nextInt();
		System.out.println("Years of service");
		int year=sc.nextInt();
		if (year>5){
			total=sal+(sal*0.05);
		}else{
			total=sal;
		}
		System.out.println("You have worked here for "+year+" yrs. So, you will get "+total);
	}
}