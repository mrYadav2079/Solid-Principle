public interface Keyboard { }
public class Windows98Machine{

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
public class Valid_dependency{
//decoupling is done in other to remvoe depemcdency of modules
}
