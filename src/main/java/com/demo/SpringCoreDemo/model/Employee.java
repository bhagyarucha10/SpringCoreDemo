package com.demo.SpringCoreDemo.model;

public class Employee {
int eid;
String name;
public Employee(){}


public Employee(int eid, String name) {
	super();
	this.eid = eid;
	this.name = name;
}

/*
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
*/
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + "]";
}

}
