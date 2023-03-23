import javax.swing.*;
import java.util.Locale;

public class VaccineSearch {

    public static void main(String[] args){
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(AZ,BNT,Moderna,Jassen):");
        vaccine.toLowerCase();

        if(vaccine.equals("az")){
            JOptionPane.showMessageDialog(null,"AZ\n研發國：英國\n疫苗種類：");
        }
        else if(vaccine.equals("bnt")){
            JOptionPane.showMessageDialog(null,"AZ\n研發國：德國\n疫苗種類：");
        }else if(vaccine.equals("moderna")){
            JOptionPane.showMessageDialog(null,"AZ\n研發國：德國與美國\n疫苗種類：");
        }else if(vaccine.equals("jassen")){
            JOptionPane.showMessageDialog(null,"AZ\n研發國：美國與比利時\n疫苗種類：");
        }else{
            JOptionPane.showMessageDialog(null,"查詢不到疫苗，請重新輸入");
        }

    }
}
