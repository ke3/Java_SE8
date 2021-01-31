//*****************************//
//   ファイル名 :Ex2_1.java    //
//   課題番号   :2_1           //
//   作成者     :大友          //
//   番号       :8             //
//   日付       :2020-10-14     //
//*****************************//

class Ex2_1
{
	public static void main(String[] args){
			String[] no = {"1001","1002","1003","1004","1005","1006","1007"};
			String[] name = {"相田","井上","江口","岡田","佐藤","鈴木","田中"};
			int flg=0;
			int i=0;
			String str=args[0];
			
			if(args.length != 1){
				System.out.println("１つの引数を入力してください");
				System.exit(1);
			}
			while(i<no.length && flg!=1){
				boolean bl = no[i].equals(str);
				if(bl==false){
					i++;
				}else{
					System.out.printf("番号：%s   名前：%s\n",no[i],name[i]);
					flg=1;
					i=no.length;
				}
			}
			if(flg==0){
				System.out.println("該当しない番号"+str+"です");
			}
	}
}

/*実行結果
Z:\Drive_Z\java\Ex2>java Ex2_1 1001 111
１つの引数を入力してください

Z:\Drive_Z\java\Ex2>java Ex2_1 1000
該当しない番号1000です

Z:\Drive_Z\java\Ex2>java Ex2_1 1001
番号：1001   名前：相田

Z:\Drive_Z\java\Ex2>java Ex2_1 1007
番号：1007   名前：田中

Z:\Drive_Z\java\Ex2>java Ex2_1 1008
該当しない番号1008です

*/