package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.main.Calculate;

import junit.framework.Assert;

public class CalculateTest {

	public int score;
	public Calculate cal;
	
	@Before
	public void initCalculateClass(){
		this.cal = new Calculate();
	}
	
	@Before
	public void initScoreZero(){
		this.score = 0;
	}
	
	@Test
	public void getScoreFromsetScoreByScore0() {
		this.score =0;
		
		int expected = 0;
		
		cal.setScore(this.score);	
		int actual =cal.getScore();
		Assert.assertEquals(expected, actual);
	}
		
		
		@Test
		public void getScoreFromsetScoreByScore100() {
			this.score =100;
			
			
			int expected = 100;
			
			
			cal.setScore(this.score);	
			int actual =cal.getScore();
			Assert.assertEquals(expected, actual);
			
	}
		@Test
		public void gradeAFromsetScoreAndCalculateByScore100() {
			this.score = 100;
			cal.setScore(this.score);
			String expected = "A";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore75() {
			this.score = 75;
			cal.setScore(this.score);
			String expected = "B+";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore79() {
			this.score = 79;
			cal.setScore(this.score);
			String expected = "B+";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore77() {
			this.score = 77;
			cal.setScore(this.score);
			String expected = "B+";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore74() {
			this.score = 74;
			cal.setScore(this.score);
			String expected = "B";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore72() {
			this.score = 72;
			cal.setScore(this.score);
			String expected = "B";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore70() {
			this.score = 70;
			cal.setScore(this.score);
			String expected = "B";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore69() {
			this.score = 69;
			cal.setScore(this.score);
			String expected = "C+";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore67() {
			this.score = 67;
			cal.setScore(this.score);
			String expected = "C+";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore65() {
			this.score = 65;
			cal.setScore(this.score);
			String expected = "C+";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore64() {
			this.score = 64;
			cal.setScore(this.score);
			String expected = "C";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore62() {
			this.score = 62;
			cal.setScore(this.score);
			String expected = "C";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore60() {
			this.score = 60;
			cal.setScore(this.score);
			String expected = "C";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore59() {
			this.score = 59;
			cal.setScore(this.score);
			String expected = "D+";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore57() {
			this.score = 57;
			cal.setScore(this.score);
			String expected = "D+";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore55() {
			this.score = 55;
			cal.setScore(this.score);
			String expected = "D+";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore54() {
			this.score = 54;
			cal.setScore(this.score);
			String expected = "D";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore52() {
			this.score = 52;
			cal.setScore(this.score);
			String expected = "D";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore50() {
			this.score = 50;
			cal.setScore(this.score);
			String expected = "D";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore0() {
			this.score = 0;
			cal.setScore(this.score);
			String expected = "F";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		@Test
		public void gradeAFromsetScoreAndCalculateByScore20() {
			this.score = 20;
			cal.setScore(this.score);
			String expected = "F";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
		
		@Test
		public void gradeAFromsetScoreAndCalculateByScore49() {
			this.score = 49;
			cal.setScore(this.score);
			String expected = "F";
			String actual = cal.calculateGrade();
			Assert.assertEquals(expected, actual);
		}
}
