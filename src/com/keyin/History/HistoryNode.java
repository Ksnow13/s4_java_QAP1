package com.keyin.History;

// Node constructor for HistoryManager class

public class HistoryNode {
    public String URL;
    public HistoryNode prev;
    public HistoryNode next;

    public HistoryNode(String URL) {

        this.URL = URL;
    }
}
