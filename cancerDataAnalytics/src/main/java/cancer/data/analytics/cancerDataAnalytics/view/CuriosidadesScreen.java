package cancer.data.analytics.cancerDataAnalytics.view;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuriosidadesScreen {
    public static void showCuriosidades() {
        JFrame frame = new JFrame("Curiosidades");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton curiosidade1Button = new JButton("Curiosidade 1");
        JButton curiosidade2Button = new JButton("Curiosidade 2");
        JButton curiosidade3Button = new JButton("Curiosidade 3");

        curiosidade1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Texto da Curiosidade 1");
            }
        });

        curiosidade2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Texto da Curiosidade 2");
            }
        });

        curiosidade3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Texto da Curiosidade 3");
            }
        });

        frame.add(curiosidade1Button);
        frame.add(curiosidade2Button);
        frame.add(curiosidade3Button);

        frame.pack();
        frame.setVisible(true);
    }
}
