package web.service;

import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(List<Car> carList, int count) {
        return count == 0 ? carList : carList.subList(0,count);
    }
}
