package com.springboot.learning;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Transactional
public interface BookingRepository<T> extends CrudRepository<Booking,Long> {
 
  
   public Booking findByDeparture(String departure);
}