import org.code.neighborhood.*;

public class PainterPlus extends Painter {

  //turns the painter right using 3 left turns
  public void turnRight() {
  turnLeft();
  turnLeft();
  turnLeft();
  
}
  //takes all the paint from the bucket that the painter is standing on
  public void takeAllPaint() {
    
      while (isOnBucket()){
        takePaint();
      }
    
    }
  //moves as long as the painter can move in the direction they are facing
  public void moveFast() {
    while (canMove()) {
      move();
    }
  }

  //paints forward as long as the painter has paint in their bucket
  public void paintToEmpty(String color) {
   while (hasPaint()) {
     paint("white");
     move();
   }
  }

  //paints a donut shape on the grid
  public void paintDonut(String color) {
    while (hasPaint()) {
    move();
    turnRight();
    paint(color);
    move();
    paint(color);
    }
   
  }

  //turns the painter the opposite direction they are facing
  public void turnAround() {
    turnLeft();
    turnLeft();
  }


  //paints a line of paint with a set number of units
  public void paintLine(int size, String color) {
  for (int i = 0; i < size; i++) {
    paint(color);
    //as long as the value that was painted is less than the set value, the painter moves
    if (i < size - 1 && canMove()) {
      move();
    }
  }
}
}
