import stratumkit.app.*;
import stratumkit.ui.*;

import java.io.IOException;
import java.util.Scanner;

public class TestAppMain extends App {
    private final UI ui = new UI(this);

    @Override
    protected void launched() throws IOException {
        ui.navigate(new MainView(ui));
        ui.render();
    }

    @Override
    protected void onInput(AppInput input) throws IOException {
        ui.handleInput(input);
        ui.render();
    }

    public static void main(String[] args) {
        if (args.length >= 1) {
            String appId = args[0];

            TestAppMain app = new TestAppMain();

            try {
                app.start(appId);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("App needs to be launched by Stratum.");
        }
    }
}
