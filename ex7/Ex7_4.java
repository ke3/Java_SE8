package pkex7;
import java.util.*;
import pkemp.Emp;
import pkemp.*;
import pkemp.sub.*;

class Ex7_4
{
	public static void main(String[] args){
		ArrayList<Emp> list = new ArrayList<Emp>();
		Scanner  sc = new Scanner(System.in);
		int no = 0;
		String name;
		
    	System.out.print("社員番号を入力して下さい==>");
		String sno =  sc.next();
		int no = Integer.parseInt(sno);
		
		
		
		FullEmp fe1 = new FullEmp(no,name,sal,bonus,holidays);
		
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

*/