package jp.ac.uryukyu.ie.e215755;
import java.util.*;

public class BlackJack {
    static int cardOrder=0;
    boolean ifcontinue;
    boolean ifcontinueForCpu;

    //次の人に行く前にコンソールをクリアしておく
    public void nextPlayer(){
        System.out.println("<enter>を押して次の人へ");
                    Scanner scan=new Scanner(System.in);
                    String line=scan.nextLine();
                    if(line.isEmpty()){
                        System.out.print("\033[H\033[2J");//コンソールをクリアするコマンド
                    }
    }
    
    //1人でプレーするためのメソッド
    public void gameStartWith1(){
        GameMaster gameMaster = new GameMaster();
        List<String> cardsList=gameMaster.preparatioOfCard();
            Cpu cpu = new Cpu();
            Player no1 = new Player("Player1");
            do{
                if(no1.ifContinueWithCpu(cardsList,"Player1")){               
                    if(!no1.judge()){
                        System.out.println("あなたの負け");
                        break;
                    }
                }
                if(cpu.ifContinueForCpu(cardsList)){             
                    if(!cpu.judge()){
                        System.out.println("cpuの負け");
                        break;
                    }
                }
            }while(no1.ifend()==true||cpu.ifend()==true);
            System.out.println(" 21以下で合計が高い人が勝ち");
            System.out.println("playerは"+no1.playerCount);
            System.out.println("cpuは"+cpu.cpuCount);
    }

    //2人でプレーするためのメソッド
    public void gameStartWith2(){
        Player no1 = new Player("Player1");
        Player no2 = new Player("Player2");
        GameMaster gameMaster = new GameMaster();
        List<String> cardsList=gameMaster.preparatioOfCard();
        do{
            if(no1.ifContinue(cardsList,"player1")){ 
                if(!no1.judge()){
                    System.out.println("あなたの負け");
                    break;
                }
                nextPlayer();   
            }
            if(no2.ifContinue(cardsList,"player2")){           
                if(!no2.judge()){
                    System.out.println("Player2の負け");
                    break;
                }
                nextPlayer();
            }
        }while(no1.ifend()==true || no2.ifend()==true);
        System.out.println(" 21以下で合計が高い人が勝ち");
        System.out.println("player1は"+no1.playerCount);
        System.out.println("player2は"+no2.playerCount);
        }

    //3人でプレーするためのメソッド
    public void gameStartWith3(){
        Player no1 = new Player("Player1");
        Player no2 = new Player("Player2");
        Player no3 = new Player("Player3");
        GameMaster gameMaster = new GameMaster();
        List<String> cardsList=gameMaster.preparatioOfCard();
        do{
            if(no1.ifContinue(cardsList,"player1")){              
                if(!no1.judge()){
                    System.out.println("あなたの負け");
                    break;
                }
                nextPlayer();
            }
            if(no2.ifContinue(cardsList,"player2")){      
                if(!no2.judge()){
                    System.out.println("Player2の負け");
                    break;
                }
                nextPlayer();
            }
            if(no3.ifContinue(cardsList,"player3")){
                if(!no3.judge()){
                    System.out.println("player3の負け");
                    break;
                }
                nextPlayer();
            }
        }while(no1.ifend()==true || no2.ifend()==true || no3.ifend()==true);
        System.out.println(" 21以下で合計が高い人が勝ち");
        System.out.println("player1は"+no1.playerCount);
        System.out.println("player2は"+no2.playerCount);
        System.out.println("player3は"+no3.playerCount);
    }  

    //4人でプレーするためのメソッド
    public void gameStartWith4(){      
        Player no1 = new Player("Player1");
        Player no2 = new Player("Player2");
        Player no3 = new Player("Player3");
        Player no4 = new Player("Player4");
        GameMaster gameMaster = new GameMaster();
        List<String> cardsList=gameMaster.preparatioOfCard();
        do{
            if(no1.ifContinue(cardsList,"player1")){
                if(!no1.judge()){
                    System.out.println("player1の負け");
                    break;
                }
                nextPlayer();
            }
            if(no2.ifContinue(cardsList,"player2")){    
                if(!no2.judge()){
                    System.out.println("Player2の負け");
                    break;
                }
                nextPlayer();
            }
            if(no3.ifContinue(cardsList,"player3")){    
                if(!no3.judge()){
                    System.out.println("player3の負け");
                    break;
                }
                nextPlayer();
            }
            if(no4.ifContinue(cardsList,"player4")){     
                if(!no4.judge()){
                    System.out.println("player4の負け");
                    break;
                }
                nextPlayer();        
            }
        }while(no1.ifend()==true || no2.ifend()==true || no3.ifend()==true || no4.ifend()==true);
        System.out.println(" 21以下で合計が高い人が勝ち");
        System.out.println("player1は"+no1.playerCount);
        System.out.println("player2は"+no2.playerCount);
        System.out.println("player3は"+no3.playerCount);
        System.out.println("player4は"+no4.playerCount);
    }
    
    
}
     
