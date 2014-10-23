package in.pgupta.webservice.spec;

/**
 * Created by prashant on 23/10/14.
 */
public class GreetQuery {
    String senderName;
    String message;

    public GreetQuery() {
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
