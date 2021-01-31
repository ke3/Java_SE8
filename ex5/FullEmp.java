package pkex5;
import common.Emp;
public class FullEmp extends Emp
{
	private int bonus;
	private int holidays;
	
	public FullEmp(int no,String name,int salary,int bonus,int holidays){
		super(no,name,salary);
		this.bonus = bonus;
		this.holidays = holidays;
	}
	public FullEmp(){
	}
	
	public void show(){
		super.show();
		//オーバーライド
		System.out.printf("  賞与：%d  有給休暇：%d 日\n",bonus,holidays);
	}
	
	public String desc(){
		String s1 = "*** 正社員 ***";
		return s1;
	}
}
/*実行結果

*/