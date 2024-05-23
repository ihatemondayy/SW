package practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice.BookManager;

class BookManagerTest {
	
	BookManager bookManager = new BookManager();

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAddBook() {
		bookManager.AddBook(1, "책이름", "사람이름", 2023);
	}

	@Test
	void testSearchBook() {
	}

	@Test
	void testRemoveBook() {
	}

}
