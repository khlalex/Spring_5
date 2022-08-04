package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImpl implements CarDao {

    List <Car> carList = new ArrayList<>();

    {
        carList.add(new Car(1, "Lada", "red"));
        carList.add(new Car(2, "Ford", "black"));
        carList.add(new Car(3, "Lamborghini", "green"));
        carList.add(new Car(4, "Honda", "grey"));
        carList.add(new Car(5, "Kia", "blue"));
    }
    @Override
    public List<Car> carListCount(Integer count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }
}
