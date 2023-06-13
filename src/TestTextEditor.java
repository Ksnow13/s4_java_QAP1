import com.keyin.TextEditor.TextEditorManager;

// Kyle
// Software Development Semester 4
// Algorithms And Datastructures QAP 1
// Started June 9th, 2023
// Finished June 11th, 2023

// Question 2 main tests for TextEditorManager

public class TestTextEditor {
    public static void main(String[] args) {

        // Here is where I test the TextEditorManager class

        TextEditorManager textEditorManager = new TextEditorManager();

        textEditorManager.insertNewLine("Hey there, how are you doing today.");
        textEditorManager.insertNewLine("My name is Kyle,");
        textEditorManager.insertNewLine("I am currently in Keyin collage");
        textEditorManager.insertNewLine("learning software development.");

        System.out.println();
        System.out.println("---- showing all lines & current line. ( | ) is the cursor ----");
        System.out.println();

        textEditorManager.showAllLinesWithCursor();

        System.out.println();
        System.out.println("---- after moving cursor up twice ----");
        System.out.println();

        textEditorManager.moveUpLine();
        textEditorManager.moveUpLine();

        textEditorManager.showAllLinesWithCursor();


        System.out.println();
        System.out.println("---- after editing current line ----");
        System.out.println();

        textEditorManager.editCurrentLine("My name is Kyle, and I'm 25 from Canada.");
        textEditorManager.showAllLinesWithCursor();

        System.out.println();
        System.out.println("---- after moving cursor to the left ----");
        System.out.println();

        textEditorManager.moveCursorLeft();
        textEditorManager.moveCursorLeft();
        textEditorManager.moveCursorLeft();
        textEditorManager.moveCursorLeft();
        textEditorManager.moveCursorLeft();
        textEditorManager.moveCursorLeft();
        textEditorManager.moveCursorLeft();

        textEditorManager.showAllLinesWithCursor();

        System.out.println();
        System.out.println("---- after moving back down ----");
        System.out.println();

        textEditorManager.moveDownLine();
        textEditorManager.moveDownLine();

        textEditorManager.showAllLinesWithCursor();

        System.out.println();
        System.out.println("---- after adding new line ----");
        System.out.println();

        textEditorManager.insertNewLine("Dans l'arrière-pays de Provence, à 30 kilomètres au sud-ouest de");
        textEditorManager.showAllLinesWithCursor();

        System.out.println();
        System.out.println("---- after deleting new line ----");
        System.out.println();

        textEditorManager.deleteCurrentLine();
        textEditorManager.showAllLinesWithCursor();
    }
}
