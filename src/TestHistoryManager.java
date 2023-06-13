import com.keyin.History.HistoryManager;

// Kyle
// Software Development Semester 4
// Algorithms And Datastructures QAP 1
// Started June 9th, 2023
// Finished June 11th, 2023

// Question 2 main tests for HistoryManager

public class TestHistoryManager {
    public static void main(String[] args) {

        // Here is where I test the HistoryManager class

        HistoryManager history = new HistoryManager();

        history.visitUrl("www.Google.com");
        history.visitUrl("www.YouTube.com");
        history.visitUrl("www.Twitch.com");
        history.visitUrl("www.Netflix.com");
        history.visitUrl("www.FaceBook.com");

        System.out.println();
        System.out.println("---- here is your current Tab ----");
        System.out.println();

        System.out.println(history.currentState.URL);

        System.out.println();
        System.out.println("---- after pressing the go back button ----");
        System.out.println();

        history.undoHistory();
        System.out.println(history.currentState.URL);

        System.out.println();
        System.out.println("---- after pressing the go back button again ----");
        System.out.println();

        history.undoHistory();
        System.out.println(history.currentState.URL);

        System.out.println();
        System.out.println("---- after pressing the go forward button ----");
        System.out.println();

        history.redoHistory();
        System.out.println(history.currentState.URL);

        System.out.println();
        System.out.println("---- after pressing the go forward button again ----");
        System.out.println();

        history.redoHistory();
        System.out.println(history.currentState.URL);

        System.out.println();
        System.out.println("---- after pressing the go forward button once you've reached the end ----");
        System.out.println();

        history.redoHistory();
        System.out.println(history.currentState.URL);

        System.out.println();
        System.out.println("---- after pressing the go back button once you've reached the start ----");
        System.out.println();

        history.undoHistory();
        history.undoHistory();
        history.undoHistory();
        history.undoHistory();
        history.undoHistory();
        System.out.println(history.currentState.URL);

        System.out.println();
        System.out.println("---- after pressing the show all history button ----");
        System.out.println();

        history.showAllHistoryNew();

        System.out.println();
        System.out.println("---- after deleting all history ----");
        System.out.println();

        history.deleteAllHistory();
        history.showAllHistoryNew();

    }
}