package pkex6;
import common.Input;
import common.Calc;
class Ex6_2
{
	public static void main(String[] args){
			Input in = new Input();
			int num = in.inNum("正整数を入力して下さい");
			int num1 = in.inNum(num);
			int num2 = in.inNum(1,num1);
			Calc cal = new Calc();
			System.out.println(num1 + "+" + num2 + "=" + cal.add(num1,num2));
			System.out.println(num1 + "-" + num2 + "=" + cal.sub(num1,num2));
			System.out.println(num1 + "*" + num2 + "=" + cal.mul(num1,num2));
			System.out.println(num1 + "/" + num2 + "=" + cal.div(num1,num2));
			System.out.println(num1 + "%" + num2 + "=" + cal.mod(num1,num2));
	}
}

/*実行結果
正整数を入力して下さい==>7.7
整数を入力して下さい。
正整数を入力して下さい==>a
整数を入力して下さい。
正整数を入力して下さい==>-1
1以上の正整数を入力して下さい
正整数を入力して下さい==>100
100未満の正整数を入力して下さい==>101
1～99の正整数を入力
100未満の正整数を入力して下さい==>100
1～99の正整数を入力
100未満の正整数を入力して下さい==>-1
1～99の正整数を入力
100未満の正整数を入力して下さい==>79
1以上79以下の整数を入力して下さい==>0
1～79を入力
1以上79以下の整数を入力して下さい==>80
1～79を入力
1以上79以下の整数を入力して下さい==>5
79+5=84
79-5=74
79*5=395
79/5=15
79%5=4
*/