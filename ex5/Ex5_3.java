package pkex5;
import common.Emp;
class Ex5_3
{
	public static void main(String[] args){
			Emp e1 = new Emp();
			FullEmp e2 = new FullEmp(110,"高橋まな",8000,10,10);
			PartEmp e3 = new PartEmp(120,"中野哲也",15000,5);
			System.out.println(e1.desc());
			System.out.println(e2.desc());
			System.out.println(e3.desc());

	}
}

/*実行結果
*** 社員 ***
*** 正社員 ***
*** パート社員 ***

*/