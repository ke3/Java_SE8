package pkstudent;
public abstract class Student 
{	
	protected int no=0;
	protected String name;
	protected int kokugo=0;
	protected int eigo=0;
	

	//コンストラクタ
	public Student(int no , String name){
		this.no = no;
		this.name = name;
	}
	
	public void setKokugo(int num){
		this.kokugo = num;
	}
	
	public void setEigo(int num){
		this.eigo = num;
	}
	
	public int getStuNo(){
		return no;
	}
	
	public String getStuName(){
		return name;
	}
	public String getKname(){
		return "国語";
	}
	
	public String getEname(){
		return "英語";
	}
	//抽象メソッド
	abstract public void show();
	
	abstract public void setSelect(int num);
	
	abstract public String getSelectName();
	

}

/*実行結果

*/