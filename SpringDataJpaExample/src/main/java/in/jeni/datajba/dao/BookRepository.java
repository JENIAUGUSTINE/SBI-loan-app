package in.jeni.datajba.dao;

import org.springframework.data.repository.CrudRepository;

import in.jeni.datajba.Book;


public interface BookRepository extends CrudRepository<Book, Integer>{

}
