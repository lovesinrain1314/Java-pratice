import javax.swing.*;
import java.awt.*;

public class GuiPractice extends JPanel {

    @Override
    public void paintComponent(Graphics g){
//        //順序會影響成果
//        //
//        ImageIcon img = new ImageIcon("rabbit.jpeg");
//        img.paintIcon(null,g,50,100);

        //橢圓
//        g.drawOval(10,10,20,20);
//        g.drawOval(100,100,20,50);
//        g.drawOval(150,150,50,20);
//        g.fillOval(50,10,50,50);

//        g.drawString("Hello",100,100);
//        g.setColor(Color.RED);
//        g.drawLine(10,10,50,60);
//        g.setColor(Color.BLACK);
//        g.drawRect(20,20,100,20);
//        g.fillRect(100,100,20,30);
        //讓底色大小隨視窗改變
//        int width = getWidth();
//        int height = getHeight();
//        g.setColor(Color.BLACK);
//        g.fillRect(0,0,width,height);
//
//        g.setColor(Color.RED);
//        g.drawLine(50,50,200,200);





    }

    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300,300);
        window.setContentPane(new GuiPractice());
        window.setVisible(true);
    }
}
