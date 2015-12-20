package mock.dynamicObjectModule.entities;

public class Item extends Sprite {
	public final static int EMPTY_OWNER = -1;

	public Item(String name, int id, boolean shared, int x, int y) {
		super(id, x, y);
	}

	@Override
	public void draw() {
		super.draw();
	}
}