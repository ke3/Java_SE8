package pkex7;
import java.util.*;
class Ex7_2
{	
	public static void main(String[] args){
		
		int ans = 0;
		int num=0;
		int i=0;
		while(i<5){
			Scanner sc = new Scanner(System.in);
			System.out.print(i+1+ "：整数を入力して下さい==>");
			String str = sc.next();
			num = toInt(str);
			if(num>=0){
				ans += num;
				i++;
			}
		}
		System.out.println("合計：" + ans);
	}
	
	public static int toInt(String str){
		int num = -1;
		try{		
			num  = Integer.parseInt(str);
			
			if(num<0){
				Exception ex = new Exception();
				throw ex;
			}
		}
		catch(NumberFormatException e ){
			System.out.println("整数ではありません。");
		}
		catch(Exception e){
			System.out.println("負の値です。");
			
		}
		finally{
			return num;
		}
	}
}

/*実行結果
1：整数を入力して下さい==>-1
負の値です。
1：整数を入力して下さい==>aaa
整数ではありません。
1：整数を入力して下さい==>0
2：整数を入力して下さい==>1
3：整数を入力して下さい==>2
4：整数を入力して下さい==>3
5：整数を入力して下さい==>4
合計：10