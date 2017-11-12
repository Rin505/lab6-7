public class second {
    static class Student {
        // создаем поля класса//
        private String name;
        private String surname;
        private int birthYear;
        private String group;

        // создаем конструкторы для каждого набора вводимых параметров. ( они могут быть неполными )

        Student(String name) {
            this.name = name;
        }

        Student(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        Student(String name, String surname, int birthYear) {
            this.name = name;
            this.surname = surname;
            this.birthYear = birthYear;
        }

        Student(String name, String surname, int birthYear, String group) {
            this.name = name;
            this.surname = surname;
            this.birthYear = birthYear;
            this.group = group;
        }

        // метод,выводящий всю информацию о студенте//

        void information() {
            System.out.print(this.name);
            if(this.surname != null){
                System.out.println(" "+ this.surname);
            }                                             // добавляем условия, чтобы избежать вывод переменной при её отсутствии//

            else {
                System.out.println();
            }
            if( this.birthYear != 0) {
                System.out.println("Год рождения: " + this.birthYear);
            }
            if(this.group  != null) {
                System.out.println("Группа: " + this.group);
            }
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Mr");
        Student student2 = new Student("Mr", "Nobody");
        Student student3 = new Student("Mr", "Nobody", 1978);
        Student student4 = new Student("Mr", "Nobody", 1978, "БИ-231");

        student1.information();
        student2.information();
        student3.information();
        student4.information();
    }
}
