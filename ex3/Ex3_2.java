package pkex3;
import java.util.*;
class Ex3_2
{
	public static void main(String[] args){
		System.out.println("データを入力して下さい");
		Scanner sc = new Scanner(System.in);
		System.out.print("書籍ID ==>");
		int id = sc.nextInt();
		System.out.print("タイトル ==>");
		String title = sc.next();
		System.out.print("著者名 ==>");
		String author = sc.next();
		System.out.print("価格 ==>");
		int price = sc.nextInt();
		Book b1 = new Book();
		b1.SetData(id,title,author,price);
		b1.dispBook();
		System.out.print("割引率を入力して下さい ==>");
		int wb = sc.nextInt();
		b1.updatePrice(wb);
		System.out.println("書籍ID：" + b1.getId());
		System.out.println("タイトル：" + b1.getTitle());
		System.out.println("著者名：" + b1.getAuthor());
		System.out.println("新価格：" + b1.getPrice());
	}
}
/*実行結果
データを入力して下さい
書籍ID ==>5555
タイトル ==>aaaa
著者名 ==>brbrbr
価格 ==>10000
書籍ID：5555  タイトル：aaaa  著者名：brbrbr  価格：10000
割引率を入力して下さい ==>10
書籍ID：5555
タイトル：aaaa
著者名：brbrbr
新価格：9000

*/