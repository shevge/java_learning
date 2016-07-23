package code;

class Util1 {

    public Util1() {

    }

    public void printLess(int x, int y, int z, int t) {
        // если х < y x < z x < t
        if (x < y) {
            if (x < z) {
                if (x < t) {
                    // вывести на экран строку "lessNumber is x" (меньшее число это х)
                    System.out.println("lessNamber is x");
                }
            } else {
                if (x < t) {
                }
            }
        }
        else {
            if (y < z) {
                if (y < t) {
                    // вывести на экран строку "lessNumber is y" (меньшее это у)
                    System.out.println("lessNumber is y");
                }
                else {
                    if (z < t) {
                        // вывести на экран строку (меньшее это z)
                        System.out.println("lessNumber is z");
                    }
                    else {
                        System.out.println("lessNumber is t");
                    }
                }
            }
        }
    }
    public int getMin(int x, int y, int z, int t) {
        int min = x;

        if (y < min) {
            min = y;
        }
        if (z < min) {
            min = z;
        }
        if (t < min) {
            min = t;
        }

        return min;
    }
    public int getMin(int[] arr) {
        int min = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}

// класс меньшего из чисел
class Main {

    // публичный статический возвращаемый метод LessNumber (функция) (строчный массив аргументов)
    public static void main(String[] args) {
        // зададим поле x = 1 y = 2 z = 3  t = 4
        Util1 util1 = new Util1();
        int[] arr = {1, 7, 0, 14, 6, 999, 12, 17, -44};

        System.out.println("Результаты: " + util1.getMin(arr));
    }
}

