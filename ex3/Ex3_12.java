package pkex3;
class Ex3_12
{
	public static void main(String[] args){
		Emp[] array = new Emp[5];
		array[0] = new Emp();
		array[1] = new Emp();
		array[2] = new Emp();
		array[3] = new Emp();
		array[4] = new Emp();
		
		array[0].SetData(10,"井口",300000);
		array[1].SetData(12,"上野",240000);
		array[2].SetData(14,"江副",230000);
		array[3].SetData(16,"小野",270000);
		array[4].SetData(20,"加藤",310000);
		
		for(Emp em:array){
			em.show();
		}
	}
}
/*実行結果
社員番号：10  氏名：井口  給与：300000
社員番号：12  氏名：上野  給与：240000
社員番号：14  氏名：江副  給与：230000
社員番号：16  氏名：小野  給与：270000
社員番号：20  氏名：加藤  給与：310000

*/