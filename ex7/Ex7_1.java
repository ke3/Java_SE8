package pkex7;

class Ex7_1
{
	public static void main(String[] args){
		int i=0;
		try{				
      		int[] num = new int[args.length];
			for(i=0; i<=1; i++){
				num[i] = Integer.parseInt(args[i]);
			}
			
			int ans = num[0] * num[1];
			System.out.println(num[0] + "*" + num[1] + "=" + ans);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("引数が不足です。");
		}
		catch(NumberFormatException e ){
			System.out.println(args[i] + "は整数ではありません。");
		}
	}
}

/*実行結果
Z:\Drive_Z\java\javakadai>java pkex7.Ex7_1 7
引数が不足です。

Z:\Drive_Z\java\javakadai>java pkex7.Ex7_1 7 5
7*5=35

Z:\Drive_Z\java\javakadai>java pkex7.Ex7_1 7 a
aは整数ではありません。

Z:\Drive_Z\java\javakadai>java pkex7.Ex7_1 a 7
aは整数ではありません。

Z:\Drive_Z\java\javakadai>java pkex7.Ex7_1 7 5 abc
7*5=35

Z:\Drive_Z\java\javakadai>java pkex7.Ex7_1 7 5 3
7*5=35
*/