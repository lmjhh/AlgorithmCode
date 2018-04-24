package PAT;

import java.util.Scanner;

public class PAT1006 {

	static int returnPA(String A,String DA){
		
		int PA = 0;
		for(int i=0; i<A.length(); i++){
			String d = String.valueOf(A.charAt(i));
			if(d.equals(DA)){
				PA = PA*10 + Integer.parseInt(DA);
			}
		}
		
		return PA;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String A,B,str;
        String a,b;
        str = scanner.nextLine();
        String[] strings = str.split(" ");
        A = strings[0];
        a = strings[1];
        B = strings[2];
        b = strings[3];
        System.out.println(returnPA(A, a) + returnPA(B, b));
	}

}
