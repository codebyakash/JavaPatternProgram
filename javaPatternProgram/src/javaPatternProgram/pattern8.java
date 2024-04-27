package javaPatternProgram;

public class pattern8 {
public static void main(String[] args) {
	int n=5;
	int k=2;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			System.out.printf("%2d ",k);
			k+=2;
		}
		System.out.println();
	}
//	2nd method
//	int count=0;
//	for(int i=1;i<=50;i++) {
//		if(i%2==0) {
//			System.out.printf("%2d ",i);
//			count++;
//		}
//		if(count==5) {
//			System.out.println();
//			count=0;
//		}
//	}
}
}
