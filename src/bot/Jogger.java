package bot;

import haven.Config;
import haven.Coord;
import haven.UI;
import haven.Widget;

public class Jogger {

    private UI ui;

    public Jogger(UI ui) {
        this.ui = ui;
    }

    public void runBotCommand() {
        String str = "Jogger Activated";
        ui.cons.out.println(str);
    }
}
