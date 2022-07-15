import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Sum_of_Even_Digits = 0;
        int Sum_of_Odd_Digits = 0;
        while(N>0){
            int digit = N%10;
            if(digit%2==0){
                Sum_of_Even_Digits = Sum_of_Even_Digits + digit;
            }else{
                Sum_of_Odd_Digits = Sum_of_Odd_Digits + digit;
            }
           N=N/10;
        }
       System.out.print(Sum_of_Even_Digits);
	   System.out.print(" ");
       System.out.print(Sum_of_Odd_Digits);
	}
}
