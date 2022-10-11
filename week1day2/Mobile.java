package week1day2;

public class Mobile {
	public void sendMessage()
	{
		System.out.println("sendMessage");
	}
	public void sendDocuments ()
	{
		System.out.println("sendDocuments");
	}
	public void call()
	{
		System.out.println("call");
	}
public static void main(String[] args) {
	Mobile actions=new Mobile();
	actions.sendMessage();
	actions.sendDocuments();
	actions.call();
}
}
