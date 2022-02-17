public interface BearCleaner {
    void washTheBear();
}

public interface BearFeeder {
    void feedTheBear();
}

public interface BearPetter {
    void petTheBear();
}
public class programmer implements BearCleaner, BearFeeder {
  void washTheBear(){
  //programmer will clean the bear.
  }
   void BearFeeder(){
  //programmer will feed the bear.
  }
  //since programmer do not want to pet the Bear as he feels dangerous to do so
   //he will not implenment  BearPetter 
}
public class IspValid {
    //we have overcome our earlier consern by using inteface segregation.
    //
}
