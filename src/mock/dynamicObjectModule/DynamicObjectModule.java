package mock.dynamicObjectModule;

import java.util.ArrayList;

import mock.dynamicObjectModule.entities.Character;
import mock.dynamicObjectModule.entities.Item;
import mock.dynamicObjectModule.entities.Sprite;
import mock.tcpClientModule.TCPClientModule;

public class DynamicObjectModule {
	private TCPClientModule _tcpClientModule;
	private ArrayList<Sprite> sprites;

	public DynamicObjectModule(TCPClientModule tcpClientModule) {
		assert (tcpClientModule != null);
		_tcpClientModule = tcpClientModule;

		sprites = new ArrayList<Sprite>();
		for (int i = 0; i < 5; i++) {
			sprites.add(new Item("My name is item", i, true, i, i));
			sprites.add(new Character(i, Character.DEFAULT_X, Character.DEFAULT_Y, Character.DEFAULT_DIRECTION,
					Character.DEFAULT_SPEED));
		}
	}

	public Sprite[] getAllDynamicObjects() {
		Sprite[] result = new Sprite[sprites.size()];
		sprites.toArray(result);

		return result;
	}
}
