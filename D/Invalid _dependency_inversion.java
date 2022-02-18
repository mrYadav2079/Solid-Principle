public class Windows98Machine {

    private final StandardKeyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine() {
        monitor = new Monitor();
        keyboard = new StandardKeyboard();
    }

}
public class Invalid_dependency_inversion{
//Here, we're using the dependency injection pattern to facilitate adding the Keyboard dependency into the Windows98Machine class.
}
