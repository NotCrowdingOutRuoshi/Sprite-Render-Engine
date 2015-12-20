package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.spriteRenderEngine.CreateSpriteRenderEngineTest;
import tests.spriteRenderEngine.SpriteRenderEngineRenderTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CreateSpriteRenderEngineTest.class, SpriteRenderEngineRenderTest.class })
public class RenderEngineTestSuite {

}
