package pkex3;
class Emp
{
	private int no;
	private String name;
	private int salary;
	
	public void SetData(int no,String name,int salary){
		this.no = no;
		this.name = name;
		this.salary=salary;
	}
	public void show(){
		System.out.printf("社員番号：%d  氏名：%s  給与：%d\n",no,name,salary);
	}
}
/*実行結果

*/