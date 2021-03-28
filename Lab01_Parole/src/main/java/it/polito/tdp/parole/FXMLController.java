package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.awt.Label;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;
	Parole p = new Parole();
	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;
    
    @FXML
    private TextArea TextTime;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;
    
    @FXML
    void Cancella(ActionEvent event) {

    	String str = txtResult.getSelectedText();
    	p.remove(str);
    	
    	String a = "";
    	
    	for(int i = 0 ; i < p.getElenco().size() ; i++) {
    		a += p.getElenco().get(i)+"\n";
    	}
    	
    	txtResult.setText(a.trim());
    	TextTime.setText(" "+System.nanoTime()+ " [nano sec]");

    }

	@FXML
    void doInsert(ActionEvent event) {
    	
    	String s = txtParola.getText();
    	if(s.length()<=0) {
    		txtResult.setText("Please Enter a Word");
    		return;
    	}
    	else {
    	p.addParola(s);
    	
    	String a = "";
    	
    	for(int i = 0 ; i < p.getElenco().size() ; i++) {
    		a += p.getElenco().get(i)+"\n";
    	}
    	
    	txtResult.setText(a.trim());
    	txtParola.setText("");
    	TextTime.setText(" "+System.nanoTime()+ " [nano sec]");
    	}
    }

    @FXML
    void doReset(ActionEvent event) {
    	p.reset();
    	txtParola.setText("");
    	txtResult.setText("");
    	TextTime.setText(" "+System.nanoTime()+ " [nano sec]");
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";
        assert TextTime != null : "fx:id=\"TextTime\" was not injected: check your FXML file 'Scene.fxml'.";
        elenco = new Parole() ;
    }
}
