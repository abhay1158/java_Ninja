import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
		int N = s.nextInt();
        
        //First half
        
		int i;
		int n1=(N+1)/2;
		int space;
		int star;
		for(i=1;i<=n1;i++) {
			
			for(space = 1;space<=n1-i;space++) {
				System.out.print(" ");
				
			}
			
			for(star=1;star<=(2*i-1);star++) {
				System.out.print("*");
				
			}
			
			System.out.println();
		}
        
        // Second half
        
        
			i=(n1-1);
			
			for(int k = 1;k<=(n1-1);k++) {
				
				for(space=1;space<=((n1-1)-i+1);space++) {
					System.out.print(" ");
					
				}
				
				for(star=1;star<=(2*i-1);star++){
					System.out.print("*");
					
				}
				i--;
				
				System.out.println();
			}
        
    }
}