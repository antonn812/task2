
abstract class Student {
    protected String fullName;
    protected int course;
    protected int lastExamMark;

    public Student(String fullName, int course, int lastExamMark) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamMark = lastExamMark;
    }

    abstract void writeExam();

    @Override
    public String toString() {
        return "ФИО: " + fullName + ", Курс: " + course + ", Оценка за последний экзамен: " + lastExamMark;
    }
}

class IUStudent extends Student {
    public IUStudent(String fullName, int course, int lastExamMark) {
        super(fullName, course, lastExamMark);
    }

    @Override
    void writeExam() {
        System.out.println("Студент информационных технологий " + fullName + " пишет экзамен");
    }
}

class MathStudent extends Student {
    public MathStudent(String fullName, int course, int lastExamMark) {
        super(fullName, course, lastExamMark);
    }

    @Override
    void writeExam() {
        System.out.println("Студент математического факультета " + fullName + " пишет экзамен");
    }
}
public class Main {
    public static void main(String[] args) {
        Student iuStudent = new IUStudent("Иванов Иван Иванович", 3, 90);
        Student mathStudent = new MathStudent("Петров Петр Петрович", 2, 85);

        System.out.println(iuStudent);
        iuStudent.writeExam();

        System.out.println(mathStudent);
        mathStudent.writeExam();
    }
}
