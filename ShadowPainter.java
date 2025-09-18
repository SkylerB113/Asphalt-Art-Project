import org.code.neighborhood.*;

public class ShadowPainter extends PainterPlus {

  /* moves the painter to the start of the shadow.
    this is one unit below where the mountain and trees start */
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
  move();

  turnLeft();
  move();
  move();
  move();
  move();
  move();
  }

  //paints the red shadow using paintLine methods
  public void paintShadow(String color) {
    paintLine (11, "red");

    /* these blocks of move(); show the white path that is being drawn.
      this is the same for the following blocks of move().
      */
    move();
    move();

    paintLine (11, "red");

    turnRight();
    move();
    turnRight();

    paintLine (10, "red");

    move();
    move();
    move();

    paintLine (11, "red");

    turnLeft();
    move();
    turnLeft();

    paintLine (11, "red");

    move();
    move();
    move();
    move();

    paintLine (9, "red");

    turnRight();
    move();
    turnRight();
    move();

    paintLine (7, "red");

    move();
    move();
    move();
    move();
    move();
    move();
    move();

    paintLine (8, "red");

    turnLeft();
    move();
    turnLeft();

    paintLine (6, "red");

    move();
    move();
    move();
    move();
    move();
    move();
    move();

    paintLine (9, "red");

    turnRight();
    move();
    turnRight();
    move();

    paintLine (10, "red");

    move();
    move();
    move();
    move();
    move();

    paintLine (5, "red");

    turnLeft();
    move();
    turnLeft();
    move();

    paintLine (5, "red");

    move();
    move();
    move();
    move();
    move();
    move();

    paintLine (7, "red");

    turnRight();
    move();
    turnRight();
    move();

    paintLine (5, "red");

    move();
    move();
    move();
    move();
    move();
    move();

    paintLine (5, "red");

    turnLeft();
    move();
    turnLeft();
    move();

    paintLine (5, "red");

    move();
    move();
    move();
    move();
    move();
    move();
    move();

    paintLine (2, "red");

    turnRight();
    move();
    turnRight();

    move();
    move();
    move();
    move();
    move();
    move();
    move();

    paintLine (5, "red");

    turnLeft();
    move();
    turnLeft();
    move();

    paintLine (4, "red");
    
  }
  
}