import java.util.*;
class numberPalindromePyramid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		printThePyramid(scan.nextInt());
		scan.close();
	}
	public static void printThePyramid(int n){
		int start=1;
		for(int i=0;i<n;++i){
			for(int j=0;j<n-i-1;++j)
			System.out.print(" ");
			for(int backward=start;backward>=1;--backward)
			System.out.print(backward);
			for(int forward=2;forward<=start;++forward)
			System.out.print(forward);
			System.out.println();
			++start;
		}
	}
}


/*

Output:

pattern>javac numberPalindromePyramid.java

pattern>java numberPalindromePyramid
5
    1
   212
  32123
 4321234
543212345

pattern>java numberPalindromePyramid
10
         1
        212
       32123
      4321234
     543212345
    65432123456
   7654321234567
  876543212345678
 98765432123456789
109876543212345678910

*/
