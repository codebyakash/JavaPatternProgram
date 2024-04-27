package javaPatternProgram;

public class pattern12 {
public static void main(String[] args) {
	int n=0;
	for(int i=1;i<=5;i++) {
		n=i;
		for(int j=1;j<=5;j++) {
			System.out.printf("%2d ",n);
			n+=5;
		}
		System.out.println();
	}
}
}