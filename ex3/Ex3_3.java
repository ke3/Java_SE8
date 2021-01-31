package pkex3;
import java.lang.*;
class Ex3_3
{
	public static void main(String[] args){
		if(args.length != 1){
			System.out.println("書籍数を引数で入力してください");
			return;
		}
		int bk;
		bk = Integer.parseInt(args[0]);
		if(bk< 3 || bk > 5){
			System.out.println("書籍数は3～5の範囲です");
			return;
		}
		BookMgr bm = new BookMgr();
		bm.setSize(bk);
		bm.input();
		bm.output();
	}
}

/*実行結果
1冊目のデータ入力
書籍ID ==>9781
タイトル ==>火花
著者名 ==>又吉直樹
価格 ==>1200

2冊目のデータ入力
書籍ID ==>1234
タイトル ==>aaaaa
著者名 ==>野口英世
価格 ==>1350

3冊目のデータ入力
書籍ID ==>1357
タイトル ==>cccc
著者名 ==>樋口一葉
価格 ==>2500

書籍ID：9781  タイトル：火花  著者名：又吉直樹  価格：1200
書籍ID：1234  タイトル：aaaaa  著者名：野口英世  価格：1350
書籍ID：1357  タイトル：cccc  著者名：樋口一葉  価格：2500

*/