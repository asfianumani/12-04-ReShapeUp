// A Point object represents a pair of (x, y) coordinates.
import java.lang.Math;

public class Point
{
  private int x;
  private int y;
  
  public Point()
  {
    x=0;
    y=0;
  }
  public Point(int initx, int inity)
  {
    x=initx;
    y=inity;
  }
  
  public int getX()
  {
    return x;
  }
  public int getY()
  {
    return y;
  }
  public double distanceFromOrigin()
  {
    double d=Math.sqrt(x*x+y*y);
    return d;
  }
  public double distance (Point p)
  {
    double d=Math.sqrt(((x-p.getX())*(x-p.getX()))+((y-p.getY())*(y-p.getY())));
    return d;
  }
  public String toString()
  {
    return "("+x+","+y+")";
  }
  public void setX(int x1)
  {
    x=x1;
  }
  public void setY(int y2)
  {
    y=y2;
  }
  public void translate (int x1, int y1)
  {
    x+=x1;
    y+=y1;
  }
}
    

