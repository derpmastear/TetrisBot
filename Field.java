class Field
{
   boolean[][] matrix;
   Piece[] pieces;
   public Field()
   {
      matrix = new boolean[20][10]; //[rows][columns]
      for(int a = 0; a < 20; a++)
      {
         for(int b = 0; b < 10; b++)
         {
            matrix[a][b] = false;
         }
      }
      pieces = new Piece[6]; 
   }
}