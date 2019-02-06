
public class rectangleMethods 
{
	private int rectangleWidth = 0;
	private int rectangleLength = 0;

	public void setWidth(int num1)
	{
		rectangleWidth = num1;
	}
	
	public void setLength(int num1)
	{
		rectangleLength = num1;
	}
	
	public int getWidth()
	{
		return rectangleWidth;
	}
	
	public int getLength()
	{
		return rectangleLength;
	}
	
	public int getArea()
	{
		return rectangleLength * rectangleWidth;
	}
	
	public double getDiagonal()
	{
		return Math.sqrt((Math.pow(rectangleLength, 2)) + (Math.pow(rectangleWidth, 2)));
	}
	
}