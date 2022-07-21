import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==0){
            System.out.print(0);

        }
        else{
            int bin[]= new int[N];
            int i=0;
            while(N>0){
                bin[i]=N%2;
                i++;
                N=N/2;
            }
            for(int j=i-1;j>=0;j--){
                System.out.print(bin[j]);

            }
        }
	}
}
