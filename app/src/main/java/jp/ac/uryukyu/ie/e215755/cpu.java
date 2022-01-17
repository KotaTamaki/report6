package jp.ac.uryukyu.ie.e215755;
import java.util.*;

public class Cpu{
    
    int cpuCount=0;
    static int cardOrder=0;
    boolean ifcontinueForCpu=true;
    
    
    Cpu(){
        System.out.println("cpuと対決します");
    }

    int getCount(){
        return cpuCount;
    }

    boolean judge(){
        if(cpuCount>21){
            return false;
        }else{
            return true;
        }
    }


    int gettingCard(List<String> list){
        int num = Integer.parseInt(list.get(cardOrder).substring(1));//リストからカードを取りその番号だけを見る
        cardOrder++;
        return num;
    }

    int countPlayersCards(List<String> list){
        return cpuCount;
        
    }

    
    public boolean ifend(){
        return ifcontinueForCpu;
    }

    boolean ifContinueForCpu(List<String> list){
        if(ifcontinueForCpu==true){
            if(countPlayersCards(list)>14){
                Random random = new Random();
                int randomValue = random.nextInt(1);
                if(randomValue==1){
                    System.out.println("CPUも引きました");
                    gettingCard(list);
                    integerChanger(list);
                    ifcontinueForCpu = true;
                    
                }else{
                    ifcontinueForCpu = false;
                    System.out.println("cpuがチェックしました");
                }
            }else{
                System.out.println("CPUも引きました");
                gettingCard(list);
                integerChanger(list);
            }
        }
        return ifcontinueForCpu;
            
    }

    int integerChanger(List<String> list){
        int num = Integer.parseInt(list.get(cardOrder-1).substring(1));//リストからカードを取りその番号だけを見る
        cpuCount+=num;
        return num;
    }
    
}
