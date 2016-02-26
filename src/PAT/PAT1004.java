package PAT;

import java.util.Scanner;

// 1004	福尔摩斯的约会 
public class PAT1004 {
    //即MON表示星期一，TUE表示星期二，WED表示星期三，THU表示星期

//四，FRI表示星期五，SAT表示星期六，SUN表示星期日。题目输入保证每个测试存在唯一解。
	
	static String[] Day = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
	static int count = 0;
	static char searchSameChar(String S1,String S2,Boolean flag,int start,Boolean flag2){	
		for(int i = start; i<S1.length(); i++){
				if(S1.charAt(i) == S2.charAt(i)){
					if(flag == true){
						count = i+1;
						if(flag2 != true){
						 if(Character.isUpperCase(S1.charAt(i))) {
							   return S1.charAt(i);
						  }
						}
						else if(S1.charAt(i) >= 'A' && S1.charAt(i) <= 'Z' || S1.charAt(i) >= 'a' && S1.charAt(i) <= 'z') {
							   return S1.charAt(i);
						}
					}
					else 
						return S1.charAt(i);
				}
		}
		return 0;
		
	}
	static String formatAns(int i){
		String S1 = "0";
		if(i<10){
			return S1+String.valueOf(i);
		}
		else return String.valueOf(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        String S1,S2,S3,S4;
        String ans1,ans2,ans3;
        S1 = scanner.nextLine();
        S2 = scanner.nextLine();
        S3 = scanner.nextLine();
        S4 = scanner.nextLine();
        char Days = searchSameChar(S1, S2, true, 0,false);
        ans1 = Day[Days - 'A'];
        char Hour = searchSameChar(S1, S2, false,count,false);
        
        if(Hour >= 'A' && Hour <= 'Z'){
        	Hour = Character.toUpperCase(Hour);
        	ans2 = formatAns(Hour - 'A' + 10);
        }
        else ans2 = formatAns(Hour - '0');
        char Mine = searchSameChar(S3, S4, true, 0,true);
        ans3 = formatAns(count -1);
        System.out.printf("%s %s:%s\n", ans1,ans2,ans3);
	}

}
//3485djDkxh4hhGE
//2984akDfkkkkggEdsb
//s&hgsfdk
//d&Hyscvnm

