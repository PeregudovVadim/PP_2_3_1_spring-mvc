package web.service.impl;

import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carList = new ArrayList<>() {{
        add(new Car("BMW", "X6", 250));
        add(new Car("BMW", "X7", 300));
        add(new Car("Audi", "RS", 250));
        add(new Car("Lada", "SPORT", 400));
        add(new Car("KIA", "RIO", 135));
        add(new Car("LADA", "VESTA", 400));

    }};

    @Override
    public List<Car> getCars(int count) {
        return (count >= 5) ? carList : carList.subList(0, count);
    }
}
