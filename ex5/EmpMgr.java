package pkex5;
import java.util.*;
import common.Emp;
public class EmpMgr
{
	private ArrayList<Emp> list = new ArrayList<Emp>();
	
	public void inputAll(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("社員データ入力して下さい。正社員なら１を  パート社員なら２を押してください。[end]で終了します。");
			String sck = sc.next();
			if(sck.equalsIgnoreCase("end")==true){
				System.out.println("\n終了します。");
				break;
			}else{
				int ck = Integer.parseInt(sck);
				
				if(ck<1 || ck>2){
					System.out.println("１か２の整数を入力して下さい。[end]で終了");
					sck = sc.next();
					if(sck.equalsIgnoreCase("end")==true){
						System.out.println("\n終了します。");
						break;
					}else {
						ck = Integer.parseInt(sck);
					}
				}
				System.out.print("社員番号 ==>");
				int id = sc.nextInt();
				
				System.out.print("氏名 ==>");
				String name = sc.next();
				
				if(ck==1){
					System.out.print("給与 ==>");
					int sly = sc.nextInt();
					System.out.print("賞与 ==>");
					int bns = sc.nextInt();
					System.out.print("有給休暇 ==>");
					int hDys = sc.nextInt();
					FullEmp femp = new FullEmp (id,name,sly,bns,hDys);
					list.add(femp);
				
				}else if(ck==2){
					
					System.out.print("日給 ==>");
					int dayMny = sc.nextInt();
					System.out.print("出勤日数 ==>");
					int workDys = sc.nextInt();
					PartEmp pemp = new PartEmp (id,name,dayMny,workDys);
					list.add(pemp);
					
				}else{					
					System.out.println("もう一度押してください。");
					
				}
			}
		}
	}
	
	public ArrayList<Emp> getList(){
		return list;
	}
}

/*実行結果

*/