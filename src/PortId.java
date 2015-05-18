import gnu.io.CommPortIdentifier;
import java.util.Enumeration;


   public class PortId
   {
	public static void main(String arg[]) throws Exception
	{

		@SuppressWarnings("unchecked")
		Enumeration<CommPortIdentifier> ports = CommPortIdentifier.getPortIdentifiers();
		
		while(ports.hasMoreElements())
		{
			
			CommPortIdentifier port = ports.nextElement(); 
			System.out.println(port.getName());
		}
	   Console console = new Console();
         console.begin();
         
		
	}
	
}
