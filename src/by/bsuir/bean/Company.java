package by.bsuir.bean;

public class Company {
	private String name;
	private String task;
	private String programmerResponse;
	private Programmer programmer;
	private Cleaner cleaner;
	
	public Company() {
		super();
	}

	public Company(String name, String task, String programmerResponse, Programmer programmer, Cleaner cleaner) {
		super();
		this.name = name;
		this.task = task;
		this.programmerResponse = programmerResponse;
		this.programmer = programmer;
		this.cleaner = cleaner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getProgrammerResponse() {
		return programmerResponse;
	}

	public void setProgrammerResponse(String programmerResponse) {
		this.programmerResponse = programmerResponse;
	}

	public Programmer getProgrammer() {
		return programmer;
	}

	public void setProgrammer(Programmer programmer) {
		this.programmer = programmer;
	}

	public Cleaner getCleaner() {
		return cleaner;
	}

	public void setCleaner(Cleaner cleaner) {
		this.cleaner = cleaner;
	}

	/**
	 * Creating new workers: programmer and cleaner
	 * getting response from programmer
	 */
	public void hireEmployee() {
		programmer = new Programmer();
		programmerResponse = programmer.writeCode(task);
		cleaner = new Cleaner();
		cleaner.clean();
		
	}
}
