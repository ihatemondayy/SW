package practice;
import java.util.ArrayList;
import java.util.List;

public class BookManager {

	private List<Book> books;
	
	public BookManager() {
		books = new ArrayList<Book>();
	}
	
	public void AddBook(int id, String name, String author, int year) {
		for (Book book : books) {
            if (book.getId() == id) {
                System.out.println("해당 ID(" + id + ")는 이미 존재합니다");
                throw new IllegalArgumentException("해당 ID(" + id + ")는 이미 존재합니다");
            }
        }
		
		Book newBook = new Book();
		newBook.setId(id);
		newBook.setName(name);
		newBook.setAuthor(author);
		newBook.setPublicationYear(year);
		books.add(newBook);
		System.out.println(newBook + " 도서가 추가되었습니다.");
	}
	
	public Book SearchBook(int id) {
		for (Book book : books) {
            if (book.getId() == id) {
            	System.out.println("검색 결과 : ");
                System.out.println(book);
                return book;
            }
        }
        throw new IllegalArgumentException("검색된 도서가 없습니다.");

	}
	
	public void RemoveBook(int id) {
		for (Book book : books) {
            if (book.getId() == id) {
            	System.out.println(book + " 도서가 삭제되었습니다.");
                books.remove(book);
            }
        }
		throw new IllegalArgumentException("해당 ID(" + id + ")의 도서를 찾을 수 없습니다.");
	}
	
	public Book search_bs(int id) {
	    int left = 0;
	    int right = books.size() - 1;
	    
	    while (left <= right) {
	        int middle = (left + right) / 2;

	        if (books.get(middle).getId() == id) {
	            System.out.println("검색 결과 : ");
	            System.out.println(books.get(middle));
	            return books.get(middle);
	        } else if (books.get(middle).getId() < id) {
	            left = middle + 1;
	        } else {
	            right = middle - 1;
	        }
	    }
	    
	    throw new IllegalArgumentException("검색된 도서가 없습니다.");
	}
}
