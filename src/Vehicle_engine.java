
public class Vehicle_engine {
    public void startEngine_sample(){}

    public void move(){}
}

class Car_sample extends  Vehicle_engine{
    @Override
    public void startEngine_sample() {}

    @Override
    public void move() {}
}

class Bicycle_sample extends Vehicle_without_engine{
    @Override
    public void move(){}

}