package jp.ac.uryukyu.ie.e215755;

import java.util.*;

public class BlackJack {
    //playerの人数設定
    public static void createMember(){
        System.out.println("ゲームする人数を入力してください ex) 1..2.. :");
        Scanner scanner = new Scanner(System.in);  //Scannerで初期化
        int numberPlayer = scanner.nextInt();  //文字列の入力の受け取り
        System.out.println(numberPlayer);
    }
    //botの数指定
    public static void createBot(){
        System.out.println("Botの数を入力してください ex) 1..2.. :");
        Scanner scanner1 = new Scanner(System.in);  //Scannerで初期化
        int numberBot = scanner1.nextInt();  //文字列の入力の受け取り
        System.out.println(numberBot);
    }

    
    
    
}
