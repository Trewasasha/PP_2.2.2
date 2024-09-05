package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiseImpl implements CarServise {
    @Override
    public List<Car> listCar() {
        List<Car> cars = new ArrayList<Car>();

        cars.add(new Car(1, "Lada", "red"));
        cars.add(new Car(2, "Mitsubishi Lancer", "white"));
        cars.add(new Car(3, "BMW", "blue"));
        cars.add(new Car(4, "Honda", "green"));
        cars.add(new Car(5, "Mercedes", "black"));

        return cars;
    }

    @Override
    public List<Car> showCars(Integer count) {
        if ((count == null) || (count >= listCar().size())) {
            return listCar();
        }
        return listCar().stream().limit(count).collect(Collectors.toList());
    }



}
