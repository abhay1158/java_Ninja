import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i;
		int j;
		for(i=1;i<=N;i++) {
			
			for(j=1;j<=(N-i);j++) {
				System.out.print(' ');
				
			}
		   
			for(j=1;j<=i;j++) {
				System.out.print('*');
				
			}
			
			for(j=1;j<=(i-1);j++) {
				System.out.print('*');
            }
			System.out.println();
		}
		
	}

}
