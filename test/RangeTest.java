package range.test;

import range.base.Range;

public class RangeTest {

    public static void main(String[] args) {

        Range test = new Range();

        int range1 = Integer.parseInt(args[0]);
        int range2 = Integer.parseInt(args[1]);

        test.findRange(range1,range2);

        
    }

}
