import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		char name_1 = name.charAt(0);
        //Marks for each student lie in the range 0 to 100 both inclusive
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		int m3 = s.nextInt();
		int avg = (m1+m2+m3)/3;
		System.out.println(name_1);
		System.out.print(avg);
		
		
		
	}

}
