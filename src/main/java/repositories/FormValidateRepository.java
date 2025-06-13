package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import formDomain.FormValidate;

@Repository
public interface FormValidateRepository extends JpaRepository<FormValidate, String>  {

}
