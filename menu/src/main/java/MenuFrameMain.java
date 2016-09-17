import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/15.
 */
public class MenuFrameMain {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new MenuFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Menu Frame Main");
            frame.setSize(400, 300);
            frame.setVisible(true);
        });
    }
}
