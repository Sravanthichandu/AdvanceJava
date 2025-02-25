package practicemethodoverridding;

public class WhatsappVersion2 extends WhatsappVersion1
{

	@Override
	public void chat()
	{
		System.out.println("Chatting window with different features");
	}
	
	@Override
	public void call()
	{
		System.out.println("audio and video calls are provided in whatsapp");
	}
	
	public void status()
	{
		System.out.println("Status feature upload only images");
	}
}
