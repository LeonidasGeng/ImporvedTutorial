package _02staticForMemberVariables;

public class window {
    String windowName;
    static int ticketNumber;

    public window(String windowName, int ticketNumber) {
        this.windowName = windowName;
        this.ticketNumber = ticketNumber;
    }

    public window() {
    }
}
