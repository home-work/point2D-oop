import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Point2DTest {
    @Test
    public void testClassPoint2D() {
        Point2D point2D = new Point2D(3,5);
        String expect = "(3.0,5.0)";
        String actual = point2D.toString();
        assertEquals(expect, actual);
    }

    @Test
    public void testClassPoint3D() {
        Point3D point3D = new Point3D(3,5,6);
        String expect = "(3.0,5.0,6.0)";
        String actual = point3D.toString();
        assertEquals(expect, actual);
    }
}
