
package haven;

/* Imports */
import java.awt.event.KeyEvent;

public interface IKeyFunction{
	public void dokey(UI ui, KeyEvent ev);
	public int getkey();
	public int getspec();
	public void setdata(int k,int s);
}