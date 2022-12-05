package _02.staticForVar;

public class Window {
    String name;
    static int ticketNumber;

    public Window() {
    }

    public Window(String name, int ticketNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
    }
}
