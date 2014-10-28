package in.pgupta.webservice.spec.rs;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by prashant on 28/10/14.
 */
@XmlRootElement(name = "message")
public class Message {

    String message;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
