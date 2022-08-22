import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        this.setResizable(false);
        this.pack();//if window is resized then components inside window should be resized
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
