package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private static List<Car> carList = new ArrayList<>();
    static {
        Car car1 = new Car(1,"audi","100");
        Car car2 = new Car(2,"bmw","E46");
        Car car3 = new Car(3,"mercedes-benz","W140");
        Car car4 = new Car(4,"volvo","850");
        Car car5 = new Car(5,"saab","9000");


        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String carCount(ModelMap modelCar, @RequestParam(required = false, defaultValue = "0") int count) {

            modelCar.addAttribute("carList", carService.getCarList(carList,count));

        return "cars";
    }

}
