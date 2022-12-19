package eclipseDeneme;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class xox extends JFrame {
	int clicked=0;
	boolean btn00Flag=true;
	boolean btn01Flag=true;
	boolean btn02Flag=true;
	boolean btn10Flag=true;
	boolean btn11Flag=true;
	boolean btn12Flag=true;
	boolean btn20Flag=true;
	boolean btn21Flag=true;
	boolean btn22Flag=true;
	int b00=0;
	int b01=0;
	int b02=0;
	int b10=0;
	int b11=0;
	int b12=0;
	int b20=0;
	int b21=0;
	int b22=0;
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xox frame = new xox();
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
	public xox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		JOptionPane.showMessageDialog(null, "XOX OYUNUNA HOŞGELDİNİZ:)     Kutucuklara 1 kere tıklandığında O, 2 Kere tıklandığında X seçilmiş olacaktır ve bir daha değiştirme hakkınız bulunmamaktadır.İYİ EĞLENCELER:)");

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn00 = new JButton("");
		btn00.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn00Flag) {
					btn00.setLabel("O");
					btn00.setEnabled(false);
					btn00Flag=false;
					b00=1;
				}else {
					btn00.setLabel("X");
					btn00.setEnabled(false);
					btn00Flag=false;
					b00=2;
				}
				checkWinner();
			}
		
		});
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn00.setBounds(0, 0, 165, 165);
		contentPane.add(btn00);
		
		JButton btn01 = new JButton("");
		btn01.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn01Flag) {
					btn01.setLabel("O");
					btn01.setEnabled(false);
					btn01Flag=false;
					b01=1;
					
				}else {
					btn01.setLabel("X");
					btn01.setEnabled(false);
					btn01Flag=false;
					b01=2;
				}
				checkWinner();
			}
		});
		btn01.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn01.setBounds(163, 0, 165, 165);
		contentPane.add(btn01);
		
		JButton btn02 = new JButton("");
		btn02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn02Flag) {
					btn02.setLabel("O");
					btn02.setEnabled(false);
					btn02Flag=false;
					b02=1;
				}else {
					btn02.setLabel("X");
					btn02.setEnabled(false);
					btn02Flag=false;
					b02=2;
				}
				checkWinner();
			}
		});
		btn02.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn02.setBounds(327, 0, 159, 165);
		contentPane.add(btn02);
		
		JButton btn10 = new JButton("");
		btn10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn10Flag) {
					btn10.setLabel("O");
					btn10.setEnabled(false);
					btn10Flag=false;
					b10=1;
				}else {
					btn10.setLabel("X");
					btn10.setEnabled(false);
					btn10Flag=false;
					b10=2;
				}
				checkWinner();
			}
		});
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn10.setBounds(0, 164, 165, 148);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("");
		btn11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn11Flag) {
					btn11.setLabel("O");
					btn11.setEnabled(false);
					btn11Flag=false;
					b11=1;
				}else {
					btn11.setLabel("X");
					btn11.setEnabled(false);
					btn11Flag=false;
					b11=2;
				}
				checkWinner();
			}
		});
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn11.setBounds(163, 164, 165, 148);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("");
		btn12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn12Flag) {
					btn12.setLabel("O");
					btn12.setEnabled(false);
					btn12Flag=false;
					b12=1;
					
				}else {
					btn12.setLabel("X");
					btn12.setEnabled(false);
					btn12Flag=false;
					b12=2;
				}
				checkWinner();
			}
		});
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn12.setBounds(326, 164, 160, 148);
		contentPane.add(btn12);
		
		JButton btn20 = new JButton("");
		btn20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn20Flag) {
					btn20.setLabel("O");
					btn20.setEnabled(false);
					btn20Flag=false;
					b20=1;
				}else {
					btn20.setLabel("X");
					btn20.setEnabled(false);
					btn20Flag=false;
					b20=2;
				}
				checkWinner();
			}
		});
		btn20.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn20.setBounds(0, 309, 165, 154);
		contentPane.add(btn20);
		
		JButton btn21 = new JButton("");
		btn21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn21Flag) {
					btn21.setLabel("O");
					btn21.setEnabled(false);
					btn21Flag=false;
					b21=1;
				}else {
					btn21.setLabel("X");
					btn21.setEnabled(false);
					btn21Flag=false;
					b21=2;
				}
				checkWinner();
			}
		});
		btn21.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn21.setBounds(163, 309, 165, 154);
		contentPane.add(btn21);
		
		JButton btn22 = new JButton("");
		btn22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				clicked++;
				if(btn22Flag) {
					btn22.setLabel("O");
					btn22.setEnabled(false);
					btn22Flag=false;
					b22=1;
				}else {
					btn22.setLabel("X");
					btn22.setEnabled(false);
					btn22Flag=false;
					b22=2;
				}
				checkWinner();
			}
		});
		btn22.setFont(new Font("Tahoma", Font.PLAIN, 99));
		btn22.setBounds(324, 309, 162, 154);
		contentPane.add(btn22);
	}
	void checkWinner(){
		if(b00==1&&b01==1&&b02==1) {
			JOptionPane.showMessageDialog(null, "O is the winner!!");
		}else if(b10==1&&b11==1&&b12==1) {
			JOptionPane.showMessageDialog(null, "O is the winner!!");
		}else if(b20==1&&b21==1&&b22==1) {
			JOptionPane.showMessageDialog(null, "O is the winner!!");
		}else if(b00==1&&b10==1&&b20==1) {
			JOptionPane.showMessageDialog(null, "O is the winner!!");
		}else if(b01==1&&b11==1&&b21==1) {
			JOptionPane.showMessageDialog(null, "O is the winner!!");
		}else if(b02==1&&b12==1&&b22==1) {
			JOptionPane.showMessageDialog(null, "O is the winner!!");
		}else if(b00==1&&b11==1&&b22==1) {
			JOptionPane.showMessageDialog(null, "O is the winner!!");
		}else if(b02==1&&b11==1&&b20==1) {
			JOptionPane.showMessageDialog(null, "O is the winner!!");
		}else if(b00==2&&b01==2&&b02==2) {
			JOptionPane.showMessageDialog(null, "X is the winner!!");
	    }  else if(b10==2&&b11==2&&b12==2) {
		JOptionPane.showMessageDialog(null, "X is the winner!!");
	    }else if(b20==2&&b21==2&&b22==2) {
	    	JOptionPane.showMessageDialog(null, "X is the winner!!");
     	}else if(b00==2&&b10==2&&b20==2) {
     		JOptionPane.showMessageDialog(null, "X is the winner!!");
     	}else if(b01==2&&b11==2&&b21==2) {
     		JOptionPane.showMessageDialog(null, "X is the winner!!");
     	}else if(b02==2&&b12==2&&b22==2) {
     		JOptionPane.showMessageDialog(null, "X is the winner!!");
     	}else if(b00==2&&b11==2&&b22==2) {
     		JOptionPane.showMessageDialog(null, "X is the winner!!");
     	}else if(b02==2&&b11==2&&b20==2) {
     		JOptionPane.showMessageDialog(null, "X is the winner!!");
     	}
	}}
