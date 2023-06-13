package com.keyin.TextEditor;

// Node constructor for TextEditorManager class

public class TextEditorNode {
    public String line;
    public TextEditorNode prev;
    public TextEditorNode next;

    public TextEditorNode(String line) {
        this.line = line;
    }
}
