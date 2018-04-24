package PAT;

import java.util.Scanner;


// 1002	数字分类 
public class PAT1002 {

	
	
	/*
	A1 = 能被5整除的数字中所有偶数的和；

	A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；

	A3 = 被5除后余2的数字的个数；

	A4 = 被5除后余3的数字的平均数，精确到小数点后1位；

	A5 = 被5除后余4的数字中最大数字。
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
        int N;
        int[] num = new int[1000];
        int A1=0,A2=0,A3=0,A5=-1;
        boolean flag = true;
        double A4 = 0.0;
        int A4num = 0;
        N = scanner.nextInt();
        
        for(int i=0;i<N;i++){
        	
        	num[i] = scanner.nextInt();
        	
        	switch (num[i]%5) {
			case 0: 
				if(num[i]%2 == 0){
					A1 += num[i];
				}
				break;
			case 1:
				if(flag){
					A2 += num[i];
					flag = false;
				}
				else {
					A2 -= num[i];
					flag = true;
				}
				break;
			case 2:
				A3 ++;
				break;
			case 3:
				A4 += num[i];
				A4num ++;
				break;				
			case 4:
				if(num[i]>A5){
					A5 = num[i];
				}
				break;
			default:
				break;
			}
        }
        A4 = A4/(A4num*1.0);
        
        if(A1 != 0) {
        	System.out.printf("%d ", A1);
        }
        else System.out.printf("N ");
        if(A2 != 0) {
        	System.out.printf("%d ", A2);
        }
        else System.out.printf("N ");
        if(A3 != 0) {
        	System.out.printf("%d ", A3);
        }
        else System.out.printf("N ");
        if(A4num > 0) {
        	System.out.printf("%.1f ", A4);
        }
        else System.out.printf("N ");
        if(A5 != -1) {
        	System.out.printf("%d\n", A5);
        }
        else System.out.printf("N\n");      
	}

}
