public class first {
    static class MyFirstClassCat2 {
        private String name; // Кличка
        private int age; // Возраст

        public void voice() {
            for (int i = 1; i <=age; i++) {
                System.out.println("Мяу");
            }
        }

        //Новые методы
        public int getAge() {
            return age;
        }
        public void setAge (int newAge) {
            if (newAge<0)
                System.out.println("Значение возраста мало");
            else if (newAge>20)
                System.out.println("Значение возраста велико");
            else age = newAge;
        }
        // Конструктор без параметров
        public MyFirstClassCat2() {
            name="Неопознанный Кот";
            age=1;
        }

        // Измененный конструктор
        public MyFirstClassCat2(String n, int a) {
            name = n;
            setAge(a);
        }
        // добавляем методы getname() и setName()//

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        MyFirstClassCat2 Cat3 = new MyFirstClassCat2("Мурзик", 5);
        // добавляем вывод для имени//
        System.out.println(Cat3.getName());
        System.out.println(Cat3.getAge());

        Cat3.voice();
        MyFirstClassCat2 Cat4 = new MyFirstClassCat2();
        System.out.println("Возраст \"Неопознанного кота\": "+Cat4.getAge());

    }
}
