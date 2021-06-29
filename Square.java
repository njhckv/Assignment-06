
package drawingquad;


public class Square extends Rectangle 
{
    int width;
    int height;

    public Square(int side) 
    {
        super(side, side);
        this.width = side;
        this.height = side;
        Rectangle s = new Rectangle(width, height);
    }

}
