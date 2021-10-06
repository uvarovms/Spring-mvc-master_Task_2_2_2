package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private static final List<Car> listCars = new ArrayList<>();

    static {
        listCars.add(new Car("Toyota", "sedan", 2.2));
        listCars.add(new Car("Audi", "hatchback", 3.5));
        listCars.add(new Car("Volkswagen", "van", 4.5));
        listCars.add(new Car("Ferrari", "coupe", 6.5));
        listCars.add(new Car("Lexus", "off-road car", 6.0));
    }

    @Override
    public List<Car> getListCars(int count) {
        List<Car> listByCar = new ArrayList<>();
        for (int i=0; i<count; i++){
            listByCar.add(listCars.get(i));
        } return listByCar;
    }
}
