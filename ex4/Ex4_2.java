package pkex4;
import java.util.*;
class Ex4_2
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 ==>");
		int num1 = sc.nextInt();
		System.out.print("num2 ==>");
		int num2 = sc.nextInt();
		Calc cal = null;
		switch (NumCheck.compare(num1,num2)){
			case -1:
				cal = new Calc(num2,num1);
				break;
			case 0:
				cal = new Calc(num1);
				break;
			case 1:
				cal = new Calc(num1,num2);
				break;
		}
		System.out.println(cal.getNum1() + "+" + cal.getNum2() + "=" + cal.add());
		System.out.println(cal.getNum1() + "+" + cal.getNum2() + "+5" + "=" + cal.add(5));
		System.out.println(cal.getNum1() + "-" + cal.getNum2() + "=" + cal.sub());
		System.out.println(cal.getNum1() + "*" + cal.getNum2() + "=" + cal.mul());
		if(!NumCheck.isZero(cal.getNum2())){
		System.out.println(cal.getNum1() + "/" + cal.getNum2() + "=" + cal.div());
		System.out.println(cal.getNum1() + "%" + cal.getNum2() + "=" + cal.mod());
		}
	}
}

/*実行結果
num1 ==>54
num2 ==>2
54+2=56
54+2+5=61
54-2=52
54*2=108
54/2=27
54%2=0

num1 ==>5
num2 ==>0
5+0=5
5+0+5=10
5-0=5
5*0=0

num1 ==>4
num2 ==>35
35+4=39
35+4+5=44
35-4=31
35*4=140
35/4=8
35%4=3

num1 ==>4
num2 ==>4
4+4=8
4+4+5=13
4-4=0
4*4=16
4/4=1
4%4=0
*/