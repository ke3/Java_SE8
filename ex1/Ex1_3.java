//*****************************//
//   ファイル名 :Ex1_3.java    //
//   課題番号   :1_3           //
//   作成者     :大友          //
//   番号       :8             //
//   日付       :2020-10-5     //
//*****************************//
class Ex1_3
{
	public static void main(String[] args){
			System.out.println("  *** FizzBuzz start ***");
			for(int i=1; i<=100; i++){
				if(i%35==0){
				System.out.print("  FizzBuzz");
				}else if(i%7==0){
				System.out.print("  Buzz");
				}else if(i%5==0){
				System.out.print("  Fizz");
				}else{
				System.out.printf("%4d",i);
				}
				if(i%10==0)System.out.println();
			}
			System.out.println("  *** FizzBuzz Terminated ***");
	}
}

/*実行結果
  *** FizzBuzz start ***
   1   2   3   4  Fizz   6  Buzz   8   9  Fizz
  11  12  13  Buzz  Fizz  16  17  18  19  Fizz
  Buzz  22  23  24  Fizz  26  27  Buzz  29  Fizz
  31  32  33  34  FizzBuzz  36  37  38  39  Fizz
  41  Buzz  43  44  Fizz  46  47  48  Buzz  Fizz
  51  52  53  54  Fizz  Buzz  57  58  59  Fizz
  61  62  Buzz  64  Fizz  66  67  68  69  FizzBuzz
  71  72  73  74  Fizz  76  Buzz  78  79  Fizz
  81  82  83  Buzz  Fizz  86  87  88  89  Fizz
  Buzz  92  93  94  Fizz  96  97  Buzz  99  Fizz
  *** FizzBuzz Terminated ***
*/