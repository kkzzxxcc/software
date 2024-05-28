package DIP;

public class Racing extends Games {
    public Racing() {
        title = returnTitle();
        version = returnVersion();

    }

    public String returnTitle() {
        return "Racing";
    }

    public String returnVersion() {
        return "2.4";
    }
}
