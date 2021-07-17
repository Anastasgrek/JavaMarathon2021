package day11.task2.model;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;
import day11.task2.interfaces.PhysAttack;

public class Shaman extends Hero implements PhysAttack, Healer, MagicAttack {

    final int HEAL_AMOUNT = 50;
    final int HEAL_TEAM_AMOUNT = 30;

    int magicAtt;

    public Shaman(){
        physAtt = 10;
        magicAtt = 15;
        physDef = 0.2;
        magicDef = 0.2;
    }


    @Override
    public void healHimself() {
        if(health + HEAL_AMOUNT > 100){
            health = MAX_HEALTH;
        }else {
            health += HEAL_AMOUNT;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAM_AMOUNT > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        }else {
            hero.health += HEAL_TEAM_AMOUNT;
        }
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAtt * (1 - hero.magicDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
