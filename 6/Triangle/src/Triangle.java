import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {
	
	public static boolean tr(int a ,int b , int c){
		return (a+b>c) && (b+c>a) && (c+a>b);
	}
	
	public static boolean seg(int a,int b, int c){
		return (a+b==c) && (b+c==a) && (c+a==b);
	}
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int d=in.nextInt();
		
		boolean triangle=false;
		boolean segment=false;
		
		triangle= triangle || tr(a, b, c);
		triangle= triangle || tr(a, b, d);
		triangle= triangle || tr(c, b, d);
		triangle= triangle || tr(c, a, d);
		
		
		segment= segment || tr(a, b, c);
		segment= segment || tr(a, b, d);
		segment= segment || tr(c, b, d);
		segment= segment || tr(c, a, d);
		
		if(triangle){System.out.println("TRIANGLE");}
		else if(segment){System.out.println("SEGMENT");}
		else{System.out.println("IMPOSSIBLE");}
		
		in.close();
		return;		

	}

}
