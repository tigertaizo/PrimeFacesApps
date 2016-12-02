package jp.tigertaizo.primefacesapps.cdis;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import jp.tigertaizo.primefacesapps.ejbs.CarService;
import jp.tigertaizo.primefacesapps.models.Car;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author tigertaizo
 */
@Named
@ViewScoped
public class Java8Test1 implements Serializable {
    
    @Getter
    @Setter
    private List<Car> cars;
     
    @Inject
    private CarService service;
 
    @PostConstruct
    public void init() {
        cars = service.createCars(20);
        //cars.forEach((final Car car) -> System.out.println(car.getId()));
        List<Car> cars2 = cars.stream()
                .filter(car -> car.getYear() > 1995)
                .collect(Collectors.toList());
        setCars(cars2);
        //cars2.forEach((final Car car) -> System.out.println(car.getId()));
    }     
}
