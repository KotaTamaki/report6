package jp.ac.uryukyu.ie.e215755;

public class Player {
    private String playerNumber;
    private String name;
    private int count;

    public Player(String name){
        System.out.println(name+" が参加しました");
        this.name=name;
    }
    String getNumber(){
        return playerNumber;
    }

    String getName(){
        return name;
    }
}