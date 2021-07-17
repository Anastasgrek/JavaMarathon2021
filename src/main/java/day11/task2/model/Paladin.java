package day11.task2.model;

import day11.task2.interfaces.Healer;

public class Paladin extends Hero implements Healer {

    final int HEAL_AMOUNT = 25;
    final int HEAL_TEAM_AMOUNT = 20;


    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }


    @Override
    public void healHimself() {
        if (health + HEAL_AMOUNT > MAX_HEALTH){
            health = MAX_HEALTH;
        }else {
            health += HEAL_AMOUNT;
        }

    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAM_AMOUNT > MAX_HEALTH){
            hero.health = MAX_HEALTH;
        }else {
            hero.health += HEAL_TEAM_AMOUNT;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}

