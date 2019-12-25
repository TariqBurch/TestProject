package test;

public class InputNumbers {
	
	private float inpt1, inpt2;
	
	
	//INTIALIZATION
	public InputNumbers(float inpt1, float inpt2) {
		
		this.inpt1 = inpt1;
		this.inpt2 = inpt2;
	}

	public InputNumbers() {
		inpt1 = 0.0f;
		inpt2 = 0.0f;
		// TODO Auto-generated constructor stub
	}

	//GETTERS & SETTERS
	public float getInpt1() {
		return inpt1;
	}

	public void setInpt1(float inpt1) {
		this.inpt1 = inpt1;
	}

	public float getInpt2() {
		return inpt2;
	}

	public void setInpt2(float inpt2) {
		this.inpt2 = inpt2;
	}
	

}
