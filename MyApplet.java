
import java.applet.*;
import java.awt.*;

/*<applet code="MyApplet" width="200" height="200">
<param name="num1" value="70">
<param name="num2" value="67">
</applet>*/
public class MyApplet extends Applet {
    int x, y;

    public void start() {
        x = Integer.parseInt(getParameter("num1"));
        y = Integer.parseInt(getParameter("num2"));
    }

    public void paint(Graphics g) {
        int z;
        z = x + y;
        g.drawString("Product is " + z, 50, 50);
    }
}
