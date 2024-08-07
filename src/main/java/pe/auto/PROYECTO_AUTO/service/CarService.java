package pe.auto.PROYECTO_AUTO.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.auto.PROYECTO_AUTO.response.DeleteCarResponse;
import pe.auto.PROYECTO_AUTO.response.UpdateCarResponse;
import pe.auto.PROYECTO_AUTO.entity.Car;
import pe.auto.PROYECTO_AUTO.repository.CarRepository;
import pe.auto.PROYECTO_AUTO.response.AddCarResponse;
import pe.auto.PROYECTO_AUTO.response.FindCarResponse;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<Iterable<Car>> findCars(@RequestParam(value = "id", defaultValue = "0") Integer id){

        Iterable<Car> cars = null;
        if(id > 0){
            cars = carRepository.findAllById(List.of(id));
        }else{
            cars = carRepository.findAll();
        }

        return ResponseEntity.ok().body(cars);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/add")
    public AddCarResponse addCar(@RequestBody Car car){

        if(car.getId() != null){
            return new AddCarResponse("99", "Id parameter is not allowed");
        }

        carRepository.save(car);
        return new AddCarResponse("01", null);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/update")
    public UpdateCarResponse updateCar(@RequestBody Car car){

        if(!carRepository.findById(car.getId()).isPresent()){
            return new UpdateCarResponse("99","Car not found to update");
        }

        carRepository.save(car);
        return new UpdateCarResponse("01",null);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/delete")
    public DeleteCarResponse deleteCar(@RequestBody Car car){

        if(!carRepository.findById(car.getId()).isPresent()){
            return new DeleteCarResponse("99","Car not found to delete");
        }

        carRepository.delete(car);
        return new DeleteCarResponse("01",null);
    }

}
