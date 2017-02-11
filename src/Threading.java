
public class Threading {

	public static void main(String[] args) {
		
	Login_Page l = new Login_Page();

		
	Thread main = new Thread(){
	public void run(){l.run();}};

	main.start();

	}}
