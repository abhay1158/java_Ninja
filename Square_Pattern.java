import java.util.Scanner;
public class Solution {

    
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;
        while(i<=N){
            int j = 1;
            while(j<=N){
                System.out.print(N);
                j+=1;
            }
            System.out.println();
            i+=1;
        }
		
		
	}

}
