package Student;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        //Создать класс Student c полями (переменными) имя и номер.
        //Создать несколько обьектов этого класса
        Student john = new Student();
        john.name="John";
        john.number=1;
        System.out.println("Student's name is: "+john.name+" and his number is: "+john.number);

        Student jack = new Student();
        jack.name="Jack";
        jack.number=2;
        System.out.println("Student's name is: "+jack.name+" and his number is: "+jack.number);

        //Задача 2
        //Добавить в класс Student конструктор с параметрами имя и номер.
        //Создать еще несколько обьектов класса с использованием этого конструктора

        Student edgar = new Student("Edgar",123);
        System.out.println("student's name is: "+edgar.name);
        System.out.println("and his number is: "+edgar.number);

        Student albina = new Student("Albina",321);
        System.out.println("student's name is: "+albina.name);
        System.out.println("and her number is: "+albina.number);


    }
}
