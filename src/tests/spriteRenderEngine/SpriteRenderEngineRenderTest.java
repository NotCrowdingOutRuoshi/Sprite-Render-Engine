package tests.spriteRenderEngine;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import mock.dynamicObjectModule.DynamicObjectModule;
import mock.dynamicObjectModule.entities.Sprite;
import mock.tcpClientModule.TCPClientModule;
import spriteRenderEngine.SpriteRenderEngine;

public class SpriteRenderEngineRenderTest {

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
		DynamicObjectModule dom = new DynamicObjectModule(new TCPClientModule());

		SpriteRenderEngine engine = new SpriteRenderEngine(dom);
		engine.renderSprites();

		for (Sprite sprite : dom.getAllDynamicObjects()) {
			assertTrue("sprite should all be drawn", sprite.isDrawn);
		}
	}
}
