package jp.ac.uryukyu.ie.e215755;
import java.util.*;

public class Player {
    int playerCount=0;
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
        System.out.println(player+"の番です。  カードを引くには <1> を押してください。パスなら<enter>を押してください");
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();
        if(line.isEmpty()){
            ifcontinue = false;
        
        }else if(line.equals("1")){
            System.out.println(gettingCard(list)+"を取得しました");
                    integerChanger(list);
                    System.out.println("現在の合計は"+countPlayersCards()+"です");
            ifcontinue = true;

        }
        return ifcontinue;
        
    }

    boolean ifContinueWithCpu(List<String> list,String player){
        System.out.println("カードを引くには <1> を押してください。<enter>でパス CPUの番になります");
        Scanner scan=new Scanner(System.in);
        String line=scan.nextLine();
        if(line.isEmpty()){
            ifcontinue = false;
        
        }else if(line.equals("1")){
            System.out.println(gettingCard(list)+"を取得しました");
                    integerChanger(list);
                    System.out.println("現在の合計は"+countPlayersCards()+"です");
            ifcontinue = true;

        }
        return ifcontinue;
        
    }


}