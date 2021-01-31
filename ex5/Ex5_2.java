package pkex5;
class Ex5_2
{
	public static void main(String[] args){
			PartEmp e1 = new PartEmp(110,"高橋まな",8000,10);
			PartEmp e2 = new PartEmp(120,"中野哲也",15000,5);
			e1.show();
			e2.show();
	}
}

/*実行結果
社員番号：110   氏名：高橋まな  給与：80000  日給：8000  出勤日数：10 日
社員番号：120   氏名：中野哲也  給与：75000  日給：15000  出勤日数：5 日

*/