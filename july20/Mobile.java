package july20;

public class Mobile {
    public void sendMessage() {
    	System.out.println("sendmessage");
    
    }
    public void shareDocument() {
    	System.out.println("sharedocument");
    	
    }
    public void call() {
    	System.out.println("call");
    	
    }
    public static void main(String[] args) {
		Mobile mob= new Mobile();
		mob.call();
		mob.sendMessage();
		mob.shareDocument();
	}
}
