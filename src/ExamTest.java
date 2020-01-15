import java.awt.*;
import java.awt.event.*;
public class ExamTest implements WindowListener,ActionListener
{    
	int c,m=0;
    Frame f;
    Panel p1,p2,p3,p4,p5,p6,p7;
    Label l1,l2,l3,l4,l5,l6;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    Checkbox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20;
    CheckboxGroup cbg1,cbg2,cbg3,cbg4,cbg5;

    public ExamTest()
    {
        f=new Frame();
        f.setSize(720,500);
        f.setVisible(true);
        f.setLayout(null);
        f.setBackground(Color.blue);
        f.addWindowListener(this);
        p1=new Panel();
        p1.setSize(590, 490);
        p1.setVisible(true);
        p1.setLayout(null);
        p1.setBackground(Color.black);
        f.add(p1);
        p2=new Panel();
        p2.setSize(590, 490);
        p2.setVisible(true);
        p2.setBackground(Color.white);
        p2.setLayout(null);
        
        p3=new Panel();
        p3.setSize(590, 490);
        p3.setVisible(true);
        p3.setBackground(Color.white);
        p3.setLayout(null);
                
        p4=new Panel();
        p4.setSize(590, 490);
        p4.setVisible(true);
        p4.setBackground(Color.white);
        p4.setLayout(null);
        
        p5=new Panel();
        p5.setSize(590, 490);
        p5.setVisible(true);
        p5.setBackground(Color.white);
        p5.setLayout(null);
        
        p6=new Panel();
        p6.setSize(590, 490);
        p6.setVisible(true);
        p6.setBackground(Color.white);
        p6.setLayout(null);
        
        p7=new Panel();
        p7.setSize(590, 490);
        p7.setVisible(true);
        p7.setBackground(Color.white);
        p7.setLayout(null);
                
        b1=new Button("Start...");
        b2=new Button("Previous");
        b3=new Button("Next");
        b4=new Button("previous");
        b5=new Button("Next");
        b6=new Button("previous");
        b7=new Button("Next");
        b8=new Button("previous");
        b9=new Button("Next");
        b10=new Button("previous");
        b11=new Button("Next");
        b12=new Button("1");
        b13=new Button("2");
        b14=new Button("3");
        b15=new Button("4");
        b16=new Button("5");
        b17=new Button("SUBMIT");
        b18=new Button("PREVIOUS");
        b19=new Button("EXIT");
        
        l1=new Label("Q1=> Capital of india is ?");
        l2=new Label("Q2=> PM of India is ?");
        l3=new Label("Q3=> Radio Active Isotope of hydrogen is ?");
        l4=new Label("Q4=> Anode in dry cell consists of :");
        l5=new Label("Q5=> Who gave the theory of relativity ?");
        l6=new Label("");
        
        cbg1=new CheckboxGroup();
        cbg2=new CheckboxGroup();
        cbg3=new CheckboxGroup();
        cbg4=new CheckboxGroup();   
        cbg5=new CheckboxGroup();
        
        cb1=new Checkbox("New Delhi", cbg1, false);
        cb2=new Checkbox("Mumbai", cbg1, false);
        cb3=new Checkbox("Kanpur", cbg1, false);
        cb4=new Checkbox("Lucknow", cbg1, false);
        
        cb5=new Checkbox("Rahul Gandhi", cbg2, false);
        cb6=new Checkbox("Aditya Nath Yogi", cbg2, false);
        cb7=new Checkbox("Amit Shah", cbg2, false);
        cb8=new Checkbox("Narendra Modi", cbg2, false);
        
        
        cb9=new Checkbox("Dutarium", cbg3, false);
        cb10=new Checkbox("protium", cbg3, false);
        cb11=new Checkbox("tritium", cbg3, false);
        cb12=new Checkbox("none of these", cbg3, false);
        
        cb13=new Checkbox("copper", cbg4, false);
        cb14=new Checkbox("zinc", cbg4, false);
        cb15=new Checkbox("cadmium", cbg4, false);
        cb16=new Checkbox("graphite", cbg4, false);
        
        cb17=new Checkbox("Isaac Newton", cbg1, false);
        cb18=new Checkbox("Stephen Hawkins", cbg1, false);
        cb19=new Checkbox("Albert Einstein", cbg1, false);
        cb20=new Checkbox("Galileo Galilei", cbg1, false);
        
        b12.setBounds(600,150,50,30);
        b13.setBounds(655,150,50,30);
        b14.setBounds(600,190,50,30);
        b15.setBounds(655,190,50,30);
        b16.setBounds(625,230,50,30);
        f.add(b12);f.add(b13);f.add(b14);f.add(b15);f.add(b16);
        b1.setBounds(220, 200, 100, 50);
        p1.add(b1);
        
        l6.setBounds(150,160 ,400 ,50 );
        b18.setBounds(180,220,80,40);
        b19.setBounds(270,220,80,40);
          p7.add(l6);p7.add(b18);p7.add(b19);
        
        b2.setBounds(50,300, 70, 40);
        b3.setBounds(200,300,70,40);
        l1.setBounds(50, 50, 200, 30);
        cb1.setBounds(50, 100, 200, 30);
        cb2.setBounds(50, 150, 200, 30);
        cb3.setBounds(50, 200, 200, 30);
        cb4.setBounds(50, 250, 200, 30);
        
        b4.setBounds(50,300, 70, 40);
        b5.setBounds(200,300,70,40);
        l2.setBounds(50, 50, 200, 30);
        cb5.setBounds(50, 100, 200, 30);
        cb6.setBounds(50, 150, 200, 30);
        cb7.setBounds(50, 200, 200, 30);
        cb8.setBounds(50, 250, 200, 30);
        
        b6.setBounds(50,300, 70, 40);
        b7.setBounds(200,300,70,40);
        l3.setBounds(50, 50, 400, 30);
        cb9.setBounds(50, 100, 200, 30);
        cb10.setBounds(50, 150, 200, 30);
        cb11.setBounds(50, 200, 200, 30);
        cb12.setBounds(50, 250, 200, 30);
        
        b8.setBounds(50,300, 70, 40);
        b9.setBounds(200,300,70,40);
        l4.setBounds(50, 50, 400, 30);
        cb13.setBounds(50, 100, 200, 30);
        cb14.setBounds(50, 150, 200, 30);
        cb15.setBounds(50, 200, 200, 30);
        cb16.setBounds(50, 250, 200, 30);
        
        b10.setBounds(50,300, 70, 40);
        b11.setBounds(200,300,70,40);
        b17.setBounds(350, 300, 70, 40);
        l5.setBounds(50, 50, 400, 30);
        cb17.setBounds(50, 100, 200, 30);
        cb18.setBounds(50, 150, 200, 30);
        cb19.setBounds(50, 200, 200, 30);
        cb20.setBounds(50, 250, 200, 30);
     
        p2.add(l1);
        p2.add(cb1);p2.add(cb2);p2.add(cb3);p2.add(cb4);
        p2.add(b2);p2.add(b3);
        
        p3.add(l2);
        p3.add(cb5);p3.add(cb6);p3.add(cb7);p3.add(cb8);
        p3.add(b4);p3.add(b5);
        
        p4.add(l3);
        p4.add(cb9);p4.add(cb10);p4.add(cb11);p4.add(cb12);
        p4.add(b6);p4.add(b7);
        
        p5.add(l4);
        p5.add(cb13);p5.add(cb14);p5.add(cb15);p5.add(cb16);
        p5.add(b8);p5.add(b9);
        
        p6.add(l5);
        p6.add(cb17);p6.add(cb18);p6.add(cb19);p6.add(cb20);
        p6.add(b10);p6.add(b11);p6.add(b17);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
                
    }
    public void windowOpened(WindowEvent we) {
    }
    public void windowClosing(WindowEvent we) {
        f.dispose();
    }
    public void windowClosed(WindowEvent we) {
    }
    public void windowIconified(WindowEvent we) {
    }
    public void windowDeiconified(WindowEvent we) {
    }
    public void windowActivated(WindowEvent we) {
    }
    public void windowDeactivated(WindowEvent we) {
    }
    public void actionPerformed(ActionEvent ae)
    {
        Object o=ae.getSource();
        if(o.equals(b1))
        {
        f.remove(p1);
        f.add(p2);
        c=1;
        }
        else if(o.equals(b2))
          {
        	if(c==1)
        	{
        	f.remove(p2);
        	f.add(p1);
        	}
          }
        else if(o.equals(b3))
        {
        	if(c==1)
        	{
        		
        		c=2;
        		if(cb1.getState()==true&&cb2.getState()==false&&cb3.getState()==false&&cb4.getState()==false)
        		{
        			f.remove(p2);
            		f.add(p3);
        			m=m+1;
        		}
        		else if(cb1.getState()==false&&cb2.getState()==false&&cb3.getState()==false&&cb4.getState()==false)
        		{
        			f.remove(p2);
            		f.add(p3);
        		}
        		else
        		{
        			f.remove(p2);
            		f.add(p3);
        			m--;
        		}
        	}
        }
        else if(o.equals(b4))
        {
        	if(c==2)
        	{
        		
        	 if(cb1.getState()==true&&cb2.getState()==false&&cb3.getState()==false&&cb4.getState()==false)
        		{
        		 f.remove(p3);
         		f.add(p2);
         		m=m-1;
        		}
        	 else if(cb1.getState()==false&&cb2.getState()==false&&cb3.getState()==false&&cb4.getState()==false)
        	 {
        		 f.remove(p3);
          		f.add(p2);
           	 }
        	 else
        	 {
        		 f.remove(p3);
           		 f.add(p2); 
           		m=m+1;
        	 }
        		c=1;
        	}
        }
        else if(o.equals(b5))
        {
        	if(c==2)
        	{
        		
        		c=3;
        		if(cb5.getState()==false&&cb6.getState()==false&&cb7.getState()==false&&cb8.getState()==true)
        	     	{
        			f.remove(p3);
            		f.add(p4);
        			m=m+1;
        	     	}
        		else if(cb5.getState()==false&&cb6.getState()==false&&cb7.getState()==false&&cb8.getState()==false)
        		{
        			f.remove(p3);
            		f.add(p4);
        		}
        		else
        		{
        			f.remove(p3);
            		f.add(p4);
        			m--;
        		}
        	}
        }
        else if(o.equals(b6))
        {
        	if(c==3)
        	{  if(cb5.getState()==false&&cb6.getState()==false&&cb7.getState()==false&&cb8.getState()==true)
        		{
        		f.remove(p4);
           		f.add(p3);
        		m=m-1;
        		}
        	else if(cb5.getState()==false&&cb6.getState()==false&&cb7.getState()==false&&cb8.getState()==false)
        	{
        		f.remove(p4);
           		f.add(p3);
        		
        	}
        	else
        	{
        		f.remove(p4);
           		f.add(p3);
           		m=m+1;
        	}
        		c=2;
        	}
        }
        else if(o.equals(b7))
        {
        	if(c==3)
        	{
        		
        		c=4;
        		if(cb9.getState()==false&&cb10.getState()==false&&cb11.getState()==true&&cb12.getState()==false)
        	     	{
        			f.remove(p4);
            		f.add(p5);
        			m=m+1;
        	     	}
        		else if(cb9.getState()==false&&cb10.getState()==false&&cb11.getState()==false&&cb12.getState()==false)
        		{
        			f.remove(p4);
            		f.add(p5);
        		}
        		else
        		{
        			f.remove(p4);
        		    f.add(p5);
        			m--;
        		}
        	}
        }
        else if(o.equals(b8))
        {
        	if(c==4)
        	{
        		if(cb9.getState()==false&&cb10.getState()==false&&cb11.getState()==true&&cb12.getState()==false)
        		{
        			f.remove(p5);
               		f.add(p4);
             		m=m-1;
        		}
        		else if(cb9.getState()==false&&cb10.getState()==false&&cb11.getState()==false&&cb12.getState()==false)
        		{
        			f.remove(p5);
               		f.add(p4);
           		}
        		else
        		{

        			f.remove(p5);
               		f.add(p4);
               		m=m+1;
        		}
             		c=3;
        	}
        }
        else if(o.equals(b9))
        {
        	if(c==4)
        	{
        		
        		c=5;
        		if(cb13.getState()==false&&cb14.getState()==true&&cb15.getState()==false&&cb16.getState()==false)
        	     	{
        			f.remove(p5);
            		f.add(p6);
        			m=m+1;
        	     	}
        		else if(cb13.getState()==false&&cb14.getState()==false&&cb15.getState()==false&&cb16.getState()==false)
        		{
        			f.remove(p5);
            		f.add(p6);
        		}
        			else
        		{
        			m--;
        		}
        	}
        }
        else if(o.equals(b10))
        {
        	if(c==5)
        	{  if(cb13.getState()==false&&cb14.getState()==true&&cb15.getState()==false&&cb16.getState()==false)
        		{
        		f.remove(p6);
        		f.add(p5);
        		m=m-1;
        		}
        	else if(cb13.getState()==false&&cb14.getState()==false&&cb15.getState()==false&&cb16.getState()==false)
        	{
        		f.remove(p6);
        		f.add(p5);
        		
        	}
        	else
        	{
        		f.remove(p6);
        		f.add(p5);
        		m=m+1;
        	}
        		c=4;
        	}
        }
        else if(o.equals(b11))
        {
        	if(c==5)
        	{
        		
        		c=6;
        		l6.setText("please go back to previous window and SUBMIT your test");
        		if(cb17.getState()==false&&cb18.getState()==false&&cb19.getState()==true&&cb20.getState()==false)
        	     	{
        			f.remove(p6);
            		f.add(p7);
        			m++;
        	     	}
        		else if(cb17.getState()==false&&cb18.getState()==false&&cb19.getState()==false&&cb20.getState()==false)
        		{
        			f.remove(p6);
            		f.add(p7);
        		}
        		else
        		{
        			m--;
        		}
        	}
        }
        else if(o.equals(b17))
        {
        	if(c==5)
        	{   
        		f.remove(p6);
        		f.add(p7);
        		c=6;
        		l6.setText("your final score is"+String.valueOf(m));
        		if(cb17.getState()==false&&cb18.getState()==false&&cb19.getState()==true&&cb20.getState()==false)
        	     	{
        			m++;
        			l6.setText("your final score is"+String.valueOf(m));
           	     	}
        		else if(cb17.getState()==false&&cb18.getState()==false&&cb19.getState()==false&&cb20.getState()==false)
        		{
        			l6.setText("your final score is"+String.valueOf(m));
        		}
        		else
        		{
        			m=m-1;
        			l6.setText("your final score is"+String.valueOf(m));
        		}
        	}
        }
        else if(o.equals(b18))
        {
        	if(c==6)
        	{   if(cb17.getState()==false&&cb18.getState()==false&&cb19.getState()==true&&cb20.getState()==false)
              	{
        		f.remove(p7);
        	   	f.add(p6);
        		m=m-1;
            	}
        	else if(cb17.getState()==false&&cb18.getState()==false&&cb19.getState()==false&&cb20.getState()==false)
        	{
        		f.remove(p7);
        	   	f.add(p6);
        		
        	}
        	else
        	{
        		f.remove(p7);
        	   	f.add(p6);
        	   	m=m+1;
        	}
           		c=5;
        	}
        }
        else if(o.equals(b19))
        {
        	if(c==6)
        	{
        		f.dispose();
        	}
        }
    }
    public static void main(String[] args)
    {
        new ExamTest();
    }
}

