package jp.ac.uryukyu.ie.e215755;
import java.util.*;

public class Main{
    //playerの人数設定
    static int createMember(){
        System.out.println("ゲームする人数を入力してください ex) 1..2.. :");
        Scanner sc = new Scanner(System.in);  //Scannerで初期化
        int numberPlayer = sc.nextInt();  //文字列の入力の受け取り
        return numberPlayer;
    }
    //botの数指定
    static int createBot(){
        System.out.println("Botの数を入力してください ex) 1..2.. :");
        Scanner sc1 = new Scanner(System.in);  //Scannerで初期化
        int numberBot = sc1.nextInt();  //文字列の入力の受け取り
        return numberBot;
    }



    
    public static void main(String args[]){
        
        // for(int i=1; i>=createMember(); i++){
        //     System.out.println("名前を入力してください:");
        //     Scanner sc2 = new Scanner(System.in);  //Scannerで初期化
        //     String name = sc2.nextLine();
        //     Player name = new Player(); 
        //     System.out.print(i);
        // }

        // String[] men ={"hanako","tarou"};
        // for(String me:men){
        //     Player me  =new Player();
        // }
        int nun = createMember();


        String[] men ={"Player1","Player2","Player3","Player4"};

        if(nun==1){
            Player no1 = new Player(men[0]);
        }else if(nun==2){
            Player no1 = new Player(men[0]);
            Player no2 = new Player(men[1]);
        }else if(nun==3){
            Player no1 = new Player(men[0]);
            Player no2 = new Player(men[1]);
            Player no3 = new Player(men[2]);
        }else if(nun==4){
            Player no1 = new Player(men[0]);
            Player no2 = new Player(men[1]);
            Player no3 = new Player(men[2]);
            Player no4 = new Player(men[3]);
        }

        BlackJack bl = new BlackJack();
        bl.game();
    } 
    

}
   