package pkex4;
import java.lang.*;
import java.util.*;
class Ex4_3
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BookMgr bm = new BookMgr();
		
		while(true){
			System.out.println("書籍データ入力して下さい。[end]で終了します。");
			System.out.print("書籍ID ==>");
			String sid = sc.next();
			if(sid.equalsIgnoreCase("end")!=true){
				int id = Integer.parseInt(sid);
				System.out.print("タイトル ==>");
				String title = sc.next();
				System.out.print("著者名 ==>");
				String author = sc.next();
				System.out.print("価格 ==>");
				int price = sc.nextInt();
				System.out.print("在庫数 ==>");
				int stock = sc.nextInt();
				Book bk = new Book(id,title,author,price,stock);
				bm.addList(bk);
			}else{
				break;
			}
		}
//BookMgrから出力メソッド呼び出し		
//        bm.printAll();

//BookMgrからgetListでlistの戻り値を取得後、Bookの出力メソッド呼び出し
		System.out.println("===============================================================================");
		//キャストしたい場合
		//ArrayList<Book> list = (ArrayList<Book>)bm.getList();
		ArrayList<Book> list = bm.getList();
		for(Book book : list){
			book.dispBook();
		}
		System.out.println("\n登録書籍数合計：" + bm.getCnt() + "    書籍在庫数合計：" + bm.getTotalStock());
		System.out.println("===============================================================================");
	}
}
/*実行結果
書籍データ入力して下さい。[end]で終了します。
書籍ID ==>111
タイトル ==>やさしいJava
著者名 ==>高橋まな
価格 ==>1200
在庫数 ==>100
書籍データ入力して下さい。[end]で終了します。
書籍ID ==>222
タイトル ==>簡単サーブレット
著者名 ==>中野明
価格 ==>2700
在庫数 ==>25
書籍データ入力して下さい。[end]で終了します。
書籍ID ==>333
タイトル ==>すぐできるJSP
著者名 ==>岡本哲
価格 ==>3800
在庫数 ==>10
書籍データ入力して下さい。[end]で終了します。
書籍ID ==>444
タイトル ==>JSP入門
著者名 ==>岡本哲
価格 ==>1550
在庫数 ==>5
書籍データ入力して下さい。[end]で終了します。
書籍ID ==>End
===============================================================================
書籍ID：111   タイトル：やさしいJava  著者名：高橋まな  価格：1200  在庫：100
書籍ID：222   タイトル：簡単サーブレット  著者名：中野明  価格：2700  在庫：25
書籍ID：333   タイトル：すぐできるJSP  著者名：岡本哲  価格：3800  在庫：10
書籍ID：444   タイトル：JSP入門  著者名：岡本哲  価格：1550  在庫：5

登録書籍数合計：4    書籍在庫数合計：140
===============================================================================
*/