package javaPatternProgram;

public class pattern5 {
public static void main(String[] args) {
	int count=0;
		for(int j=1;j<=25;j++) {
			System.out.print(j+" ");
			count++;
			if(count==5) {
				System.out.println();
				count=0;
			}
		}
		System.out.println();
	}
}
