public class Dog extends Animal{

    Dog(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                '}';
    }

    @Override
    void say() {
        System.out.println(this + ":  гав-гав");
    }
}
