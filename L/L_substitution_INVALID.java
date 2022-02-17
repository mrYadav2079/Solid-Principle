public interface Car {

    void turnOnEngine();
    void accelerate();
}
public class ElectricCar implements Car {

    public void turnOnEngine() {
        throw new AssertionError("I don't have an engine!");
    }

    public void accelerate() {
        //this acceleration is crazy!
    }
}
public class LiskovSubsINVALID {
    //it applies to inheritance in such a way that the derived class must be completely substitutable
    //for their base class. In other words if class A is a subtype of class B, then we should be able to
    // replace B with A without interrupting the behaviour of the program.
  //Here we can see class ElectricCar can not be replaced by class Car so it violates the Liskov Substitution principle
}
