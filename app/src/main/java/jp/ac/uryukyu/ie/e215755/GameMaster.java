package jp.ac.uryukyu.ie.e215755;
import java.util.*;

public class GameMaster {
    static int cardOrder=0;

    

    public List<String> preparatioOfCard(){
        
        List<String> list = new ArrayList<>(Arrays.asList(
            "♠1","♠2","♠3","♠4","♠5","♠6","♠7","♠8","♠9","♠10","♠11","♠12",
            "♥1","♥2","♥3","♥4","♥5","♥6","♥7","♥8","♥9","♥10","♥11","♥12",
            "♦1","♦2","♦3","♦4","♦5","♦6","♦7","♦8","♦9","♦10","♦11","♦12",
            "♣1","♣2","♣3","♣4","♣5","♣6","♣7","♣8","♣9","♣10","♣11","♣12"
            ));
        // カードの順番をランダムに入れ替える
        Collections.shuffle(list);
        // System.out.println(list);
        return list;
    }
}
