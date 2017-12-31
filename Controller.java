package application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
	public Button btn0;
	public Button btn2;
	public Button btn3;
	public Button btn4;
	public Button btn5;
	public Button btn6;
	public Button btn7;
	public Button btn8;
	public Button btn9;
	public Button btndoublezero;
	public Button btnclear;
	public Button btndot;
	public Button btnequal;
	public Button btnPlus;
	public Button btnone;
	public Label numbers;
	public Label result;
	public String operation;
	private double fnumber;
	// Collect numbers from button
	public void click_btn0(){
		String value=result.getText();
		String set="0";
		result.setText(value+set);
	}
	
	public void click_btnone() {
		String value=result.getText();
		String set="1";
		result.setText(value+set);
	}
	public void click_btn2() {
		String value=result.getText();
		String set="2";
		result.setText(value+set); 
	}
	public void click_btn3() {
		String value=result.getText();
		String set="3";
		result.setText(value+set); 
	}
	public void click_btn4() {
		String value=result.getText();
		String set="4";
		result.setText(value+set); 
	}
	
	public void click_btn5() {
		String value=result.getText();
		String set="5";
		result.setText(value+set); 
	}
	public void click_btn6() {
		String value=result.getText();
		String set="6";
		result.setText(value+set);
	}
	public void click_btn7() {
		String value=result.getText();
		String set="7";
		result.setText(value+set);
	}
	public void click_btn8() {
		String value=result.getText();
		String set="8";
		result.setText(value+set);
	}
	public void click_btn9() {
		String value=result.getText();
		String set="9";
		result.setText(value+set);
	}
	public void click_btndot() {
		String value=result.getText();
		String set=".";
		if(validation.isValidDecimal(value))
			result.setText(value+set);
	}
	public void click_doublezero() {
		String value=result.getText();
		String set="00";
		result.setText(value+set);
	}
	public void click_abs() {
		String set=String.valueOf(validation.addingValue(result.getText()));
		result.setText(set);
		numbers.setText(set);
	}
	public void click_powertotwo() {
		String set=String.valueOf(validation.powertotwo(result.getText()));
		result.setText(set);
	}
	public void click_sqrt() {
		String set=String.valueOf(validation.sqrt_number(result.getText()));
		numbers.setText(set);
		result.setText(set);
	}
	
	//operators
	public void click_plus() {
		this.fnumber=Double.parseDouble(result.getText());
		result.setText("");
		numbers.setText(fnumber+"+");
		operation="+";
	}
	public void click_minus() {
		this.fnumber=Double.parseDouble(result.getText());
		result.setText("");
		numbers.setText(fnumber+"-");
		operation="-";
	}
	public void click_multiply() {
		this.fnumber=Double.parseDouble(result.getText());
		result.setText("");
		numbers.setText(fnumber+"*");
		operation="*";
	}
	public void click_devide() {
		this.fnumber=Double.parseDouble(result.getText());
		result.setText("");
		numbers.setText(fnumber+"/");
		operation="/";
	}
	public void click_clear() {
		String set="";
		numbers.setText(set);
		result.setText(set);
	}
	//If clicking operators
	public void click_equal() {
		switch(operation) {
		case("+"):
			numbers.setText(String.valueOf((fnumber+ Double.parseDouble(result.getText()))));
			result.setText(numbers.getText());
			break;
		case("-"):
			numbers.setText(String.valueOf((fnumber- Double.parseDouble(result.getText()))));
			result.setText(numbers.getText());
			break;
		case("*"):
			numbers.setText(String.valueOf((fnumber* Double.parseDouble(result.getText()))));
			result.setText(numbers.getText());
			break;
		case("/"):
			numbers.setText(String.valueOf((fnumber / Double.parseDouble(result.getText()))));
			result.setText(numbers.getText());
			break;
		}
	}
}