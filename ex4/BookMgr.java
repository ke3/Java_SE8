package pkex4;
import java.util.*;
class BookMgr
{
	private ArrayList<Book> list = new ArrayList<Book>();
	private int cnt;
	private int stock;
	
	public void addList(Book bk){
		list.add(bk);
		cnt++;
		stock += bk.getStock();
	}
	
	public ArrayList<Book> getList(){
		return list;
	}
	public int getCnt(){
		return cnt;
	}
		public int getTotalStock(){
		return stock;
	}
	
/*BookMgrクラス内のメソッドで出力する
	public void printAll(){
			for(Book book : list){
			book.dispBook();
		}
	}	
*/


}

/*実行結果

*/