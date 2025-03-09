package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {

	// message sent from client to unsubscribe on a topic 

	private String user;
	private String topic;
	
    public UnsubscribeMsg(String user, String topic) {
    	this.user = user;
    	this.topic = topic;
    }

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "UnsubscribeMsg [user=" + user + ", topic=" + topic + "]";
	}
}