package com.springboot.learning;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
 
  
   public Employee findByDeparture(String departure);


}
