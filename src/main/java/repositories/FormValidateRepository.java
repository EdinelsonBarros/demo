package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import formDomain.Row;

@Repository
public interface FormValidateRepository extends JpaRepository<Row, String>  {

}
