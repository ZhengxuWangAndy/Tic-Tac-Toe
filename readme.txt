## Files
---------------------------------------------------------------------------
<A brief description of each file and what it does>

Classes below:
Board		define the board data struct and judge winner method for each turn.  
drawBoard	draw the board to the console.  
Game		the parent of all game  
gameInitialization	define the parameters of every game and instance the Board and drawBoard class  
Main		Control the top process  
OrderChaos	control the process of order and chaos game  
player		define the player structure and basic method  
PrintAllRecord	use for print the current teams players and their scores situation  
selectGame	let user select which game to play  
setTeamsPlayers	use for set up teams and players. only need set one time on the beginning  
team		define the team struct, add player at this team and get the whole team score.  
Tic		control the process of order and chaos game  


## Notes
---------------------------------------------------------------------------
1. <Files to be parsed should be stored in ConfigFiles, for parser class to
read class>

My game only have 2 parameters that do not need user to input. It's the order & chaos' rules of board size and win condition. So it is not necessary to store in ConfigFiles. Other parameters used interact input by user.

2. <Bonus Done>

It is possible to create a board with a different number of rows and columns.

It is possible to select a position on the board that has previously been selected or not even on the board.

It is possible for the game to never end.

My game can be played with different size boards and run seamlessly.

Each team can alternate players during each round.

Each round of the game can be played by two specific team members.


3. <Notes to grader>

Can add many teams and players, the score could add to each player and each team's score is the all players' score total.

Clearly prompt and Team board.

Can exit anytime.

Can robustly process any possible wrong input.(including give String to number, wrong format and etc.) 

Highly completed.


## How to compile and run
---------------------------------------------------------------------------
1. Navigate to the directory "pa1" after unzipping the files
2. Run the following instructions:
<Example below>
javac -d bin src/*.java
java -cp bin Main

## Input/Output Example (the output is to much so I only Tag the input line use [input]:)
---------------------------------------------------------------------------

/Users/zhengxuwang/Library/Java/JavaVirtualMachines/openjdk-18.0.2.1/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA 2.app/Contents/lib/idea_rt.jar=57464:/Applications/IntelliJ IDEA 2.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/zhengxuwang/IdeaProjects/HW01/out/production/HW01 Main
Welcome to the game!		Author: Zhengxu Wang
You can input 'exit' whenever you want to quit the game
How many teams do you want? please input more than 1.
[input]:3
Please input No.1 team name. Please input a valid name that different from others and not null.
[input]:BOS
Please input No.2 team name. Please input a valid name that different from others and not null.
[input]:NY
Please input No.3 team name. Please input a valid name that different from others and not null.
[input]:LA
Now we have 3 teams, [BOS, NY, LA]
===================================================
Now we can add player for team BOS
How many players do you want to add. Please input an integer more than 0.
[input]:1
What is the player's name? Please make sure every player have different name.
[input]:Zhengxu
Now we can add player for team NY
How many players do you want to add. Please input an integer more than 0.
[input]:2
What is the player's name? Please make sure every player have different name.
[input]:Drake
What is the player's name? Please make sure every player have different name.
[input]:Nicky
Now we can add player for team LA
How many players do you want to add. Please input an integer more than 0.
[input]:3
What is the player's name? Please make sure every player have different name.
[input]:Tom
What is the player's name? Please make sure every player have different name.
[input]:Jerry
What is the player's name? Please make sure every player have different name.
[input]:Joe
Now we have teams and players.
===================================================
Which game do you want to play?
Enter 1 tic tac toe
Enter 2 orders and chaos
Enter exit quit the game
Please input a valid number
[input]:1
Welcome to the
.___________. __    ______    .___________.    ___       ______    .___________.  ______    _______ 
|           ||  |  /      |   |           |   /   \     /      |   |           | /  __  \  |   ____|
`---|  |----`|  | |  ,----'   `---|  |----`  /  ^  \   |  ,----'   `---|  |----`|  |  |  | |  |__   
    |  |     |  | |  |            |  |      /  /_\  \  |  |            |  |     |  |  |  | |   __|  
    |  |     |  | |  `----.       |  |     /  _____  \ |  `----.       |  |     |  `--'  | |  |____ 
    |__|     |__|  \______|       |__|    /__/     \__\ \______|       |__|      \______/  |_______|
                                                                                                    
Here are the current teams and players.
Team : BOS 		 Score: 0  
	Player : Zhengxu 		 Score: 0  
Team : NY 		 Score: 0  
	Player : Nicky 		 Score: 0  
	Player : Drake 		 Score: 0  
Team : LA 		 Score: 0  
	Player : Joe 		 Score: 0  
	Player : Tom 		 Score: 0  
	Player : Jerry 		 Score: 0  
===================================================
Round 1 Game start!
What's the board size do you want to play？
Please input an integer n means the board size of n*n. Valid number needs greater than 2
[input]:3
Here is your board.
-------
| | | |
-------
| | | |
-------
| | | |
-------
===================================================
And current team board.
Team : BOS 		 Score: 0  
	Player : Zhengxu 		 Score: 0  
Team : NY 		 Score: 0  
	Player : Nicky 		 Score: 0  
	Player : Drake 		 Score: 0  
Team : LA 		 Score: 0  
	Player : Joe 		 Score: 0  
	Player : Tom 		 Score: 0  
	Player : Jerry 		 Score: 0  
===================================================
The first team is? Please input a valid name that include in team board
[input]:BOS
The player name is? Please input a valid name that include in this team
[input]:Zhengxu
What is the symbol would you like? Use for mark the piece
[input]:#
===================================================
And another team is? Please input a valid name that include in team board.
[input]:LA
The player name is? Please input a valid name that include in this team
[input]:Jerry
What is the symbol would you like? Use for mark the piece (Not null and different from opponent)
[input]:0
===================================================
Here is the board below
-------
| | | |
-------
| | | |
-------
| | | |
-------
It's Zhengxu turn
What's position would you want to?(please input a valid number split with space)
For example:2 3
[input]:0 0
-------
|#| | |
-------
| | | |
-------
| | | |
-------
===================================================
It's Jerry turn
What's position would you want to?(please input a valid number split with space)
For example:2 3
[input]:0 1
-------
|#|0| |
-------
| | | |
-------
| | | |
-------
===================================================
It's Zhengxu turn
What's position would you want to?(please input a valid number split with space)
For example:2 3
[input]:1 1
-------
|#|0| |
-------
| |#| |
-------
| | | |
-------
===================================================
It's Jerry turn
What's position would you want to?(please input a valid number split with space)
For example:2 3
[input]:0 2
-------
|#|0|0|
-------
| |#| |
-------
| | | |
-------
===================================================
It's Zhengxu turn
What's position would you want to?(please input a valid number split with space)
For example:2 3
[input]:2 2
-------
|#|0|0|
-------
| |#| |
-------
| | |#|
-------
===================================================
Congratulation! Zhengxu WIN!!!
Team : BOS 		 Score: 1  
	Player : Zhengxu 		 Score: 1  
Team : NY 		 Score: 0  
	Player : Nicky 		 Score: 0  
	Player : Drake 		 Score: 0  
Team : LA 		 Score: 0  
	Player : Joe 		 Score: 0  
	Player : Tom 		 Score: 0  
	Player : Jerry 		 Score: 0  
===================================================
Do you wanna play another round? y/n
[input]:y
Here are the current teams and players.
Team : BOS 		 Score: 1  
	Player : Zhengxu 		 Score: 1  
Team : NY 		 Score: 0  
	Player : Nicky 		 Score: 0  
	Player : Drake 		 Score: 0  
Team : LA 		 Score: 0  
	Player : Joe 		 Score: 0  
	Player : Tom 		 Score: 0  
	Player : Jerry 		 Score: 0  
===================================================
Round 2 Game start!
What's the board size do you want to play？
Please input an integer n means the board size of n*n. Valid number needs greater than 2
[input]:exit

Process finished with exit code 0
