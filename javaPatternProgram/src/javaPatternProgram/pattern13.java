package javaPatternProgram;

public class pattern13 {
public static void main(String[] args) {
	int n=5;
	int x;
	int y;
	for(int i=1;i<=n;i++) {
		x=i;
		y=n-i+1;
		for(int j=1;j<=n;j++) {
			if(j%2==1) {
				System.out.printf("%2d ",x);
			}
			else {
				System.out.printf("%2d ",y);
			}
			x=x+n;
			y=y+n;
		}
		System.out.println();
	}
}
}
