public class Bench {
  public static void main(String args[]) {
    final long startTime = System.currentTimeMillis();

    sortBenchmark();
    nQueensBenchmark();

    final long endTime = System.currentTimeMillis();
    System.out.println("Time taken: " + (endTime - startTime));
  }

  private static void sortBenchmark() {
    final int[] values = new int[11000];
    final java.util.Random r = new java.util.Random(16);
    for (int i = 0; i < values.length; i++) {
      values[i] = r.nextInt();
    }
    System.out.println(""+values[0]);
    for (int i = 0; i < values.length; i++) {
      for (int j = i+1; j < values.length; j++) {
        if (values[i] < values[j]) {
          // swap
          final int tmp = values[j];
          values[j] = values[i];
          values[i] = tmp;
        }
      }
    }
    System.out.println(""+values[0]);
  }

  private static void nQueensBenchmark() {
   placeQueens(21);
  }

  // Credit: http://javabypatel.blogspot.in/2015/09/backtracking-n-queens-problem.html
 private static void placeQueens(int gridSize) {
  if(gridSize<4){
   System.out.println("No Solution available");
  }else{
   int[] board = new int[gridSize]; // Lets take example of 4*4
   placeAllQueens(board, 0);
   printBoard(board);
  }
 }

 private static boolean placeAllQueens(int[] board, int row) {
  if(row == board.length){
   return true;
  }

  boolean isAllQueensPlaced = false;
  for (int column = 0; column < board.length; column++) {
   board[row] = column;
   if(isSafe(board, row)){
    isAllQueensPlaced = placeAllQueens(board, row+1);
   }

   if(isAllQueensPlaced){
    return true;
   }
  }
  return false;
 }


 // Return true if queen placement board[row] does not conflict with
 // other queens board[0] through board[row-1]
 private static boolean isSafe(int[] board, int row) {
  for (int i = 0; i < row; i++) {
   //Check any column
   if(board[row] == board[i]){
    return false;
   }
   //Check upper left and upper right diagonal
   if(Math.abs(board[row] - board[i]) == Math.abs(row-i)){
    return false;
   }
  }
  return true;
 }

 private static void printBoard(int[] board) {
  // for (int i = 0; i < board.length; i++) {
  for (int i = 0; i < 4; i++) {
   // for (int j = 0; j < board.length; j++) {
   for (int j = 0; j < 4; j++) {
    if(j==board[i]){
     System.out.print("Q ");
    }else{
     System.out.print("_ ");
    }
   }
   System.out.println();
  }
 }
}
