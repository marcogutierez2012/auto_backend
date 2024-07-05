package pe.auto.PROYECTO_AUTO.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String brand;
    private String model;
    private Date fabricationYear;
    private double price;
    private int numberSeats;
    private String color;
    private String fuelType;
    private String transmissionType;
    private String licensePlate;

    public Car() {
    }

    public Car(Integer id) {
        this.id = id;
    }

    public Car(Integer id, String brand, String model, Date fabricationYear,
               double price, int numberSeats, String color, String fuelType,
               String transmissionType, String licensePlate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.fabricationYear = fabricationYear;
        this.price = price;
        this.numberSeats = numberSeats;
        this.color = color;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", fabricationYear=" + fabricationYear +
                ", price=" + price +
                ", numberSeats=" + numberSeats +
                ", color='" + color + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(Date fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
