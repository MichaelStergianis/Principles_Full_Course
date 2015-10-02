abstract public class Shape{

	protected String shapeName;

	public Shape(String shapeName){
		this.shapeName = shapeName;
	}

	public String getName(){
		return shapeName;
	}
	abstract public double getArea();
}
