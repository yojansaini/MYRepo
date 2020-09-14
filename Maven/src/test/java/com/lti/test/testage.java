package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.lti.code.Testrevision;

public class testage {
 private Testrevision rev;
 @Before
 public void inint() {
	 rev= new Testrevision();
 }
 @Test
 public void age() {
	 assertEquals(30,rev.ageupdate(15, 5));
 }
}
