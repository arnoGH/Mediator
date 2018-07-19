import java.util.ArrayList;

public class ApplicationMediator implements Mediator {

    private ArrayList<Colleague> colleagues;

    public ApplicationMediator() {
        colleagues = new ArrayList<Colleague>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void send(String message, Colleague originator) {
        // let all other screens know that this screen has changed
        for(Colleague c: colleagues) {
            //don't tell ourselves
            if(c != originator) {
                c.receive(message);
            }
        }
    }

}
