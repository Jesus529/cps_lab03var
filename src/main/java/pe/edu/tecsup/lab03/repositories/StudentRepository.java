package pe.edu.tecsup.lab03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.tecsup.lab03.entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

}
