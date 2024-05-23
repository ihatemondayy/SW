import java.util.List;

public class BookManager {

	private List<Book> books;
	
	public void AddBook(int id, String name, String author, int year) {
		for (Book book : books) {
            if (book.getId() == id) {
                System.out.println("Book found: " + book);
                throw new IllegalArgumentException("해당 ID(" + id + ")는 이미 존재합니다");
            }
        }
		
		Book newBook = new Book();
		newBook.setId(id);
		newBook.setName(name);
		newBook.setAuthor(author);
		newBook.setPublicationYear(year);
		
	}
	
	public Book SearchBook(int id) {
		for (Book book : books) {
            if (book.getId() == id) {
                System.out.println("Book found: " + book);
                return book;
            }
        }
        throw new IllegalArgumentException("검색된 도서가 없습니다.");

	}
	
	public String RemoveBook(int id) {
		for (Book book : books) {
            if (book.getId() == id) {
            	String str = book.toString();
                books.remove(book);
                return str;
            }
        }
		throw new IllegalArgumentException("해당 ID(" + id + ")의 도서를 찾을 수 없습니다.");
	}
}
