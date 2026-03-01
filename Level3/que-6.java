//que 1
import java.util.Scanner;
class leap_year{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Year");
		int year=sc.nextInt();
		if (year>=1582){
			if(year%4==0){
				System.out.println(year+" is a Leap Year");
			}else{
				System.out.println(year+" is not a Leap Year");
			}
		}else{
			System.out.println(year+" is not in correspondence with Gregorian Calander");
		}
	}
}