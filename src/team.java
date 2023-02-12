import java.util.HashMap;

// define the team struct, add player at this team and get the whole team score.
public class team{
    String name = "";
    int score = 0;
    HashMap<String, player> playerMap = new HashMap<String, player>();
    public void team(){

    }

    public void setName(String name){
        this.name = name;
    }

    public void setScore(int score){
        this.score = score;
    }

    public void addPlayer(player p){
        playerMap.put(p.name,p);
    }

    public int getScore(){
        // recalculate the whole teams score
        this.score = 0;
        playerMap.forEach((key, value) ->{
            this.score += value.getScore();
        });
        return this.score;
    }

}
