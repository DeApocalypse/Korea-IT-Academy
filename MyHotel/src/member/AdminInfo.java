package member;

public class AdminInfo {
	
	private String name;
	private String date;
	private String hotel;
	private String people;
	
	public void printMemberInfo() {
		System.out.println("ÀÌ¸§ : "+name);
		System.out.println("³¯Â¥ : "+date);
		System.out.println("È£ÅÚ : "+hotel);
		System.out.println("ÀÎ¿ø ¼ö : "+people);		
	}

	public AdminInfo(String name, String date, String hotel, String people) {
		super();
		this.name = name;
		this.date = date;
		this.hotel = hotel;
		this.people = people;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdminInfo other = (AdminInfo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
