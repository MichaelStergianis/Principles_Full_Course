import java.lang.Exception;

public class Square extends Shape{
	protected double side;

	public Square(double side) throws Exception{
		super("Square");
		Exception ex = new Exception("Side must be greater than 0");
		if (side <= 0){
			throw ex;
		}
		else
			this.side = side;
	}
	
	public double getArea(){
		return (side*side);
	}
}
