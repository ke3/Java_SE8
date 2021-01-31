package pkex7;
import java.util.*;
import common.*;
class Ex7_3
{	
	public static void main(String[] args){
		
		int num1 = 0;
		int num2 = 0;
		int i = 0;
		boolean flg = false;
		
		while(flg == false){
			try{
				Calc2 cal = new Calc2();
				while(flg==false){
					
					Scanner sc = new Scanner(System.in);
					System.out.print("1つ目の整数を入力して下さい==>");
					String str = sc.next();
					num1 = cal.toInt(str);
					System.out.print("2つ目の整数を入力して下さい==>");
					str = sc.next();
					num2 = cal.toInt(str);
					flg = true;
				}
				
				System.out.println(num1 + "+" + num2 + "=" + cal.add(num1,num2));
				System.out.println(num1 + "-" + num2 + "=" + cal.sub(num1,num2));
				System.out.println(num1 + "から" + num2 + "の和は" + cal.sum(num1,num2));
			
			}
			catch(NumberFormatException e ){
				System.out.println("整数ではありません\n");
			}
			catch(IllegalArgumentException e ){
				System.out.println("整数の大小関係エラーです\n");
				flg = false;
			}
			catch(Exception e ){
				System.out.println("負の値です\n");
			}
		}
	}
}

/*実行結果
1つ目の整数を入力して下さい==>aaa
整数ではありません

1つ目の整数を入力して下さい==>10
2つ目の整数を入力して下さい==>bbb
整数ではありません

1つ目の整数を入力して下さい==>10
2つ目の整数を入力して下さい==>-5
負の値です

1つ目の整数を入力して下さい==>10
2つ目の整数を入力して下さい==>2
10+2=12
10-2=8
整数の大小関係エラーです

1つ目の整数を入力して下さい==>1
2つ目の整数を入力して下さい==>10
1+10=11
1-10=-9
1から10の和は55
*/