package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.spriteRenderEngine.CreateSpriteRenderEngineTest;
import tests.spriteRenderEngine.SpriteRenderEngineFunctionalTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CreateSpriteRenderEngineTest.class, SpriteRenderEngineFunctionalTest.class })
public class RenderEngineTestSuite {

}
