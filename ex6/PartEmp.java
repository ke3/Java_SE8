package pkemp.sub;
import pkemp.Emp;
public class PartEmp extends Emp
{
	private int workDayMoney;
	private int workDays;

	public PartEmp(int no,String name,int workDayMoney,int workDays){
		super(no,name,workDayMoney*workDays);
		this.workDayMoney = workDayMoney;
		this.workDays = workDays;
	}
	
	public PartEmp(){
	}
	public void show(){
		System.out.printf("  社員番号："+super.getNo()+"  氏名："+super.getName()+"  給与："+super.getSal()+"  日給：%-5d  出勤日数：%d 日\n",workDayMoney,workDays);
	}
	
	public String desc(){
	String s1 = "** パート社員 **";
	return s1;
	}
}
/*実行結果

*/