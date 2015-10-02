import java.lang.Exception;

public class Rectangle extends Shape{
	private double length, width;
	public Rectangle(double length, double width) throws Exception{
		super("Rectangle");
		Exception e = new Exception("Length and width must be greater than 0");
		if (length <= 0 || width <= 0){
			throw e;
		} else {
			this.length = length;
			this.width = width;
		}
	}

	public double getArea(){
		return (length * width);
	}
}
