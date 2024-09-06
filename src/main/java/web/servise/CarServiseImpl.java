package web.servise;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiseImpl implements CarServise {

    private List<Car> cars;

    public CarServiseImpl() {
        this.cars = new ArrayList<>();
        this.cars.add(new Car(1, "Lada", "red"));
        this.cars.add(new Car(2, "Mitsubishi Lancer", "white"));
        this.cars.add(new Car(3, "BMW", "blue"));
        this.cars.add(new Car(4, "Honda", "green"));
        this.cars.add(new Car(5, "Mercedes", "black"));
    }


    @Override
    public List<Car> showCars(Integer count) {
        if ((count == null) || (count >= cars.size())) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }



}
