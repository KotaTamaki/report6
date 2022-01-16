package jp.ac.uryukyu.ie.e215755;
import java.util.*;

public class Player {
    int playerCount=0;
    boolean contenue=true;
    static int cardOrder=0;
    private String name;
    boolean ifcontinue;

    Player(String name){
        System.out.println(name+" が参加しました");
        this.name=name;
    }

    String getName(){
        return name;
    }

    int getCount(){
        return playerCount;
    }

    boolean judge(){
        if(playerCount>21){
            return false;
        }else{
            return true;
        }
    }

    String gettingCard(List<String> list){
        String num = list.get(cardOrder);
        cardOrder++;
        return num;
    }

    int integerChanger(List<String> list){
        int num = Integer.parseInt(list.get(cardOrder-1).substring(1));//リストからカードを取りその番号だけを見る
        playerCount+=num;
        return num;
    }

    public int countPlayersCards(){
        return playerCount;
        
    }

    public boolean ifend(){
        return ifcontinue;
    }

    boolean ifContinue(List<String> list,String player){
        System.out.println(player+"の番です。  カードを引くには <1> を押してください。次の人に行くのは<enter>");
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();
        if(line.isEmpty()){
            System.out.print("\033[H\033[2J");//コンソールをクリアするコマンド
            line=scan.nextLine();
            ifcontinue = false;
        
        }else if(line.equals("1")){
            ifcontinue = true;

        }
        return ifcontinue;
        
    }


}