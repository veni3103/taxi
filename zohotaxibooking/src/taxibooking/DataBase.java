package taxibooking;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class DataBase {
	public static void main(String[] args) throws Exception {
		Map<Integer,Integer>drivers=new HashMap<>();
		Map<Integer,Character>place=new HashMap<>();
		drivers.put(1, 0);
		drivers.put(2, 0);
		drivers.put(3, 0);
		drivers.put(4, 0);
		int count=1;
		place.put(1,'A');
		place.put(2,'A');
		place.put(3,'A');
		place.put(4,'A');
		System.out.println("Enter where you going");
		Scanner scanner=new Scanner(System.in);
		char dest=scanner.next().charAt(0);
		if(count<=drivers.size()) {
			
			drivers.get(count);
			int diff=((int)place.get(count)-(int)dest);
			int salary=Math.abs(diff*15)*10;
			place.put(count, dest);
			drivers.put(count, salary);
			Connection con=DBConnection.getConnection();
			Statement state=con.createStatement();
			ResultSet res=state.executeQuery("update driverdetails set place='"+dest+"' and salary="+salary+"where number="+count+";" );
			count++;

			/*System.out.println("confirm");
			System.out.println(place.get(count));
			System.out.println(drivers.get(count));*/
		}
		//System.out.println("confirm");

	}

}


