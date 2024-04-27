package javaPatternProgram;

public class pattern9 {
public static void main(String[] args) {
	int k;
	for(int i=1;i<=5;i++) {
		k=i;
		for(int j=1;j<=5;j++) {
			System.out.printf("%2d ",k);
			k+=i;
		}
		System.out.println();
	}
	//2nd method
//	for(int i=1;i<=5;i++) {
//		for(int j=1;j<=5;j++) {
//			System.out.printf("%2d ",i*j);
//		}
//		System.out.println();
//	}
}
}
