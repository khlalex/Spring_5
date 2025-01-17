package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(defaultValue="5") Integer count, ModelMap model) {
        CarServiceImpl carsServiceImpl = new CarServiceImpl();
        List<Car> listCars = carsServiceImpl.carListCount(count);
        model.addAttribute("cars", listCars);
        return "cars";
    }
}
