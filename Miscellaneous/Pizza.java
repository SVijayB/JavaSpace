package Miscellaneous;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.TitledBorder;

public class Pizza implements ItemListener,ActionListener
{
	JFrame f;
	TitledBorder Size,Toppings;
	JCheckBox plain,sausage,mushroom,pepperoni;
	JRadioButton small,medium,large;
	JLabel l1,l2;
	JButton bill;
	JTextArea val;
	static int total=0;
	Pizza()
	{
		f=new JFrame("Pizza Billing");
		f.setBounds(200,200,400,450);
		f.setLayout(null);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
		JLabel l1=new JLabel();
		l1.setBorder(new TitledBorder("PizzaSize"));
	    l1.setBounds(10,10,350,70);
	    f.add(l1);
	    small=new JRadioButton("Small");
		small.setBounds(20,40,80,30);
		f.add(small);
		medium=new JRadioButton("Medium");
		medium.setBounds(100,40,80,30);
		f.add(medium);
		large=new JRadioButton("Large");
		large.setBounds(180,40,80,30);
		f.add(large);
		ButtonGroup size=new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		JLabel l2=new JLabel();
		l2.setBorder(new TitledBorder("Toppings"));
		l2.setBounds(10,100,350,130);
		f.add(l2);
		plain=new JCheckBox("Plain");
		plain.setBounds(20,130,80,30);
		f.add(plain);
		sausage=new JCheckBox("Sausage");
		sausage.setBounds(100,130,80,30);
		f.add(sausage);
		mushroom=new JCheckBox("Mushroom");
		mushroom.setBounds(180,130,100,30);
		f.add(mushroom);
		pepperoni=new JCheckBox("Pepperoni");
		pepperoni.setBounds(20,160,100,30);
		f.add(pepperoni);
		
		bill=new JButton("Generate Bill");
		bill.setBounds(100,230,150,30);
		f.add(bill);
	
		val=new JTextArea();
		val.setBounds(10,300,360,80);
		val.setVisible(false);
		f.add(val);
		
		bill.addActionListener(this);
		plain.addItemListener(this);
		sausage.addItemListener(this);
		mushroom.addItemListener(this);
		pepperoni.addItemListener(this);
		f.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(small.isSelected())
		{
			total=total+100;
		}
		if(medium.isSelected())
		{
			total=total+130;
		}
		if(large.isSelected())
		{
			total=total+160;
		}
		val.setVisible(true);
		val.setText("\nOrder placed Successfully!"+"\nAmount: Rs."+total);
	}

	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==plain)
		{
			total=total+0;
		}
		if(e.getSource()==sausage)
		{
			total=total+20;
		}
		if(e.getSource()==mushroom)
		{
			total=total+20;
		}
		if(e.getSource()==pepperoni)
		{
			total=total+20;
		}
	}

	public static void main(String[]args)
	{
		new Pizza();
	}
}