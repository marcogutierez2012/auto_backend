package pe.auto.PROYECTO_AUTO.response;

import pe.auto.PROYECTO_AUTO.entity.Car;

public record FindCarResponse(Iterable<Car> cars) {
}
