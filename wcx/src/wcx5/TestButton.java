package wcx5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

interface addActionListener {
	void actionPerformed(ActionEvent e);
}

public class TestButton {
    public static void main(String[] args) {
        Frame frame = new Frame("Flow Layout");
        frame.setLayout(new FlowLayout());
        Button button1 = new Button("������-�ӳ��������ϵ�ṹ");
        Button button2 = new Button("������������ϵ�ṹ");
        Button button3 = new Button("�¼�ϵͳ�����ϵ�ṹ");
        Button button4 = new Button("�ܵ�-���������ϵ�ṹ");
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.setSize(2000, 1000);
        frame.setVisible(true);
        //�����¼�������
        button1.addActionListener(new ButtonHandler1());
        button2.addActionListener(new ButtonHandler2());
        button3.addActionListener(new ButtonHandler3());
        button4.addActionListener(new ButtonHandler4());
    }
}

class ButtonHandler1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
    	 String pathname = "E:\\output.txt";
         
         try (FileReader reader = new FileReader(pathname);
              BufferedReader br = new BufferedReader(reader) 
         ) {
             String line;
            
             while ((line = br.readLine()) != null) {
               
                 System.out.println(line);
             }
         } catch (IOException e1) {
             e1.printStackTrace();
         }
    }
}
class ButtonHandler2 implements ActionListener{
	 @Override
	    public void actionPerformed(ActionEvent e) {
	    	 String pathname = "E:\\output.txt"; 
	         
	         try (FileReader reader = new FileReader(pathname);
	              BufferedReader br = new BufferedReader(reader) 
	         ) {
	             String line;
	             
	             while ((line = br.readLine()) != null) {
	                
	                 System.out.println(line);
	             }
	         } catch (IOException e1) {
	             e1.printStackTrace();
	         }
	    }
}
class ButtonHandler3 implements ActionListener{
	 @Override
	    public void actionPerformed(ActionEvent e) {
	    	 String pathname = "E:\\output.txt"; 
	         
	         try (FileReader reader = new FileReader(pathname);
	              BufferedReader br = new BufferedReader(reader)
	         ) {
	             String line;
	           
	             while ((line = br.readLine()) != null) {
	             
	                 System.out.println(line);
	             }
	         } catch (IOException e1) {
	             e1.printStackTrace();
	         }
	    }
}
class ButtonHandler4 implements ActionListener{
	 @Override
	    public void actionPerformed(ActionEvent e) {
	    	 String pathname = "E:\\output.txt"; 
	         
	         try (FileReader reader = new FileReader(pathname);
	              BufferedReader br = new BufferedReader(reader) 
	         ) {
	             String line;
	           
	             while ((line = br.readLine()) != null) {
	               
	                 System.out.println(line);
	             }
	         } catch (IOException e1) {
	             e1.printStackTrace();
	         }
	    }
}
