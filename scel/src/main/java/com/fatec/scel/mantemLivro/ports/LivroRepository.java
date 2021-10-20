package com.fatec.scel.mantemLivro.ports;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fatec.scel.mantemLivro.model.Livro;
@Repository
public interface LivroRepository extends CrudRepository<Livro, Long> {
	  //@Query("SELECT l FROM Livro l WHERE l.isbn = :isbn")
	   public Livro findByIsbn(@Param("isbn") String isbn);


}
