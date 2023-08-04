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
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Rotate;

/**
 * FXML Controller class
 *
 * @author Aayush Kasera
 */
public class ChessController implements Initializable {

    @FXML
    private ImageView haathiaa;
    @FXML
    private GridPane chessboard;
    @FXML
   
    
    private ImageView sipahia0;
    @FXML
    private ImageView sipahia1;
    @FXML
    
    private ImageView sipahia2;
    @FXML
    private Button sipahia3;
    @FXML
    private ImageView sipahia4;
    @FXML
    private ImageView sipahia5;
    @FXML
    private ImageView sipahia6;
    @FXML
    private ImageView sipahia7;
    @FXML
    private ImageView haathiab;
    @FXML
    private ImageView horeseaa;
    @FXML
    private ImageView horseab;
    @FXML
    private ImageView ootaa;
    @FXML
    private ImageView ootab;
    @FXML
    private ImageView wajira;
    @FXML
    private ImageView queena;
    @FXML
    private ImageView queenb;
    @FXML
    private ImageView wajirb;
    @FXML
    private ImageView sipahib0;
    @FXML
    private ImageView sipahib7;
    @FXML
    private ImageView sipahib6;
    @FXML
    private ImageView sipahib5;
    @FXML
    private ImageView sipahib4;
    @FXML
    private ImageView sipahib3;
    @FXML
    private ImageView sipahib2;
    @FXML
    private ImageView sipahib1;
    @FXML
    private ImageView haathiba;
    @FXML
    private ImageView haathibb;
    @FXML
    private ImageView horseba;
    @FXML
    private ImageView horsebb;
    @FXML
    private ImageView ootba;
    @FXML
    private ImageView ootbb;
    @FXML
    private Label CHECK;
    boolean turn=false;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void play(MouseEvent event) {
        Object abc = event.getSource();
        Object abcd=null;
        if(abc==sipahia0 || abc==sipahia1 || abc==sipahia2 || abc==sipahia3 || abc==sipahia4 ||abc==sipahia5 || abc==sipahia6 || abc==sipahia7){
        
        GridPane.setRowIndex((Node) abc,GridPane.getRowIndex((Node) abc)+1);
        GridPane.setColumnIndex((Node) abc,GridPane.getColumnIndex((Node) abc));
        
        
        
        
        }
        else if(abc==sipahib0 || abc==sipahib1 || abc==sipahib2 || abc==sipahib3 || abc==sipahib4 ||abc==sipahib5 || abc==sipahib6 || abc==sipahib7){
        
        
        GridPane.setRowIndex((Node) abc,GridPane.getRowIndex((Node) abc)-1);
        GridPane.setColumnIndex((Node) abc,GridPane.getColumnIndex((Node) abc));
        }
        }

    
    
    }

   


    
    

