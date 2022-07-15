import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int E = scan.nextInt();
        int W = scan.nextInt();        
        int i = S;
        while(i<=E) {
        	System.out.print(i);
        	System.out.print("\t");
        	int c;
        	c = ((i-32)*5)/9;
          	System.out.println(c);
        	i = i+W;        
        }
        
	}

}