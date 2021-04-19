package root;
public class Rooter {
	private double precision;
	/*construct a new rooter*/
	public Rooter(double precision) {
		
		this.precision=precision;
	}
	/*set the precision of the rooter*/
	public void setPrecision(double precision) {
		this.precision = precision;
	}
	/*calculate the sqrt of given number according to the precision*/
	public double sqrt(double x) {
		double one= x/2;
		while(true)
		{
			double two=x/one;
			if(one==two) return one;
			if(Math.abs((one-two))<precision) return one;
			one = (one+two)/2;
		}
	}
}
