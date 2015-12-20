/**
 * 
 */
package tests.spriteRenderEngine;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import mock.dynamicObjectModule.DynamicObjectModule;
import mock.tcpClientModule.TCPClientModule;
import spriteRenderEngine.SpriteRenderEngine;

public class CreateSpriteRenderEngineTest {
	private static Field _domFieldAccessor;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		_domFieldAccessor = SpriteRenderEngine.class.getDeclaredField("_dynamicObjectModule");
		_domFieldAccessor.setAccessible(true);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		_domFieldAccessor.setAccessible(false);
		_domFieldAccessor = null;
	}

	@Before
	public void setUp() throws Exception {

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testConstructorShouldSuccess() throws IllegalArgumentException, IllegalAccessException {
		DynamicObjectModule expectedDom = new DynamicObjectModule(new TCPClientModule());
		SpriteRenderEngine engine = new SpriteRenderEngine(expectedDom);

		Object actualDomMember = _domFieldAccessor.get(engine);

		assertSame(expectedDom, actualDomMember);
	}

	@Test(expected = AssertionError.class)
	public void testConstructorShouldFailWithNullInjection() throws IllegalArgumentException, IllegalAccessException {
		SpriteRenderEngine engine = new SpriteRenderEngine(null);

		Object actualDomMember = _domFieldAccessor.get(engine);

		assertNull(actualDomMember);
	}
}
