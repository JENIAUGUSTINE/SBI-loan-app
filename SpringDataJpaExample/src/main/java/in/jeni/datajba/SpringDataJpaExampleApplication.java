package in.jeni.datajba;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.jeni.datajba.dao.BookRepository;
@SpringBootApplication
public class SpringDataJpaExampleApplication {

	public static void main(String[] args) {
ConfigurableApplicationContext cntxt = SpringApplication.run(SpringDataJpaExampleApplication.class, args);
BookRepository repo = cntxt.getBean(BookRepository.class);
Book b = new Book();
//b.setBookId(101);
//b.setBookName("Jeshwin");
//b.setBookPrice(102.00);
//Book save =repo.save(b);
//System.out.println(save);
Iterable<Book> bm = repo.findAll();

System.out.println(bm.toString());
	}

}
