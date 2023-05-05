package com.example.project1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Loginx")
public class LoginModel {
@Id
private int id;
private String name;
private String pwd;
private String cname;
private int cage;
private String cgender;
private String cemail;
private String cphone;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getCage() {
	return cage;
}
public void setCage(int cage) {
	this.cage = cage;
}
public String getCgender() {
	return cgender;
}
public void setCgender(String cgender) {
	this.cgender = cgender;
}
public String getCemail() {
	return cemail;
}
public void setCemail(String cemail) {
	this.cemail = cemail;
}
public String getCphone() {
	return cphone;
}
public void setCphone(String cphone) {
	this.cphone = cphone;
}

}
