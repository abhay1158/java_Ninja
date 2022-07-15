import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i;
        int j;
        for(i=1;i<=N;i++){
            for(j=1;j<=(N-i);j++){
                System.out.print(" ");

            }
            int t = i;
            for(j=1;j<=i;j++){
                System.out.print(t);
                t++;

            }
             int s = t;
             for(j=1;j<=(i-1);j++){
                 System.out.print(s-2);
                 s--;

             }
            System.out.println();

        }
		
	}
}
