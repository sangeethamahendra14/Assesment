package Methodoverloading;


	
import java.math.*;

public class Point {
  private int x, y;
  
  public Point() {
    x = 0;
    y = 0;
  }
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  public int getX() {
    return x;
  }
  
  public int getY() {
    return y;
  }
  
  public void setX(int x) {
    this.x = x;
  }
  
  public void setY(int y) {
    this.y = y;
  }
  
  public double distance() {
    return Math.sqrt(x * x + y * y);
  }
  
  public double distance(Point point) {
    int xDiff = this.x - point.x;
    int yDiff = this.y - point.y;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
  }
}

 class Tester {
  public static void main(String[] args) {
    Point p1 = new Point(2,3);
    System.out.println("Distance from origin: " + Math.round(p1.distance()));
    
    Point p2 = new Point(5,6);
    System.out.println("Distance between p1 and p2: " + Math.round(p1.distance(p2)));
  }
}
