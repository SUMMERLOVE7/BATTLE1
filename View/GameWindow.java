package View;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameWindow extends JFrame {

	private JPanel contentPane;

	JButton btnNewButton = new JButton("");
	
	GameWindow_2 gw2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow frame = new GameWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GameWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to BattleGame!");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Informal Roman", Font.PLAIN, 40));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(12, 10, 380, 57);
		contentPane.add(lblNewLabel);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gw2 == null) {////////////////
					gw2 = new GameWindow_2();
				}
				else {
					gw2.dispose();
					gw2 = new GameWindow_2();
				}
				gw2.setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uC2A4\uD0C0\uD2B8.PNG"));
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Bell MT", Font.PLAIN, 25));
		btnNewButton.setBounds(298, 228, 209, 109);
		contentPane.add(btnNewButton);
		
		JLabel background1 = new JLabel("");
		background1.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uAE30\uBCF8\uD50C\uB808\uC774\uBC30\uACBD.PNG"));
		background1.setBounds(12, 0, 921, 633);
		contentPane.add(background1);
	}
}
