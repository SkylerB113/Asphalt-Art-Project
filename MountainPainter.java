import org.code.neighborhood.*;

public class MountainPainter extends PainterPlus {

  
/*moves the painter to the starting point.
  this point is on the same line as the trees
  */
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
    move();
    move();
    move();
    move();
    move();
  }

  public void paintMountain(String color) {

    /* paints the mountain using the paintLine methods,
      starting at the bottom and working its way up to the peak
      */
   paintLine (11, "black");

    //paints the white space in the middle (beginning of the middle tree)
    move();
    paint("whiteSmoke");
    move();

    paintLine (11, "black");

    //moves to next line on the right
      turnLeft();
    move();
    turnLeft();

    paintLine (11, "black");

    //paints white space
    move();
    paint("whiteSmoke");
    move();

    paintLine (11, "black");

    //moves to next line on the left
    turnRight();
    move();
    turnRight();

    paintLine (11, "black");

    //paints white space
    move();
    paint("whiteSmoke");
    move();

    paintLine (11, "black");

    turnLeft();
    move();
    turnLeft();
    move();

    paintLine (10, "black");

    move();
    move();

    paintLine (10, "black");

      turnRight();
      move();
      turnRight();

    paintLine (10, "black");

    move();
    move();

    paintLine (10, "black");

    turnLeft();
    move();
    turnLeft();

    paintLine (9, "black");

    move();
    move();
    move();

    paintLine (10, "black");

    turnRight();
    move();
    turnRight();
    move();

    paintLine (8, "black");

    move();
    move();
    move();

    paintLine (9, "black");

    turnLeft();
    move();
    turnLeft();

    paintLine (8, "black");

    move();
    move();
    move();
    move();

    paintLine (8, "black");

    turnRight();
    move();
    turnRight();
    move();

    paintLine (2, "black");

    move();
    move();

    paintLine (3, "black");

    move();
    move();
    paint("black");
    move();
    move();
    paint("black");

    move();
    move();

    paintLine (6, "black");

    turnLeft();
    move();
    turnLeft();

    paintLine (6, "black");

    move();
    move();
    paint("black");
    move();
    move();
    paint("black");

    move();
    move();

    paintLine (3, "black");

    move();
    move();

    paintLine(2, "black");

    turnRight();
    move();
    turnRight();

    move();
    move();
    move();

    paintLine (5, "black");

    move();
    move();

    paintLine (4, "black");

    move();
    move();

    paintLine (3, "black");

    turnLeft();
    move();
    turnLeft();
    move();

    paint("black");
    move();
    move();
    move();

    //begins to paint the red leaf details at the top of the mountain
    paint("black");
    move();
    paint("fireBrick");
    move();
    paint("black");
    move();
    move();
    paint("black");
    move();
    paint("black");
    move();
    paint("fireBrick");
    move();

    paintLine (3, "black");

    turnRight();
    move();
    turnRight();

    paintLine (5, "black");

    move();
    paint("fireBrick");
    move();

    paintLine (3, "black");

    move();
    move();
    move();
    move();
    paint("black");

    turnLeft();
    move();
    turnLeft();

    move();
    move();
    move();
    move();
    move();

    paintLine (3, "black");

    move();
    paint("fireBrick");
    move();
    paint("black");

    move();
    move();
    move();
    paint("black");

    turnRight();
    move();
    turnRight();
    move();
    move();
    move();

    paintLine (4, "black");

    move();
    paint("fireBrick");

    turnLeft();
    move();
    turnLeft();

    move();
    paint("black");
    move();
    paint("fireBrick");
    move();
    paint("black");

    turnRight();
    move();
    turnRight();

    paintLine (3, "black");

    turnLeft();
    move();
    turnLeft();

    move();
    paint("black");
    
  }
  
}