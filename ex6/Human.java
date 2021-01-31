package pkstudent;
public class Human extends Student implements InfStudent
{	
	protected int syakai=0;
	
	
	public Human(int no , String name){
		super(no,name);
	}
	
	public int getTotal(){
		return super.kokugo + super.eigo +syakai;
	}
	
	public double getAvg(){
		return getTotal() / 3.0;
	}
	
	public void show(){
		
		System.out.println(
		 super.no+"   "
		+super.name+"   "
		+super.kokugo+"   "
		+super.eigo+"   "
		+syakai+"("+this.getSelectName()+ ")   "
		+getTotal()+"   "
		+getAvg());
	}
	
	public void setSelect(int num){
		this.syakai = num;
	}
	public String getSelectName(){
		return "社会";
	}

}

/*実行結果

*/