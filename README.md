
# P1-ROBOTMANIA PROJECT
- Nakul Nandhakumar - [@nakulnandhakumar](https://github.com/nakulnandhakumar)
- Vihan Jayaraman  - [@VihanJ](https://github.com/VihanJ)
- Sara Beniwal - [@saraben21](https://github.com/saraben21)
- Yasaswi Singamneni - [@YasaswiS](https://github.com/YasaswiS)
- Sanvi Pal - [@sanvi1855544](https://github.com/sanvi1855544)

## Overview of Project

- As an overview, our project focuses on incorporating UI into games such as Battleship, Connect Four, and Hangman to provide an interactive appeal to the user
- Instead of playing games on the console, they can use a more user-friendly version with simple to understand buttons, intriguing graphics, and vivid colors. 
- Each member has made sure to make their own mark on the project, through the multiple games the user can choose from.

## Project Highlights

#### **Battleship (One Player Game):** 
- Are you a fan of the classic two person game? Well here is our twist of the game using Java!
    - Guess where your enemy's ships are placed on a custom GUI and sink them! Beware, you only have a certain amount of guesses before your enemies are alerted!
    - Our easy to use interface makes the game much more simple and enjoyable.
- Battleship uses an MVC code format, however, our Battleship is special because of it's double model relationship, class Board and Class Ship
- In class Board, the board where the enemy ships will be placed is created using arraylists to create indices
- In class Ship, the enemy ships are created based on the specified amount, each one more unit longer than the other. Other information such as ship lengths and orientation are also initialized here and all of this information is added to a stack called shiplist
- In the class BattleshipControl, the baord and ship information are received from the model classes and then a method uses the information from the stack shiplist and prints the enemy ships on the enemy board. As the player presses buttons to guess, a recursive method is run to keep checking for hits until the player wins or runs out of turns

![](BattleshipGIF.gif)

#### **Connect Four (Two Player Game):** 
- Try this UI version of Connect Four! Press buttons that coordinate to certain columns to "drop" your pieces. 
- Play with a friend and compete to see who will make four in a row first!

![](ConnectFourGIF.gif)

#### **Hangbot:** 
- A fan of hangman? Check out hangbot, a single player game that will test your guessing ability.
- With a plethora of words and an engaging UI, you will be sure to enjoy this game!

![](HangbotGIF.gif)

#### **Calculators:** 
- Are you tired of your phone's boring calculator? Since you said yes, take a look at our one-of-a-kind and user-friendly calculators!
- With creative and ingenious M double-V C programming, you can experience the joy of a console or a user interface caluclator that you can freely switch between!
- Check out TrioCalculator or SaraSanviCalculator if you want to have the most enjoyable calculator ever (Note: In order to experience SaraSanviCalulator Console verison, you will have to end the runtime of the code and choose from the main menu again)

![](CalculatorGIF.gif)

#### **HelloGame** 
- As part of our IntelliJ projects, we wanted to move over some of our old console UI code into our IntelliJ platform and see if we could incorporate some UI based elements inside it.
- This is just some testing and experimenting we have done with GUIs for learning purposes using HelloGame as an example.

## HOW TO RUN CODE:
- **MAIN FILE METHOD**
    - Find the /Main directory under the /src directory on the left
    - Open the Main.java file
    - Find the main method of the file
    - Click the green play button on the left, near the line numbers
    - Once you have run it once, if you want to run it again, just hit the green play button on the right side of the top bar of the IntelliJ Window
    
- **JAR FILE METHOD** [Tutorial To Create JAR File](https://docs.google.com/document/d/1FkWllDalq6lbXXn5N-mtvU0xlS8zBNXp2Xo21JkgmDQ/edit?usp=sharing)
    - Open the /out directory on the left
    - Open the /artifacts directory
    - Open the /p1_robotmania_jar directory
    - Right click on the "main.jar" file
    - Right click, scroll over "Copy", then click "Absolute Path"
    - Open up the terminal tab at the bottom of the IntelliJ workspace
    - Type the following: java -jar ***Copied Path***
    - Press "enter" on your keyboard and enjoy!

## RUNTIME GUIDANCE:
- After running the code, a main menu will pop-up
- If it doesn't look for a new icon appearing on the bottom of your desktop or computer and click it
- Once the menu is opened, scroll over the tabs at the top of the menu bar and look through the drop down menus for the name of the application you want to run
- Once the application is found, click it
- You will be brought to the start of the application
- Once completed with the application, close the application window
- If the application window is closed and the code hasn't stopped running, do not pick a new application from the menu window and close it to prevent any code from breaking
- If you want to see another application, run the project again and repeat the previous steps

## SELF GRADE (25% of Project)
- Nakul Nandhakumar - 24% (MVP)
    - **Comments:** A great integrator, patient teacher, always helps his teammates both in an outside of class, really helpful when tackling issues with version control, great with GUI creation, hard worker
- Vihan Jayaraman - 24%
    - **Comments:** Amazing work for Battleship and other project code logic, especially logic for setting enemy ships and solving overlap issues, helps his teammates when they need help, very focused
- Sara Beniwal - 24%
    - **Comments:** Someone who has really good organization skills, good README layouts, great notetaker, became proficient in java syntax quickly, very hard worker
- Yasaswi Singamneni - 24%
    - **Comments:** A person with great foundations in java, helps the team with java syntax at the beginning of tri, great in integration, very determined and focused
- Sanvi Pal - 24%
    - **Comments:** A person who doesn't give up easily, went from knowing almost nothing about java, git, and intellij at the start of tri, to becoming proficient in them now, great learning capacity, always positive

## WEEK 10 UPDATES

| Person | Code/Artifacts |
| ------ | ------------- |
| Nakul Nandhakumar| <p>**COMPLETED:**<br />- Abstracted method of [button color](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/BattleshipGame/BattleshipUI.java#L305) change in Battleship from control to view <br> - Added [turn limit](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/BattleshipGame/BattleshipControl.java#L112) to Battleship <br> - [Abstracted turn limit label updates](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/BattleshipGame/BattleshipUI.java#L315) to BattleshipUI <br> - Added General Reflections to Journal (3rd entry from the first) <br> - Added Stacks and Queues Entry to journal (second to last entry) <br> <br> **TO-DO** <br> - Reformat the GUIs into java code from swing designer forms|
| Sanvi Pal| - Integrated personal notes and research such as Blended Learning Model, AGILE, Stacks & Queues into journal <br> - Worked on getting rid of the [Hangman](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/Hangman/Hangman.java) bug where it is not detected in the images <br> - Created code demonstrating [Stacks](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/Stacks/StackDemo.java)
| Yasaswi Singamneni| COMPLETED: <br> - Created a GUI for HelloGame <br> - Finished [HelloGame](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/HelloGame/HelloGameGUI.java) <br> - Added [Image](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/HelloGame) code <br> - Added [File IO](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/HelloGame/HelloGameGUI.java#L114) to save answers <br><br> TO-DO: <br>- Add GIF of code/GUI running <br> - Fix formatting errors|
| Vihan Jayaraman| <p>**COMPLETED:**<br />- Cleaned up GUI of Battleship - Better looking buttons <br />- Added Icons to Battleship <br> <br> **TO-DO:** <br>- Add two player mode<br />- create safe exit function</p> |
| Sara Beniwal| - Focused on completing the calculator MVC project as well as updating/finalizing our pair share journals <br> - For the calculator MVC, decided to use an [arraylist](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/CalculatorGUI.java) to keep the expression and operator strings saved in order to update the calcInput JLabel <br> - Created a CalculatorGUI constructor and classes for updating calcArea, clearing calcArea, and determining the answer <br> - Created the [CalculatorOperations](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/CalculatorOperations.java) class, which had all of the operations but in one place <br> - Separated the single and double arg ops by calling the args/ops two times -- one for each type <br> - Created a [main](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/Calculator.java) which would ask the user to input a number depending on which calculator code they would like to run -- GUI based (my work) or console based (Sanvi’s work) <br> - Finalized MVC for the calculator <br> - Learned that in terms of GUI, the model was the [CalculatorOperations](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/CalculatorOperations.java) class, the view was the [GUI form](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/CalculatorGUI.form), and the control was the main within the [CalculatorGUI](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/CalculatorGUI.java) class

## WEEK 9 UPDATES

| Person | Code/Artifacts |
| ------ | ------------- |
| Nakul Nandhakumar| <p>**COMPLETED:**<br />-Finished [Model](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorData.java#L4) for Calc <br> -Instantiated [CalcGUI](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorControl.java#L16) and [CalcData](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorControl.java#L15) in CalcControl <br> -Finished [Menu in Control](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorControl.java#L74) for Calc <br> -Abstracted Models ([Ship](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/BattleshipGame/Ship.java#L5) model and [Board](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/BattleshipGame/Board.java#L5) model), [View](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/BattleshipGame/BattleshipUI.java#L6), and [Control](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/BattleshipGame/BattleshipControl.java#L13) for Battleship <br> -Implemented Stacks in [BattleshipControl](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/BattleshipGame/BattleshipControl.java#L26), [Model](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/BattleshipGame/Ship.java#L46), and [Bubble Sort](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/BubbleSort/Student.java#L30) <br> -Added old repl.it project code to project and [main menu](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/Main/Main.java#L150) <br> -Created [executable JAR file](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/out/artifacts/p1_robotmania_jar/main.jar) and tutorial for main class <br> -Created BlueJ code modeling for [Calculator and Battleship](https://docs.google.com/document/d/1vppNjLiFR90s7xUZCyNaEpjVviBTeIO0ZWKb4DkyrbI/edit?usp=sharing) (top image is battleship, bottom image is calculator) <br> <br> **TO-DO** <br> -Add Stacks and Queues entry in journal <br> -Add reflections to journal <br> -Update README with Git, IntelliJ, SwingDesigner, etc., instructions <br> -Add turn limit for battleship
| Sanvi Pal| - Worked on separating code into MVC,  creating the pseudocode in BlueJay, and getting rid of bugs for Hangman. <br> Separating code- <br> [ArgData](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/ArgData.java) <br> [ArgOp](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/ArgOp.java) <br> [ConsoleBasedUI](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/ConsoleBasedUI.java) <br> - Model was ArgData and it contained the accessor and setter method that stored the arguments and operator <br> - View was ConsoleBasedUI and it had the elements of the program that interacted with the user <br> - Control contained all all the operations in the form of two switches-one for  single argument operations and one for double argument operations <br> Bluejay- <br> - Made pseudocode that demonstrates MVC as shown by the arrows <br> - ConsoleBasedUI points to ArgData because the view interacts with the user and relays the arguments and operator to ArgData, the model which stores these values. ArgOp points to ArgData as it gets the arguments and operator to perform the operation on them. ConsoleBasedUI points to ArgOp as it creates an instance or ArgOp while printing the answer <br> Bugs in Hangman- <br> - Issue was that my Hangman code ran in my local IDE but the repo didn’t detect form <br> - Redid my GUI form on swing designer and got rid of the bug that way <br> - Another bug occurred where the program can’t detect the images. Will work on fixing this next week.
| Yasaswi Singamneni|COMPLETED: <br> - Started control for [HelloGame](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/HelloGame/HelloGameGUI.java) <br> - Added [Image](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/HelloGame/unnamed.png) to HelloGameGUI form <br> TO-DO: <br>- Finish control code for HelloGame <br> - Add File I/O to save answers <br> - Fix bugs in switch cases|
| Vihan Jayaraman| <p>**COMPLETED:**<br />- Added "Winner" dialog to Battleship game<br />- Modified the GUI of Battleship<br />-Discovered how to dynamically create GUI with coding only.</p> <p>**TO-DO:**<br />- Make a two-player mode for Battleship<br />- Create a safe exit function to close Battleship when finished and return to main menu<br />- Improve GUI with icons.</p>|
| Sara Beniwal| - Completed and finalized the [Connect Four UI game](https://github.com/nakulnandhakumar/p1-robotmania/tree/master/src/ConnectFourGame) I had been focused on for the past few weeks <br> - Worked on planning out MVC using pseudo code and BlueJ <br> - Created a class to initialize the player’s turn and add action listeners <br> - Created a [main](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/ConnectFourGame/ConnectFourGUI.java) (would serve as control in terms of MVC) to initialize the board <br> - Added an [action performed and mark grid class](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/ConnectFourGame/ConnectFourGUI.java) to establish the “dropper” and the change of colors for each player <br> - Utilized the [ternary operator](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/ConnectFourGame/ConnectFourGUI.java) to alternate turns <br> - Needed to integrate the model, or the [ConnectFourAlgorithms class](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/ConnectFourGame/ConnectFourAlgorithm.java), in order to check for win each turn


## WEEK 8 (SELF-ADVOCACY WEEK) UPDATES

| Self Grade | Person | Code/Artifacts |
| ---------- | ------ | ------------- |
| **19/20** (Self) **5/5** Scrum Leader (Nakul was contributing to the group and met his goals for the week) | Nakul Nandhakumar | This past week, I worked on the main project menu and my trio team's Calculator. For the main menu, I created a [Main Menu GUI](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/Main.java#L18) in Swing designer and added [buttons for each file](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/Main.java#L10) in our project to be clicked for accessing those files. I added actionlisteners to call the .main method of each major file. For the Calculator, I created a [Console UI](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorConsoleUI.java#L4) and started to separate MVC. In the ConsoleUI, I created a method [setUp()](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorConsoleUI.java#L14) with a [ConsoleMenu](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorConsoleUI.java#L15) to choose operations from and turned it into a [recursive function](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorConsoleUI.java#L39) to keep calculating until the user exits. For separating MVC, I have created a separate class [CalculatorData](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorData.java#L4) for the model and have abstracted all the model methods and functions, for exmaple, things like [setarg1](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorData.java#L22), [setarg2](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorData.java#L26), [calculate](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorData.java#L30), and [setmathop](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorData.java#L18). I have made control an intermediary that [calls](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorContrl.java#L56) these model methods when the UIs need them throught the [object model](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorContrl.java#L23) of the class CalculatorData. I created a GUI form for the contorl to serve as a menu to let the user [choose which UI he wants to use](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorContrl.java#L25). I have abstracted the methods specific to view, like [updateCalcArea](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorGUI.java#L43), and clearCalculator, to the view files. <br> <br> **TO-DO:** - Create methods and object for view in control to control the CalcGUI view. -Create drop down menu for the main Menu instead of buttons. -Start to improve the GUI for battleship and other GUIs. |
| **19/20** (Self) **5/5** Scrum Leader (Sara was contributing to the group and almost met all her goals for the week) | Sara Beniwal | This week was self advocacy week, where we provided our goals early on in the week in hopes of accomplishing them by the end. My goals were to finish the Connect Four UI code, write up our readme with clear-to-see information, update my journal, and work on the calculator GUI. I was able to meet three of these four goals: first, I took the initiative of rewriting the readme following Mr. M's feedback to make the project clear to understand and run. Secondly, I focused on updating the journal for this week with details of progress, tech talks, and a reflection. Lastly, I broke down Mr. M's [calculator MVC](src/SanviSaraCalculator/CalculatorUI.java) project by analyzing his code and developing a plan to incorporate version control to show at the end of next week. The one thing I was unable to accomplish was completing the [Connect Four UI](src/ConnectFourGame/ConnectFourGUI.form), although I did make some progress. I believe I overestimated what I could accomplish on this shorter week. However, I made sure to complete the UI look and transfer the algorithms necessary to complete the assignment. <br> <br> **TO-DO:** - Complete both the calculator and Connect Four assignments. Finalize journal and tie any loose ends on the readme/project.  |
| **19/20** (Self) **4/5** Scrum Leader (I was contributing to the group and almost met all my goals for the week. I took off a point because I encountered bugs in my console UI code and dedicated time getting rid of those. This led me to not meet my goal of finishing the Hangman GUI (although I did make progress).) | Sanvi Pal | This past week I mainly focused on making the ConsoleBased UI of the Calculator and working on the Hangman GUI. For the Console Calculator UI, I created the [text based menu](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/ConsoleBasedUI.java#L7) where users input their choice of operation, and I created 2 other class files, [singleArgOp](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/singleArgOp.java#L6) and [doubleargOp](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/SanviSaraCalculator/doubleargOp.java#L6) where I call methods to save and calculate answers based on how many arguments are needed for the operation. For the Hangbot GUI, I worked on referencing images within the IntelliJ project file and created the GUI outline using SwingDesigner. <br> <br> **TO-DO:** Work on image displaying for HangbotGUI through JLabel and finishing the Hangbot GUI. Work on separating MVC for CalculatorGUI and ConsoleBasedUI. Create better user experience for Calc Console Based UI (through ASCII art) |
| **19/20** (Self) **5/5** Scrum Leader (Vihan was contributing to the group and met his goals for the week) | Vihan Jayaraman | This past week I worked on the Battleship game and fixing up the final bugs and redundancies:. The most prominent bug was that the game would not account for overlapping ships on the game board. The player wasn't able to finish the game, because the game believed there were more distinct ship tiles than there actually were. This issue was caused by there being no check to see if there was already a ship tile in the spot that the game was currently setting a ship tile. Implementing this check was as simple as checking if the current tile was equal to the nunmerical value assigned to ship tiles (in this case it was 1), and if that was the case, the game would subtract 1 from the number of distinct ship tiles [Checking Code](https://github.com/nakulnandhakumar/p1-robotmania/blob/a13a810d5278ea40ae70f3b3ff873f7fcba945fa/src/BattleshipGame/BattleshipGUI.java#L374). I also removed the junk code in BattleshipGUI. <br> <br> **TO-DO** - Create a more graphically pleasing GUI for Battleship, and implement an option for two players, as well as work on GUI screen that tells the player they have won (at the moment the program only detects when the player has won, but doesn't display).  |
| **19/20** (Self) **5/5** Scrum Leader (Yasaswi was contributing to the group and almost met all his goals for the week) | Yasaswi Singamneni | This week, I added a GUI to my [HelloGame](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/HelloGame/HelloGame.java#L31), which curently displays an image of a robot, but will later have a text field in order for the user to input their answer directly into the GUI, along with also fixing some bugs in HelloGame. I also finished the functionality for the Memory Game, and will add the code to the repo once I finish the GUI for the game. <br> <br> **TO-DO:** - Finish GUI for Memory Game. -Add Text Field for HelloGame to allow user to input answers in the GUI.|
