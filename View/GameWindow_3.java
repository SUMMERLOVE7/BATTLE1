package View;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Weapon.*;
import Player.*;
import MyInterface.*;


public class GameWindow_3 extends JFrame {

	private JPanel contentPane;
	JButton bow = new JButton("");
	JButton rock = new JButton("");
	JButton gun = new JButton("");
	JButton hammer = new JButton("");
	JButton shield = new JButton("");
	
	Weapon weapon;
	private final JButton btnNewButton = new JButton("\uB2EB\uAE30");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow_3 frame = new GameWindow_3();
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
	public GameWindow_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uBB34\uAE30\uACE0\uC5D0 \uC624\uC2E0 \uAC78 \uD658\uC601\uD569\uB2C8\uB2E4 ");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("DX시인과나", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(37, 34, 582, 69);
		contentPane.add(lblNewLabel_1);
		shield.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				System.out.println("Select Shield as weapon");
				weapon = new Shield();
				dispose();
			}
		});
		
		
		shield.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uBC29\uD3281.png"));
		shield.setBounds(577, 127, 206, 171);
		contentPane.add(shield);
		hammer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Select Hammer as weapon");
				weapon = new Hammer();
				dispose();
			}
		});
		
		
		hammer.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uBB20\uB2C8\uB9742.png"));
		hammer.setBounds(318, 127, 200, 200);
		contentPane.add(hammer);
		gun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Select Gun as weapon");
				weapon = new Gun();		
				dispose();
			}
		});
		
		
		gun.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uCD1D1.png"));
		gun.setBounds(58, 370, 200, 148);
		contentPane.add(gun);
		rock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				weapon = new Rock();					
				dispose();
			}
		});
		
	
		rock.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uBC14\uC704.png"));
		rock.setBounds(577, 327, 206, 191);
		contentPane.add(rock);
		
	
		bow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				weapon = new Bow();		
				dispose();
			}
		});
		bow.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uD65C.png"));
		bow.setBounds(58, 127, 200, 171);
		contentPane.add(bow);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
		btnNewButton.setBounds(362, 442, 156, 76);
		
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uBB34\uAE30\uACE0big.PNG"));
		lblNewLabel.setBounds(0, 0, 863, 617);
		contentPane.add(lblNewLabel);
	}
}
