package application;

import by.bsuir.bean.Boss;
import by.bsuir.bean.Cleaner;
import by.bsuir.bean.Company;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Company companyObj;
	private static Cleaner cleanerObj;
	
	private static AnchorPane anchorPane1;
	private static AnchorPane anchorPane2;
	private static AnchorPane anchorPane3;
	private static AnchorPane anchorPane4;
	
	private static BorderPane b1;
	private static BorderPane b2;
	private static BorderPane b3;
	private static BorderPane b4;
	
	private static Label company;
	private static Label boss;
	private static Label programmer;
	private static Label cleaner;
	
	private static Button ruleC;
	private static Label bossRules;
	private static TextField textChangeT;
	private static Button changeTask;
	
	private static Label hireWorker;
	private static Button hireProgrammer;
	private static Button hireCleaner;
	
	private static Label writeCode;
	private static TextField codeField;
	private static Button send;	
	
	@Override
	public void start(Stage stage) {
		companyObj = new Company();
		cleanerObj = new Cleaner();
		
		stage.setTitle("Company");
		SplitPane sp = new SplitPane();
		Scene scene = new Scene(sp, 900, 400);
		stage.setScene(scene);
		
		b1 = new BorderPane();
		b2 = new BorderPane();
		b3 = new BorderPane();
		b4 = new BorderPane();
		
		anchorPane1 = new AnchorPane();
		anchorPane2 = new AnchorPane();
		anchorPane3 = new AnchorPane();
		anchorPane4 = new AnchorPane();

		company = new Label("Company");
		boss = new Label("Boss");
	    programmer = new Label("Programmer");
		cleaner = new Label("Cleaner");
		
		bossRules = new Label();
		
		ruleC = new Button("Rule Company");
		changeTask = new Button("Change Task");
		textChangeT = new TextField();
		
		anchorPane2.getChildren().add(ruleC);
		
	    ruleC.setLayoutX(60);
	    ruleC.setLayoutY(50);

		b1.setTop(company);
		b2.setTop(boss);
		b3.setTop(programmer);
		b4.setTop(cleaner);
		
		b1.setCenter(anchorPane1);
		b2.setCenter(anchorPane2);
		b3.setCenter(anchorPane3);
		b4.setCenter(anchorPane4);

		sp.getItems().addAll(b1, b2, b3, b4);
		sp.setDividerPositions(0.25f, 0.5f, 0.75f, 1f);
		
		ruleC.setOnAction(value -> BossActions());
		changeTask.setOnAction(value -> {
			companyObj.setTask(textChangeT.getText());
			CompanyActions();
			
		});
		stage.show();		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * Actions which performed in Boss block
	 * TextField in which you can enter new task and button 
	 */
	public static void BossActions() {
		Boss boss = new Boss();
		Label label = new Label(boss.ruleCompany());
		anchorPane2.getChildren().addAll(label, textChangeT, changeTask);
		
		label.setLayoutX(50);
	    label.setLayoutY(100);
		
		changeTask.setLayoutX(50);
	    changeTask.setLayoutY(200);
	    
	    textChangeT.setLayoutX(50);
	    textChangeT.setLayoutY(150);
			
	}
	
	/**
	 * Actions which performed in Company block
	 * Labels and buttons to hire workers
	 */
	public static void CompanyActions() {
		hireWorker = new Label("Hire a worker: ");
		hireProgrammer = new Button("Programmer");
		hireCleaner = new Button("Cleaner");
		
		anchorPane1.getChildren().addAll(hireWorker, hireProgrammer, hireCleaner);
		
		hireWorker.setLayoutX(50);
		hireWorker.setLayoutY(100);
		
		hireProgrammer.setLayoutX(50);
		hireProgrammer.setLayoutY(130);
	    
		hireCleaner.setLayoutX(50);
		hireCleaner.setLayoutY(160);
		
		hireProgrammer.setOnAction(value -> ProgrammerActions());
		hireCleaner.setOnAction(value -> CleanerActions());
	}
	
	/**
	 * Actions which performed in Programmer block
	 * TextField for code and button
	 */
	public static void ProgrammerActions() {
		writeCode = new Label("You need to write code!");
		codeField = new TextField();
		send = new Button("Send");
		
		anchorPane3.getChildren().addAll(writeCode, codeField, send);
		
		writeCode.setLayoutX(50);
	    writeCode.setLayoutY(100);
		
	    codeField.setLayoutX(50);
	    codeField.setLayoutY(150);
	    
		send.setLayoutX(50);
	    send.setLayoutY(200);
	    
	    companyObj.setProgrammerResponse(codeField.getText());
	    
	}
	
	/**
	 * Actions which performed in Cleaner block
	 * Button and label
	 */
	public static void CleanerActions() {
		Button clean = new Button("Clean");
		Label cleanLabel = new Label();
		
		anchorPane4.getChildren().addAll(clean, cleanLabel);
		
		clean.setLayoutX(50);
	    clean.setLayoutY(100);
		
	    cleanLabel.setLayoutX(50);
	    cleanLabel.setLayoutY(150);
	    clean.setOnAction(value -> cleanLabel.setText(cleanerObj.clean()));
	    
	}
	
}