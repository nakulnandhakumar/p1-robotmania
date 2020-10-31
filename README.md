
# p1-robotmania Readme/Project Updates

# Week 2 - Advocacy Week

This readme entails both information about our project as well as our progress throughout this week. As an overview, our project focuses on incorporating UI into games such as Battleship, Connect Four, and Hangman to provide an interactive appeal to the user. Instead of playing games on the console, they can use a more user-friendly version with simple to understand buttons, intriguing graphics, and vivid colors. Each member has made sure to make their own mark on the project, through the multiple games the user can choose from.

# Overview of Project

**Battleship:** Are you a fan of the classic two person game? Well here is our twist of the game using Java! In this code, you can choose buttons to hit at your opponents targets. Additionally, our easy to use interface makes the game much more simple and enjoyable.

**Connect Four:** Try this UI version of Connect Four! Press buttons that coordinate to certain columns to "drop" your pieces. Play with a friend and compete to see who will make four in a row first! *Please note: Currently a work in progress*

**Hangbot:** A fan of hangman? Check out hangbot, a single player game that will test your guessing ability. With a plethora of words and an engaging UI, you will be sure to enjoy this game! *Please note: Currently a work in progress*

**Calculators:** As MVC is a key part of this project, we have incorporated the calculators assignment to this readme. Take a look at our calculators, some of which are a work in progress (Sara and Sanvi's. We have almost finished the two versions and are now in the process of connecting them).

# How to run our code:

- To run our code, click the green play button at the top right of the IntelliJ window
- That will open up a GUI window with buttons that have the names of the different files of the project
- clicking one of the buttons will run the corresponding file from our project
- closing the gui window will quit the entire runnning project, and you have to click the green play button to run it again

# Self-Grade & Contributions

| Self Grade | Person | Contributions |
| ---------- | ------ | ------------- |
| **19/20** (Personal) **5/5** Scrum Leader (Nakul was contributing to the group and met his goals for the week) | Nakul Nandhakumar | This past week, I worked on the main project menu and my trio team's Calculator. For the main menu, I created a [Main Menu GUI](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/Main.java#L18) in Swing designer and added [buttons for each file](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/Main.java#L10) in our project to be clicked for accessing those files. I added actionlisteners to call the .main method of each major file. For the Calculator, I created a [Console UI](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorConsoleUI.java#L4) and started to separate MVC. In the ConsoleUI, I created a method [setUp()](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorConsoleUI.java#L14) with a [ConsoleMenu](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorConsoleUI.java#L15) to choose operations from and turned it into a [recursive function](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorConsoleUI.java#L39) to keep calculating until the user exits. For separating MVC, I have created a separate class [CalculatorData](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorData.java#L4) for the model and have abstracted all the model methods and functions, for exmaple, things like [setarg1](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorData.java#L22), [setarg2](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorData.java#L26), [calculate](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorData.java#L30), and [setmathop](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorData.java#L18). I have made control an intermediary that [calls](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorContrl.java#L56) these model methods when the UIs need them throught the [object model](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorContrl.java#L23) of the class CalculatorData. I created a GUI form for the contorl to serve as a menu to let the user [choose which UI he wants to use](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorContrl.java#L25). I have abstracted the methods specific to view, like [updateCalcArea](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/TrioCalculator/CalculatorGUI.java#L43), and clearCalculator, to the view files. **TO-DO:** - Create methods and object for view in control to control the CalcGUI view. -Create drop down menu for the main Menu instead of buttons. -Start to improve the GUI for battleship and other GUIs. |
| **19/20**  | Sara Beniwal | This week was self advocacy week, where we provided our goals early on in the week in hopes of accomplishing them by the end. My goals were to finish the Connect Four UI code, write up our readme with clear-to-see information, update my journal, and work on the calculator GUI. I was able to meet three of these four goals: first, I took the initiative of rewriting the readme following Mr. M's feedback to make the project clear to understand and run. Secondly, I focused on updating the journal for this week with details of progress, tech talks, and a reflection. Lastly, I broke down Mr. M's calculator MVC project by analyzing his code and developing a plan to incorporate version control to show at the end of next week. The one thing I was unable to accomplish was completing the Connect Four UI. I believe I overestimated what I could accomplish on this shorter week. However, I made sure to complete the UI look and transfer the algorithms necessary to complete the assignment.**TO-DO:** - Complete both the calculator and Connect Four assignments. Finalize journal and tie any loose ends on the readme/project.  |
| **19/20**  | Sanvi Pal | Contributions:   |
| **19/20**  | Vihan Jayaraman | This past week I worked on the Battleship game and fixing up the final bugs and redundancies:. The most prominent bug was that the game would not account for overlapping ships on the game board. The player wasn't able to finish the game, because the game believed there were more distinct ship tiles than there actually were. This issue was caused by there being no check to see if there was already a ship tile in the spot that the game was currently setting a ship tile. Implementing this check was as simple as checking if the current tile was equal to the nunmerical value assigned to ship tiles (in this case it was 1), and if that was the case, the game would subtract 1 from the number of distinct ship tiles [Checking Code](https://github.com/nakulnandhakumar/p1-robotmania/blob/a13a810d5278ea40ae70f3b3ff873f7fcba945fa/src/BattleshipGame/BattleshipGUI.java#L374). I also removed the junk code in BattleshipGUI.**TO-DO** - Create a more graphically pleasing GUI for Battleship, and implement an option for two players, as well as work on GUI screen that tells the player they have won (at the moment the program only detects when the player has won, but doesn't display).  |
| **19/20**  | Yasaswi Singamneni | Contributions: This week, I added a GUI to my [HelloGame](https://github.com/nakulnandhakumar/p1-robotmania/blob/master/src/HelloGame/HelloGame.java#L31), which curently displays an image of a robot, but will later have a text field in order for the user to input their answer directly into the GUI, along with also fixing some bugs in HelloGame. I also finished the functionality for the Memory Game, and will add the code to the repo once I finish the GUI for the game. **TO-DO:** - Finish GUI for Memory Game. -Add Text Field for HelloGame to allow user to input answers in the GUI.|
