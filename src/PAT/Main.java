package PAT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class sortClass {
	int number;
	int der;
	int cai;
	
	
	public sortClass(int Num,int der,int cai) {
		// TODO Auto-generated constructor stub
		this.cai = cai;
		this.der = der;
		this.number = Num;
	}
}
public class Main{

//	为优先录取线——德分和才分均不低于此线的被定义为“才德全尽”，此类考生按德才总分从高到低排序；才分不到

//但德分到线的一类考生属于“德胜才”，也按总分排序，但排在第一类考生之后；德才分均低于H，但是德分不低于才分的考生属于“才德兼
//
//亡”但尚有“德胜才”者，按总分排序，但排在第二类考生之后；其他达到最低线L的考生也按总分排序，但排在第三类考生之后。

	static int n,l,h;
	
	static Comparator<sortClass> comparator1 = new Comparator<sortClass>() {
		public int compare(sortClass o1, sortClass o2) {
			// TODO Auto-generated method stub
			if(o1.der+ o1.cai > o2.der + o2.cai) return -1;
			return 0;
		}
	};
	
	static Comparator<sortClass> comparator2 = new Comparator<sortClass>() {
		
		public int compare(sortClass o1, sortClass o2){
			
			if(o1.der >= h && o1.cai >= h && (o2.der < h || o2.cai < h)) {
				return -1;
			}
			
			return 0;
		}
		
	};
	
	static Comparator<sortClass> comparator3 = new Comparator<sortClass>() {
		
		public int compare(sortClass o1, sortClass o2) {
			// TODO Auto-generated method stub
			if (o1.der >= h && o1.cai >= h && o2.der >= h && o2.cai >= h) {
		    	if(o1.der+ o1.cai > o2.der + o2.cai) return -1;
		    }
			if (o1.der >= h && o1.cai < h && o2.der >= h && o2.cai < h){
				if(o1.der+ o1.cai > o2.der + o2.cai) return -1;
			}
			if (o1.der < h && o1.cai < h && o1.der >= o1.cai && o2.der < h && o2.cai < h && o2.der >= o2.cai){
				if(o1.der+ o1.cai > o2.der + o2.cai) return -1;
			}
			if (o1.der >= l && o1.cai >= l && o2.der >= l && o2.cai >= l) {
		    	if(o1.der+ o1.cai > o2.der + o2.cai) return -1;
		    }
			return 0;
		}
	};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<sortClass> list = new ArrayList<sortClass>();
		
		n = scanner.nextInt();
		l = scanner.nextInt();
		h = scanner.nextInt();
		
		for(int i = 0; i< n; i++){
			int num = scanner.nextInt();
			int der = scanner.nextInt();
			int cai = scanner.nextInt();
			sortClass s = new sortClass(num, der, cai);
			list.add(s);
		}
		Collections.sort(list,comparator1);
		Collections.sort(list,comparator2);
		Collections.sort(list,comparator3);
		for(sortClass oClass : list) {
			System.out.println(oClass.number + " " + oClass.der + " " + oClass.cai);
		}
	}

}
//14 60 80
//10000001 64 90
//10000002 90 60
//10000011 85 80
//10000003 85 80
//10000004 80 85
//10000005 82 77
//10000006 83 76
//10000007 90 78
//10000008 75 79
//10000009 59 90
//10000010 88 45
//10000012 80 100
//10000013 90 99
//10000014 66 60