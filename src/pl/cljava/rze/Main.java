package pl.cljava.rze;

import pl.cljava.rze.pl.cljava.rze.obj.Car;
import pl.cljava.rze.pl.cljava.rze.obj.Tank;

/**
 * Simple usage of GenericBuilder pattern
 * It reduces a boilerplate code writen by programmers in POJO classes
 * Created by pakz on 2017-01-17.
 */
public class Main {

    public static void main(String [] args)
    {
        Car car = GenericBuilder.of(Car::new)
                .with(Car::setEngineName, "V8")
                .with(Car::setEngineCM, 4280L)
                .with(Car::setBrand, "BMW")
                .with(Car::setModel, "M3 AMG")
                .build();

        Tank tank = GenericBuilder.of(Tank::new)
                .with(Tank::setEngineName, "V16")
                .with(Tank::setEngineCM, 9400L)
                .with(Tank::setArmed, false)
                .with(Tank::setLegal, false)
                .build();
    }

}
