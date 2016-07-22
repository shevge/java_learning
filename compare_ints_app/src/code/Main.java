package code;

class Util {

    public Util() {

    }

    public void printMax(int x, int y, int z) {
        // если x>y x>z
        if (x>y){
            if (x>z) {
                // вывести на экран строку "larger is x" (большее это х)
                System.out.println("larger is x");
            }else{
                //  если нет - вывести на экран строку "larger is y" (большее это y)
                System.out.println("larger is y");
            }
        }
        //если y>z - вывести на экран строку "larger is y" (большее это y)
        else {
            if (z > y) {
                System.out.println("larger is z");
            } else {
                System.out.println("larger is y");
            }
        }
    }
}
// класс большего из чисел
class Main {

    // публичный статический возвращаемый метод main (функция) (строчный массив аргументов)
    public static void main(String[] args) {
        // зададим поле (переменные) целое х = 1 у = 2 z = 3
        Util util = new Util();
        
        util.printMax(2, 3, 4);
        util.printMax(6, 11, 2);
        util.printMax(14, 12, 13);
        util.printMax(2, 2, 2);
    }
}
