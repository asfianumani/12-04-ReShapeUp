// A Rectangle object represents a rectangle defined by an origin point (bottom left corner), plus width and height.
import java.lang.Math;
public class Rectangle
{
  private Point origin;
  private int width;
  private int height;
  public Rectangle()
  {
    origin=new Point();
    width=0;
    height=0;
  }
  public Rectangle (Point bl, Point tr)
  {
    origin=bl;
    height=tr.getY()-bl.getY();
    width=tr.getX()-bl.getY();
  }
  public Rectangle(Point bl, int x, int y)
  {
    origin=bl;
    width=bl.getX()-x;
    height=bl.getY()-y;
  }
  public Point getBottomLeft()
  {
    return origin;
  }
  public Point getTopRight()
  {
    Point tr=new Point();
    tr.setX(origin.getX()+width);
    tr.setY(origin.getY()+height);
    return tr;
  }
  public int getHeight()
  {
    return height;
  }
  public int getWidth()
  {
    return width;
  }
  public double area()
  {
    return height*width;
  }
  public double diagonal()
  {
    return Math.sqrt((height*height)+(width*width));
  }
  public int perimeter()
  {
    return (2*width)+(2*height);
  }
  public boolean isSquare()
  {
    if(width!=height)
    {
    return false;
    }
    else
    {
      return true;
    }
  }
  public String toString()
  {
    return "["+origin.toString()+","+getTopRight().toString()+"]";
  }
  public void translate(int x, int y)
  {
    origin.setX(origin.getX()+x);
    origin.setY(origin.getY()+y);
  }
  public void scale (int dx, int dy)
  {
    width+=dx;
    height+=dy;
  }
}
