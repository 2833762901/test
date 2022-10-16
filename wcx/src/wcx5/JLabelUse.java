package wcx5;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


class JLabelUse {
    public JLabelUse() {
   
        JPanel jPanel = new JPanel();


        // 只显示图片的标签
        JLabel imgLabel = new JLabel(new ImageIcon("bj.jpg"));
        jPanel.add(imgLabel);

    }
}

