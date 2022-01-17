package jp.ac.uryukyu.ie.e215755;
import java.util.*;

public class Main{
    public static void main(String args[]){
        System.out.println("ゲームする人数を入力してください ex) 1..2...4 :");
        System.out.println("1人を選択した場合コンピューターとの対戦となります");
        Scanner sc = new Scanner(System.in);  //Scannerで初期化
        int numberPlayer = sc.nextInt();  //文字列の入力の受け取り
        BlackJack bl = new BlackJack();
        
        if(numberPlayer==1){
            bl.gameStartWith1();
        }else if(numberPlayer==2){
            bl.gameStartWith2();
        }else if(numberPlayer==3){
            bl.gameStartWith3();
        }else if(numberPlayer==4){
            bl.gameStartWith4();
        }
    } 
    

}
   