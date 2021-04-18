package MyInterface;
import Player.*;
import Weapon.*;

public interface Attackable {

	public void attack(Player target);
	public void attack(Player target, Weapon weapon);
}
