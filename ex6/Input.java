package common;
import java.util.*;
public class Input implements InfInput
{	
	public int inNum(String str){
		
		boolean flg = false;
		int num = 0;		
		while(flg==false){
			try{
				Scanner sc = new Scanner(System.in);
				System.out.print(str + "==>");
				String snum = sc.next();
				num = Integer.parseInt(snum);
				if(num>=1){
					flg = true;
				}else {
				System.out.println("1以上の正整数を入力");
					
				}
			}
			catch(NumberFormatException e){
				System.out.println("整数を入力して下さい。");
			}
		}
		return num;
	}
	
	public int inNum(int a){
		boolean flg = false;
		int num = 0;		
		while(flg==false){
			try{
				Scanner sc = new Scanner(System.in);
				System.out.print(a + "未満の正整数を入力して下さい==>");
				String snum = sc.next();
				num = Integer.parseInt(snum);
				if(num < a && num >=1){
					flg = true;
				}else {
				System.out.println("1～"+ (a-1));
				}
			}
			catch(NumberFormatException e){
				System.out.println("範囲外による入力エラーです。");
			}
		}
		return num;
	}
	
	public int inNum(int a,int b){
		boolean flg = false;
		int num = 0;
		while(flg==false){
			try{
				Scanner sc = new Scanner(System.in);
				System.out.print(a + "以上" + b + "以下の整数を入力して下さい==>");

				String snum = sc.next();
				num = Integer.parseInt(snum);
				if(num >= a && num <= b){
					flg = true;
				}else {
					System.out.println(a + "～" + b + "を入力");
				}
			}
			catch(NumberFormatException e){
				System.out.println("範囲外による入力エラーです。");
			}
		}
		return num;
	}
}

/*実行結果
*/