
// draw the board to the console.
public class drawBoard {
    Board board;
//    int n;
    int width;
    int height;
    public drawBoard(Board board){
        this.board = board;
        this.height = board.getHeight();
        this.width = board.getWidth();
    }

    public void draw(Board board){
        for(int i = 0; i < 2*height+1; i++){
            for(int j = 0; j < 2*width+1; j++){
                if(i%2 == 0){
                    System.out.printf("-");
                }
                else if(j%2 == 0){
                    System.out.printf("|");
                }
                else {
                    System.out.printf(board.board[Math.floorDiv(i,2)][Math.floorDiv(j,2)]);
                }
            }
            System.out.println("");
        }
    }
}
