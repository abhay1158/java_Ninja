import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int a = 1;
		int b = 1;
		int k = a+b;
		for(int j = 1; j<=N-3; j++ ) {
			a=b;
			b=k;
			k = a+b;
			}
		if(N==1 || N==2){
			System.out.println(1);
		}else {
		System.out.println(k);
		}
	}
	
}