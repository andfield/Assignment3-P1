package com.IT7320.Assignment3_p1;

import static org.junit.Assert.*;

import org.junit.*;
import org.mockito.Mockito;


public class TaxTesting {
		
	Implementation imp;
	Interface_tax it;
	Employee e;
	double expected;
	double actual;
	double mock_data = 100.0;

	
	@Before
	public void setUp() throws Exception {
		imp = new Implementation();
		it = Mockito.mock(Interface_tax.class);
		e = new Employee();
		e.setSalary(1000.0);
	
	}

	@After
	public void tearDown() throws Exception {
		imp = null;
		e = null;
	}
	
	@Test
	public void computedTaxTest() {
	expected = mock_data;
	Mockito.when(it.computeTax(mock_data)).thenReturn (expected);
	imp.setImplementation(this.it);
	actual = imp.computeTax(mock_data);
	assertEquals(expected, actual, 0.1);
	}

	@Test
	public void weeklySalary() {
		expected = e.getSalary()/52;
		Mockito.when(it.weeklySalary(e)).thenReturn ((double) (e.getSalary()/52));
		imp.setImplementation(this.it);
		actual = imp.weeklySalary(e);
		assertEquals(expected,actual, 0.1);
	}
	
	@Test
	public void fortnightSalaryTest() {
		expected= e.getSalary()/26;
		Mockito.when(it.fortnightSalary(e)).thenReturn ((double) (e.getSalary()/26));
		imp.setImplementation(this.it);
		actual = imp.fortnightSalary(e);
		assertEquals(expected,actual, 0.1);
	}
	
	@Test
	public void computeKiwiSaverTest() {
		expected= e.getSalary();
		Mockito.when(it.computeKiwiSaver(e)).thenReturn (expected);
		imp.setImplementation(this.it);
		actual = imp.computeKiwiSaver(e);
		assertEquals(expected,actual, 0.1);
	}
}
