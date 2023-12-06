package JavaProgramPractice;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int x= 6;
		int y= 7;
		int temp ;
		
		System.out.println("Before swapping");
		System.out.println("x value is :"+x);
		System.out.println("y value is :"+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After swapping");
		System.out.println("x value is :"+x);
		System.out.println("y value is :"+y);
		

	}

}
