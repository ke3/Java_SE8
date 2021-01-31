package pkex4;
class Book
{
	private int id;
	private String title;
	private String author;
	private int price;
	private int stock;
	
	public Book(int id,String title,String author, int price,int stock){
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	public void dispBook(){		
	System.out.printf("書籍ID：%-4d  タイトル：%s  著者名：%s  価格：%-4d  在庫：%-4d\n",id,title,author,price,stock);
			
	}
	
	public int getStock(){
		return stock;
	}
}

/*実行結果
*/