package test;

public class Calculate {
	
	private float result;
	
	//INTIALIZATION
	public Calculate(float result) {
		super();
		this.result = result;
	}
	
	

	public Calculate() {
		super();
		// TODO Auto-generated constructor stub
	}


	//GETTERS & SETTERS
	public float getResult() {
		return result;
	}


	public void setResult(float result) {
		this.result = result;
	}

	
	
	//USER FUNCTIONS

	float add(InputNumbers inpt){
		
		return result = inpt.getInpt1() + inpt.getInpt2();
		

	}
	
	float substract(InputNumbers inpt){
		
		return result = inpt.getInpt1() - inpt.getInpt2();
	}
	
	float multiply(InputNumbers inpt){
		
		return result = inpt.getInpt1() * inpt.getInpt2();
	}
	float divide(InputNumbers inpt){
		
		return result = inpt.getInpt1() / inpt.getInpt2();
	}
	
}
