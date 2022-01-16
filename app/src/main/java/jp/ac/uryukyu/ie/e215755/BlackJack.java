package jp.ac.uryukyu.ie.e215755;
import java.util.*;

public class BlackJack {
    int playerCount=0;
    boolean contenue=true;
    static int cardOrder=0;
    boolean ifcontinue;
    boolean ifcontinueForCpu=true;
    
    
    public void gameStart(int joinNumber){

        GameMaster gameMaster = new GameMaster();
        List<String> cardsList=gameMaster.preparatioOfCard();


        if(joinNumber==1){
            Cpu cpu = new Cpu();
            Player no1 = new Player("Player1");
            do{
                if(no1.ifContinue(cardsList,"player1")){
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
            }while(no1.ifend()==true||cpu.ifend()==true);
            System.out.println("player"+no1.playerCount);
            System.out.println("cpu"+cpu.cpuCount);
            System.out.print(no1.playerCount+"対"+cpu.cpuCount);  


        }else if(joinNumber==2){
            Player no1 = new Player("Player1");
            Player no2 = new Player("Player2");
            do{
                if(no1.ifContinue(cardsList,"player1")){
                    System.out.println(no1.gettingCard(cardsList)+"を取得しました");
                    no1.integerChanger(cardsList);
                    System.out.println("現在の合計は"+no1.countPlayersCards()+"です");
                    
                    if(!no1.judge()){
                        System.out.println("あなたの負け");
                        break;
                    }
                    System.out.println("<enter>を押して次に人へ");
                    Scanner scan=new Scanner(System.in);
                    String line=scan.nextLine();
                    if(line.isEmpty()){
                        System.out.print("\033[H\033[2J");//コンソールをクリアするコマンド
                    }
                }

                if(no2.ifContinue(cardsList,"player2")){
                    System.out.println(no2.gettingCard(cardsList)+"を取得しました");
                    no2.integerChanger(cardsList);
                    System.out.println("現在の合計は"+no2.countPlayersCards()+"です");
                    
                    if(!no2.judge()){
                        System.out.println("Player2の負け");
                        break;
                    }
                    System.out.println("<enter>を押して次に人へ");
                    Scanner scan1=new Scanner(System.in);
                    String line1=scan1.nextLine();
                    if(line1.isEmpty()){
                        System.out.print("\033[H\033[2J");//コンソールをクリアするコマンド
                    }
                }
            }while(no1.ifend()==true || no2.ifend()==true);
            System.out.println("playerは"+no1.playerCount);
            System.out.println("player2は"+no2.playerCount);
            System.out.print(no1.playerCount+"対"+no2.playerCount);  
        }else if(joinNumber==3){
            Player no1 = new Player("Player1");
            Player no2 = new Player("Player2");
            Player no3 = new Player("Player3");
            do{
                if(no1.ifContinue(cardsList,"player1")){
                    System.out.println(no1.gettingCard(cardsList)+"を取得しました");
                    no1.integerChanger(cardsList);
                    System.out.println("現在の合計は"+no1.countPlayersCards()+"です");
                    
                    if(!no1.judge()){
                        System.out.println("あなたの負け");
                        break;
                    }
                    System.out.println("<enter>を押して次に人へ");
                    Scanner scan=new Scanner(System.in);
                    String line=scan.nextLine();
                    if(line.isEmpty()){
                        System.out.print("\033[H\033[2J");//コンソールをクリアするコマンド
                    }
                }

                if(no2.ifContinue(cardsList,"player2")){
                    System.out.println(no2.gettingCard(cardsList)+"を取得しました");
                    no2.integerChanger(cardsList);
                    System.out.println("現在の合計は"+no2.countPlayersCards()+"です");
                    
                    if(!no2.judge()){
                        System.out.println("Player2の負け");
                        break;
                    }
                    System.out.println("<enter>を押して次に人へ");
                    Scanner scan1=new Scanner(System.in);
                    String line1=scan1.nextLine();
                    if(line1.isEmpty()){
                        System.out.print("\033[H\033[2J");//コンソールをクリアするコマンド
                    }
                }

                if(no3.ifContinue(cardsList,"player3")){
                    System.out.println(no3.gettingCard(cardsList)+"を取得しました");
                    no3.integerChanger(cardsList);
                    System.out.println("現在の合計は"+no3.countPlayersCards()+"です");
                    
                    if(!no3.judge()){
                        System.out.println("player3の負け");
                        break;
                    }
                    System.out.println("<enter>を押して次に人へ");
                    Scanner scan2=new Scanner(System.in);
                    String line2=scan2.nextLine();
                    if(line2.isEmpty()){
                        System.out.print("\033[H\033[2J");//コンソールをクリアするコマンド
                    }
                }
            }while(no1.ifend()==true || no2.ifend()==true || no3.ifend()==true);
            System.out.println("player1は"+no1.playerCount);
            System.out.println("player2は"+no2.playerCount);
            System.out.println("player3は"+no3.playerCount);
             

        }
    
    }
    

    
}
