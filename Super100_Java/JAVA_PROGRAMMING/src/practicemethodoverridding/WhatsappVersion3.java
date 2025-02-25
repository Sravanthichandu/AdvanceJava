package practicemethodoverridding;

public class WhatsappVersion3 extends WhatsappVersion2{

	@Override
	public void chat()
	{
		System.out.println("Chat updated features");
	}
	public void calls()
	{
	  System.out.println("Audio and video calls ");	
	}
	public void status()
	{
		System.out.println("both images and videos accepted in whatsapp version3");
	}
}
