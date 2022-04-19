package com.springboot.learning;
 import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKING")
public class skdhgfv implements Serializable{

  
 private static final long serialVersionUID = 1L;
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 Long booking_id;
 @Column
 String psngrName;
 @Column
 String departure;
 @Column
 String destination;
 @Column
 Date travelDate;

 public Long getBookingId() {
  return booking_id;
 }

 public void setBookingId(Long booking_Id) {
  this.booking_id = booking_id;
 }

 public String getPsngrName() {
  return psngrName;
 }

 public void setPsngrName(String psngrName) {
  this.psngrName = psngrName;
 }

 public String getDeparture() {
  return departure;
 }

 public void setDeparture(String departure) {
  this.departure = departure;
 }

 public String getDestination() {
  return destination;
 }

 public void setDestination(String destination) {
  this.destination = destination;
 }

 public Date getTravelDate() {
  return travelDate;
 }

 public void setTravelDate(Date travelDate) {
  this.travelDate = travelDate;
 }
 
 
}