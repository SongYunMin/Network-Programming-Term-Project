package network_term_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Manager extends JFrame {

	private JPanel Manager_Layout;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Manager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 465);
		Manager_Layout = new JPanel();
		Manager_Layout.setBackground(new Color(250, 235, 215));
		Manager_Layout.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Manager_Layout);
		Manager_Layout.setLayout(null);

		// ��/��/���Ằ �������
		JButton Drink_Sales = new JButton("\uC74C\uB8CC\uBCC4 \uB9E4\uCD9C \uAD00\uB9AC");
		Drink_Sales.setBackground(new Color(255, 255, 224));
		Drink_Sales.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 16));
		Drink_Sales.setBounds(222, 318, 161, 63);
		Manager_Layout.add(Drink_Sales);

		JButton Daily_Sales = new JButton("\uCD1D \uB9E4\uCD9C \uD655\uC778");
		Daily_Sales.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.Gross.setVisible(true);
			}
		});
		Daily_Sales.setBackground(new Color(255, 250, 240));
		Daily_Sales.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 16));
		Daily_Sales.setBounds(35, 318, 161, 63);
		Manager_Layout.add(Daily_Sales);

		JLabel Admin_Label = new JLabel("\uAD00\uB9AC\uC790 \uBA54\uB274");
		Admin_Label.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 36));
		Admin_Label.setBounds(24, 10, 172, 86);
		Manager_Layout.add(Admin_Label);

		// ������� ����� ����
		// �� ����
		JButton Plus_Water = new JButton("\uBB3C \uBCF4\uCDA9");
		Plus_Water.setBackground(new Color(135, 206, 250));
		Plus_Water.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.water.setNumber(3);
				UI.WaterNum.setText(String.valueOf("���� : " + UI.water.getNumber()));
				JOptionPane.showMessageDialog(Manager_Layout, "���� �����Ͽ����ϴ�.");
			}
		});
		Plus_Water.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 16));
		Plus_Water.setBounds(87, 159, 124, 47);
		Manager_Layout.add(Plus_Water);

		// Ŀ�� ����
		JButton Plus_Coffee = new JButton("\uCEE4\uD53C \uBCF4\uCDA9");
		Plus_Coffee.setBackground(new Color(0, 206, 209));
		Plus_Coffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.coffee.setNumber(3);
				UI.CoffeeNum.setText(String.valueOf("���� : " + UI.coffee.getNumber()));
				JOptionPane.showMessageDialog(Manager_Layout, "Ŀ�Ǹ� �����Ͽ����ϴ�.");
			}
		});
		Plus_Coffee.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 16));
		Plus_Coffee.setBounds(223, 159, 124, 47);
		Manager_Layout.add(Plus_Coffee);

		
		// �̿� ���� ����
		JButton Plus_Sport = new JButton("\uC774\uC628\uC74C\uB8CC \uBCF4\uCDA9");
		Plus_Sport.setBackground(new Color(216, 191, 216));
		Plus_Sport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.ion.setNumber(3);
				UI.SportNum.setText(String.valueOf("���� : " + UI.ion.getNumber()));
				JOptionPane.showMessageDialog(Manager_Layout, "�̿����Ḧ �����Ͽ����ϴ�.");
			}
		});
		Plus_Sport.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 16));
		Plus_Sport.setBounds(359, 159, 124, 47);
		Manager_Layout.add(Plus_Sport);

		// ����Ŀ�� ����
		JButton Plus_HighCoffee = new JButton("\uACE0\uAE09\uCEE4\uD53C \uBCF4\uCDA9");
		Plus_HighCoffee.setBackground(new Color(255, 255, 224));
		Plus_HighCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.high_coffee.setNumber(3);
				UI.HighCoffeeNum.setText(String.valueOf("���� : " + UI.high_coffee.getNumber()));
				JOptionPane.showMessageDialog(Manager_Layout, "����Ŀ�Ǹ� �����Ͽ����ϴ�.");
			}
		});
		Plus_HighCoffee.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 16));
		Plus_HighCoffee.setBounds(154, 225, 124, 47);
		Manager_Layout.add(Plus_HighCoffee);

		
		// ź�� ���� ����
		JButton Plus_Soda = new JButton("\uD0C4\uC0B0\uC74C\uB8CC \uBCF4\uCDA9");
		Plus_Soda.setBackground(new Color(255, 215, 0));
		Plus_Soda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UI.soda.setNumber(3);
				UI.SodaNum.setText(String.valueOf("���� : " + UI.soda.getNumber()));
				JOptionPane.showMessageDialog(Manager_Layout, "ź�����Ḧ �����Ͽ����ϴ�.");
			}
		});
		Plus_Soda.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 16));
		Plus_Soda.setBounds(297, 225, 124, 47);
		Manager_Layout.add(Plus_Soda);
		
		
		// ��й�ȣ ���� �̺�Ʈ
		JButton Change_PassWord = new JButton("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		Change_PassWord.setBackground(new Color(240, 248, 255));
		Change_PassWord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Change_PW change_pw = new Change_PW();
				change_pw.setVisible(true);
			}
		});
		Change_PassWord.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 16));
		Change_PassWord.setBounds(413, 318, 124, 63);
		Manager_Layout.add(Change_PassWord);
		
		// ���� ���� ��ư
		JButton Change_Drink = new JButton("\uC74C\uB8CC\uBCC0\uACBD");
		Change_Drink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Change D_C = new Drink_Change();
				D_C.setVisible(true);
			}
		});
		Change_Drink.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 15));
		Change_Drink.setBackground(new Color(173, 216, 230));
		Change_Drink.setBounds(277, 35, 124, 48);
		Manager_Layout.add(Change_Drink);
		
		// ������ ��ư
		JButton Exit_Button = new JButton("\uB098\uAC00\uAE30");
		Exit_Button.setBackground(new Color(173, 216, 230));
		Exit_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		Exit_Button.setFont(new Font("���ﳲ��ü EB", Font.PLAIN, 16));
		Exit_Button.setBounds(413, 36, 124, 48);
		Manager_Layout.add(Exit_Button);
	}
}