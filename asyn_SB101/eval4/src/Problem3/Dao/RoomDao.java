package Problem3.Dao;

import java.util.List;

import Problem3.Exception.RoomException;
import Problem3.Models.Room;

public interface RoomDao {
	
	public String addRoom(Room room) throws RoomException;
	
	
	public List<Room> getEmptyRooms()throws RoomException;
	
	
	public Room getRoomByRoomType(String name)throws RoomException;
	
	
	public List<Room> getAllRoomDetails();

}
