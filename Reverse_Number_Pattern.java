import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i<=N){
            int j = 1;
            int value = i;
            while(j<=i){
                System.out.print(value);
                value--;
                j++;
            }
            i++;
            System.out.println();
        }
		
		
	}

}
