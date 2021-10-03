package com.company;

public class Person {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;
    public Person(String _name, String _position, String _email, int _phone, int _salary, int _age) {
        this.name = _name;
        this.position = _position;
        this.email= _email;
        this.phone= _phone;
        this.salary= _salary;
        this.age = _age;
    }
    String getFullInfo() {
        return this.name + " " +
                this.position + " " +
                this.email + " " +
                this.phone + " " +
                this.salary + " " +
                this.age;
 }
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        persArray[1] = new Person("Sokolov Petr", "IT", "slv@mail.ru", 892253636, 30000, 35);
        persArray[2] = new Person("Petrov Fedya", "Security", "petr@mailbox.com", 895553862, 30000, 45);
        persArray[3] = new Person("Tihonova Natalia", "Manager", "natanata@mailbox.com", 89563533, 30000, 25);
        persArray[4] = new Person("Mursina Venera", "Cleaner", "mrasina@mailbox.ru", 892311243, 30000, 51);
        showAge(persArray, 40);
        }
    public static void showAge(Person[] persArray, int year) {
        for (int i = 0; i < persArray.length; i++)
            if (persArray[i].age > year){
                System.out.println(persArray[i].getFullInfo());
            }
    }
}
