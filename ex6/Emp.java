package pkemp;
public abstract class Emp
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
	
	public void setNo(int no){
		this.no = no;
	}
	public void setSal(int salary){
		this.salary = salary;
	}
	
	public int getNo(){
		return no;
	}
	
	public String getName(){
		return name;
	}
	
	public int getSal(){
		return salary;
	}
	
//抽象メソッド
	public abstract String desc();

	public abstract void show();
}
/*実行結果

*/