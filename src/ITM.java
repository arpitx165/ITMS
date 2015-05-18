import java.util.ArrayList;
public class ITM 
{

	private int start=0;
	ArrayList<Integer> Red_time= new ArrayList <Integer>(5);
	ArrayList<Integer> Green_time= new ArrayList <Integer>(5);
	ArrayList<Integer> vech_freqx= new ArrayList <Integer>(5);
	ArrayList<Integer> vech_freqx1= new ArrayList <Integer>(5);
	ITM(){};
	ITM(int x)
	{
		for(int i=0;i<4;i++)
		{
			vech_freqx.add(i,0);
			vech_freqx1.add(i,0);
			Green_time.add(i,0);
			Red_time.add(i,0);
		}
	}
	
	public void Set_freq(int int_text,int index) 
	{
		
	 	vech_freqx1.set(index, int_text);
	 	for(int i=0;i<4;i++)
	 		vech_freqx.set(i,vech_freqx1.get(i));	
	 	

	}
	public void get_freq() 
	{
		
	 	
	 	for(int i=0;i<4;i++)
	 	System.out.println(Red_time.get(i));	
	 	

	}
	public void Cal_time() 
	{
		// TODO Auto-generated method stub
		int P_60;               
	 	for(int i=0;i<4;i++)    // calculating green time
	 	{
	 //	 System.out.println(vech_freqx.get(i));	
	 	 
	 		 P_60=vech_freqx.get(i)*60;
	 		 P_60=(int) Math.floor(P_60/100);
	 		if(P_60>20)
		 	 {
	 		 vech_freqx.set(i,((vech_freqx.get(i))-P_60));
	 		 P_60*=3;
	 		 P_60=(int) Math.floor(P_60/4);
	 		 Green_time.set(i,P_60);
	 		  
		 	 }
	 	     else
	 	     {
	 		 Green_time.set(i,15);
	 	     }

	 	 }
	 	
	 }
	
	private void Cal_red() 
	{
		// TODO Auto-generated method stub
		int i,val=0,end;
	      end=start+3;
		  end=Get_index(end); 
		  i=start;
		while(true)
		{
			if(i==end)
				break;
		    val+=Green_time.get(i);
			Red_time.set(Get_index(i+1),val);
		     i++;
		  if(i>3)
			  i=0;
		}
		
	}
	public int Get_Green(int i) 
	{
		// TODO Auto-generated method stub
		
		return (Green_time.get(i))/5;
	}
	public int Get_Red(int i) 
	{
		// TODO Auto-generated method stub
		return (Red_time.get(i))/5;
	}
    public int Get_index(int i) 
    {
		// TODO Auto-generated method stub
		if(i>3)
			i=i-4;
		else if(i<0)
			i=4+i;
			
		return i;
	}
	public void set_green(int count) 
	{
		// TODO Auto-generated method stub
		start=count;
		if(count==2||count==3)
		{
			count--;
			update_green(count);
		}
		Cal_red();
	}
	private void update_green(int count) 
	{
	            int px_60;
				px_60=vech_freqx.get(count);
				px_60*=60;
				px_60=(int) Math.floor(px_60/100);
			if(px_60>20)
			  {
				px_60*=3;
				 px_60=(int) Math.floor(px_60/4);
				Green_time.set(count,px_60);
			  }
			else
				Green_time.set(count,15);
	}
}
