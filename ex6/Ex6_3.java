package pkex6;
import pkgreet.*;
import java.util.*;
class Ex6_3
{
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			Random rd = new Random();
			Greeting greet = null; 
			System.out.println("言語を選択してください。日本語：J  英語：E  フランス語：F ==>");
			String str = sc.next();
			int h = rd.nextInt(24);
//			int h = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
			
			if(str.equalsIgnoreCase("J")==true){
				greet = new Japanese();
			}
			if(str.equalsIgnoreCase("E")==true){
				greet = new English();
			}
			if(str.equalsIgnoreCase("F")==true){
				greet = new France();
			}
			
			System.out.println(h + "時の挨拶は ");

			if(h >= 5 && h <= 11){
				greet.morning();
			}
			if(h >= 12 && h <= 17){
				greet.afternoon();
			}
			if(h >= 18 && h <= 23 || h >= 0 && h <= 4){
				greet.evening();
			}
			

	}
}
/*実行結果
言語を選択してください。日本語：J  英語：E  フランス語：F ==>
j
8時の挨拶は
おはようございます

言語を選択してください。日本語：J  英語：E  フランス語：F ==>
e
0時の挨拶は
Good evening

言語を選択してください。日本語：J  英語：E  フランス語：F ==>
F
14時の挨拶は
Bonjour

*/