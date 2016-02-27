package PAT;

import java.util.Arrays;
import java.util.Scanner;

// 1009	数字黑洞 (20)
public class PAT1009 {
    
	static String addSort(String num){
		 char[] chars = num.toCharArray();
		 Arrays.sort(chars);
		 num = String.valueOf(chars);
		 return num;
	}
	static String dedSort(String num){
		 char[] chars = num.toCharArray();
		 Arrays.sort(chars);
		 num = String.valueOf(chars);
		 num = new StringBuffer(num).reverse().toString();
		 return num;
	}
	static String StringExtension(String string){
    	if(string.length() == 3) {
    		string = "0"+string;
    	}
    	else if(string.length() == 2)	{
    		string = "00"+string;
    	}
    	else if(string.length() == 1)	{
			 string = "000"+string;
		}
    	return string;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = StringExtension(string);
        int flag = 1;
        if(string.charAt(0) == string.charAt(1) && string.charAt(2) == string.charAt(3) && string.charAt(3) == string.charAt(0)){
        	System.out.println(string+ " - "+string + " = " + "0000");
        	return;
        }
        while(flag > 0) {
        	System.out.print(dedSort(string)+" - "+addSort(string)+ " = ");
        	string = String.valueOf(Integer.parseInt(dedSort(string)) - Integer.parseInt(addSort(string)));
        	string = StringExtension(string);
        	System.out.println(string);
        	if(string.equals("6174")) {
        		break;
        	}
        }
	}

}
