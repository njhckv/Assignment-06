
package drawingquad;

public class Point 
{
    int x;
    int y;
    
    Point()
    {
        x = 0;
        y = 0;
    }
    
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void moveTo(int newX, int newY)
    {
        x = newX;
        y = newY;
    }
    
    public String toString()
    {
        return ("x is " + x + ", y is " + y);
    }
    
    public static void main(String[] args) 
    {
        Point p1 = new Point();
        Point p2 = new Point(1, 1);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(3, 3);
        
        System.out.println(p1.toString() + "\n" + p2.toString() + "\n" + p3.toString() + "\n" + p4.toString() + "\n");
    }
}
