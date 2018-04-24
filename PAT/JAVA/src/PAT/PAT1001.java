package PAT;
import java.util.Scanner;


// PAT 1001	A+B和C 
public class PAT1001 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t;
		long  a,b,c;
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		for(int i=1;i<=t;i++){
			
			a = scanner.nextLong();
			b = scanner.nextLong();
			c = scanner.nextLong();
			
		     if( a+b > c){
		    	 System.out.printf("Case #%d: true\r\n", i);
		     }
		     else System.out.printf("Case #%d: false\r\n", i);
		}
	}
}
