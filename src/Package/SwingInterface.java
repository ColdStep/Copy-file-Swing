package Package;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;



public class SwingInterface extends ShowFile  {
    
    public static void main(String[] args) throws Exception {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1000,1000);
        JButton button;
        JLabel jLabel = null;
        JLabel jLabel1 = null;


        JLabel label = new JLabel("Копіювання файлу", SwingConstants.CENTER);
        JButton copy = new JButton("Копіювати");

        JFileChooser chooser1 = new JFileChooser("C:/Users/Администратор/Desktop/test");
        JFileChooser chooser2 = new JFileChooser("C:/Users/Администратор/Desktop/test");
        chooser2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        Panel panel1 =new Panel();
        panel1.setLayout(new BorderLayout());
        panel1.add(chooser1, BorderLayout.WEST);
        panel1.add(chooser2, BorderLayout.EAST);

        Panel panel2 = new Panel();
        panel2.setLayout(new BorderLayout());
        panel2.add(label, BorderLayout.NORTH);
        panel2.add(panel1, BorderLayout.CENTER);
        panel2.add(copy, BorderLayout.SOUTH);




            copy.addActionListener(new ActionListener() {
                                       @Override
                                       public void actionPerformed(ActionEvent e) {

                                               File link1 = chooser1.getSelectedFile();
                                               File link2 = chooser2.getCurrentDirectory();

                                                   ShowFile showFile = new ShowFile();
                                                   String link4=showFile.textEdit(link1.toString(),link2.toString());
                                                   File link3 = new File(link4);
                                                   //showFile.Copy(link1.toString(),link3.toString());

                                                Path source = Paths.get(link1.toString());
                                                Path target = Paths.get(link3.toString());

                                               try {
                                                   Files.copy(source, target, REPLACE_EXISTING);
                                                   System.out.println("Complete!!!!");
                                               } catch (IOException e1) {
                                                  e1.printStackTrace();
                                               }

                                           }
            });



        f.add(panel2);

        f.setVisible(true);




    }

    }


