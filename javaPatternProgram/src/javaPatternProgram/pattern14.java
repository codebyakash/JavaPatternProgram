package javaPatternProgram;

public class pattern14 {
public static void main(String[] args) {
	int n=5;
	int x=0;
	for(int i=n;i>=1;i--) {
		x=i;
		for(int j=1;j<=n;j++) {
			System.out.printf("%2d ",x);
			x+=5;
		}
		System.out.println();
	}
}
}
