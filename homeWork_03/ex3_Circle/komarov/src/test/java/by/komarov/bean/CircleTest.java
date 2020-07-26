package by.komarov.bean;

import junit.framework.TestCase;

public class CircleTest extends TestCase {

    public void testCalculateArea() { 
        Circle circle = new Circle();
        double radius = 20;
        double expected = 31.4 * radius; 
        double actual = circle.calculateArea(radius);
     assertEquals(expected, actual);
        
        
        
    }
}