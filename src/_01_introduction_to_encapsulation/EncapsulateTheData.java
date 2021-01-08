package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private int itemsReceived; // must not be negative. All negative arguments get set to 0.
	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	public static void main(String[] args) {
		
	}
	@Test
	public void testGetAndSetters() {
		setItemsReceived(-4);
		assertEquals(getItemsReceived(),0);
		setItemsReceived(5);
		assertEquals(getItemsReceived(),5);
		setDegreesTurned(56);
		assertEquals(getDegreesTurned(),56,0.01);
		setDegreesTurned(550);
		assertEquals(getDegreesTurned(),56,0.01);
		setNomenclature("");
		assertEquals(getNomenclature()," ");
		setNomenclature("Hello!");
		assertEquals(getNomenclature(),"Hello!");
		String s = "I am a tomato!";
		setMemberObj(s);
		assertNotEquals(getMemberObj(),s);
		setMemberObj(56);
		assertEquals(getMemberObj(),56);
	}
	public int getItemsReceived() {
		return itemsReceived;
	}

	public void setItemsReceived(int itemsReceived) {
		if (itemsReceived < 0) {
			itemsReceived = 0;
		}
		this.itemsReceived = itemsReceived;

	}

	public float getDegreesTurned() {
		return degreesTurned;
	}

	public void setDegreesTurned(float degreesTurned) {
		if (degreesTurned >= 0.0  && degreesTurned <= 360.0 ) {
			this.degreesTurned = degreesTurned;
		}
	}

	public String getNomenclature() {
		return nomenclature;
	}

	public void setNomenclature(String nomenclature) {
		if (nomenclature.equals("")) {
			nomenclature = " ";
		}
		this.nomenclature = nomenclature;
	}

	public Object getMemberObj() {
		return memberObj;
	}

	public void setMemberObj(Object memberObj) {
	
		//try {
		//	String test = (String) memberObj;
		//	memberObj = new Object();
		//} catch(Exception e) {
		//	System.out.print("Not a String");
		//} finally{
		//	this.memberObj = memberObj;
		//}
		if(memberObj instanceof String) {
			this.memberObj = new Object();
		}
		else {
		this.memberObj = memberObj;
		}
		}
}
