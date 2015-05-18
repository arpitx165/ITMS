import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.OutputStream;

public class Console extends GUI  {
	SerialPort serialPort;
	private OutputStream   serialOut;

    
		
	public void begin() throws Exception
	{
		CommPortIdentifier port = CommPortIdentifier.getPortIdentifier("COM4"); 
        CommPort commPort = port.open(this.getClass().getName(),2000);
        serialPort = (SerialPort) commPort;
        serialPort.setSerialPortParams(115200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
		serialOut=serialPort.getOutputStream();
        
	}  
 Console(){
      jb[4].addActionListener(new ActionListener() 
         {
     		
     		@Override
     		public void actionPerformed(ActionEvent e) 
     		{
     			// TODO Auto-generated method stub
     	     	if(e.getSource()==jb[4])
     	          start();
     	      try {
     	    	 Thread.sleep(100);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
     	     String str = "";
     	       str+=(vech_freq.Get_Green(0));
			   str+=',';
			   str+=(vech_freq.Get_Green(1));
			   str+=',';
			   str+=(vech_freq.Get_Green(2));
			   str+=',';
			   str+=(vech_freq.Get_Green(3));
			   str+=",,";
			 try {
				    
					System.out.println(str);
					serialOut.write(str.getBytes());
				  } 
			  catch (IOException e1) {
					e1.printStackTrace();
			  
	      	   }
     		    }
     });
 }
				
}	


		
