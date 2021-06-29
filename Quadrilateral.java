/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingquad;

import java.awt.Graphics;
import java.util.Arrays;



public class Quadrilateral
{
    private int x;
    private int y;
    static Point[] points = new Point[4];
    
    private int random(int min, int max)
    {
        int result = min + (int)(Math.random() * (max - min + 1));
        return result;
    }
    
    Quadrilateral()
            {
                points[0] = new Point(random(50, 400), random(150, 300));
                points[1] = new Point(random(600, 1000), random(150, 300));
                points[2] = new Point(random(600, 1000), random(400, 650));
                points[3] = new Point(random(50, 400), random(400, 650));
            }
    
    
    public void draw(Graphics g)
    {
        //for (int i = 0; i < 3; i ++)
        //{
        //    g.drawLine(points[i].x, points[i].y, points[i + 1].x, points[i + 1].y);
        //}
        g.drawLine(points[0].x, points[0].y, points[1].x, points[1].y);
        g.drawLine(points[1].x, points[1].y, points[2].x, points[2].y);
        g.drawLine(points[2].x, points[2].y, points[3].x, points[3].y);
        g.drawLine(points[3].x, points[3].y, points[0].x, points[0].y);
    }
 
}
