package Problem3.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Problem3.Exception.RoomException;
import Problem3.Models.Room;
import eval4.com.masai.Problem1.DBUtil.DBUtil;

public class RoomDaoImpl implements RoomDao{

	@Override
	public String addRoom(Room room) throws RoomException {
String res = "Room Not Added";
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into room values(?, ?, ?, ?, true)");
			
			ps.setInt(1, room.getRoomNumber());
			ps.setString(2, room.getRoomType());
			ps.setDouble(3, room.getPricePerNight());
			ps.setInt(4, room.getMaximumPerson());			
			
			int i = ps.executeUpdate();
			
			if(i > 0) res = "Room Added";
			
		} catch (SQLException e) {
			res = e.getMessage();
		}
		
		return res;
	}

	@Override
	public List<Room> getEmptyRooms() throws RoomException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Room getRoomByRoomType(String name) throws RoomException {
		// TODO Auto-generated method stub
Room r = null;
		
		try(Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps= conn.prepareStatement("select * from room where roomtype = ?");
			
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				int roomNo = rs.getInt("roomNumber");
				String roomType = rs.getString("roomType");
				double price = rs.getDouble("pricePerNight");
				int maxPerson = rs.getInt("maximumPerson");
				boolean empt = rs.getBoolean("isEmpty");
				
				r = new Room(roomNo, roomType, price, maxPerson, empt);
			}
			else {
				throw new RoomException("Couldn't find " + name + " room!");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public List<Room> getAllRoomDetails() throws RoomException {
List<Room> rooms = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from room where isEmpty IS TRUE");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int roomNo = rs.getInt("roomNumber");
				String roomType = rs.getString("roomType");
				double price = rs.getDouble("pricePerNight");
				int maxPerson = rs.getInt("maximumPerson");
				
				Room r = new Room(roomNo, roomType, price, maxPerson, true);
				rooms.add(r);
			}
			
			if(rooms.size() == 0) throw new RoomException("No Empty!");
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		return rooms;
	}

	@Override
	public List<Room> getAllRoomDetails() {
		List<Room> rooms = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from room ");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int roomNo = rs.getInt("roomNumber");
				String roomType = rs.getString("roomType");
				double price = rs.getDouble("pricePerNight");
				int maxPerson = rs.getInt("maximumPerson");
				boolean empt = rs.getBoolean("isEmpty");
				
				Room r = new Room(roomNo, roomType, price, maxPerson, empt);
				rooms.add(r);
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		return rooms;
	}}


