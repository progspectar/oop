public class Base1 extends Base{

    public Base1(String state) {

        super(state);
        String s = "";
    }

    @Override
    public String getState() {
        return super.getState();
    }

    public static void main(String[] args) {
        Base base1 = new Base1("the state's been overridden in an constructor");
        String state1 = base1.getState();
        System.out.println(state1);
    }
}
