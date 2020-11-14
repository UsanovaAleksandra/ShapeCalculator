package model.triangle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void setUp() throws Exception {
        triangle = new Triangle(4, 5, 6);
    }

    @Test
    public void getName() {
        Assert.assertEquals("Треугольник", triangle.getName());
    }

    @Test
    public void getPerimeter() {
        Assert.assertEquals(15, triangle.getPerimeter(), 0);
    }

    @Test
    public void getSquare() {
        Assert.assertEquals(9.921567416492215, triangle.getSquare(), 0);
    }

    @Test
    public void testToString() {
        String expected = """
                Треугольник
                Первая сторона: 4.0
                Вторая сторона: 5.0
                Третья сторона: 6.0
                Периметр: 15.0
                Площадь: 9.921567416492215""";
        Assert.assertEquals(expected, triangle.toString());
    }

    @Test
    public void testEquals() {
        Triangle triangle1 = new Triangle(4, 5, 6);
        Triangle triangle2 = new Triangle(6, 5, 4);
        Assert.assertEquals(triangle, triangle1);
        Assert.assertNotEquals(triangle, triangle2);
    }
}