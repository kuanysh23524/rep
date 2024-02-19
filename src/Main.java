import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     ArrayList<Student> students = new ArrayList<>();

    }
    private static void addStudent() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя студента: ");
        String name = in.nextLine();

        System.out.print("Введите идентификатор студента: ");
        int id = in.nextInt();

        System.out.print("Введите балл за тест: ");
        int testScore = in.nextInt();

        Student student = new Student(id, name, testScore);

        System.out.println("Студент успешно добавлен.");
    }

}