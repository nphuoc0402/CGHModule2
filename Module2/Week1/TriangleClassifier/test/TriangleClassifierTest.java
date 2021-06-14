import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class TriangleClassifierTest {

    @Test
    void triangle() {
        assertEquals("tam giác đều",TriangleClassifier.Triangle(2,2,2));
        assertEquals("tam giác cân",TriangleClassifier.Triangle(2,2,3));
        assertEquals("tam giác thường",TriangleClassifier.Triangle(3,4,5));
        assertEquals("không phải là tam giác",TriangleClassifier.Triangle(8,2,3));
        assertEquals("không phải là tam giác",TriangleClassifier.Triangle(-1,2,1));
        assertEquals("không phải là tam giác",TriangleClassifier.Triangle(0,1,1));

    }
}