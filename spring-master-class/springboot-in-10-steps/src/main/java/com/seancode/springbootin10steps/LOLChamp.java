package com.seancode.springbootin10steps;

public class LOLChamp {
	private String charID;
	private String charName;
	private float charPrice;
	
	public LOLChamp(String charID, String charName, float charPrice) {
		this.charID = charID;
		this.charName = charName;
		this.charPrice = charPrice;
	}
	
	public String getCharID() {
		return charID;
	}
	
	public void setCharID(String charID) {
		this.charID = charID;
	}
	
	public String getCharName() {
		return charName;
	}
	
	public void setCharName(String charName) {
		this.charName = charName;
	}
	
	public float getCharPrice() {
		return charPrice;
	}
	
	public void setCharPrice(float charPrice) {
		this.charPrice = charPrice;
	}
}
