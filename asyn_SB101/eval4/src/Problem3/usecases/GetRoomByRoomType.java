package Problem3.usecases;

import java.util.Scanner;

import Problem3.Dao.RoomDao;
import Problem3.Dao.RoomDaoImpl;
import Problem3.Exception.RoomException;
import Problem3.Models.Room;

public class GetRoomByRoomType {
public static void main(String[] args) {
		
		RoomDao rd = new RoomDaoImpl();
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter Room type");
		
		String roomType = sc.next();			
		
		try {
				
			Room room = rd.getRoomByRoomType(roomType);
			
			
			System.out.println(room);
			
		} catch (RoomException re) {
			System.out.println(re.getMessage());
		}
		
		
		
	}		

}