package springmvcsearch.enties;

public class Address {
	private String Street;
	private String city;
	private String state;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", state=" + state + "]";
	}

	
}
