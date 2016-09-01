import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class registration {

	public static void main(String[] args) {
		registration.register();

	}
	
	
	public static void register(){
		Scanner input=new Scanner(System.in);
		int count=input.nextInt();
		
		HashMap<String,ArrayList<String>> dict=new HashMap<String,ArrayList<String>>();
		ArrayList<String> answer=new ArrayList<String>();
		
		
		for (int i=0;i<count;i++){
			String name=input.next();
			if (!dict.containsKey(name)){
				dict.put(name, new ArrayList<String>());
				answer.add("OK");
			}
			else{
				ArrayList<String> temp=dict.get(name);
				String newName=name+Integer.toString(temp.size()+1);
				temp.add(newName);
				answer.add(newName);
			}
		}
		for (int i=0;i<answer.size();i++){
			System.out.println(answer.get(i));
		}
		
		input.close();
		
	}
}
