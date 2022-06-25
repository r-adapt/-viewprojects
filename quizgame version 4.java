import java.util.Scanner;// input for user
import jav.io.*; // add  needed for file classes  - add version 4  update change

/*Description:Create a text file that saves the questions, 4 answers,  
correct answer and point value in a file called “questions.txt”. 
The file should contain only raw data and should use the following format for each question  */
//date 7/16/2020
//quizgame version 3
import javax.swing.JOptionPane;// declare for display dialog for input/output 
class javaGamev4 {
public static void main(String[] args)throws IOException {   
//declare and initialize variable
String userName;       
int mainMenu;
// version 4 update useranswer 1-7 var for question and answers choose display from file read
String userAnswer1; 
String userAnswer2;
String userAnswer3;
String userAnswer4;
String userAnswer5;
String userAnswer6;
String userAnswer7;    
String question1; // update version 4 change all answer variable to question samevalue for reading in files
String question2;
String question3;
String question4;
String question5;
String question6;
String question7;
String answerA;       // update version 4 add string for userinput for answer choose to  being read from the file         
String answerB;                             
String answerC;
String answerD;  
String Blank =""; /* update version empty string var to create 
           space inbetween question set (1-7) */ 

   // be reading File Object for reading
 File rfile = new File("questions.txt");   
    
// version 4 update for declare Scanner object to write data to file 
  Scanner file = new Scanner(rfile);

// score point var 
// update version 4 change to intgers value for reading from file for user score    
int pointValue = 0; // all total to toghter for user points
//letter for input for mutiple choice
//Display Intro
JOptionPane.showMessageDialog(null,"Welcome to java Trivia game!");
//display user input
//Prompt for userName
userName = JOptionPane.showInputDialog("Please enter your name:");
do{ // do while for main menu
//Display main menu
mainMenu = Integer.parseInt(JOptionPane.showInputDialog("main menu:\n1)See rules\n 2)Play Game\n 3)Exit"));
// menu main take user input choose
if(mainMenu == 1)
{
JOptionPane.showMessageDialog(null,"Quiz Game Rule\n question are multiple-choice\n question is answer incorrect no point\n" +
"question is answer correct get point\nafter all question are answer point get total to togther");
}
else if (mainMenu == 2)
{
do{ // do while check valid user answer input
    
 // version 4 update  reading line in to file 
       for (int i ; i<= 7; i++) 
 // version 4 update change format to read in   from file document
question1 = rfile.nextLine();
answerA = rfile.nextLine();
answerB = rfile.nextline();
answerC = rfile.nextLine();
answerD = rfile.nextLine();
correctAnswer = rfile.nextLine();
pointValue = rfile.nextLine();
Blank = rfile.nextLine();
    
// update verson 4 question with answers choose display to read from doc.txt
  userAnswer1 = JOptionPane.showInputDialog(question1 + "\nA)" + answerA + "\nB)" + answerB + 
  "\nC)" + answerC +"\nD)" + answerD);
      
if(userAnswer1.equals(correctAnswer)){
  JOptionPane.showMessageDialog(null,"correct");
   pointValue+=10;

}
else if(userAnswer1.equalsIgnoreCase("a") ||userAnswer1.equalsIgnoreCase("b") || userAnswer1.equalsIgnoreCase("c"))                                                         

{
JOptionPane.showMessageDialog(null,"Incorrect The answer is : operators");
}
else
{
//display invalid
JOptionPane.showMessageDialog(null,"Invalid. You must choose A - D");
}
 // change add all result of score from user input valid answer .
JOptionPane.showMessageDialog(null,"Your score: " + pointValue); 
  //  add to all  question and answer to valid with do while   
}while(!userAnswer1.equalsIgnoreCase("a")&& !userAnswer1.equalsIgnoreCase("b")&&!userAnswer1.equalsIgnoreCase("c") && !userAnswer1.equalsIgnoreCase("d"));
    
 rfile.close();   
do{// do while check valid user answer input
    // version 4 update change format to read in   from file document
question1 = rfile.nextLine();
answerA = rfile.nextLine();
answerB = rfile.nextline();
answerC = rfile.nextLine();
answerD = rfile.nextLine();
correctAnswer = rfile.nextLine();
pointValue = rfile.nextLine();
Blank = rfile.nextLine();
    
 userAnswer2 = JOptionPane.showInputDialog(question2 + "\nA)" + answerA + "\nB)" + answerB + 
  "\nC)" + answerC +"\nD)" + answerD);
    
if(userAnswer2.equals(correctAnswer)){
JOptionPane.showMessageDialog(null,"correct");
pointValue+=20;
}
else if(userAnswer2.equalsIgnoreCase("b") || userAnswer2.equalsIgnoreCase("c") || userAnswer2.equalsIgnoreCase("d"))
{
JOptionPane.showMessageDialog(null,"Incorrect The answer is : syntax");
}
else
{
JOptionPane.showMessageDialog(null," Invalid. You must choose A - D ");
}
 // change add all result of score from user input valid answer .
JOptionPane.showMessageDialog(null,"Your score: " + pointValue);    
    //add to all  question and answer to valid with do while 
}while(!userAnswer2.equalsIgnoreCase("a")&& !userAnswer2.equalsIgnoreCase("b")&&!userAnswer2.equalsIgnoreCase("c") && !userAnswer2.equalsIgnoreCase("d"));
    rfile.close();
do{// do while check valid user answer input

    // version 4 update change format to read in   from file document
question3 = rfile.nextLine();
answerA = rfile.nextLine();
answerB = rfile.nextline();
answerC = rfile.nextLine();
answerD = rfile.nextLine();
correctAnswer = rfile.nextLine();
pointValue = rfile.nextLine();
Blank = rfile.nextLine();
    
 userAnswer3 = JOptionPane.showInputDialog(question3 + "\nA)" + answerA + "\nB)" + answerB + 
  "\nC)" + answerC +"\nD)" + answerD);
    
if(userAnswer3.equals(correctAnswer)){
JOptionPane.showMessageDialog(null,"correct");
pointValue+=30;
}
else if (userAnswer3.equalsIgnoreCase("a") || userAnswer3.equalsIgnoreCase("c") || userAnswer3.equalsIgnoreCase("d"))
{
JOptionPane.showMessageDialog(null,"Incorrect The is: byte code ");
}
else {
JOptionPane.showMessageDialog(null,"Invalid. You must choose A - D ");
}
     // change add all result of score from user input valid answer .
JOptionPane.showMessageDialog(null,"Your score: " + pointValue);    
  //  add to all  question and answer to valid with do while 
}while(!userAnswer3.equalsIgnoreCase("a")&& !userAnswer3.equalsIgnoreCase("b")&&!userAnswer3.equalsIgnoreCase("c") && !userAnswer3.equalsIgnoreCase("d"));
   rfile.close(); 
do{// do while check valid user answer input
    // version 4 update change format to read in   from file document
question4 = rfile.nextLine();
answerA = rfile.nextLine();
answerB = rfile.nextline();
answerC = rfile.nextLine();
answerD = rfile.nextLine();
correctAnswer = rfile.nextLine();
pointValue = rfile.nextLine();
Blank = rfile.nextLine();

 userAnswer4 = JOptionPane.showInputDialog(question4 + "\nA)" + answerA + "\nB)" + answerB + 
  "\nC)" + answerC +"\nD)" + answerD);
    
if(userAnswer4.equals(correctanswer)){
JOptionPane.showMessageDialog(null,"correct");    
pointValue+=40;   

}
else if (userAnswer4.equalsIgnoreCase("a") || userAnswer4.equalsIgnoreCase("c") || userAnswer4.equalsIgnoreCase("d"))
{
JOptionPane.showMessageDialog(null,"Incorrect The answer is: default");
}
else{
JOptionPane.showMessageDialog(null,"Invalid. You must choose A - D ");
}
    // change add all result of score from user input valid answer .
JOptionPane.showMessageDialog(null,"Your score: " + pointValue);   
   // add to all  question and answer to valid with do while 
}while(!userAnswer4.equalsIgnoreCase("a")&& !userAnswer4.equalsIgnoreCase("b")&& !userAnswer4.equalsIgnoreCase("c") && !userAnswer4.equalsIgnoreCase("d"));
   rfile.close(); 
do{// do while check valid user answer input
question5 = rfile.nextLine();
answerA = rfile.nextLine();
answerB = rfile.nextline();
answerC = rfile.nextLine();
answerD = rfile.nextLine();
correctAnswer = rfile.nextLine();
pointValue = rfile.nextLine();
Blank = rfile.nextLine();

 userAnswer5 = JOptionPane.showInputDialog(question5 + "\nA)" + answerA + "\nB)" + answerB + 
  "\nC)" + answerC +"\nD)" + answerD);
    
if(userAnswer5.equals(correctAnswer)){
JOptionPane.showMessageDialog(null,"correct");
pointValue+=50;
}
else if (userAnswer5.equalsIgnoreCase("a") || userAnswer5.equalsIgnoreCase("b") || userAnswer5.equalsIgnoreCase("d"))
{
JOptionPane.showMessageDialog(null,"Incorrect The answer is: if-else statement");
}
else {
JOptionPane.showMessageDialog(null,"Invalid. You must choose A - D ");
}
    //result of score from user input valid answer .
 JOptionPane.showMessageDialog(null,"Your score: " + pointValue);   
  // add to all  question and answer to valid with do while  
}while(!userAnswer5.equalsIgnoreCase("a")&&!userAnswer5.equalsIgnoreCase("b")&&!userAnswer5.equalsIgnoreCase("c")&&!userAnswer5.equalsIgnoreCase("d"));
//result of score from user input valid answer .
   rfile.close(); 
do{

question6 = rfile.nextLine();
answerA = rfile.nextLine();
answerB = rfile.nextline();
answerC = rfile.nextLine();
answerD = rfile.nextLine();
correctAnswer = rfile.nextLine();
pointValue = rfile.nextLine();
Blank = rfile.nextLine();

 userAnswer6 = JOptionPane.showInputDialog(question1 + "\nA)" + answerA + "\nB)" + answerB + 
  "\nC)" + answerC +"\nD)" + answerD);   
    
if(userAnswer6.equals(correctAnswer))
{JOptionPane.showMessageDialog(null,"correct");
pointValue+=60;
}
else if (userAnswer6.equalsIgnoreCase("b") || userAnswer6.equalsIgnoreCase("c") || userAnswer6.equalsIgnoreCase("d"))
{
JOptionPane.showMessageDialog(null,"Incorrect the answer is: counting loop,sentinel-controlled loop,result-controlled loop ");
}
else{
JOptionPane.showMessageDialog(null,"Invalid. You must choose A - D");
} 
 // add to all question and answer to valid with do while   
JOptionPane.showMessageDialog(null,"Your score: " + pointValue);    
    
}while(!userAnswer6.equalsIgnoreCase("a")&&!userAnswer6.equalsIgnoreCase("b")&&!userAnswer6.equalsIgnoreCase("c")&&!userAnswer6.equalsIgnoreCase("d"));
rfile.close();
do{// do while check valid user answer input
question7 = rfile.nextLine();
answerA = rfile.nextLine();
answerB = rfile.nextline();
answerC = rfile.nextLine();
answerD = rfile.nextLine();
correctAnswer = rfile.nextLine();
pointValue = rfile.nextLine();
Blank = rfile.nextLine();

 userAnswer7 = JOptionPane.showInputDialog(question7 + "\nA)" + answerA + "\nB)" + answerB + 
  "\nC)" + answerC +"\nD)" + answerD);
    

if(userAnswer7.equals(correctAnswer)){
JOptionPane.showMessageDialog(null,"correct");
pointValue+=70;
}
else if (userAnswer7.equalsIgnoreCase("b") || userAnswer7.equalsIgnoreCase("c") || userAnswer7.equalsIgnoreCase("d"))
{
JOptionPane.showMessageDialog(null,"Incorrect the answer is : Exit");
}
else{
JOptionPane.showMessageDialog(null,"Invalid. You must choose A - D");
}
JOptionPane.showMessageDialog(null,"Your score: " + pointValue);
   //add to all  question and answer to valid with do while  
}while(!userAnswer7.equalsIgnoreCase("a")&&!userAnswer7.equalsIgnoreCase("b")&&!userAnswer7.equalsIgnoreCase("c")&&!userAnswer7.equalsIgnoreCase("d"));
 rfile.close();   
}
else
{
//display invalid
JOptionPane.showMessageDialog(null,"Invalid. You must enter 1 - 3.\n");
}
}while(mainMenu !=3);
}
}