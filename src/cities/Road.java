package cities;

public class Road {
	private int length;
	private City city1;
	private City city2;
	//constructor for a road, it also connects to 2 cities
	public Road(City city1,City city2,int length) {
		this.length=length;
		this.city1=city1;
		this.city2=city2;
		city1.connect(this);
		city2.connect(this);
	}
	
	//returns city connected to a road
	public City getCity1() {
		return city1;
	}
	//returns city connected to a road
	public City getCity2() {
		return city2;
	}
	//road length
	public int getLength() {
		return length;
	}
	

}
