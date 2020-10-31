
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
| **19/20**  | Sara Beniwal | Contributions:   |
| **19/20**  | Sanvi Pal | Contributions:   |
| **19/20**  | Vihan Jayaraman | Contributions:   |
