package jp.ac.uryukyu.ie.e215755;
import java.util.*;

public class Cpu{
    int cpuCount=0;//プレイヤーの持つ合計
    public int cardOrder=1;//カードがどこまで引かれたかを記録する
    boolean ifcontinueForCpu=true;
    
    
    public Cpu(){
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

    //山札からカードを一枚とる
    public String gettingCard(List<String> list){
        String num = list.get(cardOrder);
        cardOrder++;
        return num;
    }
    //取得したカードを数値に変換 ex)♥2->2
    int integerChanger(List<String> list){
        int num = Integer.parseInt(list.get(cardOrder-1).substring(1));//リストからカードを取りその番号だけを見る
        cpuCount+=num;
        return num;
    }

    int countPlayersCards(List<String> list){
        return cpuCount;
        
    }

    
    public boolean ifend(){
        return ifcontinueForCpu;
    }


    //引く動作の可否に関してを決める
    public boolean ifContinueForCpu(List<String> list){
        if(ifcontinueForCpu==true){
            //合計が14より大きかった場合、1/2の確率で引く
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
                    System.out.println("cpuがパスしました");
                }
            }else{
                System.out.println("CPUも引きました");
                gettingCard(list);
                integerChanger(list);
            }
        }
        return ifcontinueForCpu;
            
    }

    
    
}
