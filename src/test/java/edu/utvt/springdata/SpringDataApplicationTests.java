package edu.utvt.springdata;

import edu.utvt.springdata.data.entities.Student;
import edu.utvt.springdata.data.repositories.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;

@SpringBootTest
class SpringDataApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
    @Autowired
    private NamedParameterJdbcOperations namedParameterJdbcOperations;

	@Test
	void contextLoads() {

		Student student = new Student("Picapiedra", "Pedro");
		studentRepository.save(student);
	}

}
