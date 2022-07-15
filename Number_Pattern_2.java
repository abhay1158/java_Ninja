import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int space = 1;
            while(space<=(n-i)){
                System.out.print(" ");
                space = space+1;
            }
            int j = 0;
            while(j<i){
                int sum = i;
                sum = sum+j;
                System.out.print(sum);
                j=j+1;
            }
            System.out.println();
            i=i+1;
        }
		
	}

}
