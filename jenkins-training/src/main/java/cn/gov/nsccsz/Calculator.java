package cn.gov.nsccsz;

public class Calculator {

	public long add(int a, int b){
		return a + b;
	}
	
	public long minus(int a, int b){
		return a - b;
	}
	
	public long multiply(int a, int b){
		return a * b;
	}
	
	public long divide(int a, int b) throws Exception{
		if(b == 0) throw new Exception("0 error");
		return a / b;
	}
}
