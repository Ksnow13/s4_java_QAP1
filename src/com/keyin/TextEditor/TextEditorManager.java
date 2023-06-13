package com.keyin.TextEditor;

// Kyle
// Software Development Semester 4
// Algorithms And Datastructures QAP 1
// Started June 9th, 2023
// Finished June 11th, 2023

// Question 2 Manager Class

public class TextEditorManager {
    public TextEditorNode currentLine;
    public int cursorPosition;

    // method to insert new text line into editor
    public void insertNewLine(String newLine) {
        TextEditorNode newNode = new TextEditorNode(newLine);

        newNode.prev = currentLine;
        newNode.next = null;

        if (currentLine != null) {
            currentLine.next = newNode;
        }

        currentLine = newNode;
        cursorPosition = currentLine.line.length();
    }

    // method to move the cursor up one line
    public void moveUpLine(){
        if (currentLine == null) {
            System.out.println("There are no lines to move up.");
            return;
        }

        TextEditorNode previousLine = currentLine.prev;

        if (previousLine == null) {
            System.out.println("You have reached the top.");
        } else {
            currentLine = previousLine;
            cursorPosition = currentLine.line.length();
        }
    }

    // method to move the cursor down one line
    public void moveDownLine() {
        if (currentLine == null) {
            System.out.println("There are no lines to move down.");
            return;
        }

        TextEditorNode nextLine = currentLine.next;

        if (nextLine == null) {
            System.out.println("You have reached the bottom.");
        } else {
            currentLine = nextLine;
            cursorPosition = currentLine.line.length();
        }
    }

    // method to move the cursor left by one space
    public void moveCursorLeft(){
        if (cursorPosition > 0 && currentLine != null) {
            cursorPosition--;
        } else if (currentLine.prev != null) {
            moveUpLine();
            cursorPosition = currentLine.line.length();
        }
    }

    // method to move the cursor right by one space
    public void moveCursorRight() {
        if (currentLine != null && cursorPosition < currentLine.line.length()) {
            cursorPosition++;
        } else if (currentLine.next != null) {
            moveDownLine();
            cursorPosition = 0;
        }
    }

    // method to edit the current line that the user is on
    public void editCurrentLine(String newLine) {
        if (currentLine == null) {
            System.out.println("There is no current line to edit.");
        } else {
            currentLine.line = newLine;
            cursorPosition = currentLine.line.length();
        }
    }

    // method to delete the current line a user is on
    public void deleteCurrentLine() {
        if (currentLine == null) {
            System.out.println("There are no lines to delete.");
        }

        if (currentLine.prev != null) {
            currentLine.prev.next = currentLine.next;
        }

        if (currentLine.next != null) {
            currentLine.next.prev = currentLine.prev;
            currentLine = currentLine.next;

        } else {
            currentLine = currentLine.prev;
        }

        if (currentLine != null) {
            cursorPosition = currentLine.line.length();
        }
    }

    //method to show all lines a buffer/display the cursors current position to the user
    public void showAllLinesWithCursor() {
        TextEditorNode firstNode;

        if (currentLine == null) {
            System.out.println("There are no lines to show.");
        } else {

            if (currentLine.prev == null) {
                firstNode = currentLine;
            } else {
                firstNode = currentLine.prev;
            }

            while (firstNode.prev != null) {
                firstNode = firstNode.prev;
            }

            while (firstNode != null) {
                if (firstNode == currentLine) {
                    if (cursorPosition >= currentLine.line.length()) {
                        System.out.println("> " + firstNode.line + "|");
                        firstNode = firstNode.next;
                    } else {
                        System.out.println("> " + firstNode.line.substring(0, cursorPosition) + "|" + firstNode.line.substring(cursorPosition));
                        firstNode = firstNode.next;
                    }
                } else {
                    System.out.println(firstNode.line);
                    firstNode = firstNode.next;
                }
            }
        }
    }

}
