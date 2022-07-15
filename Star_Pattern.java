import java.util.Scanner;
public class Solution {


    public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int sum =1;
        while(i<=n){
            int space = 1;
            while(space<=(n-i)){
                System.out.print(" ");
                space = space+1;            	
            }
            int j = 1;
            while(j<=sum){
                System.out.print("*");
                j=j+1;
            }
            sum=sum+2;
            System.out.println();
            i=i+1;
        }
        
		
	}

}
