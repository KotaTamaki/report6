package jp.ac.uryukyu.ie.e215755;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BattleTestForPlayer {
    int playerCount=0;
    static int cardOrder=0;
    int cpuCount=0;

    @Test
    void TestPlayer(){
        GameMaster gameMaster = new GameMaster();
        List<String> list =gameMaster.preparatioOfCardForTest();
    
        Player no1 = new Player("Player1");

        no1.gettingCard(list);
        no1.integerChanger(list);

        assertEquals(1,no1.playerCount);

    }

    
}
