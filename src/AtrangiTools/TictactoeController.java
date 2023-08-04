/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtrangiTools;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author Aayush Kasera
 */
public class TictactoeController implements Initializable {

    @FXML
    private Label turn;
    @FXML
    private Label win;
    @FXML
    private Button zero;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    private int turnn = 1;
    private boolean[] t = {true, true, true, true, true, true, true, true, true};

    @FXML
    private AnchorPane anchor;
    @FXML
    private GridPane grid;
    @FXML
    private Button Refresh;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void tic(ActionEvent event) throws InterruptedException {
        if (event.getSource() == zero && t[0] == true) {
            if (turnn == 1) {
                zero.setText("o");
                zero.setStyle("-fx-color: red; ");
                turn.setText("Player B");

                turnn = 2;
                t[0] = false;
            } else {
                turn.setText("Player A");
                zero.setText("x");
                zero.setStyle("-fx-color: green; ");
                turnn = 1;
                t[0] = false;
            }
        } else if (event.getSource() == one && t[1] == true) {
            if (turnn == 1) {
                one.setText("o");
                turn.setText("Player B");
                one.setStyle("-fx-color: red; ");
                turnn = 2;
                t[1] = false;
            } else {
                turn.setText("Player A");
                one.setText("x");
                one.setStyle("-fx-color: green; ");
                turnn = 1;
                t[1] = false;
            }
        } else if (event.getSource() == two && t[2] == true) {
            if (turnn == 1) {
                two.setText("o");
                turn.setText("Player B");
                two.setStyle("-fx-color: red; ");
                turnn = 2;
                t[2] = false;
            } else {
                turn.setText("Player A");
                two.setText("x");
                two.setStyle("-fx-color: green; ");
                turnn = 1;
                t[2] = false;
            }
        } else if (event.getSource() == three && t[3] == true) {
            if (turnn == 1) {
                three.setText("o");
                three.setStyle("-fx-color: red; ");
                turn.setText("Player B");
                turnn = 2;
                t[3] = false;
            } else {
                turn.setText("Player A");
                three.setText("x");
                three.setStyle("-fx-color: green; ");
                turnn = 1;
                t[3] = false;
            }
        } else if (event.getSource() == four && t[4] == true) {
            if (turnn == 1) {
                four.setText("o");
                turn.setText("Player B");
                four.setStyle("-fx-color: red; ");
                turnn = 2;
                t[4] = false;
            } else {
                turn.setText("Player A");
                four.setText("x");
                four.setStyle("-fx-color: green; ");
                turnn = 1;
                t[4] = false;
            }
        } else if (event.getSource() == five && t[5] == true) {
            if (turnn == 1) {
                five.setText("o");
                turn.setText("Player B");
                five.setStyle("-fx-color: red; ");
                turnn = 2;
                t[5] = false;
            } else {
                turn.setText("Player A");
                five.setText("x");
                five.setStyle("-fx-color: green; ");
                turnn = 1;
                t[5] = false;
            }
        } else if (event.getSource() == six && t[6] == true) {
            if (turnn == 1) {
                six.setText("o");
                turn.setText("Player B");
                six.setStyle("-fx-color: red; ");
                turnn = 2;
                t[6] = false;
            } else {
                turn.setText("Player A");
                six.setStyle("-fx-color: green; ");
                six.setText("x");
                turnn = 1;
                t[6] = false;
            }
        } else if (event.getSource() == seven && t[7] == true) {
            if (turnn == 1) {
                seven.setText("o");
                turn.setText("Player B");
                seven.setStyle("-fx-color: red; ");
                turnn = 2;
                t[7] = false;
            } else {
                turn.setText("Player A");
                seven.setStyle("-fx-color: green; ");
                seven.setText("x");
                turnn = 1;
                t[7] = false;
            }
        } else if (event.getSource() == eight && t[8] == true) {
            if (turnn == 1) {
                eight.setText("o");
                turn.setText("Player B");
                eight.setStyle("-fx-color: red; ");
                turnn = 2;
                t[8] = false;
            } else {
                turn.setText("Player A");
                eight.setText("x");
                eight.setStyle("-fx-color: green; ");
                turnn = 1;
                t[8] = false;
            }
        } else if (event.getSource() == Refresh) {
            turnn = 1;
            for (int i = 0; i < 9; i++) {
                t[i] = true;
            }
            zero.setText("");
            one.setText("");
            two.setText("");
            three.setText("");
            four.setText("");
            five.setText("");
            six.setText("");
            seven.setText("");
            eight.setText("");
            win.setText("");
            turn.setText("Player A");
            zero.setStyle("-fx-color:white");
            one.setStyle("-fx-color:white");
            two.setStyle("-fx-color:white");
            three.setStyle("-fx-color:white");
            four.setStyle("-fx-color:white");
            five.setStyle("-fx-color:white");
            six.setStyle("-fx-color:white");
            seven.setStyle("-fx-color:white");
            eight.setStyle("-fx-color:white");
            
            
            grid.setDisable(false);

        }

        if ((zero.getText().equals("o") && one.getText().equals("o") && two.getText().equals("o")) || (zero.getText().equals("o") && three.getText().equals("o") && six.getText().equals("o"))
                || (zero.getText().equals("o") && four.getText().equals("o") && eight.getText().equals("o")) || (one.getText().equals("o") && four.getText().equals("o") && seven.getText().equals("o"))
                || (two.getText().equals("o") && four.getText().equals("o") && six.getText().equals("o")) || (two.getText().equals("o") && five.getText().equals("o") && eight.getText().equals("o"))
                || (six.getText().equals("o") && seven.getText().equals("o") && eight.getText().equals("o")) || (three.getText().equals("o") && four.getText().equals("o") && five.getText().equals("o"))) {
            win.setText("Winner: Player A");
            grid.setDisable(true);

        } else if ((zero.getText().equals("x") && one.getText().equals("x") && two.getText().equals("x")) || (zero.getText().equals("x") && three.getText().equals("x") && six.getText().equals("x"))
                || (zero.getText().equals("x") && four.getText().equals("x") && eight.getText().equals("x")) || (one.getText().equals("x") && four.getText().equals("x") && seven.getText().equals("x"))
                || (two.getText().equals("x") && four.getText().equals("x") && six.getText().equals("x")) || (two.getText().equals("x") && five.getText().equals("x") && eight.getText().equals("x"))
                || (six.getText().equals("x") && seven.getText().equals("x") && eight.getText().equals("x")) || (three.getText().equals("x") && four.getText().equals("x") && five.getText().equals("x"))) {
            win.setText("Winner: Player B");

            grid.setDisable(true);

        } else if ((zero.getText().equals("o") || zero.getText().equals("x")) && (one.getText().equals("o") || one.getText().equals("x")) && (two.getText().equals("o") || two.getText().equals("x"))
                && (three.getText().equals("o") || three.getText().equals("x")) && (four.getText().equals("o") || four.getText().equals("x")) && (five.getText().equals("o") || five.getText().equals("x"))
                && (six.getText().equals("o") || six.getText().equals("x")) && (seven.getText().equals("o") || seven.getText().equals("x")) && (eight.getText().equals("o") || eight.getText().equals("x"))) {
            win.setText("Match Draw");
            
            grid.setDisable(true);
        }
    }

}
