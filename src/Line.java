// A Line object represents a line defined by a pair of Points.
public class Line
{
  private Point start;
  private Point end;
  public Line()
  {
    start=new Point();
    end=new Point();
  }
  public Line(Point startPoint, Point endPoint)
  {
    start=startPoint;
    end=endPoint;
  }
  public double length()
  {
    return start.distance(end);
  }
  public double slope()
  {
    return (start.getY()-end.getY())/(start.getX()-end.getX());
  }
  public String toString()
  {
    return "["+start.toString()+","+end.toString()+"]";
  }
  public void translate(int dx, int dy)
  {
    start.translate(dx,dy);
    end.translate(dx, dy);
  }
}
