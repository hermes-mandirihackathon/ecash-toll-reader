package mandiriecash.com.ecash_toll_reader;

/**
 * Created by Ichwan Haryo Sembodo on 27/02/2016.
 */
public class PlannerResponse {
    String status;
    String message;
    String content;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", content='" + content + '\'';
    }
}
