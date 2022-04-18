package web.service;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarList(List<Car> car, int count);
}
