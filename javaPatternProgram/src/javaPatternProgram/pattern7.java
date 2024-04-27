package javaPatternProgram;

public class pattern7 {
public static void main(String[] args) {
	int count=0;
	for(int i=1;i<=50;i++) {
		if(i%2!=0) {
			System.out.printf("%2d ",i);
		count++;	
		}
		if(count==5) {
			System.out.println();
			count=0;
		}
	}
	// 2nd method
//	int n=5;
//	int k=1;
//	for(int i=1;i<=n;i++) {
//		for(int j=1;j<=n;j++) {
//			System.out.printf("%2d ",k);
//			k+=2;
//		}
//		System.out.println();
//	}
}
}
