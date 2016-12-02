package jp.tigertaizo.primefacesapps.cdis;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import jp.tigertaizo.primefacesapps.ejbs.CarService;
import jp.tigertaizo.primefacesapps.models.Car;

/**
 *
 * @author tigertaizo
 */
@Named
@ViewScoped
public class BasicView implements Serializable {
    
    private List<Car> cars;
     
    @Inject
    private CarService service;
 
    @PostConstruct
    public void init() {
        cars = service.createCars(10);
    }
     
    public List<Car> getCars() {
        return cars;
    }
 
    public void setService(CarService service) {
        this.service = service;
    }    
}
