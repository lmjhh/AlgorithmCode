package PAT;

import java.util.Scanner;


//  1007	A除以B 


public class PAT1007 {
    
	static String result = "";
	
	static int returnResult(String Q,String B){
		
		boolean isFirst = true;
		int subs = 0;
		int Bei = Integer.parseInt(B);
		
		for(int i=0; i<Q.length(); i++){
			int sub = Integer.parseInt(Q.substring(i, i+1));
			if(sub > Bei) isFirst = false;
			if(subs < Bei) {
				subs*=10;
				subs += sub;
			}
			if(subs >= Bei) {
				result = result + String.valueOf(subs/Bei);
				subs = subs % Bei;
			}
			else if(isFirst == true){
				isFirst = false;
			}
			else result = result + "0";
		}
		return subs;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] strings = string.split(" ");
        int ans = returnResult(strings[0], strings[1]);
        System.out.println(result + " "+ ans);      
	}
	//17636684150141093474 3
   //141872294990590620769
}
