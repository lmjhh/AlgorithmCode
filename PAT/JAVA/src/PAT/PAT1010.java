package PAT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

//1010	月饼 (25)
class goods {
	double price;
	double num;
	double sum;
	public goods(double num,double sum) {
		// TODO Auto-generated constructor stub
		this.num = num;
		this.sum = sum;
 	    this.price = sum/num;
	}
}

public class PAT1010 {

	static Comparator<goods> comparator = new Comparator<goods>() {
		public int compare(goods a, goods b){
			if( a.price > b.price ){
				return -1;
			}
			else if( a.price < b.price) {
				return 1;
			}
			else return 0;
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       int n,D;
       n = scanner.nextInt();
       D = scanner.nextInt();
       double[] num = new double[n];
       ArrayList<goods> gArrayList = new ArrayList<goods>();
       double []price = new double[n];
       for(int i=0;i<n;i++){
    	   num[i] = scanner.nextDouble();
       }
       for(int i=0;i<n;i++){  
    	   double sum;
    	   sum = scanner.nextDouble();
    	   goods good = new goods(num[i], sum);
    	   gArrayList.add(good);
       }
       Collections.sort(gArrayList, comparator);
       double ans = 0.0;
       while(D > 0){
    	   for(goods g : gArrayList){
    		   if(D - g.num > 0){
    			   ans += g.sum;
                   D -= g.num;
    		   }
    		   else if(D - g.num <= 0){
    			   ans += g.price * D;
    			   D = 0;
    		   }
    	   }
       }
       System.out.printf("%.2f", ans);
	}

}
