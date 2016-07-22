// папка com.company
package com.company;

// описание класса человек с целыми переменными экземпляра х, у, именем
class Human {
    int x;
    int y;
    String name;

    // конструктор - иницилизирует (дает значения) новый объект и вызывается при создании каждого нового объекта
    public Human(String newName) {
        this.x = 0;
        this.y = 0;
        this.name = newName;
    }

    // печать (вывод строки) координат вновь созданного объекта
    public void printCoordinates() {
        // my coordinates: (4, 5)
        String str = this.name + "coordinates : ("  + this.x + ", " + this.y + ")";
        System.out.println(str);
    }
    // функция перемещения (движения) заданных объектов по координатным точкам
    public void go(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}

class Program {
    // класс программы меин работающий с объектами Human
    public static void main(String[] args) {
        // переменной женя типа человек присваевается новый человек с именем женя
        Human jenya = new Human("Jenya");
        // переменной никита (обьект никита) присваивается новый человек с именем борис
        Human nikita = new Human("Борис");
        // человеку мама присваивается новый человек с именем Ира
        Human mommy = new Human("Ира");

        // координаты мама выводятся на экран (0.0)
        mommy.printCoordinates();
        // координаты женя выводятся на экран (0.0)
        jenya.printCoordinates();
        // координаты никита выводятся на экран (0.0)
        nikita.printCoordinates();
        // женя иди в точку с координатами 1.2
        jenya.go(1, 2);

        // координаты мама выводятся на экран (0.0)
        mommy.printCoordinates();
        // координаты женя выводятся на экран (1.2)
        jenya.printCoordinates();
        // координаты никита выводятся на экран (0.0)
        nikita.printCoordinates();
        // женя иди в точку с координатами 5.4
        jenya.go(5, 4);

        // координаты мама выводятся на экран (0.0)
        mommy.printCoordinates();
        // координаты женя выводятся на экран (5.4)
        jenya.printCoordinates();
        // координаты никита выводятся на экран (0.0)
        nikita.printCoordinates();
        // никита иди в точку с координатами 2.3
        nikita.go(2, 3);
    }
}
