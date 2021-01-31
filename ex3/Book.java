package pkex3;
class Book
{
	private int id;
	private String title;
	private String author;
	private int price;
	
	public void SetData(int id,String title,String author, int price){
		this.id = id;
		this.title = title;
		this.author = author;
		if(price<=10000&&price>=10){
		this.price = price;
		}else{
		this.price = 0;
		}
	}
	public void updatePrice(int wb){
		if(wb<0){
			return;
		}else{
		price = (int)(price*(1-(double)wb/100));
		}
	}
	public void dispBook(){
		System.out.printf("書籍ID：%d  タイトル：%s  著者名：%s  価格：%d\n",this.id,this.title,this.author,this.price);
	}
	public int getId(){
		return id;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public int getPrice(){
		return price;
	}
}

/*実行結果
*/