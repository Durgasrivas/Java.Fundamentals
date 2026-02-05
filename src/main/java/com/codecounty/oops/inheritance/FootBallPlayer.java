package com.codecounty.oops.inheritance;

public class FootBallPlayer {
    String name;
    int age;
    int goal;
    int jerseyNo;
    int experience;
    int matchPlayed;
    boolean isCaptain;

    public FootBallPlayer(String name, int age, int goal, int jerseyNo, int experience,
                     int matchPlayed, boolean isCaptain) {
        this.name = name;
        this.age = age;
        this.goal = goal;
        this.jerseyNo = jerseyNo;
        this.experience = experience;
        this.matchPlayed = matchPlayed;
        this.isCaptain = isCaptain;
    }

    void average() {
        System.out.println("Average "+(goal/matchPlayed));
    }

    public String info() {
        return "FootBallPlayer{" +
                "name='" + name  +
                ", age=" + age +
                ", goal=" + goal +
                ", jerseyNo=" + jerseyNo +
                ", experience=" + experience +
                ", matchPlayed=" + matchPlayed +
                ", isCaptain=" + isCaptain +
                '}';
    }
}
