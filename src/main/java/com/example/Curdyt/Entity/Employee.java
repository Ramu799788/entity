package com.example.Curdyt.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@Column
	private int id;

	@Column
	private String name;
	
	@Column
	private int salary;
	
	@Column
	private String email;
	
	@Column
	private String address;
	
	@Column
	private String phoneno;

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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}


}