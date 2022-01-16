package jp.ac.uryukyu.ie.e215755;
import java.util.*;

public class BlackJack {
    int playerCount=0;
    boolean contenue=true;
    static int cardOrder=0;
    
    
    public void gameStart(int joinNumber){

        GameMaster gameMaster = new GameMaster();
        List<String> cardsList=gameMaster.preparatioOfCard();


        if(joinNumber==1){
            Cpu cpu = new Cpu();
            Player no1 = new Player("Player1");
            do{
                if(no1.ifContinue(cardsList)){
                    System.out.println(no1.gettingCard(cardsList)+"を取得しました");
                    no1.integerChanger(cardsList);
                    System.out.println("現在の合計は"+no1.countPlayersCards()+"です");
                    
                    if(!no1.judge()){
                        System.out.println("あなたの負け");
                        break;
                    }
                }

                if(cpu.ifContinueForCpu(cardsList)){
                    cpu.gettingCard(cardsList);
                    cpu.integerChanger(cardsList);
                        if(!cpu.judge()){
                            System.out.println("cpuの負け");
                            break;
                        }
                }
            }while(cpu.ifend()==true);
            System.out.println("player"+no1.playerCount);
            System.out.println("cpu"+cpu.cpuCount);
            System.out.print(no1.playerCount+"対"+cpu.cpuCount);  
        }
    
    }
    

    
}
