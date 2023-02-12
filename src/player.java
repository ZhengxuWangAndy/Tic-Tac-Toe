
// define the player structure and basic method
public class player {
    String name = "";
    int score = 0;
//    String currentTeam = "";
    String symbol = "";

    public void player(){}

    public void setSymbol(String symbol){ this.symbol = symbol;}

    public void setName(String name){
        this.name = name;
    }

    public void addScore(){
        this.score += 1;
    }

    public String getName(){ return this.name;}

    public int getScore(){ return this.score;}

}
