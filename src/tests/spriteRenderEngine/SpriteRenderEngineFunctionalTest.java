package tests.spriteRenderEngine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import mock.dynamicObjectModule.DynamicObjectModule;
import mock.dynamicObjectModule.entities.Character;
import mock.dynamicObjectModule.entities.Sprite;
import mock.tcpClientModule.TCPClientModule;
import spriteRenderEngine.SpriteRenderEngine;

public class SpriteRenderEngineFunctionalTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testRenderSprites() {
		// Mock DOM.
		DynamicObjectModule dom = new DynamicObjectModule(new TCPClientModule());

		// Mock Sprite.
		for (int i = 0; i < 5; i++) {
			dom.addItem("my name is item", i, true, i, i);
			dom.addVirtualCharacter(i);
		}

		SpriteRenderEngine engine = new SpriteRenderEngine(dom);
		engine.renderSprites();

		Sprite[] sprites = dom.getAllDynamicObjects();
		for (Sprite sprite : sprites) {
			String[] consoleOutput = sprite.flushConsoleOutput().split(System.getProperty("line.separator"));
			for (String line : consoleOutput) {
				String[] tokens = line.split(":");
				String type = tokens[0];
				String value = tokens[1];

				switch (type) {
				case "Draw":
					// Ignore Sprite type.
					break;
				case "ID":
					// ID cannot be drawn.
					break;
				case "X":
					assertEquals("sprite should be drawn at X = " + sprite.getX(), sprite.getX(), Integer.parseInt(value));
					break;
				case "Y":
					assertEquals("sprite should be drawn at Y = " + sprite.getY(), sprite.getY(), Integer.parseInt(value));
					break;
				case "Direction":
					assertEquals("sprite should be drawn as facing " + ((Character) sprite).getDirection().toString(), ((Character) sprite).getDirection().toString(), value);
					break;
				case "Speed":
					// Speed cannot be drawn.
					break;
				default:
					fail("invalid console output token found in sprite id = \"" + sprite.getId() + "\" after sprite rendered");
					break;
				}
			}
		}
	}
}
