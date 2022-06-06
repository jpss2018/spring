package br.com.jpss.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.jpss.model.Person;

@Repository
public interface PersonRepository  extends JpaRepository<Person, Long>{
	
	@Query("Select person from Person person where person.name like %:name% order by name")
	public List<Person> findByFiltro(@Param("name") String name);
}
