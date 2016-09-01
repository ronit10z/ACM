import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class pack {

	public static void main(String[] args) {
		pack.put();

	}
	
	public static void put(){
		Scanner input=new Scanner(System.in);
		int count=input.nextInt();
		int cardWidth=input.nextInt();
		int cardHeight=input.nextInt();
		
		ArrayList<envelope> arr=new ArrayList<envelope>(count);
				
		
		for (int i=0;i<count;i++){
			int width=input.nextInt();
			int height=input.nextInt();
			arr.add(new envelope(i,width,height));
		}
		
		Collections.sort(arr, new envelopeComparator());
		
		String ans="";
		
		ArrayList<envelope> answer=new ArrayList<envelope>();
		for (int i=0;i<arr.size();i++){
			envelope curr=arr.get(i);
			if (arr.isEmpty() && curr.height>cardHeight && curr.width>cardWidth){
				ans+=curr.index+" ";
				answer.add(curr);
				break;
			}
			else if (curr.height>cardHeight && curr.width>cardWidth && curr.height<arr.get(arr.size()-1).height && curr.width<arr.get(arr.size()-1).width){
				answer.add(curr);
				ans+=curr.index+" ";
			}
			
		}
		System.out.println(answer.size());
		System.out.println(ans.trim());
		input.close();
	}
	
	
	
	public static class envelope{
		int index;
		int width;
		int height;
		
		public envelope(int index,int width,int height){
			this.index=index;
			this.width=width;
			this.height=height;
		}
	}
	public static class envelopeComparator implements Comparator<envelope>{
		@Override
		public int compare(envelope arg0, envelope arg1) {
			if (arg0.width<arg1.width && arg0.height<arg1.height){
				return 1;
			}
			if (arg0.width>arg1.width && arg0.height>arg1.height){
				return -1;
			}
			
			return 0;
		}
		
	}
}
