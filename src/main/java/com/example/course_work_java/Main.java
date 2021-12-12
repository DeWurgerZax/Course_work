package com.example.course_work_java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Thread emuThread;
    public static Controller controller;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("interface.fxml"));
        Scene scene = new Scene(loader.load(), 800,500);
        controller =  loader.getController();
        emuThread = new Thread(new TLauncher());

        stage.setTitle("Task Manager");
        stage.setScene(scene);
        stage.show();

    }


    @Override
    public void stop() throws Exception {
        super.stop();
        if(emuThread.isAlive())
            emuThread.interrupt();
    }

    public static void main(String[] args) {
        launch(args);
    }

}