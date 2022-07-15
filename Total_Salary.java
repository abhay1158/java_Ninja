import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		  int basic = s.nextInt();
		  String str = s.next();
		  char grade = str.charAt(0);
		  int allow;
		  float hra =(float) (basic*20)/100;
		  
		  float da =(float) (basic*50)/100;
		  
		  float pf =(float) (basic*11)/100;
		 
		  if(grade== 'A') {
			  allow = 1700;
			  
		  }else if(grade== 'B') {
			  allow = 1500;
			
		  }else {
			  allow = 1300;
		  }
		  float totalSalary=basic+hra+da+allow-pf;
		  System.out.println(Math.round(totalSalary));
	}
}
