package com.lti.test;
import static org.junit.Assert.assertEquals;

import org.junit.*;

import com.lti.code.Revision;


public class Testcases {
 private Revision rev;
 @Before
 public void inint() {
	 rev= new Revision();
 }
 @Test
 public void age() {
	 assertEquals(30,rev.ageupdate(15, 5));
 }
}