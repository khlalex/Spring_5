package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> carListCount(Integer count);
    List<Car> getCarList();
}
