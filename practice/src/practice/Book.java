package practice;

public class Book {

	int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	String name;
	
	String author;
	
	int publicationYear;
	
	@Override
	public String toString() {
		return String.format("id:%d name:%s author:%s year:%d", id, name, author, publicationYear);
	}
	
}
