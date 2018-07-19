
public class Client {

    public static void main(String[] args) {
        ApplicationMediator mediator = new ApplicationMediator();
        DesktopColleague desktop = new DesktopColleague(mediator);
        MobileColleague mobile = new MobileColleague(mediator);
        mediator.addColleague(desktop);
        mediator.addColleague(mobile);
        desktop.send("When do you have class today?");
        mobile.send("I have class at 6 am.");
    }
}
