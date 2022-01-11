package jp.ac.uryukyu.ie.e215755;

public class Player {
    private String playerNumber;
    private String name;

    public Player(String name){
        System.out.println(name+" インスタンスが生成されました");
        this.name=name;
    }
    String getNumber(){
        return playerNumber;
    }

    String getName(){
        return name;
    }
}