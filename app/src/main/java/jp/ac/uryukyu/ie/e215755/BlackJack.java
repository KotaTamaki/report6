package jp.ac.uryukyu.ie.e215755;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
// import java.util.Collections;

public class BlackJack {
    int playerCount=0;
    int contenue;

    private ArrayList<ArrayList<String>> cardList = new ArrayList<>();
    public void makePlayingCards() {
        try {
            File file = new File("cards.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(filereader);
            try {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    ArrayList<String> card = new ArrayList<String>();
                    for (String s : line.split(" ")) {
                        card.add(s);
                    }
                    cardList.add(card);
                }
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    void getCard(){
        
        Random rnd = new Random();

        int number = rnd.nextInt(11) + 1;//12までのトランプをランダムで取得
        playerCount += number;
        System.out.println("最初のカードとして"+playerCount+"のカードをもらいました。");
    }

    void ifContinue(){
        while(true){
            System.out.println("現在の合計は"+playerCount+"です");
            System.out.println("もう一度引きますか？？ (Yes->1) OR (No->2):");
            Scanner scanner2 = new Scanner(System.in);  
            int contenue = scanner2.nextInt(); 
            if(contenue==1){
                Random rnd = new Random();
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

    // public void main(String[] args){
    //     System.out.println(cardList);
    // }

    // void startGame(){
    //     if(nun==1){
    //         while(true){
    //             no1.game();
    //             cpu.game();
    //         }
    //     }else if(nun==2){
            
    //     }else if(nun==3){
            
    //     }else if(nun==4){
            
    // }

    

    
}
