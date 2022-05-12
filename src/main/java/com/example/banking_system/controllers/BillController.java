package com.example.banking_system.controllers;

import com.example.banking_system.services.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class BillController {
    Parent root;
    Stage stage;
    Scene scene;

    private Client client;


    public void cancel_to_ClientDash(ActionEvent event) throws IOException {
        //some_logic
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/banking_system/views/client-dash.fxml"));
        ClientDashController contr = new ClientDashController();
        contr.setClient(client);
        loader.setController(contr);
        root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 1280, 800);
        stage.setScene(scene);
        stage.show();    }

    public void pay_to_ClientDash(ActionEvent event) throws IOException {

        switch_scene("client-dash.fxml", event);
    }



    private void switch_scene(String resource, ActionEvent event) throws IOException {
        String path = "/com/example/banking_system/views/" + resource;
        root  = FXMLLoader.load(getClass().getResource(path));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 1280, 800);
        stage.setScene(scene);
        stage.show();
    }

    public void setClient(Client client) {
        this.client = client;
    }
}