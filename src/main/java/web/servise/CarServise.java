package web.servise;

import web.model.Car;

import java.util.List;

public interface CarServise {
    List<Car> listCar();
    List<Car> showCars(Integer count);
}
