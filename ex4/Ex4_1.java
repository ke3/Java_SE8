package pkex4;
class Ex4_1
{
	public static void main(String[] args){
			Emp e1 = new Emp();
			e1.show();
			e1.SetData(10,"村上春樹",500000);
			e1.show();
			
			Emp e2 = new Emp(20,"池井戸潤",250000);
			e2.show();
			
			Emp e3 = new Emp("高橋まな");			
			e3.show();
			e3.setNo(30);
			e3.setSal(150000);
			e3.show();
	}
}

/*実行結果
社員番号：999   氏名：No name   給与：99999
社員番号：10    氏名：村上春樹  給与：500000
社員番号：20    氏名：池井戸潤  給与：250000
社員番号：999   氏名：高橋まな  給与：99999
社員番号：30    氏名：高橋まな  給与：150000
*/