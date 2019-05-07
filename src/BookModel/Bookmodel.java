package BookModel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bookmodel")
public class Bookmodel {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="bookname")
	private String bookname;
	
	@Column(name="author")
	private String author;
	
	@Column(name="noofbooks")
	private String noofbooks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getNoofbooks() {
		return noofbooks;
	}

	public void setNoofbooks(String noofbooks) {
		this.noofbooks = noofbooks;
	}
	
	
	
	
}


