package com.example.demo11;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
        @FXML
        private TableView table;
        @FXML
        private Button ButtonAdd;
        @FXML
        private Button ButtonDelete;
        @FXML
        private Button ButtonSave;
        @FXML
        private TableColumn<Customer, Integer> id;
        @FXML
        private TableColumn<Customer, String> name;
        @FXML
        private TableColumn<Customer, Integer> identycard ;
        @FXML
        private TableColumn<Customer, Integer> point;
        @FXML
        private TableColumn<Customer, String> phonenumber;
        @FXML
        private TableColumn<Customer, String> adress;

        public ObservableList<Customer> customers = FXCollections.observableArrayList(
                new Customer("Duy",23,100,1234534123,"Ha Noi","092312341234"),
                 new Customer("Minh",63,10,1999999999,"Ha Noi","082341334"),
                 new Customer("Chien",29,160,45243423,"Ha Noi","0239123112"),
                 new Customer("Khanh",73,190,333213333,"Ha Noi","084124124"),
                 new Customer("Tu",53,120,234534123,"Ha Noi","0145138991")
        );

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        point.setCellValueFactory(new PropertyValueFactory<>("point"));
        identycard.setCellValueFactory(new PropertyValueFactory<>("identyCard"));
        adress.setCellValueFactory(new PropertyValueFactory<>("adress"));
        phonenumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        table.setItems(customers);


    }

        public void AddCustomer(ActionEvent e) throws IOException {
        //Stage
    }



        public void delete(ActionEvent e) {
        Food selected = (Food) table.getSelectionModel().getSelectedItem();

        foods.remove(selected);


    }
}