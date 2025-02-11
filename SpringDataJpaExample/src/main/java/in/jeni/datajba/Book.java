package in.jeni.datajba;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	@Id
private int bookId;
private String bookName;
private Double bookPrice;

}
