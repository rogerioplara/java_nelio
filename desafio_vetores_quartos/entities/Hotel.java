package entities;

public class Hotel {
	
	private int rooms;
	private String name;
	private String email;
	private int room;
	
	public Hotel(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}
	
	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}
	
	public String toString() {
		return String.format
				("%d: %s, %s", 
				getRoom(), getName(), getEmail());
	}

}
