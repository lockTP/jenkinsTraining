package cn.gov.nsccsz;

public class Calculator {

	public long newFun(int a, int b){
		return a*a+b*b;
	}
	
	public long add(int a, int b){
		System.out.println("jenkins");
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
