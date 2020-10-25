package entites;

import java.time.LocalDate;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	private LocalDate data;

	public Employee() {
	}

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}

}
