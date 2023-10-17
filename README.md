# Урок 3. Качество тестов
## Classwork
### task001:
Протестировать калькулятор с архитектурой MVC и оценить качество покрытия.

Задание №1
Создайте набор тестов, полностью покрывающих все ветви кода функции fizzBuzz. Эта
функция принимает на вход число и возвращает "Fizz", если число делится на 3, "Buzz",
если число делится на 5, и "FizzBuzz", если число делится на 15. Если число не делится ни
на 3, ни на 5, ни на 15, функция возвращает входное число в виде строки.

Задание №2
Разработайте тесты для метода firstLast6, где на вход подается массив чисел, а метод
возвращает true, если первое или последнее число в массиве равно 6, иначе false.

Задание №3
Создайте тесты, обеспечивающие полное покрытие кода метода calculatingDiscount, который принимает сумму
покупки и размер скидки, затем вычисляет и возвращает сумму с учетом скидки. Метод должен обрабатывать
исключения, связанные с некорректным размером скидки или отрицательной суммой покупки.

Задание №4
Разработайте метод luckySum и напишите для него тесты. Этот метод принимает на вход три числа и возвращает
их сумму. Однако, если одно из чисел равно 13, то оно не учитывается при подсчете суммы.
Так, например, если b равно 13, то считается сумма только a и c.
public int luckySum(int a, int b, int c) { ... }

Задание №5
Примените подход TDD для создания нового класса MoodAnalyser, который оценивает настроение
выраженное во фразах.

Задание №6
Разработайте класс User с методом аутентификации по логину и паролю. Метод должен возвращать true, если
введенные логин и пароль корректны, иначе false. Протестируйте все методы

Задание №7
Добавьте класс UserRepository для управления пользователями. В этот класс должен быть включен метод
addUser, который добавляет пользователя в систему, если он прошел аутентификацию. Покройте тестами новую
функциональность


## Homework
Задание 0. (необязательное) *Попробовать самостоятельно решить задачи, которые не успели решить на семинаре. 
Сдавать решение не нужно.
### task001:
*Задание 1.

Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или 
нечетным. (код приложен в презентации)

Задание 2.

Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в 
интервал (25;100). (код приложен в презентации)

### task002:
Задание 3.  (необязательное)

Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов. Для этого, 
вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами. 
Протестируйте данную функцию.