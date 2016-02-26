package PAT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
	int num;
	int der;
	int cai;
	public Student (int num,int der,int cai) {
		this.der = der;
		this.cai = cai;
		this.num = num;
	}
}

// 1005	德才论 
public class PAT1005 {

	static Comparator<Student> comparator = new Comparator<Student>() {
		
		public int compare(Student S1,Student S2){
			
			if(S1.der + S1.cai != S2.der + S2.cai) {
				return (S2.der + S2.cai) - (S1.der + S1.cai);
			}
			else {
				if(S1.der != S2.der) {
					return S2.der - S1.der;
				}
				else {
					return S1.num - S2.num; 
				}
			}
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scanner = new Scanner(System.in);
       int n,l,h;
       n = scanner.nextInt();
       l = scanner.nextInt();
       h = scanner.nextInt();
       ArrayList<Student> list1 = new ArrayList<Student>();
       ArrayList<Student> list2 = new ArrayList<Student>();
       ArrayList<Student> list3 = new ArrayList<Student>();
       ArrayList<Student> list4 = new ArrayList<Student>();
       for(int i = 0; i<n; i++){
    	   int num,der,cai;
    	   num = scanner.nextInt();
    	   der = scanner.nextInt();
    	   cai = scanner.nextInt();
    	   Student student = new Student(num, der, cai);
    	   if(der >= h && cai >= h) {
    		   list1.add(student);
    	   }
    	   else if(der >= h && cai < h && cai >= l) {
    		   list2.add(student);
    	   }
    	   else if(der <h && cai < h && der >= cai && der >= l && cai >= l) {
    		   list3.add(student);
    	   }
    	   else if(der >= l && cai >= l) {
    		   list4.add(student);
    	   }
       }
       Collections.sort(list1,comparator);
       Collections.sort(list2,comparator);
       Collections.sort(list3,comparator);
       Collections.sort(list4,comparator);
       int sum = list1.size() + list2.size() + list3.size() + list4.size();
       System.out.println(sum);
       for(Student s : list1) {
    	   System.out.println(s.num + " "+ s.der + " " + s.cai);
       }
       for(Student s : list2) {
    	   System.out.println(s.num + " "+ s.der + " " + s.cai);
       }
       for(Student s : list3) {
    	   System.out.println(s.num + " "+ s.der + " " + s.cai);
       }
       for(Student s : list4) {
    	   System.out.println(s.num + " "+ s.der + " " + s.cai);
       }
	}

}
