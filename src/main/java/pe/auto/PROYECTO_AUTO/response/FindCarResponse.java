package pe.auto.PROYECTO_AUTO.response;

import pe.auto.PROYECTO_AUTO.entity.Car;

public record FindCarResponse(String code, String error, Iterable<Car> cars) {
}
