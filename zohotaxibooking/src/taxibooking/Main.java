package taxibooking;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	static Map<Character,List<Integer>> map=new HashMap<>();
	private static void getMap()
	{
		List<Integer>list=new ArrayList<>();
		for(int i = 1; i <= 4; i ++)
		{
			list.add(i);
		}
		map.put('A', list);
		map.put('B', new ArrayList<Integer>());
		map.put('C', new ArrayList<Integer>());
		map.put('D', new ArrayList<Integer>());
		map.put('E', new ArrayList<Integer>());
		map.put('F', new ArrayList<Integer>());
	}

	public static void main(String[] args) {
		getMap();
		Map<Integer,Integer>salary=new HashMap<>();
		while(true) 
		{
			System.out.println("Enter where you pickup");
			System.out.println("Enter where you going");
			Scanner scanner=new Scanner(System.in);
			char pickup=scanner.next().charAt(0);
			char dest=scanner.next().charAt(0);
			int driver=chooseDriver(pickup);
			if(count<=salary.size()) {
				salary.get(count);
				int diff=((int)pickup-(int)dest);
				int increasesalary=100+(Math.abs(diff*15)-5)*10;
				place.put(count, dest);
				salary.put(count, increasesalary);
				count++;

				System.out.println("confirm");
				System.out.println(place.get(count));
				System.out.println(salary.get(count));
			}
			//System.out.println("confirm");
			Collection<Integer> a=salary.values();
			for(int s:a) {
				System.out.println(s);
			}
		}		
	}
	
	private static int chooseDriver(char pickup)
	{
		List<Integer>choose= map.get(pickup);
		if(!choose.isEmpty()) 
		{
			int drivernum=choose.get(0);
			list.remove(0);
			
		}
	}
	

}
