package pkex5;
class Ex5_1
{
	public static void main(String[] args){
			FullEmp e1 = new FullEmp(10,"村上春樹",500000,750000,10);
			FullEmp e2 = new FullEmp(20,"池井戸潤",250000,750000,15);
			e1.show();
			e2.show();
	}
}

/*実行結果
社員番号：10    氏名：村上春樹  給与：500000  賞与：750000  有給休暇：10 日
社員番号：20    氏名：池井戸潤  給与：250000  賞与：750000  有給休暇：15 日

*/