import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int i = 1;
        while(i<=n) {
        	int j = 1;
        	char value = (char)('A'+i-1);
        	while(j<=i) {
        		System.out.print(value);
        		value=(char)(value+1);
        		j++;
        	}
        	i=i+1;
        	System.out.println();
        }

		
	}

}
