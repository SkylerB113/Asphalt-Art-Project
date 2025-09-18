import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    //instantiates all painters and calls methods to paint the album
   BackgroundPainter kellin = new BackgroundPainter();
     kellin.paintBackground("whiteSmoke");

    TreePainter justin = new TreePainter();
    justin.getToStart();
    justin.paintTrees();

   MountainPainter nick = new MountainPainter();
     nick.getToStart();
     nick.paintMountain("black");

    ShadowPainter jack = new ShadowPainter();
    jack.getToStart();
    jack.paintShadow("red");

    DetailPainter matty = new DetailPainter();
    matty.paintTitle("black");

    DetailPainter gabe = new DetailPainter();
    gabe.paintClouds("lightGray");


    
  }
}