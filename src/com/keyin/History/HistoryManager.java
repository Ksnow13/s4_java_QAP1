package com.keyin.History;

// Kyle
// Software Development Semester 4
// Algorithms And Datastructures QAP 1
// Started June 9th, 2023
// Finished June 11th, 2023

// Question 1 Manager Class

import com.keyin.TextEditor.TextEditorNode;

public class HistoryManager {

    public HistoryNode currentState;

    // method to add a url to your current tab / history
    public void visitUrl(String newState) {
        HistoryNode newHistoryNode = new HistoryNode(newState);

        newHistoryNode.prev = currentState;
        newHistoryNode.next = null;

        if (currentState != null) {
            currentState.next = newHistoryNode;
        }

        currentState = newHistoryNode;
    }

    // method to browse back in your history
    public String undoHistory() {
        if (currentState == null) {
            System.out.println("No state to undo");
            return null;
        }

        HistoryNode previousState = currentState.prev;

        if (previousState == null) {
            System.out.println("You have reached the initial state. Can not undo any further");
        } else {
            currentState = previousState;
        }
        return currentState.URL;
    }

    // method to go browse forward in your history
    public String redoHistory() {
        if (currentState == null || currentState.next == null) {
            System.out.println("No states to redo.");
            return null;
        }

        HistoryNode nextState = currentState.next;

        currentState = nextState;

        return currentState.URL;

    }

    // method to display all browsed history
    public void showAllHistoryNew() {
        HistoryNode firstNode;

        if (currentState == null) {
            System.out.println("There is no history to show.");
        } else {
            if (currentState.prev == null) {
                firstNode = currentState;
            } else {
                firstNode = currentState.prev;
            }

            while (firstNode.prev != null) {
                firstNode = firstNode.prev;
            }

            while (firstNode != null) {

                System.out.println(firstNode.URL);
                firstNode = firstNode.next;
            }

        }
    }

    // method to delete all browsed history
    public void deleteAllHistory() {
        if (currentState == null) {
            System.out.println("Your history is empty");
        } else {
            HistoryNode tempHistoryNode = currentState;

            while (tempHistoryNode != null) {
                tempHistoryNode.URL = null;
                tempHistoryNode.next = null;
                tempHistoryNode = tempHistoryNode.prev;
            }

            System.out.println("ALl history has successfully been deleted.");
        }
    }

}
