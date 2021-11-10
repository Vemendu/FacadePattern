import devices.CaseWithHardware;
import devices.Keyboard;
import devices.Monitor;
import devices.WebCamera;

public class CreatorOfPc {
    public CreatorOfPc()
    {
        CaseWithHardware caseWithHardware = new CaseWithHardware();
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        WebCamera webCamera = new WebCamera();
    }
    @Override
    public String toString()
    {
        return "PC was created \n" +
                "It has a case, keyboard, monitor and webCamera";
    }
}
