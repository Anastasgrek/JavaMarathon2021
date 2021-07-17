package day11.task2.model;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {

    final int MAX_HEALTH = 100;
    final int MIN_HEALTH = 0;

    int health;
    double physDef;
    double magicDef;
    int physAtt;

    public Hero(){
        health = MAX_HEALTH;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAtt * (1 - hero.physDef);
        if (hero.health - attackScore < 0){
            hero.health = MIN_HEALTH;
        }else {
            hero.health -= attackScore;
        }
    }
}
