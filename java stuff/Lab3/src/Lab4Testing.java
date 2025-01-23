import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Lab4Testing {
    
    /**
     * This method tests the return statement for the meridian part of the method
     * makes sure that a.m. is before p.m.
     * @Test a testing method for the clock class
     */
    @Test
    public void testMeridian(){
        clock c1 = new clock(12, 00, "a.m.");
        clock c2 = new clock(12, 00, "p.m.");
        assertEquals(c1, clock.getEarlier(c1, c2));

        clock c3 = new clock(12, 00, "p.m.");
        clock c4 = new clock(12,00,"a.m.");
        assertEquals(c4, clock.getEarlier(c3, c4));
    }

    /**
     * Tests the return statement for the hours part of the getEarlier method
     * makes sure that if the hours on one clock are earlier than than the others
     * it also checks the special case where if the clock is at 12 something a.m. or p.m.
     * and the other one for example is 1:00 a.m. then it would return the one that was 12 something a.m.
     * @Test testing method for the getEarlier method in the clock class
     */
    @Test
    public void testHours(){
        clock c1 = new clock(3, 00, "a.m.");
        clock c2 = new clock(6, 00, "a.m.");
        assertEquals(c1, clock.getEarlier(c1, c2));

        clock c3 = new clock(6, 00, "a.m.");
        clock c4 = new clock(3, 00, "a.m.");
        assertEquals(c4, clock.getEarlier(c3, c4));

        clock c5 = new clock(12, 00 ,"a.m.");
        clock c6 = new clock(1, 00, "a.m.");
        assertEquals(c5,clock.getEarlier(c5, c6) );
    }

    /**
     * checks the return statement for the minutes part of the getEarlier method in the clock class
     * checks the minutes of the time and should return the earlier time
     * @Test testing method for the getEarlier method in the clock class
     */
    @Test
    public void testMinutes(){
        clock c1 = new clock(12, 10, "p.m.");
        clock c2 = new clock(12, 25, "p.m.");
        assertEquals(c1, clock.getEarlier(c1, c2));

        clock c3 = new clock(6, 41, "p.m.");
        clock c4 = new clock(3, 56, "p.m.");
        assertEquals(c4, clock.getEarlier(c3, c4));
    }

    /**
     * check the return statement if the clocks time is equal 
     * makes sure it returns the time of the first clock if the time are equal
     * @Test testing method for the getEarlier method in the clock class
     */
    @Test
    public void sameTime(){
        clock c1 = new clock(12, 00, "p.m.");
        clock c2 = new clock(12, 00, "p.m.");
        assertEquals(c1, clock.getEarlier(c1, c2));
    }
}
