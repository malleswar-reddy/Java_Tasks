package org.jdbc.model;

public class Employee {

	private Integer emp_id;
	private String first_name;
	private String Last_name;
	private String email;
	private String phone_number;
	private String hire_date;
	private String job_id;
	private Integer salary;
	private Integer manager_id;
	private Integer department_id;

	public Integer getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(Integer emp_id) {
		this.emp_id = emp_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Integer getManager_id() {
		return manager_id;
	}

	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	@Override
	public String toString() {
		return String.format(
				"Employee [emp_id=%s, first_name=%s, Last_name=%s, email=%s, phone_number=%s, hire_date=%s, job_id=%s, salary=%s, manager_id=%s, department_id=%s]",
				emp_id, first_name, Last_name, email, phone_number, hire_date, job_id, salary, manager_id,
				department_id);
	}

}
