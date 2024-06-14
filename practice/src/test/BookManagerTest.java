package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

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
	
	@Test
	void performanceTest() {
		System.out.println("성능 테스트 시작");
		int test_num = 10000;
		int test_search_num = 5000;
		
		for (int i = 0; i < test_num; i++)
		{
			bookManager.AddBook(i, "test_bookname_" + i, "test_author_" + i, i + 2000);
		}
		Random random = new Random(); 
		System.out.println("생성된 책 개수 : " + test_num + "개, 검색 대상 개수 : " + test_search_num + "개");
		
		long startTime = System.currentTimeMillis();
		System.out.println("SearchBook 테스트 시작 시간 : " + startTime);
		for (int i = 0; i < test_search_num; i++)
		{
			int t = random.nextInt(test_num);
			bookManager.SearchBook(t);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("SearchBook 테스트 종료 시간 : " + endTime);
		System.out.println("SearchBook 테스트 소모 시간 : " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		System.out.println("search_bs 테스트 시작 시간 : " + startTime);
		for (int i = 0; i < test_search_num; i++)
		{
			int t = random.nextInt(test_num);
			bookManager.search_bs(t);
		}
		endTime = System.currentTimeMillis();
		System.out.println("search_bs 테스트 종료 시간 : " + endTime);
		System.out.println("search_bs 테스트 소모 시간 : " + (endTime - startTime));
	}

}
