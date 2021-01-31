package pkex5;
import common.Emp;
class Ex5_4
{
	public static void main(String[] args){
			FullEmp emp1= new FullEmp(10,"村上春樹",500000,750000,10);
			PartEmp emp2 = new PartEmp(110,"高橋まな",8000,10);
			disp(emp1);
			disp(emp2);
	}
	
	static void disp(Emp emp){
		System.out.println(emp.desc());
		emp.show();
	}
}

/*実行結果
*** 正社員 ***
社員番号：10    氏名：村上春樹  給与：500000  賞与：750000  有給休暇：10 日
*** パート社員 ***
社員番号：110   氏名：高橋まな  給与：80000  日給：8000  出勤日数：10 日

*/