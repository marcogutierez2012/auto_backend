package pe.auto.PROYECTO_AUTO.repository;

import org.springframework.data.repository.CrudRepository;
import pe.auto.PROYECTO_AUTO.entity.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {
}
