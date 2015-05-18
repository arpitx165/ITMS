import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class GUI extends Mysql {
  
	JFrame jf1,jf;
	JButton jb[]=new JButton[10];
	JTextField jt[]=new JTextField[10];
	JLabel jl1,jl2;
	ImageIcon i1,i2;
	String text;
	int int_text;
	int count=0,flag=0,th_tr=0;
    Thread th[]=new Thread[10];
    ITM vech_freq=new ITM(0);
	GUI()
	{
		  
		   jf =new JFrame("Intelligent Trafic Management System");
	       i1=new ImageIcon("ab.png");
	       i2=new ImageIcon("em.png");
			jl1=new JLabel(i1);
			jl1.setBounds(0,-50, 800, 20); 
			jb[0]=new JButton("set");
			jb[0].setBounds(100,150, 70, 25);//for left side setter
			jb[1]=new JButton("set");
			jb[1].setBounds(700,150, 70, 25);//for right side setter
			jb[2]=new JButton("set");
			jb[2].setBounds(100,570, 70, 25);//for left bottom setter
			jb[3]=new JButton("set");
			jb[3].setBounds(700,570, 70, 25);//for right bottom setter
			jb[4]=new JButton("start"); // for starting
			jb[4].setBounds(200,50,70, 25);
			jb[5]=new JButton("Emergency");//for emergency for left side setter
			jb[5].setBounds(350,150,100,25);
			jb[6]=new JButton(i2);//for emergency for right side setter
			jb[6].setBounds(695,240,25,130);
			jb[7]=new JButton(i2);//for emergency for left bottom side setter
			jb[7].setBounds(275,400,25,130);
			jb[8]=new JButton("Emergency");
			jb[8].setBounds(520,570,100,25); //emergency for right bottom side setter
			jb[9]=new JButton("DataBase"); //For taking value from data base
			jb[9].setBounds(80,50,90,25);
			jt[0]=new JTextField(20);
		    jt[0].setBounds(200, 150, 70, 25);  //for left side setter
			jt[1]=new JTextField(20);   
			jt[1].setBounds(800,150,70,25);  //for right side setter 
			jt[2]=new JTextField(20);
		    jt[2].setBounds(200,570, 70, 25);  //for left bottom side setter
		    jt[3]=new JTextField(20);
		    jt[3].setBounds(800,570, 70, 25); //for right bottom setter
		    for(int i=4;i<8;i++)
		    	{
		    	jt[i]=new JTextField(20);
		    	jt[i].setBackground(Color.red);}
		    	
		    jt[4].setBounds(220,270,70,25); //left side setter
		    jt[5].setBounds(550,150,70,25); //right side setter 
		    jt[7].setBounds(370,570,70,25); //left bottom side setter
		    jt[6].setBounds(700,450,70,25); //right bottom side setter
		    //adding listener to all buttons
		    jb[0].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
			     	if(e.getSource()==jb[0])
			      	{
					  text=jt[0].getText();//taking values from textfield
					  int_text=Integer.parseInt(text);
					  vech_freq.Set_freq(int_text,0);
					 
				    }
			     }
			});
           jb[1].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
			     	if(e.getSource()==jb[1])
			      	{
					  text=jt[1].getText();//taking values from textfield
					  int_text=Integer.parseInt(text);
					  vech_freq.Set_freq(int_text,1);
					
				    }
					
					
				}
			});
           jb[2].addActionListener(new ActionListener() {
		
	     	@Override
	      	 public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	         if(e.getSource()==jb[2])
	      	  {
			    text=jt[2].getText();//taking values from textfield
			    int_text=Integer.parseInt(text);
			    vech_freq.Set_freq(int_text,2);
			   
		      }
			
		  }
	  });
           jb[3].addActionListener(new ActionListener() {
		
		@Override
		  public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
	     	if(e.getSource()==jb[3])
	      	{
			  text=jt[3].getText();//taking values from textfield
			  int_text=Integer.parseInt(text);
			  vech_freq.Set_freq(int_text,3);
			  	
		    }
		  }
	    });
     
           jb[5].addActionListener(new ActionListener() 
           {
       		
       		@Override
       		public void actionPerformed(ActionEvent e) 
       		{
       			// TODO Auto-generated method stub
       	     	if(e.getSource()==jb[5])
       	      	{
       	     	  
       			  flag=5;
       			
       		    }
       		}
       		});
           jb[6].addActionListener(new ActionListener() 
           {
       		
       		@Override
       		public void actionPerformed(ActionEvent e) 
       		{
       			// TODO Auto-generated method stub
       	     	if(e.getSource()==jb[6])
       	      	{
       	     	  
       			  flag=6;
       			
       		    }
       		}
       		});
           jb[7].addActionListener(new ActionListener() 
           {
       		
       		@Override
       		public void actionPerformed(ActionEvent e) 
       		{
       		// TODO Auto-generated method stub
       	     	if(e.getSource()==jb[6])
       	      	{
       	     	  
       			  flag=7;
       			
       		    }
       		}
       		});
           jb[8].addActionListener(new ActionListener() 
           {
       		
       		@Override
       		public void actionPerformed(ActionEvent e) 
       		{
       			// TODO Auto-generated method stub
       	     	if(e.getSource()==jb[8])
       	      	{
       	     	  
       			  flag=8;
       			
       		    }
       		}
       		});
           jb[9].addActionListener(new ActionListener()
           {
        	   
        	   public void actionPerformed(ActionEvent e) 
          		{
          			// TODO Auto-generated method stub
          	     	if(e.getSource()==jb[9])
          	      	{
          	     	 text=data(0);
          	     	 jt[0].setText(text);
          	         int_text=Integer.parseInt(text);
       			     vech_freq.Set_freq(int_text,0);
       			     text=data(1);
      	     	     jt[1].setText(text);
      	             int_text=Integer.parseInt(text);
      	             vech_freq.Set_freq(int_text,1);
      	             text=data(2);
    	     	     jt[2].setText(text);
    	             int_text=Integer.parseInt(text);
    	             vech_freq.Set_freq(int_text,2);
    	             text=data(3);
      	     	     jt[3].setText(text);
      	             int_text=Integer.parseInt(text);
      	             vech_freq.Set_freq(int_text,3);
          	     	}
          		}
           });

       		jf.setSize(1000,800);
			for(int i1=0;i1<=9;i1++)
			{
				jl1.add(jb[i1]);
				if(i1<8)
				jl1.add(jt[i1]);
			}
				
			jf.add(jl1);
			jf.setResizable(false);
			jf.setVisible(true);
			jf.setLocationRelativeTo(null);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
	
	public void start()
	{
		th[0]=new Thread(r0);
		th[1]=new Thread(r1);
		th[2]=new Thread(r2);
		th[3]=new Thread(r3);
		th[0].start();
		th[1].start();
		th[2].start();
		th[3].start();
	  
	}

	Runnable r0=new Runnable() 
	{
		@Override
		public void run() 
		{
		    while(true)
		     {
		    	int timer=0,flagx=0;
		    	if(count==0)	
		        {
		    	 	 
		    		 synchronized(vech_freq){ 
		    		 vech_freq.Cal_time();
		    		 vech_freq.set_green(0);
		    		
		    		 }
		    		 vech_freq.get_freq();
		      	  try {
		   				Thread.sleep(40);
		   			} catch (InterruptedException e) {
		   				// TODO Auto-generated catch block
		   				e.printStackTrace();
		   				
		   			}
		      	  timer=vech_freq.Get_Green(0);
		      	  jt[4].setBackground(Color.green);
		      	  flagx=1;
		      	  count=1;
		      
		        }
		        else
		        {

		      	  timer=vech_freq.Get_Red(0);
		      	  jt[4].setBackground(Color.red);
		      	  flagx=2;
		        }
		      
			  for(int i=timer;i>0;i--)
			  {
				
				  try 
				     {
					  if(th_tr==-1)
						  break;
					  if(flag==6)
					  {
						//th[4].start();
						 jt[4].setBackground(Color.yellow);
						 Thread.sleep(10000);
						 if(flagx==1)
						 jt[4].setBackground(Color.green);
						 else
						  jt[4].setBackground(Color.red);
						 flag=0;
					  }
					  else if(flag!=0)
					  {
						 Thread.sleep(10000); 	  
					  }
					  jt[4].setText(String.valueOf(i));  
					    Thread.sleep(1000);
					   } 
				  catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			  }
			
			  
		   }
		}
	};
	Runnable r1=new Runnable() 
	{
		
		@Override
		public void run() 
		{
			// TODO Auto-generated method stub
			 
			while(true)
		     {
		  //    int timer=vech_call.Get_red(count);
				
				int timer=0,flagx=0;		 
				 if(count==1)	
			     {
					 synchronized(vech_freq)
					 { vech_freq.set_green(1);}
					 vech_freq.get_freq();
			   	  try {
							Thread.sleep(40);
					  } catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
				     }
			   	  timer=vech_freq.Get_Green(1);
			   	  jt[5].setBackground(Color.green);
			   	  count=2;
			   	  flagx=1;
			     }
			     else
			     {
			    	
			   	 timer=vech_freq.Get_Red(1);
			   	 jt[5].setBackground(Color.red);
			        flagx=2;
			     } 		    
				for(int i=timer;i>0;i--)
			    {
					
				  try {
					  
					  
					  if(flag==4)
					  {
						//th[4].start();
						 jt[4].setBackground(Color.yellow);
						 Thread.sleep(10000);
						 if(flagx==1)
						 jt[4].setBackground(Color.green);
						 else
						  jt[4].setBackground(Color.red);
						 flag=0;
					  }
					  else if(flag!=0)
					  {
						 Thread.sleep(10000); 	  
					  }
					  jt[5].setText(String.valueOf(i));  
					  Thread.sleep(1000);
					 } 
				  catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			          }
			    }
				
			 
	    	  }
		}
	};
	Runnable r2=new Runnable() 
	{
		
		@Override
		public void run() 
		{
			// TODO Auto-generated method stub
			 
			while(true)
		     {
						 
			  int timer,flagx=0;
			  if(count==2)
			    {
				  synchronized(vech_freq){ vech_freq.set_green(2);}
				  vech_freq.get_freq();
			 	     try {
							Thread.sleep(40);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			 	     timer=vech_freq.Get_Green(2);
				    	 jt[6].setBackground(Color.green);
				    	 count=3;
				    	 flagx=1;
			    }
			    else
			    {
			 	      timer=vech_freq.Get_Red(2);
				    	  jt[6].setBackground(Color.red);
				    	  flagx=2;
			    }  
             for(int i=timer;i>0;i--)
			  {
		          try {
		        	
		        	  if(flag==5)
					  {
						//th[4].start();
						 jt[4].setBackground(Color.yellow);
						 Thread.sleep(10000);
						 if(flagx==1)
						 jt[4].setBackground(Color.green);
						 else
						  jt[4].setBackground(Color.red);
						 flag=0;
					  }
					  else if(flag!=0)
					  {
						 Thread.sleep(10000); 	  
					  }
					 jt[6].setText(String.valueOf(i));  
					  Thread.sleep(1000);
					   } 
				  catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			  }
            
				  
	    	  }
		}
	};
	Runnable r3=new Runnable() 
	{
		
		@Override
		public void run() 
		{
			// TODO Auto-generated method stub
		
			while(true)
		     {
				int timer,flagx=0;
				if(count==3)
			    {
					 synchronized(vech_freq){vech_freq.set_green(3);}	
					 vech_freq.get_freq();
			 	   try {
							Thread.sleep(40);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
			 	    timer=vech_freq.Get_Green(3);
				    jt[7].setBackground(Color.green);
				    count=0;
				    flagx=1;
			    }
			    else
			    {
			    	    // System.out.println("HI");
			 	         timer=vech_freq.Get_Red(3);
				    	  jt[7].setBackground(Color.red);
				    	  flagx=2;
			    }
			  for(int i=timer;i>0;i--)
			  {
				  try {
					  if(th_tr==-1)
							break;
					  if(flag==4)
					  {
						//th[4].start();
						 jt[7].setBackground(Color.yellow);
						 Thread.sleep(10000);
						 if(flagx==1)
						 jt[7].setBackground(Color.green);
						 else
						  jt[7].setBackground(Color.red);
						 flag=0;
					  }
					  else if(flag!=0)
					  {
						 Thread.sleep(10000); 	  
					  }
					  jt[7].setText(String.valueOf(i));  
					    Thread.sleep(1000);
					  } 
				  catch (InterruptedException e)
				  {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				  }
			  }
	         if(flagx==1)
	         {	 
	          try {
				Thread.sleep(40);
		    	 } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			   }
	         }
			 
	    	}
			
		}
	};

}