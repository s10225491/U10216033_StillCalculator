import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;

public class StillCalculator extends Application{

	@Override
	public void start(Stage primaryStage){
		
		//Layout
		GridPane pane = new GridPane(); //Grid
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(8,8,8,8));

		//add buttoms to pane
		pane.add(new Button(" MC"),0,0);
		pane.add(new Button(" MR"),1,0);
		pane.add(new Button(" MS"),2,0);
		pane.add(new Button(" M+"),3,0);
		pane.add(new Button(" M-"),4,0);
		pane.add(new Button(" <-"),0,1);
		pane.add(new Button(" CE"),1,1);
		pane.add(new Button(" C "),2,1);
		pane.add(new Button(" +-"),3,1);
		pane.add(new Button("sqrt"),4,1);
		pane.add(new Button(" 7 "),0,2);
		pane.add(new Button(" 8 "),1,2);
		pane.add(new Button(" 9 "),2,2);
		pane.add(new Button(" / "),3,2);
		pane.add(new Button(" % "),4,2);
		pane.add(new Button(" 4 "),0,3);
		pane.add(new Button(" 5 "),1,3);
		pane.add(new Button(" 6 "),2,3);
		pane.add(new Button(" * "),3,3);
		pane.add(new Button("1/x"),4,3);
		pane.add(new Button(" 1 "),0,4);
		pane.add(new Button(" 2 "),1,4);
		pane.add(new Button(" 3 "),2,4);
		pane.add(new Button(" - "),3,4);
		pane.add(new Button(" = "),4,4);
		pane.add(new Button(" 0 "),0,5);
		pane.add(new Button(" . "),1,5);
		pane.add(new Button(" + "),2,5);
		
		//Layout
		BorderPane pane1 = new BorderPane(); //Border
		pane1.setTop(new TextField());
		pane1.setBottom(pane);
		
		Scene scene = new Scene(pane1);
		primaryStage.setTitle("Calculator"); //set Title
		primaryStage.setScene(scene);
		primaryStage.show();

	}
}