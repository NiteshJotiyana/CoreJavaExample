package com.java.design.pattern.observer;

import java.util.Observable;

public class CricketBoard extends Observable {

	private int score;
	private double over;
	private String batsManName1;
	private String batsManName2;
	private String bowlerName;
	private String empireName;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getOver() {
		return over;
	}

	public void setOver(double over) {
		this.over = over;
	}

	public String getBatsManName1() {
		return batsManName1;
	}

	public void setBatsManName1(String batsManName1) {
		this.batsManName1 = batsManName1;
	}

	public String getBatsManName2() {
		return batsManName2;
	}

	public void setBatsManName2(String batsManName2) {
		this.batsManName2 = batsManName2;
	}

	public String getBowlerName() {
		return bowlerName;
	}

	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}

	public String getEmpireName() {
		return empireName;
	}

	public void setEmpireName(String empireName) {
		this.empireName = empireName;
	}

	@Override
	protected synchronized void setChanged() {
		// TODO Auto-generated method stub
		super.setChanged();
	}

	@Override
	protected synchronized void clearChanged() {
		// TODO Auto-generated method stub
		super.clearChanged();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "batsManName1 : " + batsManName1 + " batsManName2 : " + batsManName2 + " bowlerName : " + bowlerName
				+ " empireName : " + empireName + " over : " + over + " score : " + score;
	}

}
