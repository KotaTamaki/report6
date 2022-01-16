package jp.ac.uryukyu.ie.e215755;
import java.util.*;

public class Main{
    //playerの人数設定
    static int createMember(){
        System.out.println("ゲームする人数を入力してください ex) 1..2.. :");
        System.out.println("1人を選択した場合コンピューターとの対戦となります");
        Scanner sc = new Scanner(System.in);  //Scannerで初期化
        int numberPlayer = sc.nextInt();  //文字列の入力の受け取り
        return numberPlayer;
    }
    public static void main(String args[]){

        BlackJack bl = new BlackJack();
        bl.gameStart(createMember());

    } 
    

}
   