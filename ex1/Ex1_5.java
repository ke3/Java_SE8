//*****************************//
//   ファイル名 :Ex1_5.java    //
//   課題番号   :1_5           //
//   作成者     :大友          //
//   番号       :8             //
//   日付       :2020-10-12    //
//*****************************//
class Ex1_5
{
	public static void main(String[] args){
			boolean[] array = {true,true,false,false,true,true,false};
			for(int i=0; i<array.length; i++){
				System.out.print(i+1);
				if(array[i]==true){						
					for(int j=0; j<=i; j++){
						System.out.print("*");
					}
					System.out.println();
				}else{
					System.out.println();
				}
			}
	}
}

/*実行結果
1*
2**
3
4
5*****
6******
7

*/