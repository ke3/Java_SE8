package pkex4;
class Calc
{
	private int num1;
	private int num2;
	
	public Calc(int num){
		this.num1 = num;
		this.num2 = num;
	}
	public Calc(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;		
	}
	public int add(){
		return num1+num2;
	}
	public int add(int n){
		return num1+num2+n;
	}
	public int sub(){
		return num1-num2;
	}
	public int mul(){
		return num1*num2;
	}
	public int div(){
		return num1/num2;
	}
	public int mod(){
		return num1%num2;
	}
	public int getNum1(){
		return num1;
	}
	public int getNum2(){
		return num2;
	}

}

