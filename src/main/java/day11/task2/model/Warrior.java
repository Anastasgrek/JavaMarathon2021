package day11.task2.model;


public class Warrior extends Hero {


    public Warrior(){
        magicDef = 0;
        physDef = 0.8;
        physAtt = 30;
    }


    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
