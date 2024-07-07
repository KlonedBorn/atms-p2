package com.github.klonedev.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;

public class DesignController {

    @FXML
    private ToggleGroup commands;

    @FXML
    private Pane designCanvas;

    @FXML
    private ScrollPane designScroll;

    @FXML
    void initialize() {

    }

    @FXML
    void onActionConfirmAndClearDesign(ActionEvent event) {

    }

    @FXML
    void onActionRedoHistory(ActionEvent event) {

    }

    @FXML
    void onActionUndoHistory(ActionEvent event) {

    }
}