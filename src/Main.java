import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

// Control the top process
public class Main {
    public static void main(String[] args) {


        // set the team and players, 2-n team each team 1-n player.
        // every team have different name, every player have different name.
        selectGame game = new selectGame();
        setTeamsPlayers teamBuilder = new setTeamsPlayers();
        LinkedHashMap<String, team> teamMap = teamBuilder.setTeamsPlayers();



        Scanner in = new Scanner(System.in);


        while (true){
            // select which game
            String type = game.select();

            if (type.equals("1")) {
                // Tic tac toe
                Tic tic = new Tic();

                while (tic.turnNum != 0) {
                    tic.ticRound(teamMap);
                    String answer = "y";
                    while (!answer.equals("n")) {
                        System.out.println("Do you wanna play another round? y/n");
                        answer = in.nextLine();
                        if (answer.equals("exit")) {
                            System.exit(0);
                        }
                        if (answer.equals("y")) {
                            tic.gameOver = false;
                            tic.ticRound(teamMap);
                        } else if (answer.equals("n")) {
                            tic.turnNum = 0;
                            break;
                        }
                    }
                }
                System.out.println("Thank you for your playing Tic tac toe");
                System.out.println("===================================================");

            } else if (type.equals("2")) {
                //Order and Chaos
                OrderChaos order = new OrderChaos();

                while (order.turnNum != 0) {
                    order.orderRound(teamMap);
                    String answer = "y";
                    while (!answer.equals("n")) {
                        System.out.println("Do you wanna play another round? y/n");
                        answer = in.nextLine();
                        if (answer.equals("exit")) {
                            System.exit(0);
                        }
                        if (answer.equals("y")) {
                            order.gameOver = false;
                            order.orderRound(teamMap);
                        } else if (answer.equals("n")) {
                            order.turnNum = 0;
                            break;
                        }
                    }
                }
                System.out.println("Thank you for your playing Order and Chaos");
                System.out.println("===================================================");
            }
        }

    }
}