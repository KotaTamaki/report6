package jp.ac.uryukyu.ie.e215755;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BattleTestForCpu {
    static int cardOrder=0;
    int cpuCount=0;

    @Test
    void TestCpu(){
        GameMaster gameMaster = new GameMaster();
        List<String> list =gameMaster.preparatioOfCardForTest();
    
        Cpu cpu = new Cpu();

        cpu.gettingCard(list);
        cpu.integerChanger(list);

        assertEquals(1,cpu.cpuCount);

    }

    
}