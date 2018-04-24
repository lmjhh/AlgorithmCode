package PAT;

import java.util.Scanner;


// PAT 1003 	数素数 


public class PAT1003 {

	//令Pi表示第i个素数。现任给两个正整数M <= N <= 10000，请输出PM到PN的所有素数。
	
	static boolean isPrime[] = new boolean[200000];
	
	
	static void creatPrimeTable() {
		
		
		for(int i=1; i < isPrime.length; i++){
			isPrime[i] = true;
		}
		
		
		for(int i=2;i<isPrime.length;i++){
			
			if(isPrime[i] == true){
				
				for(int j = 2; j*i < isPrime.length; j++){
					
					isPrime[j*i] = false;
				}
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner scanner = new Scanner(System.in);
		creatPrimeTable();
		int n,m;
		int primeCount = 0;
		int isreturn = 0;
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		for(int i = 2; primeCount<m; i++){
			if(isPrime[i]){
				primeCount++;
				if(primeCount >= n){
					
					System.out.printf("%d", i);
					isreturn++;
					if(isreturn == 10 || primeCount == m){
						System.out.printf("\n");
						isreturn = 0;
					}
					else System.out.printf(" ");
				}
			}
		}
		
	}

}
