package by.bsuir.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MainTest {

	private Company company = null;
	private Boss boss = null;
	private Cleaner cleaner = null;
	private Programmer programmer = null;
	private boolean expected = true;
	
	@Before
	public void init() {
		company = new Company();
		boss = new Boss();
		cleaner = new Cleaner();
		programmer = new Programmer();
	}
	
	@Test
	public void cleanerChecker() {
		boolean real = false;
		if(cleaner.clean().equals("This territory has been cleaned"))
			real = true;
		assertEquals("Successful", real, expected);
	}
	
	@Test
	public void programmerChecker() {
		boolean real = false;
		if(programmer.writeCode("task").equals("Your task has been performed"))
			real = true;
		assertEquals("Successful", real, expected);
	}
	
	
	@Test
	public void hireEmployeeChecker() {
		boolean real = true;
		company.hireEmployee();
		if(company.getProgrammer() == null || company.getCleaner() == null)
			real = false;
		assertEquals("Successful", real, expected);
	}

}
