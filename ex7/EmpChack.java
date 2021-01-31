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
	
	public int noCheck (String str) throws EmpException{
		
		int num = Integer.parseInt(str);
		
		
		
		
		if(0<num && 1000>num){
			EmpException empex = new EmpException(num, ERR2);
		}
		
		
		return num;
	}
}

/*
*/