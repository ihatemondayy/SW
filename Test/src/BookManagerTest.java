import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookManagerTest {

	private BookManager bookManager;
	
	@BeforeEach
	void setUp() throws Exception {
		bookManager = new BookManager();
	}

	@Test
	void testAddBook() {
		bookManager.AddBook(1, "Java기초", "jane", 2012);
		bookManager.AddBook(1, "Java기초", "jane", 2012);
		bookManager.SearchBook(1);
	}

	@Test
	void testSearchBook() {
		bookManager.AddBook(1, "Java기초", "jane", 2012);
		bookManager.AddBook(2, "Java중급", "jan2e", 2013);
		bookManager.AddBook(3, "Java심화", "jane3", 2015);
		
		bookManager.SearchBook(1);
		bookManager.SearchBook(2);
		bookManager.SearchBook(3);
	}

	@Test
	void testRemoveBook() {
		bookManager.AddBook(1, "Java기초", "jane", 2012);
		bookManager.AddBook(2, "Java중급", "jan2e", 2013);
		
		bookManager.RemoveBook(1);
		
		bookManager.SearchBook(1);
	}

}
