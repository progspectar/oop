public class Base {
private String state;

    public Base() {
        this.state = "the state has been initialized in constructor class Base";
    }

    public Base(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
