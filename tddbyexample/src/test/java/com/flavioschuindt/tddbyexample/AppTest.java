package com.flavioschuindt.tddbyexample;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testMultiplication() {
    	Dollar five = new Dollar(5);
    	assertEquals(new Dollar(10), five.times(2));
    	assertEquals(new Dollar(15), five.times(3));
    }
    
    public void testEquality() {
    	assertTrue(new Dollar(5).equals(new Dollar(5)));
    	assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
    
    public void testFrancMultiplication() {
    	Franc five = new Franc(5);
    	assertEquals(new Franc(10), five.times(2));
    	assertEquals(new Franc(15), five.times(3));
    }
    
}
