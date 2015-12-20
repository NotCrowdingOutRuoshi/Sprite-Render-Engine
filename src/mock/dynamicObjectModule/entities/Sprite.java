package mock.dynamicObjectModule.entities;

public abstract class Sprite {
	public static final int DEFAULT_X = 0;
	public static final int DEFAULT_Y = 0;

	public boolean isDrawn;

	public Sprite(int id, int x, int y) {
		isDrawn = false;
	}

	public void draw() {
		isDrawn = true;
	}
}