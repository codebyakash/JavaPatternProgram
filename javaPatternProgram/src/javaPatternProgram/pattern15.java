package javaPatternProgram;

public class pattern15 {
public static void main(String[] args) {
	int n=1;
	for(int i=5;i>=1;i--) {
		n++;
	for(int j=n;j<=n+4;j++) {
		System.out.print((j%2)+" ");
	}
	
	System.out.println();
	}
}
}
