package jp.ac.uryukyu.ie.e215755;

import java.util.*;

public class BlackJack {
    int playerCount=0;
    int contenue;

    
    void game(){
        
        Random rnd = new Random();

        int number = rnd.nextInt(11) + 1;//12までのトランプをランダムで取得
        playerCount += number;
        System.out.println("最初のカードとして"+playerCount+"のカードをもらいました。");
        
        while(true){
            System.out.println("現在の合計は"+playerCount+"です");
            System.out.println("もう一度引きますか？？ (Yes->1) OR (No->2):");
            Scanner scanner2 = new Scanner(System.in);  
            int contenue = scanner2.nextInt(); 
            if(contenue==1){
                int num = rnd.nextInt(11) + 1;//12までのトランプをランダムで取得
                playerCount += num;
                System.out.println(num+"のカード引きました。");

                if(playerCount>21){
                    System.out.println("21を超えたのでgameoverです");
                    break;
                }


            }else{
                break;
            }
        }

        System.out.println(playerCount+"で上がります。");
          
        
    }

    

    
}
