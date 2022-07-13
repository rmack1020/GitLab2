package edu.odu.cs.cs350;
import org.junit.test;
import Interval.java;
public class gradleTest {
    @test
    public void intervalTest()
    {
    int lownum = 10.01;
    int highnum = 20.01;
    interval(lownum, highnum);
    assertThat(interval(lownum, highnum), contains(10.01));
    }
    
}
