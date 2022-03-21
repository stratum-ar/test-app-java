import stratumkit.ui.Color;
import stratumkit.ui.UI;
import stratumkit.ui.UIView;
import stratumkit.ui.components.shapes.Rectangle;

public class MainView extends UIView {
    boolean red = false;

    public MainView(UI ui) {
        super(ui);

        create();
    }

    void create() {
        Rectangle rectangle = new Rectangle(
                20, 20, 150, 40, Color.BLUE,
                (component, input) -> {
                    red = !red;
                    ((Rectangle)component).setColor(red ? Color.RED : Color.BLUE);
                }
        );

        add(rectangle);
    }
}
