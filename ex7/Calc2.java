package common;
public class Calc2 extends Calc
{	
	public int sum(int a, int b){
		int sum = 0;
		
		if(a>=b){
			IllegalArgumentException ill = new IllegalArgumentException();
			throw ill;
		}
		
		for(int i = 0; i <= b-a; i++){
			sum += a + i;
		}
		
		return sum;
		
	}
	
	public int toInt(String str) throws Exception{
		
		int num = Integer.parseInt(str);
		
		if(num<0){
			Exception ex = new Exception();
			throw ex;
		}
		return num;
	}
}

/*
*/