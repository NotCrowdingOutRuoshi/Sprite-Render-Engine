package mock.dynamicObjectModule.entities;

public class Item extends Sprite {
	public final static int EMPTY_OWNER = -1;

	private int _owner;
	private String _name;
	private boolean _shared;

	public Item(String name, int id, boolean shared, int x, int y) {
		super(id, x, y);

		assert (name != null && !name.isEmpty());

		_name = name;
		_owner = EMPTY_OWNER;
		_shared = shared;
	}

	@Override
	public void draw() {
		super.draw();
		
		consoleOutput.append("Draw:Item");
		consoleOutput.append(System.getProperty("line.separator"));
		consoleOutput.append("ID:" + _id);
		consoleOutput.append(System.getProperty("line.separator"));
		consoleOutput.append("X:" + _x);
		consoleOutput.append(System.getProperty("line.separator"));
		consoleOutput.append("Y:" + _y);

		System.out.println(consoleOutput);
	}

	public int getOwner() {
		return _owner;
	}

	public void setOwner(int owner) {
		assert (owner >= 0 || owner == EMPTY_OWNER);
		_owner = owner;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		assert (name != null && !name.isEmpty());
		_name = name;
	}

	public boolean isOwned() {
		return _owner != EMPTY_OWNER;
	}

	public boolean isShared() {
		return _shared;
	}

	public void setShared(boolean isShared) {
		_shared = isShared;
	}
}