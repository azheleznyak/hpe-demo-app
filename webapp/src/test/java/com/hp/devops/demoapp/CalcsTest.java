package com.hp.devops.demoapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by gullery on 17/02/2016.
 *
 * Testing playground dsfds
 *
 * Testing playground
 */
public class CalcsTest {

	@Test
	public void webapp_CalcsTest_sum_test_A() {
		assertEquals(3, Calcs.sum(1, 2));
	}

	@Test
	public void webapp_CalcsTest_sub_test_A() {
		assertEquals(3, Calcs.sub(5, 2));
	}

	@Test
	public void webapp_CalcsTest_sub_test_B() {
		assertEquals(2, Calcs.sub(-1, -3));
	}

	@Test
	public void webapp_CalcsTest_sub_test_C() {
		assertEquals(3, Calcs.sub(10, 7));
	}

	@Test
	public void webapp_CalcsTest_eq_test_A() {
		assertTrue(Calcs.equal(1, 1));
	}

	@Test
	public void webapp_CalcsTest_eq_test_B() {
		assertTrue(Calcs.equal(-1, -1));
	}

	@Test
	public void webapp_CalcsTest_neq_test_A() {
		assertTrue(Calcs.nonEqual(0, 1));
	}

	@Test
	public void webapp_CalcsTest_neq_test_B() {
		assertTrue(Calcs.nonEqual(-1, 0));
	}

	@Test
	public void webapp_CalcsTest_neq_test_C_BrokenTest() {
		assertTrue(Calcs.nonEqual(5, 5));
	}

	@Test
	public void webapp_CalcsTest_always_true_A() {
		assertTrue(Calcs.alwaysTrue());
	}
}
