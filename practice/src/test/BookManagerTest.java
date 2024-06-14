package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import practice.BookManager;
import practice.Book;

class BookManagerTest {
	
	BookManager bookManager;

	@BeforeEach
	void setUp() throws Exception {
		bookManager = new BookManager();
		System.out.println("BookManager 인스턴스 생성");
	}


	@Test
	void testSearch_bs() {
		System.out.println("search_bs 테스트 시작 - 예시 book 입력");
		int test_num = 1000;
		for (int i = 0; i < test_num; i++)
		{
			bookManager.AddBook(i, "test_bookname", "test_author", i + 2000);
		}
		System.out.println("book " + test_num + "개 입력 완료");
		System.out.println("SearchBook과 search_bs 결과 비교");
		int test_id = 777;
		assertEquals(bookManager.SearchBook(test_id), bookManager.search_bs(test_id), "SearchBook과 search_bs의 결과는 같아야 함");
		System.out.println("테스트 통과");
	}

}
