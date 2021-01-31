package pkex5;
//import java.lang.*;
import java.util.*;
import common.Emp;

class Ex5_6
{
	public static void main(String[] args){
		EmpMgr eMgr = new EmpMgr();
		
    	eMgr.inputAll();

		
		System.out.println("===============================================================================");
		ArrayList<Emp> list = eMgr.getList();
		for(Emp emp: list){
			System.out.println(emp.desc());
			emp.show();
		}
		
		
		System.out.println("===============================================================================");
    	
    }
}
/*実行結果
社員データ入力して下さい。正社員なら１を  パート社員なら２を押してください。[end]で終了します。
15
１か２の整数を入力して下さい。[end]で終了
END

終了します。
===============================================================================
===============================================================================

社員データ入力して下さい。正社員なら１を  パート社員なら２を押してください。[end]で終了します。
end

終了します。
===============================================================================
===============================================================================

社員データ入力して下さい。正社員なら１を  パート社員なら２を押してください。[end]で終了します。
1
社員番号 ==>3333
氏名 ==>rrrrr
給与 ==>400000
賞与 ==>100000
有給休暇 ==>30
社員データ入力して下さい。正社員なら１を  パート社員なら２を押してください。[end]で終了します。
2
社員番号 ==>6654
氏名 ==>nnnn
給与 ==>200000
日給 ==>8000
出勤日数 ==>20
社員データ入力して下さい。正社員なら１を  パート社員なら２を押してください。[end]で終了します。
end

終了します。
===============================================================================
*** 正社員 ***
社員番号：3333  氏名：rrrrr  給与：400000  賞与：100000  有給休暇：30 日
*** パート社員 ***
社員番号：6654  氏名：nnnn  給与：160000  日給：8000   出勤日数：20 日
===============================================================================

*/