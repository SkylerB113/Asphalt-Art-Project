import org.code.neighborhood.*;

public class BackgroundPainter extends PainterPlus {

  // paints the background of the code
public void paintBackground(String color) {
    while (canMove("south")) {
      paintRow(color);
      turnToWest();
      paintRow(color);
      turnToEast();
    }
  }

 // if the painter can move, it will paint what they are standing on then move
  public void paintRow(String color) {
    while (canMove()) {
      paint(color);
      move();
    }
    paint(color);
  }

 /* moves the painter to the next line.
    after this, the painter turns to face the opposite direction.
  */
  public void turnToEast() {
    if (isFacingWest()) {
      turnLeft();
      
      if (canMove()){
        move();
      }
      
      turnLeft();
    }
  }
  
  //does the same thing as previous method, only now we are going to face west
  public void turnToWest() {
    if (isFacingEast()) {
      turnRight();
      
      if (canMove()){
        move();
      }
      
      turnRight();
    }
  }
 
}