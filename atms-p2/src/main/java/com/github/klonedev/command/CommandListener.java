package com.github.klonedev.command;

import java.util.List;
import java.util.Optional;

import javax.management.Notification;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class CommandListener {
    public Optional<List<ReversibleAction>> onMouseEvent(MouseEvent evt, Notification notify, Node... components) {
        return Optional.empty();
    }
}
