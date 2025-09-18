import org.code.neighborhood.*;

public class TreePainter extends PainterPlus {

  //moves the painter to the starting point
  public void getToStart() {
    turnRight();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();  
    turnLeft();
  }

  /* paints the line of trees using a loop.
     the code will paint four trees and repeat the pattern.
     */
  public void paintTrees() {

    while (canMove("east")) {
      turnLeft();
      paint("black");
      move();
      paint("black");
      move();
      paint("black");
      
      //moves to next tree
      turnRight();
      move();
      turnRight();
      move();
      paint("dimGray");
      move();
      paint("dimGray");

      //moves to next tree
      turnLeft();
      move();
      turnLeft();
      paint("black");
      move();
      paint("black");

      //moves to next tree
      turnRight();
      move();
      turnRight();
      move();
    turnLeft();
    turnLeft();
    paint("lightGray");
    move();
    paint("lightGray");
    move();
    paint("lightGray");
    turnRight();
    turnRight();
    move();
    move();
      turnLeft();

      //ensures that there will not be an error of the painter running off the grid
      if (canMove("east")) {
         move();
      }
  
    } 
    }
  
  }