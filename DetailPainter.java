import org.code.neighborhood.*;

public class DetailPainter extends PainterPlus{

  //paints the album title that appears in the upper left corner
public void paintTitle(String color) {
  move();
  move();
  paint("black");
  
  move();
  move();
  move();
  move();
  move();
  move();
  move();

  turnRight();
  move();
  turnRight();

  paintLine (3, "black");

  move();
  move();
  paint("black");
  move();
  move();

  paintLine (3, "black");

  turnLeft();
  move();
  turnLeft();
  
  paint("black");
  move();
  move();
  move();

  paintLine (2, "black");

  move();
  move();
  paint("black");
  move();
  move();

  paintLine (2, "black");

  move();
  turnRight();
  move();
  turnRight();

  paintLine (2, "black");

  move();
  move();
  move();

  paintLine (3, "black");

  move();
  move();
  paint("black");
  move();

  //paints the grey accents
  paintLine (3, "dimGray");

  turnLeft();
  move();
  turnLeft();
  move();

  paintLine (2, "dimGray");
  move();
  paintLine (3, "black");

  move();
  move();

  paintLine (3, "black");

  turnRight();
  move();
  turnRight();
  move();
  move();
  move();
  move();
  move();
  move();
  paint("black");
}

  /* paints the two clouds that appear in the background, 
     starting with the rightmost one
  */
  public void paintClouds(String color) {

    //moves the painter to the other side then to the starting position
    moveFast();
    turnRight();
    move();
    turnRight();
    move();
    move();
    move();
    move();
    turnLeft();

    paintLine(2, "darkGray");
    move();
    paint("lightGray");

    move();
    move();

    turnLeft();
    move();
    turnLeft();

    paintLine (3, "darkGray");
    move();
    paint("lightGray");

    turnRight();
    move();
    turnRight();

    paintLine (4, "darkGray");

    turnLeft();
    move();
    turnLeft();
    move();

    paint("lightGray");
    move();
    paintLine (2, "darkGray");

    turnRight();
    move();
    turnRight();

    paintLine (2, "darkGray");
    move();
    paint("lightGray");

    move();
    move();
    move();

    //moves the painter to the other side to begin the second cloud
    turnRight();
    moveFast();

    turnLeft();
    paint("darkGray");
    move();
    paint("lightGray");
    move();
    paintLine (2, "darkGray");

    turnLeft();
    move();
    turnLeft();

    paintLine (2, "darkGray");
    move();
    paint("lightGray");

    turnRight();
    move();
    turnRight();
    move();

    paint("lightGray");
    turnLeft();
    move();
    paint("darkGray");
    move();
    turnRight();
    move();
    paint("darkGray");

  }
  
}