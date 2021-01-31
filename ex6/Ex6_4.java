package pkex6;
import pkstudent.*;
import java.util.*;
class Ex6_4
{
	private static ArrayList<Student> list = new ArrayList<Student>();
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			String str = new String();
			boolean flg = true;
			while(flg==true){
				System.out.println("学生データを入力してください。\n理系→S 文系→H [end]で終了==>");
				String ck = sc.next();
				if (ck.equalsIgnoreCase("end")==true) {
					System.out.println("\n終了します。");
					flg = false;
				} else{
					String s = new String();
					s = sc.next();
					String ary[] = str.split(",");
					int no = Integer.parseInt(ary[0]);
					String name = ary[1];

					if(ary[2].equalsIgnoreCase("S")==true){
						Student sci= new Science(no,name);
						list.add(sci);
					}
					else if(ary[2].equalsIgnoreCase("H")==true){
						Student hum= new Human(no,name);
						list.add(hum);
					}
				}
			}
			if(flg==true){
				System.out.println("***  科目毎の点数を入力してください。");
			}
			for(Student st :list){
				System.out.println(st.getStuNo()+"  "+st.getStuName());
				System.out.println("      "+st.getKname()+"==>");
				String skg = sc.next();
				int kokugo= Integer.parseInt(skg);
				st.setKokugo(kokugo);
				
				System.out.println("      "+st.getEname()+"==>");
				String seg = sc.next();
				int eigo= Integer.parseInt(seg);
				st.setEigo(eigo);

				System.out.println(st.getSelectName()+"==>");
				String sSel = sc.next();
				int sel= Integer.parseInt(sSel);
				st.setSelect(sel);
			}
			if(flg==true){
				System.out.println("***   成績一覧表  ***");
				System.out.println("番号   氏名   国語   英語   選択   合計点   平均点");
				for(Student st  :list){
					st.show();
				}
			}
	}
}
/*実行結果
学生データを入力してください。
理系→S 文系→H [end]で終了==>
10,板橋花子,S
20,赤羽次郎,s
Exception in thread "main" java.lang.NumberFormatException: For input string: ""
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:776)
        at pkex6.Ex6_4.main(Ex6_4.java:22)
*/