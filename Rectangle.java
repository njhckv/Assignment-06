
package drawingquad;

public class Rectangle extends Quadrilateral
{
    int width;
    int height;

    
    private void moveTo(int x, int y)
    {
        points[0] = new Point(x, y);
        points[1] = new Point(x + width, y);
        points[2] = new Point(x + width, y + height);
        points[3] = new Point(x, y + height);
    }
    
    private void center()
    {
        while(true)
        {
            int x = (int)(Math.random() * 526);
            int y = (int)(Math.random() * 426);
            if ((x + width > 525) && (y + height > 425) && ((x + x + width) / 2 == 525) && ((y + y + height) / 2 == 425))
            {
                moveTo(x, y);
                break;
            }
        }
    }
    
    Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
        center();
    }
}
