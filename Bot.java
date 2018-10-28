import java.awt.Robot;
import java.awt.AWTException;
class Bot
{
   private static Field field;
   private static Robot robot;
   public Bot(Field f)
   {
      try{
         field = f;
         robot = new Robot();
      }
      catch(AWTException e) { 
      }
   }
   
   public static void press(int id)
   {
      robot.keyPress(id);
      robot.keyRelease(id);
   }
   public static void hold(int id) throws Exception
   {
      Thread t = new Thread(
         new Runnable() {
         
            public void run() {
                  robot.keyPress(id);
            }
         });
      t.start();
      Thread.sleep(100);
      robot.keyRelease(id);
   }
}