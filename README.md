# Calculator Version 2 MVC Separation Ideas

-- Separate control, view, and model code into separate classes (CalculatorGUI, CalculatorTextUI, CalculatorControl, CalculatorModel)

-- Extend the view code class in the control code, create object of view class, instantiate view using object

-- Possibly will be using multiple interfaces for modeling and to work around not being able to do multiple class inheritance in Java

*class CalculatorControl {*

*CalculatorGUI viewGUI = new CalculatorGUI();*

*CalculatorTextUI textUI = new CalculatorTextUI();*

  *public void CalculatorControl("insert preferred UI here") {*

  *... control code*

   *}*
  
*}* 


# p1-robotmania Project Updates

# Week 1

Nakul Nandhakumar and Vihan Jayaraman:

-- Worked on Battleship GUI using SwingDesigner

-- Successfully adapted control code to new UI

-- Kept text and console based elements in code to work in tangent with UI control code

-- Worked on adapting control code for potential ship overlaps

-- Experimented with instantiating GUI after extending GUI class file in other classes

TO-DO

-- Aesthetical improvements to GUI for user satisfaction

-- Adapt control code to better handle ship overlaps and conditions

-- improvements to technical ease of user interaction needed (ex. button pressing, more intuitive button placement/text/names etc.)

-- Potenitally start UI for monopoly/tick-tack-toe/hangman games??? 

-- Work on adding a playerBoard for enemy to guess and attack player ships