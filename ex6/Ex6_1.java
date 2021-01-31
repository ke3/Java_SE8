package pkex6;
//import java.lang.*;
import java.util.*;
import pkemp.Emp;
import pkemp.sub.FullEmp;
import pkemp.sub.PartEmp;

class Ex6_1
{
	public static void main(String[] args){
		ArrayList<Emp> list = new ArrayList<Emp>();
		
		FullEmp fe1 = new FullEmp(10,"村上春樹",500000,750000,10);
		FullEmp fe2 = new FullEmp(20,"池井戸潤",250000,750000,15);
		PartEmp pe1	= new PartEmp(110,"高橋まな",8000,10);
		PartEmp pe2	= new PartEmp(120,"中野哲也",15000,5);
		
		list.add(fe1);
		list.add(fe2);
		list.add(pe1);
		list.add(pe2);

		for(Emp emp: list){
			System.out.print(emp.desc());
			emp.show();
		}
    	System.out.println("社員数："+list.size()+" 人\n");
    	
		int cnt = 0;
		for(Emp emp: list){
			if(emp instanceof FullEmp){
				System.out.print(emp.desc());
				emp.show();
				cnt++;
			}
		}
    	System.out.printf("社員数：%d 人",cnt);
		
    }
}
/*実行結果
** 正社員 **  社員番号：10  氏名：村上春樹  給与：500000  賞与：750000  有給休暇：10 日
** 正社員 **  社員番号：20  氏名：池井戸潤  給与：250000  賞与：750000  有給休暇：15 日
** パート社員 **  社員番号：110  氏名：高橋まな  給与：80000  日給：8000   出勤日数：10 日
** パート社員 **  社員番号：120  氏名：中野哲也  給与：75000  日給：15000  出勤日数：5 日
社員数：4 人

** 正社員 **  社員番号：10  氏名：村上春樹  給与：500000  賞与：750000  有給休暇：10 日
** 正社員 **  社員番号：20  氏名：池井戸潤  給与：250000  賞与：750000  有給休暇：15 日
社員数：2 人

*/