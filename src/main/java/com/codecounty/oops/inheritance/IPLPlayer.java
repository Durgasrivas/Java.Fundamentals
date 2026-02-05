package com.codecounty.oops.inheritance;

public class IPLPlayer extends Player {

    int runs;
    int jerseyNo;
    boolean isAllRounder;
    boolean isCaptain;

    public IPLPlayer(String name, int age, int experience, int matchPlayed, Gender gender,
                     int runs, int jerseyNo, boolean isAllRounder, boolean isCaptain) {
        super(name, age, experience, matchPlayed, gender);
        this.runs = runs;
        this.jerseyNo = jerseyNo;
        this.isAllRounder = isAllRounder;
        this.isCaptain = isCaptain;
    }

    void average() {
        System.out.println("Average " + (runs / matchPlayed));

    }


    public String info() {
        return "IPLPlayer{" +
                "runs=" + runs +
                ", jerseyNo=" + jerseyNo +
                ", isAllRounder=" + isAllRounder +
                ", isCaptain=" + isCaptain +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", matchPlayed=" + matchPlayed +
                ", gender=" + gender +
                '}';
    }
}

