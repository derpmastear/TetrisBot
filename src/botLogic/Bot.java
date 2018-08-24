/**
 * 
 */
package botLogic;

/**
 * @author rippo
 *
 */
public class Bot {
	private Tetromino[] myPieces;
	private Visualizer myVisualizer;
	private int myStrategy;
	public Bot(Visualizer v)
	{
		myVisualizer = v;
		myPieces = myVisualizer.getPieces();
	}
	public void placePiece(int x)
	{
		
	}
	
	public void getQueuedPieces()
	{
		myPieces = myVisualizer.getPieces();
	}
	
	public void initializeKeyboard()
	{
		
	}
	public void setStrategy(int s)
	{
		myStrategy = s;
	}
	// Integers are such as follows: 1 - tetris, 2 - 2w, 3 - 3w, 4 - 4w, 5 - tspin, 6 - perfect clear
}
