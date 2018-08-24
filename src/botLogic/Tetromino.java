package botLogic;

public class Tetromino {
	private int[][] myShape;
	private final int height;
	private final int width;
	public Tetromino(int h, int w)
	{
		height = h;
		width = w;
		myShape = new int[w][h];
	}
	public int[][] turnRight()
	{
		int[][] result = new int[width][height];
		return result;
	}
	public int[][] turnLeft()
	{
		int[][] result = new int[width][height];
		return result;
	}
}
