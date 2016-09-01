import java.util.Scanner;

public class melon {

	public static void main(String[] args) {
		melon.isEvenlyDividable();

	}
	
	
	public static void isEvenlyDividable(){
		Scanner input=new Scanner(System.in);
		int weight=input.nextInt();
		if (weight%2!=0){
			System.out.println("NO");
			input.close();
			return;
		}
		
		for (int i=2;i<weight;i+=2){
			if ((weight-2)%2==0) {
				System.out.println("YES");
				input.close();
				return;
			}
		}
		
	System.out.println("NO");
	input.close();
	}
}

