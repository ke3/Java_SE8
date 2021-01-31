package common;
public class Emp
{
	private int no;
	private String name;
	private int salary;
	
	
	public Emp(){
		this.no = 999;
		this.name = "No name ";
		this.salary= 99999;
	}
	public Emp(String name){
		this();
		this.name = name;
	}
	public Emp(int no,String name,int salary){
		this.no = no;
		this.name = name;
		this.salary=salary;
	}
	public void SetData(int no,String name,int salary){
		this.no = no;
		this.name = name;
		this.salary=salary;
	}
	public void show(){
		System.out.printf("社員番号：%-4d  氏名：%s  給与：%-6d",no,name,salary);
	}
	public void setNo(int no){
		this.no = no;
	}
	public void setSal(int salary){
		this.salary = salary;
	}
	public String desc(){
		String s1 = "*** 社員 ***";
		return s1;
	}
}
/*実行結果

*/