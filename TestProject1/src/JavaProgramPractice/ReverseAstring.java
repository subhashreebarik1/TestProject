package JavaProgramPractice;

public class ReverseAstring {

	public static void main(String[] args) {
		String name = "Mama";
		String reverse = "";
		for(int i =name.length()-1;i>=0;i--) {
			reverse = reverse+name.charAt(i);
		}
		System.out.println(reverse);
		}
	}


