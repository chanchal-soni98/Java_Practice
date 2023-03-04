package Problem3.usecases;

import java.util.List;

import Problem3.Dao.RoomDao;
import Problem3.Dao.RoomDaoImpl;
import Problem3.Exception.RoomException;
import Problem3.Models.Room;

public class GetEmptyRooms {
public static void main(String[] args) {
		
		RoomDao rd = new RoomDaoImpl();
				
		try {
			List<Room> room = rd.getEmptyRooms();
			
			System.out.println(room);
			
		} catch (RoomException r) {
			System.out.println(r.getMessage());
		}
		
	}

}