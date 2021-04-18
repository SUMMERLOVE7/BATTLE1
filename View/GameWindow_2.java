package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Player.*;
import Weapon.*;
import MyInterface.*;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JProgressBar;

public class GameWindow_2 extends JFrame {

	private JPanel contentPane;
	JButton 랜덤플레이어 = new JButton("");
	JButton 무기고1 = new JButton("");
	JButton 무기고2 = new JButton("");
	JButton 공격1 = new JButton("");
	JButton 공격2 = new JButton("");
	JButton 특수공격1 = new JButton("");
	JButton 특수공격2 = new JButton("");
	JLabel 플레이어2 = new JLabel("");
	JLabel 플레이어1 = new JLabel("");
	JTextArea textArea = new JTextArea();
	JProgressBar progressBar1 = new JProgressBar();
	JProgressBar progressBar2 = new JProgressBar();
	
	GameWindow_3 gw3;
	Player player1;
	Player player2;
	Player player = new Player();
	Weapon wp;
	//String []p = {"헐크", "호크아이", "블랙위도우", "캡틴아메리카", "토르"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow_2 frame = new GameWindow_2();
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
	public GameWindow_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		플레이어1.setVerticalAlignment(SwingConstants.TOP);	
		플레이어1.setBounds(16, 89, 267, 207);
		플레이어1.setForeground(Color.BLACK);
		플레이어1.setBackground(Color.BLACK);
		contentPane.add(플레이어1);
		
		플레이어2.setVerticalAlignment(SwingConstants.TOP);	
		플레이어2.setBounds(616, 89, 256, 207);
		플레이어2.setForeground(Color.BLACK);
		플레이어2.setBackground(Color.BLACK);
		contentPane.add(플레이어2);
		
		랜덤플레이어.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooseplayer();
				progressBar1.setMaximum(player1.gethp());
				progressBar2.setMaximum(player2.gethp());
				progressBar1.setValue(player1.gethp());
				progressBar2.setValue(player2.gethp());
				textArea.append("player1 : "+player1.name+"\n");
				textArea.append("player2 : "+player2.name+"\n");	
				textArea.append("무기를 먼저 정해주십시오\n");
				textArea.append("만약 무기사용이 불가하다면 공격실패로 target의 hp유지\n");
				textArea.append("------------------------------------------------\n");

				System.out.println("player1 : "+player1.name);
				System.out.println("plyaer2 : "+player2.name);
				System.out.println("-----------------------------------------");
				player1.show();
				player2.show();
				System.out.println("무기를 먼저 정해주십시오");
			}
		});
		랜덤플레이어.setBounds(314, 168, 267, 94);	
		랜덤플레이어.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uBC84\uD2BC2\uB2E4\uC2DC.PNG"));
		랜덤플레이어.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 20));
		contentPane.add(랜덤플레이어);
		
		무기고1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player = player1;
				
				if(gw3 == null) {					
					gw3 = new GameWindow_3();
				}
				else {
					gw3.dispose();					
					gw3 = new GameWindow_3();
				}
				gw3.setVisible(true);
				System.out.println("무기고로 이동");
			}
		});
		무기고1.setBounds(55, 344, 210, 86);				
		무기고1.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uBB34\uAE30\uACE0\uBC84\uD2BC.PNG"));
		contentPane.add(무기고1);
		
		무기고2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player = player2;
				
				if(gw3 == null) {				
					gw3 = new GameWindow_3();
				}
				else {
					gw3.dispose();
					
					gw3 = new GameWindow_3();
				}
				gw3.setVisible(true);
				System.out.println("무기고로 이동");
			}
		});
		무기고2.setBounds(632, 344, 210, 86);	
		무기고2.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uBB34\uAE30\uACE0\uBC84\uD2BC.PNG"));
		contentPane.add(무기고2);
		
		공격2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int power = player2.getPower();
				int value = progressBar1.getValue() - power;
				
				player1.sethp(player1.gethp() - power);
				progressBar1.setValue(player1.gethp());
				textArea.append(player1.name+"에게 단순공격!!\n");
				textArea.append(player1.name+"의 남은 hp : "+player1.gethp()+"\n");
				textArea.append("--------------------------------------------\n");
				
				System.out.println(player1.name+"에게 단순공격");
				System.out.println("-----------------------------------------");
				player1.show();
				player2.show();
				
				if(player1.gethp() <= 0) {
					textArea.append("================게임종료================");
					System.out.println("==================Game Over==================");
				}
			}
		});
		공격2.setBounds(632, 435, 210, 86);
		공격2.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uACF5\uACA9\uD558\uAE30\uBC84\uD2BC.PNG"));
		contentPane.add(공격2);
		
		공격1.setBounds(55, 435, 210, 86);	
		공격1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int power = player1.getPower();
				int value = progressBar2.getValue() - power;
				player2.sethp(player2.gethp() - power);
				progressBar2.setValue(player2.gethp());
				textArea.append(player2.name+"에게 단순공격!!\n");
				textArea.append(player2.name +"의 남은 hp : "+player2.gethp()+"\n");
				textArea.append("--------------------------------------------\n");
				
				System.out.println(player1.name+"에게 단순공격");				
				System.out.println("-----------------------------------------");
				player1.show();
				player2.show();
				
				if(player2.gethp()<=0) {
					textArea.append("================게임종료================");
					System.out.println("==================Game Over==================");
				}
			}
		});
		공격1.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uACF5\uACA9\uD558\uAE30\uBC84\uD2BC.PNG"));
		contentPane.add(공격1);
		
		특수공격1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				wp = gw3.weapon;
				textArea.append(player2.name+"에게"+"특수 공격!!\n");				
				player1.setWeapon(wp);
			    player1.attack(player2);			
				textArea.append(player2.name +"의 남은 hp : "+player2.gethp()+"\n");
				textArea.append("--------------------------------------------\n");
				progressBar2.setValue(player2.gethp());
				
				if(player2.gethp()<= 0) {
					textArea.append("================게임종료================\n");
					System.out.println("==================Game Over==================");
				}
			}
		});
		특수공격1.setBounds(55, 525, 210, 86);		
		특수공격1.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uD2B9\uC218\uACF5\uACA9\uD558\uAE30\uBC84\uD2BC.PNG"));
		contentPane.add(특수공격1);
		
		특수공격2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wp = gw3.weapon;
				textArea.append(player1.name+"에게"+"특수 공격!!\n");
				player2.setWeapon(wp);   
				player2.attack(player1);							
				textArea.append(player1.name+"의 남은 hp : "+player1.gethp()+"\n");
				textArea.append("--------------------------------------------\n");
				progressBar1.setValue(player1.gethp());
				
				if(player1.gethp()<=0) {
					textArea.append("================게임종료================\n");
					System.out.println("==================Game Over==================");
				}
			}
		});
		특수공격2.setBounds(632, 525, 210, 86);		
		특수공격2.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uD2B9\uC218\uACF5\uACA9\uD558\uAE30\uBC84\uD2BC.PNG"));
		contentPane.add(특수공격2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(66, 20, 750, 59);
		lblNewLabel.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uAE30\uBCF8\uBA54\uC138\uC9C0\uB2E4\uC2DC.PNG"));
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(295, 322, 304, 282);
		contentPane.add(scrollPane);
		
		scrollPane.setViewportView(textArea);
		progressBar1.setForeground(Color.GREEN);
		progressBar1.setBackground(Color.GRAY);		
		progressBar1.setBounds(12, 301, 271, 33);
		contentPane.add(progressBar1);
		progressBar2.setForeground(Color.GREEN);
		progressBar2.setBackground(Color.GRAY);		
		progressBar2.setBounds(603, 301, 269, 33);
		contentPane.add(progressBar2);
		
		JLabel 배경 = new JLabel("");
		배경.setBounds(0, 0, 924, 631);
		배경.setIcon(new ImageIcon("D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uD50C\uB808\uC774\uD654\uBA74big.PNG"));
		contentPane.add(배경);
	}
	public void chooseplayer() {
		int m = (int)(Math.random()*234 % 6);
		String []imgfile = {"D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uCEA1\uD2F4\uC544\uBA54\uB9AC\uCE741.png", "D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uD5D0\uD06C1.png", "D:\\\uC774\uB300\\2\uD559\uB144 1\uD559\uAE30\\\uAC1D\uCCB4\uC9C0\uD5A5\uD504\uB85C\uADF8\uB798\uBC0D\\\uAE30\uB9D0\uACFC\uC81C\\\uD1A0\uB9741.png", "D:\\이대\\2학년 1학기\\객체지향프로그래밍\\기말과제\\블랙위도우.png", "D:\\이대\\2학년 1학기\\객체지향프로그래밍\\기말과제\\호크아이1.png"};
		JLabel [] labels = {플레이어1, 플레이어2};	
		
		if (m == 0) {
			player1 = new 헐크("헐크");
			player2 = new 호크아이("호크아이");

			플레이어1.setIcon(new ImageIcon(imgfile[1]));			
			플레이어2.setIcon(new ImageIcon(imgfile[4]));			
		}
		else if(m==1) {
			player1 = new 호크아이("호크아이");
			player2 = new 블랙위도우("블랙위도우");
			
			플레이어1.setIcon(new ImageIcon(imgfile[4]));
			플레이어2.setIcon(new ImageIcon(imgfile[3]));			
		}
		else if (m == 2) {
			player1 = new 블랙위도우("블랙위도우");
			player2 = new 토르("토르");
			
			플레이어1.setIcon(new ImageIcon(imgfile[3]));			
			플레이어2.setIcon(new ImageIcon(imgfile[2]));		
		}
		else if(m == 3) {
			player1 = new 토르("토르");
			player2 = new 캡틴아메리카("캡틴아메리카");
			
			플레이어1.setIcon(new ImageIcon(imgfile[2]));			
			플레이어2.setIcon(new ImageIcon(imgfile[0]));		
		}
		else if (m == 4) {
			player1 = new 호크아이("호크아이");
			player2 = new 캡틴아메리카("캡틴아메리카");
			
			플레이어1.setIcon(new ImageIcon(imgfile[4]));
			플레이어2.setIcon(new ImageIcon(imgfile[0]));		
		}
		else if (m == 5) {
			player1 = new 블랙위도우("블랙위도우");
			player2 = new 헐크("헐크");
			
			플레이어1.setIcon(new ImageIcon(imgfile[3]));
			플레이어2.setIcon(new ImageIcon(imgfile[1]));		
		}		
	}
}
