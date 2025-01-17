package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    CarDao carDao = new CarDaoImpl();

    @Override
    public List<Car> carListCount(Integer count) {
        return carDao.carListCount(count);
    }

    @Override
    public List<Car> getCarList() {
        return carDao.getCarList();
    }
}
