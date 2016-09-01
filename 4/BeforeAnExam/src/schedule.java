import java.util.Scanner;


public class schedule {

	public static void main(String[] args) {
		schedule.get();

	}
	
	public static void get(){
		Scanner input=new Scanner(System.in);
		
		int days=input.nextInt();
		int SumTime=input.nextInt();
		
		int[] minTime=new int[days];
		int[] maxTime=new int[days];
		
		int baseTime=0;
		int maxPos=0;
		int minT=0;
		int maxT=0;
		
		
		for (int i=0;i<days;i++){
			minT=input.nextInt();
			maxT=input.nextInt();
			baseTime+=minT;
			maxPos+=maxT;
			
			
			minTime[i]=minT;
			maxTime[i]=maxT;
		}	
		
		if (SumTime>maxPos || SumTime<baseTime){
			System.out.println("NO");
			input.close();
			return;
		}
		
		
		
		String answer="";
		int extraTime=SumTime-baseTime;
		for (int i=0;i<days;i++){
			if (extraTime<maxTime[i]-minTime[i] && extraTime!=0 ){
				minTime[i]=extraTime+minTime[i];
				extraTime=0;
				
			}
			else if (extraTime!=0){
				extraTime-=(maxTime[i]-minTime[i]);
				minTime[i]=maxTime[i];				
				
			}
			answer+=Integer.toString(minTime[i])+" ";
			
		}	
		System.out.println("YES");
		System.out.println(answer.trim());
		
		input.close();
		
	}

}
