package day6;

public class Teacher {
    private String name;
    private String subject;


    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student){
        int randomNumber = 2 + (int) (Math.random() * 3);
        switch (randomNumber){
            case 2:
                System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                        " по предмету " + this.subject + " на оценку неудовлетворительно");
                break;
            case 3:
                System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                        " по предмету " + this.subject + " на оценку удволетворительно");
                break;
            case 4:
                System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                        " по предмету " + this.subject + " на оценку хорошо");
                break;
            case 5:
                System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                        " по предмету " + this.subject + " на оценку отлично");
                break;
        }
    }
}
