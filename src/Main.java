import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog("Введите имя: ");
        if (word != null){
            JOptionPane.showMessageDialog(null,"Вы ввели имя " + word);
        }






    }
}