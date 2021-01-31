package pkstudent;
public class Science extends Student implements InfStudent
{	
	protected int sugaku=0;
	
	public Science(int no , String name){
		super(no,name);
	}
	public int getTotal(){
		return super.kokugo + super.eigo +sugaku;
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
		+sugaku+"("+this.getSelectName()+ ")   "
		+getTotal()+"   "
		+getAvg());
	}
	
	public void setSelect(int num){
		this.sugaku = num;
	}
	public String getSelectName(){
		return "数学";
	}

}

/*実行結果

*/