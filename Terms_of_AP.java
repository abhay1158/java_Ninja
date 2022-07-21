import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int i=1;
		while(i<=n) {
			int eqn = (3*i)+2;
			if(eqn%4==0) {
				n++;
			}else {
				System.out.print(eqn+" ");
				
			}
			i++;
		}

	}
}
