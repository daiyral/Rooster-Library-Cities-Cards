package cities;

public class City {
	private String cityName;
	private Road[] roads;
	private int numRoads;
	
	//city constructor builds a city with an empty array of roads
	public City(String name) {
		cityName=name;
		roads=new Road[10];
	}
	//connects a road to a city
	public void connect(Road r) {
		roads[numRoads]= r;//add a road to the cities road array
		numRoads++;//update the number of roads in the city
	}
	//finds the nearest city to a city
	public City nearestCity() {
		if (numRoads==0)//if the city is isolated return null
			return null;
		int minLen=roads[0].getLength();
		int minIndex=0;
		for(int i=1;i<numRoads;i++){//find the shortest road and return it's index
			if(roads[i].getLength()<minLen)
			{
				minLen=roads[i].getLength();
				minIndex=i;
			}
		}
		return roads[minIndex].getCity2();	//return the city connected to the shortest road as it's the closest city 
	}
	public String toString() {
		return cityName;
	}
}
