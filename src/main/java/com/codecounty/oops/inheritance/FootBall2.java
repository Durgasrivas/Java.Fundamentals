package com.codecounty.oops.inheritance;

public class FootBall2 extends Player{

    int goal;
    int jerseyNo;
    boolean isCaptain;

    public FootBall2(String name, int age, int experience, int matchPlayed, Gender gender, int goal, int jerseyNo, boolean isCaptain) {
        super(name, age, experience, matchPlayed, gender);
        this.goal = goal;
        this.jerseyNo = jerseyNo;
        this.isCaptain = isCaptain;
    }
}
