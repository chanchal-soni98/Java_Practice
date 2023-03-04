package Problem3.usecases;

import java.util.Scanner;

import Problem3.Dao.RoomDao;
import Problem3.Dao.RoomDaoImpl;
import Problem3.Exception.RoomException;
import Problem3.Models.Room;

public class AddingRoom {
public static void main(String[] args) {
		
		RoomDao rd = new RoomDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Room Num");
		int roomNumber = sc.nextInt();
		
		
		System.out.println("Enter  R. type");
		String roomType = sc.next();
		
		
		System.out.println("Room price for one night");
		int pricePerNight = sc.nextInt();
		
		
		System.out.println("Enter the maximum people ");
		int maximumPerson = sc.nextInt();
		
		sc.close();
		
		Room room = new Room();
		
		room.setRoomNumber(roomNumber);
		
		room.setRoomType(roomType);
		
		room.setPricePerNight(pricePerNight);
		
		room.setMaximumPerson(maximumPerson);
		
		
		try {
			String message = rd.addRoom(room);
			
			System.out.println(message);
			
		} catch (RoomException r) {
			System.out.println(r.getMessage());
		}
		
		
	}

}
