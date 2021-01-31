package pkex3;
import java.util.*;
import java.lang.*;
class BookMgr
{
	private Book[] array;
	private int size;
	
	public void setSize(int size){
		this.size = size;
		array = new Book[size];
	}
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		int i;
		for(i=0; i<this.size; i++){
			System.out.println(i+1 + "冊目のデータ入力");
			System.out.print("書籍ID ==>");
			int id = sc.nextInt();
			System.out.print("タイトル ==>");
			String title = sc.next();
			System.out.print("著者名 ==>");
			String author = sc.next();
			System.out.print("価格 ==>");
			int price = sc.nextInt();
			System.out.println();	
			array[i] = new Book();
			array[i].SetData(id,title,author,price);
		}
	}
	
	public void output(){
		for(Book em: array){
			em.dispBook();
		}
	}
}

/*実行結果

*/