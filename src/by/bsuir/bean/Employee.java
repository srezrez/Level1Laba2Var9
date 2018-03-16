package by.bsuir.bean;

public class Employee {
	
	private String name;
	private Double money;
	
	public Employee() {
	}
	
	public Employee(String name, Double money) {
		super();
		this.name = name;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getMoney() {
		return money;
	}
	
	public void setMoney(Double money) {
		this.money = money;
	}	

}
