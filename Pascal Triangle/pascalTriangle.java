import java.util.*;
class pascalTriangle{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printThePascalTriangle(scan.nextInt());
	}
	public static void printThePascalTriangle(int n){
		ArrayList<Integer> li=new ArrayList<Integer>();
		li.add(1);
		for(int i=0;i<n;++i){
			for(int j=0;j<n-i-1;++j)
			System.out.print(" ");
			for(int k=0;k<li.size();++k)
			System.out.print(li.get(k)+" ");
			li=changeMe(li);
			System.out.println();
		}
	}
	public static ArrayList<Integer> changeMe(ArrayList<Integer> li){
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(1);
		for(int i=0;i<li.size()-1;++i)
		l.add(li.get(i)+li.get(i+1));
		l.add(1);
		return l;
	}
}



/*

Output
patterns>javac pascalTriangle.java

patterns>java pascalTriangle
5
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

patterns>java pascalTriangle
10
         1
        1 1
       1 2 1
      1 3 3 1
     1 4 6 4 1
    1 5 10 10 5 1
   1 6 15 20 15 6 1
  1 7 21 35 35 21 7 1
 1 8 28 56 70 56 28 8 1
1 9 36 84 126 126 84 36 9 1

*/
