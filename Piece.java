class Piece
{
   private int rotation;
   /*
   0 = spawn state
   1 = state resulting from a clockwise rotation ("right") from spawn
   2 = state resulting from 2 successive rotations in either direction from spawn.
   3 = state resulting from a counter-clockwise ("left") rotation from spawn
   */
   private int type; 
   private boolean placing;
   public Piece(int id)
   {
      type = id;
      placing = false;
      rotation = 0;
   }
   public void rotateRight()
   {
     rotation++;
     if(rotation > 3)
     {
         rotation = rotation - 4;
     }  
   }
   public void rotateLeft()
   {
      rotation--;
      if(rotation < 0)
      {
         rotation = rotation + 4;
      }
   }
   public int rotationVal()
   {
      return rotation; 
   }
}