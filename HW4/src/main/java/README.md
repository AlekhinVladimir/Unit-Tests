*Задание 1.
Проект main.java.Vehicle. Написать следующие тесты с использованием JUnit5:

- Проверить, что экземпляр объекта main.java.Car также является экземпляром транспортного средства (используя оператор instanceof).

- Проверить, что объект main.java.Car создается с 4-мя колесами.

- Проверить, что объект Motorcycle создается с 2-мя колесами.

- Проверить, что объект main.java.Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).

- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).

- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).

- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

В этом проекте, вы будете работать с проектом ""main.java.Vehicle"", который представляет собой иерархию классов, включающую абстрактный базовый класс ""main.java.Vehicle"" и два его подкласса ""main.java.Car"" и ""Motorcycle"".

Базовый класс ""main.java.Vehicle"" содержит абстрактные методы ""testDrive()"" и ""park()"", а также поля ""company"", ""model"", ""yearRelease"", ""numWheels"" и ""speed"".

Класс ""main.java.Car"" расширяет ""main.java.Vehicle"" и реализует его абстрактные методы. При создании объекта ""main.java.Car"", число колес устанавливается в 4, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 60, а в методе ""park()"" - обратно в 0.

Класс ""Motorcycle"" также расширяет ""main.java.Vehicle"" и реализует его абстрактные методы. При создании объекта ""Motorcycle"", число колес устанавливается в 2, а скорость в 0. В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.

Формат сдачи: воспользуйтесь одним из вариантов: Ссылка на репозиторий Git или Прикрепленный архив.