package day6;

public class Teacher {
    private String name;
    private String subject;
    private String grade;


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
                this.grade =  "неудовлетворительно";
                break;
            case 3:
                this.grade = "удовлетворительно";
                break;
            case 4:
                this.grade = "хорошо";
                break;
            case 5:
                this.grade = "отлчино";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                " по предмету " + this.subject + " на оценку " + this.grade);
    }
}
