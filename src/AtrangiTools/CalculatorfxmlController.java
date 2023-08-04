/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtrangiTools;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Aayush Kasera
 */
public class CalculatorfxmlController implements Initializable {
    private float num1=0;
    private float num2=0;
    private int oper=0;
    private float result=0;
    private String operr="";
    @FXML
    private TextField display;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button divide;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button mult;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button minus;
    @FXML
    private Button point;
    @FXML
    private Button zero;
    @FXML
    private Button equal;
    @FXML
    private Button plus;
    @FXML
    private Button clear;
    @FXML
    private Text prev;

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
    private void operation(Event event) {
        
        if(event.getSource()==one){
            display.setText(display.getText() + "1");
        }
        else if(event.getSource()==two){
            display.setText(display.getText() + "2");
        }
        else if(event.getSource()==three){
            display.setText(display.getText() + "3");
        }
        else if(event.getSource()==four){
            display.setText(display.getText() + "4");
        }
        else if(event.getSource()==five){
            display.setText(display.getText() + "5");
        }
        else if(event.getSource()==six){
            display.setText(display.getText() + "6");
        }
        else if(event.getSource()==seven){
            display.setText(display.getText() + "7");
        }
        else if(event.getSource()==eight){
            display.setText(display.getText() + "8");
        }
        else if(event.getSource()==nine){
            display.setText(display.getText() + "9");
        }
        else if(event.getSource()==zero){
            display.setText(display.getText() + "0");
        }
        else if(event.getSource()==point){
            display.setText(display.getText() + ".");
        }
        else if(event.getSource()==clear){
            display.setText("");
            prev.setText("");
            oper=0;
            operr="";
            num1=0;
            num2=0;
            result=0;
        }
        else if(event.getSource()==plus){
            if(oper==0){
                
                num1=Float.parseFloat(display.getText());
                prev.setText(display.getText()+ "+");
                display.setText("");
                oper=1;
                operr="+";
            }
            else if(oper==1){
                prev.setText(num1+"+");
                operr="+";
            }
            
            
        }
        else if(event.getSource()==minus){
            if(oper==0){
                num1=Float.parseFloat(display.getText());
                
                prev.setText(display.getText()+ "-");
                display.setText("");
                oper=1;
                operr="-";
            }
            else if(oper==1){
                prev.setText(num1+"-");
                operr="-";
            }
        }
        else if(event.getSource()== mult){
            if(oper==0){
                num1=Float.parseFloat(display.getText());
                
                prev.setText(display.getText()+ "*");
                display.setText("");
                oper=1;
                operr="*";
            }
            else if(oper==1){
                prev.setText(num1+"*");
                operr="*";
            }
        }
        else if(event.getSource()==divide){
            if(oper==0){
                num1=Float.parseFloat(display.getText());
                
                prev.setText(display.getText()+ "/");
                display.setText("");
                oper=1;
                operr="/";
            }
            else if(oper==1){
                prev.setText(num1+"/");
                operr="/";
            }
        }
        else if(event.getSource()==equal){
           
            if(oper==1){
                
               
                num2=Float.parseFloat(display.getText());
                if(operr=="+"){
                result=num1+num2;
                }
                else if(operr=="-"){
                result=num1-num2;
                }
                else if(operr=="*"){
                result=num1*num2;
                }
                else if(operr=="/"){
                result=num1/num2;
                }
                num1=0;
                num2=0;
                display.setText(Float.toString(result));
                result=0;
                oper=0;
                operr="";
                prev.setText("");
                
            }
            }
            
                
            
            
        }
        
    }
    

