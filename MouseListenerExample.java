

import com.sun.webkit.graphics.GraphicsDecoder;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.ImageIcon;
public class MouseListenerExample extends WindowAdapter implements MouseListener {  
    Label l;  
    Frame f;
    Graphics g;
     ImageIcon img;
    MouseListenerExample(){  
        
        f=new Frame();
        f.addMouseListener(this);  
          
        l=new Label();  
        l.setBounds(20,50,100,20);  
        f.add(l);  
        f.addMouseListener(this);
        f.addWindowListener(this);
      
        
       
      
        
          f.setSize(600,700);  
        f.setLayout(null);  
        f.setVisible(true);  
       
    }  
    public void paint(Graphics g){
          img =new ImageIcon("one.jpg");
         f.paint(g);
        g.drawImage(img.getImage(), 0, 0,f);
        
        //f.add(img);
    }
    public void mouseClicked(MouseEvent e) { 
        f.setBackground(Color.PINK);
        
        l.setText("Mouse Clicked");  
    }  
    public void mouseEntered(MouseEvent e) {  
        
        f.setBackground(Color.yellow);
        l.setText("Mouse Entered");  
    }  
    public void mouseExited(MouseEvent e) {
        f.setBackground(Color.RED);
        l.setText("Mouse Entered");  
        l.setText("Mouse Exited");  
    }  
    public void mousePressed(MouseEvent e) {  
        
        
        l.setText("Mouse Pressed");  
    }  
    public void mouseReleased(MouseEvent e) {  
        l.setText("Mouse Released");  
    }  
     public void windowClosing(WindowEvent e)
    {  
        System.exit(0);
    }
public static void main(String[] args) {  
   MouseListenerExample m= new MouseListenerExample();  
}  
}  