package pkex5;
import common.Emp;
class Ex5_5
{
	public static void main(String[] args){
			Emp[] ary = {
			new FullEmp(10,"村上春樹",500000,750000,10),
			new FullEmp(20,"池井戸潤",250000,750000,15),
			new PartEmp(110,"高橋まな",8000,10),
			new PartEmp(120,"中野哲也",15000,5)
			};

			for(Emp emp : ary){
				emp.show();
			}
	}
}

/*実行結果
社員番号：10    氏名：村上春樹  給与：500000  賞与：750000  有給休暇：10 日
社員番号：20    氏名：池井戸潤  給与：250000  賞与：750000  有給休暇：15 日
社員番号：110   氏名：高橋まな  給与：80000   日給：8000   出勤日数：10 日
社員番号：120   氏名：中野哲也  給与：75000   日給：15000  出勤日数：5 日

*/