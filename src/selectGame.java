import java.util.Scanner;

// let user select which game to play
public class selectGame extends Game{
    public selectGame(){

    }
    public String select(){
        String type = "";
        System.out.println("Which game do you want to play?");
        System.out.println("Enter 1 tic tac toe");
        System.out.println("Enter 2 orders and chaos");
        System.out.println("Enter exit quit the game");

        while (!(type.equals("1") || type.equals("2"))) {
            System.out.println("Please input a valid number");
            Scanner in = new Scanner(System.in);
            type = in.nextLine();
            if(type.equals("exit")){
                System.out.printf("Bye!");
                System.exit(0);
            }
        }
        return type;
    }
}
