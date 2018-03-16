package by.bsuir.bean;

public class Boss extends Employee{
	
	private Company company = new Company();
	
	public String ruleCompany() {
		return "It's time to rule my company!";
	}
	
	public void changeTask(String task) {
		company.setTask(task);
	}

}
