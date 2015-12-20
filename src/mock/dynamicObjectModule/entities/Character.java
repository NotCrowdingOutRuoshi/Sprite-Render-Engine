package mock.dynamicObjectModule.entities;

public class Character extends Sprite {
	public enum DIRECTIONS {
		UP, DOWN, LEFT, RIGHT
	};

	public static final int DEFAULT_SPEED = 0;
	public static final DIRECTIONS DEFAULT_DIRECTION = DIRECTIONS.RIGHT;

	public Character(int id, int x, int y, DIRECTIONS direction, int speed) {
		super(id, x, y);
	}

	@Override
	public void draw() {
		super.draw();
	}
}
