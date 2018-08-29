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
}
