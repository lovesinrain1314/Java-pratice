import javax.swing.*;
import java.awt.*;

public class LoopLab extends JPanel{
    String type;
    int n;

    public LoopLab(){
        type = JOptionPane.showInputDialog("Do you want an addition table or multiplication talbe?(A or M)");
        n = Integer.parseInt(JOptionPane.showInputDialog("How big table size do you want?"));
    }

    @Override
    public void paintComponent(Graphics g){
        int w = getWidth();
        int h = getHeight();
        int gridWidth = w/n;
        int gridHeight = h/n;


        for (int i=1;i<n+1;i++){
            for (int j=1;j<n+1;j++){
                g.drawRect((i-1)*gridWidth,(j-1)*gridHeight,gridWidth,gridHeight);
                if (i==1 || j==1){
                    g.setColor(Color.YELLOW);
                    g.fillRect((i-1)*gridWidth,(j-1)*gridHeight,gridWidth,gridHeight);
                }
                g.setColor(Color.BLACK);
                if (i==1)
                    g.drawString(""+j,(i-1)*gridWidth+5,(j-1)*gridHeight+20);
                else if (j==1)
                    g.drawString(""+i,(i-1)*gridWidth+5,(j-1)*gridHeight+20);
                else{
                    if (type.toLowerCase().equals("m"))
                        g.drawString(""+(i*j),(i-1)*gridWidth+5,(j-1)*gridHeight+20);
                    else
                        g.drawString(""+(i+j),(i-1)*gridWidth+5,(j-1)*gridHeight+20);
                }
            }
        }

    }

    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,400);
        window.setContentPane(new LoopLab());
        window.setVisible(true);
    }

}









//public class LoopLab extends JPanel{
//
//    @Override
//    public void paintComponent(Graphics g){
//        //user input
//        String type = JOptionPane.showInputDialog("Do you want an addition table or multiplication table? (A or M)");
//        int n = Integer.parseInt(String.valueOf(JOptionPane.showInputDialog("How big do you want table to be?")));
//
//        int x=10, y=15;
//        for (int i=1;i<n+2;i++){
//            for(int j=1;j<n+2;j++){
//                if (i==1 || j==1) {
//                    g.setColor(Color.YELLOW);
//                    g.fillRect((i-1)*30,(j-1)*30,30,30);
//                }
//                g.setColor(Color.BLACK);
//                if (i==1) {
//                    g.drawString(String.valueOf(j), x + 30 * (i - 1), y + 30 * (j - 1));
//                }
//                else if (j==1) {
//                    g.drawString(String.valueOf(i), x + 30 * (i - 1), y + 30 * (j - 1));
//                }
//                else {
//                    g.drawString(String.valueOf((i)*(j)),x+30*(i-1),y+30*(j-1));
//                }
//                g.drawLine(30*(i-1),0,30*(i-1),300);
//                g.drawLine(0,30*(j-1),300,30*(j-1));
//
//            }
//        }
//    }
//
//
//
//
//    public static void main(String[] args){
//
//        JFrame window = new JFrame();
//        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        window.setSize(300,300);
//        window.setContentPane(new LoopLab());
//        window.setVisible(true);
//
//    }
//}
