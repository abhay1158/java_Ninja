import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int Sum = 0;
        int i = 1;
        while(i<=N){
            if(i%2==0){
                Sum = Sum+i;
            }
            i=i+1;
        }
        System.out.println(Sum);


	}

}