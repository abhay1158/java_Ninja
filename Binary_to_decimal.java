import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner scan = new Scanner(System.in);
		int bin = scan.nextInt();
        int n = 0;
		int digit = 0;
		while(bin>0) {
			int temp = bin%10;
			digit+= temp*Math.pow(2,n);
			n++;
			bin = bin/10;
		}
		System.out.println(digit);
	}
}
