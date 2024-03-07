import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.Vehicle;

class VehicleTest {
// проверка того, что экземпляр объекта main.java.Car также является экземпляром транспортного средства; (instanceof)
    @Test
    void testCarIsInstanceOfVehicle() {
        main.java.Car car = new main.java.Car();
        assertTrue(car instanceof Vehicle);
    }
// проверка того, объект main.java.Car создается с 4-мя колесами
    @Test
    void testCarCreatedWithFourWheels() {
        main.java.Car car = new main.java.Car();
        assertEquals(4, car.getWheels().size());
    }
// проверка того, объект main.java.Motorcycle создается с 2-мя колесами
    @Test
    void testMotorcycleCreatedWithTwoWheels() {
        main.java.Motorcycle motorcycle = new main.java.Motorcycle();
        assertEquals(2, motorcycle.getWheels().size());
    }
// проверка того, объект main.java.Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    void testCarSpeedAfterTestDrive() {
        main.java.Car car = new main.java.Car();
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }
// проверка того, объект main.java.Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    void testMotorcycleSpeedAfterTestDrive() {
        main.java.Motorcycle motorcycle = new main.java.Motorcycle();
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }
// проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
    @Test
    void testCarStopsInParkingMode() {
        main.java.Car car = new main.java.Car();
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }
// проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    void testMotorcycleStopsInParkingMode() {
        main.java.Motorcycle motorcycle = new main.java.Motorcycle();
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}