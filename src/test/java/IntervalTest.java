package java;
import java.Interval;
import org.junit.test;
import org.junit.assertThat;


public class IntervalTest {
    @test
    public static void testIntervalLowHigh()
    {
        assertThat(interval(10.01, 10.02), contains 10.01);
    }

}
