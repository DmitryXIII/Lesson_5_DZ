package com.geekbrains.lesson_5;
/*Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        Конструктор класса должен заполнять эти поля при создании объекта.
        Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        Создать массив из 5 сотрудников.
        Пример:
        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person(...);
        ...
        persArray[4] = new Person(...);
        С помощью цикла вывести информацию только о сотрудниках старше 40 лет.*/

public class Lesson_5_DZ {
    public static void main(String[] args) {
        Person[] personArray = new Person[5];
        personArray[0] = new Person("Иванов Иван Иванович", 42, "Директор", "ivanov@gmail.com", "89001234567", 100000);
        personArray[1] = new Person("Петров Петр Иванович", 24, "Младший научный сотрудник", "petrov@gmail.com", "89011234566", 15000);
        personArray[2] = new Person("Сидоров Иван Сидорович", 38, "Старший научный сотрудник", "sidorov@gmail.com", "89021234565", 30000);
        personArray[3] = new Person("Кузнецов Петр Иванович", 35, "Системный администратор", "kuznetcov@gmail.com", "89031234564", 70000);
        personArray[4] = new Person("Глушко Юрий Венедиктович", 51, "Заместитель директора", "glushko@gmail.com", "89041234563", 80000);
        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].age > 39) {
                System.out.println("Сотрудник:");
                Person.printPerson(personArray[i]);
                System.out.println();
            }
        }
    }
}

class Person {
    protected String name;
    protected int age;
    protected String position;
    protected String eMail;
    protected String phoneNumber;
    protected int salary;

    public Person(String name, int age, String position, String eMail, String phoneNumber, int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public static void printPerson(Person person) {
        System.out.println("ФИО: " + person.name);
        System.out.println("возраст: " + person.age);
        System.out.println("должность: " + person.position);
        System.out.println("eMail: " + person.eMail);
        System.out.println("телефон: " + person.phoneNumber);
        System.out.println("зарплата: " + person.salary);
    }
}
