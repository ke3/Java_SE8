package pkex3;
class Ex3_11
{
	public static void main(String[] args){
			Emp e1 = new Emp();
			Emp e2 = new Emp();
			e1.SetData(10,"村上春樹",500000);
			e2.SetData(20,"池井戸潤",250000);
			e1.show();
			e2.show();
	}
}

/*実行結果
社員番号：10  氏名：村上春樹  給与：500000
社員番号：20  氏名：池井戸潤  給与：250000

*/