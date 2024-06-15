package com.pes.MyLab20;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
class Employee{
	@Id
private int id;
private String Name;
private String city;
private long phno;

public Employee()
{
super();
	
}
public Employee(int id, String Name, String city, long phno) {
	super();
	id=234;
	Name="Harshi";
	city="mandya";
	phno=1234;
}

@Id
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}

public void save(Employee e)
{
}
}

