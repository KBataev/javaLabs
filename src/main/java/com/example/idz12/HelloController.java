package com.example.idz12;

        import java.net.URL;
        import java.sql.SQLException;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.DatePicker;
        import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField DatePas;

    @FXML
    private TextField HB;

    @FXML
    private TextField city;

    @FXML
    private TextField date_birth;

    @FXML
    private TextField idPas;

    @FXML
    private TextField name_text;

    @FXML
    private Button next_button;

    @FXML
    private TextField patronymic_text;

    @FXML
    private TextField phone_number_text;

    @FXML
    private TextField placePas;

    @FXML
    private TextField position;

    @FXML
    private TextField salary;

    @FXML
    private TextField surname_text;

    @FXML
    private Button search;

    @FXML
    private TextField search_text;

    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();
        next_button.setOnAction(actionEvent -> {//запись данных в бд
            try {
                dbHandler.signUpUser(name_text.getText(),
                        surname_text.getText(),
                        patronymic_text.getText(),
                        phone_number_text.getText(),
                        date_birth.getText(),
                        city.getText(),
                        HB.getText(),
                        idPas.getText(),
                        placePas.getText(),
                        DatePas.getText(),
                        position.getText(),
                        salary.getText()
                        );
                name_text.setText("");
                surname_text.setText("");
                patronymic_text.setText("");
                phone_number_text.setText("");
                date_birth.setText("");
                city.setText("");
                HB.setText("");
                idPas.setText("");
                placePas.setText("");
                DatePas.setText("");
                position.setText("");
                salary.setText("");
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });

        search.setOnAction(actionEvent -> {//вывод
            try {
                DatabaseHandler dbHandler1 = new DatabaseHandler();
                dbHandler1.getWorkers(search_text.getText());
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        });

    }

}

