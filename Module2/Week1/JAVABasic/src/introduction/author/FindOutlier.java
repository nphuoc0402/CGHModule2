package introduction.author;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

class FindOutlier{
    static int find(int[] integers){
        int firstThreeParity = integers[0]%2 + integers[1]%2 + integers[2]%2;
        int rem = firstThreeParity < 2 ? 1 : 0;
        for (int integer : integers) {
            if (integer % 2 == rem) {
                return integer;
            }
        }
        return 0;
    }}
class OutlierTest{
    @Test
    public void testExample() {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        assertEquals(3, FindOutlier.find(exampleTest1));
        assertEquals(206847684, FindOutlier.find(exampleTest2));
        assertEquals(0, FindOutlier.find(exampleTest3));
    }}
