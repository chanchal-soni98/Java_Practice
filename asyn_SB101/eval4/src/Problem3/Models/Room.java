package Problem3.Models;

public class Room {
	private int roomNumber;
	private String roomType;
	private double pricePerNight;
	private int maximumPerson;
	private boolean isEmpty;
	
	public Room() {}

	public Room(int roomNumber, String roomType, double pricePerNight, int maximumPerson, boolean isEmpty) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.pricePerNight = pricePerNight;
		this.maximumPerson = maximumPerson;
		this.isEmpty = isEmpty;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(double pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getMaximumPerson() {
		return maximumPerson;
	}

	public void setMaximumPerson(int maximumPerson) {
		this.maximumPerson = maximumPerson;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", roomType=" + roomType + ", pricePerNight=" + pricePerNight
				+ ", maximumPerson=" + maximumPerson + ", isEmpty=" + isEmpty + "]";
	}
	
}