/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtrangiTools;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Aayush Kasera
 */
public class StartpageController implements Initializable {

    @FXML
    private Button calculator;
    @FXML
    private Button tictactoe;
    @FXML
    private BorderPane main;
    @FXML
    private Label arrow1;
    @FXML
    private Label arrow2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void operation(ActionEvent event) throws IOException {
        if(event.getSource()==calculator){
            try{
                Pane root =FXMLLoader.load(getClass().getResource("CalculatorFXML.fxml"));
            
                main.setCenter(root);
                arrow1.setVisible(true);
                arrow2.setVisible(false);
                
            }
            catch(IOException e){
                System.out.println("Error in opening File");
            }
        }
        else if(event.getSource()==tictactoe){
            try{
                Pane root =FXMLLoader.load(getClass().getResource("tictactoe.fxml"));
            
                main.setCenter(root);
                arrow1.setVisible(false);
                arrow2.setVisible(true);
            }
            catch(IOException e){
                System.out.println("Error in opening File");
            }
        }
    }
    
}
