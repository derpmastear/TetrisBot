import java.awt.event.KeyEvent;
class Runtime
{
   private final static int left = KeyEvent.VK_LEFT;
   private final static int right = KeyEvent.VK_RIGHT;
   private final static int space = KeyEvent.VK_SPACE;
   private final static int x = KeyEvent.VK_X;
   private final static int z = KeyEvent.VK_Z;
   private final static int c = KeyEvent.VK_C;
   public static void main(String[] args) throws Exception
   {
      Field playField = new Field();
      Bot tetrisBot = new Bot(playField);
      Thread.sleep(2000);
      tetrisBot.press(KeyEvent.VK_R);
      Thread.sleep(2000);
      for(int a = 0; a < 5; a++)
      {
         tetrisBot.press(left);
         tetrisBot.press(space);
         tetrisBot.hold(left);
         tetrisBot.press(space);
         tetrisBot.press(right);
         tetrisBot.press(space);
         tetrisBot.hold(right);
         tetrisBot.press(space);
      }
   }
}