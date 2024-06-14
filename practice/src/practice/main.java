package practice;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager bm = new BookManager();
		for(int i = 1;i<=20;i++) {
			bm.AddBook(i, "name" + i, "author" + i, i+2000);
		}
		bm.SearchBook(20);
		bm.search_bs(20);
	}

}
