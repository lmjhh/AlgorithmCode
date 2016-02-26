package PAT;

import java.util.Scanner;

public class PAT1008 {

	static int AJ = 0,AC = 0,AB = 0,BJ = 0,BC = 0,BB = 0;
	static int Awin = 0, Afai = 0, Aequ = 0, Bwin = 0, Bfai = 0, Bequ = 0;
	//C代表“锤子”、J代表“剪刀”、B代
	//表“布”，
	static int judge(String S1, String S2){
		
		if(S1.equals("C") && S2.equals("C")) {
			
			Aequ++;
			Bequ++;
			return 0;
			
		}
		else if(S1.equals("C") && S2.equals("B")) {
			BB++;
			Bwin++;
			Afai++;
			return -1;
		}
		else if(S1.equals("C") && S2.equals("J")) {
			AC++;
			Awin++;
			Bfai++;
			return 1;
		}
		else if(S1.equals("J") && S2.equals("J")) {
			Aequ++;
			Bequ++;
			return 0;
		}
		else if(S1.equals("J") && S2.equals("C")) {
			BC++;
			Bwin++;
			Afai++;
			return -1;
		}
		else if(S1.equals("J") && S2.equals("B")) {
			AJ++;
			Awin++;
			Bfai++;
			return 1;
		}
		else if(S1.equals("B") && S2.equals("B")) {
			Aequ++;
			Bequ++;
			return 0;
		}
		else if(S1.equals("B") && S2.equals("J")) {
			BJ++;
			Bwin++;
			Afai++;
			return -1;
		}
		else {
			AB++;
			Awin++;
			Bfai++;
			return 1;
		}
	}
	
	static String judgeMax(int a,int b,int c){
		int max = 0;
		if(a>max) max=a;
		if(b>max) max=b;
		if(c>max) max=c;
		if(max == a && max == b && max == c) {
			return "B";
		}
		else if(max == a && max == b){
			return "C";
		}
		else if(max == a && max == c){
			return "B";
		}
		else if(max == b && max == c){
			return "B";
		}
		else if(max == a){
			return "J";
		}
		else if(max == b){
			return "C";
		}
		else {
			return "B";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n;
		n =  scanner.nextInt();
		scanner.nextLine();
		for(int i=0; i<n; i++){
			String string;
			string = scanner.nextLine();
			String[] strings = string.split(" ");
			String a = strings[0]; String b = strings[1];
			judge(a, b);
		}
		System.out.println(Awin + " " + Aequ + " " + Afai);
		System.out.println(Bwin + " " + Bequ + " " + Bfai);
		System.out.println(judgeMax(AJ, AC, AB) + " " + judgeMax(BJ, BC, BB));
	}

}
//10
//C J
//J B
//C B
//B B
//B C
//C C
//C B
//J B
//B C
//J J