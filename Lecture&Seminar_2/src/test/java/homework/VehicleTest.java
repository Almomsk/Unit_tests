package homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.homework.Car;
import java.homework.Motorcycle;
import java.homework.Vehicle;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VehicleTest {

    Car car = new Car("Nissan", "Qashqai", 2022);
    Motorcycle moto = new Motorcycle("Ducati", "Monster", 2021);

    //- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
    @Test
    void instanceOf() {
        //Car car = new Car("Nissan", "Qashqai", 2022);
        assertThat(car instanceof Vehicle);
    }

    //- Проверить, что объект Car создается с 4-мя колесами.
    @Test
    void WheelsCar() {
        //Car car = new Car("Nissan", "Qashqai", 2022);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    // - Проверить, что объект Motorcycle создается с 2-мя колесами.
    @Test
    void MotorcycleWheels() {
        //Motorcycle moto = new Motorcycle("Ducati", "Monster", 2021);
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    //- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
    @Test
    void testDriveCar() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    // -Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).

    @Test
    void testDriveMotorcycle() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    //Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
    @Test
    void parkCar() {
        car.testDrive();
        //System.out.println(car.getSpeed());
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
    @Test
    void parkMotorcycle() {
        moto.testDrive();
        //System.out.println(moto.getSpeed());
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }

}