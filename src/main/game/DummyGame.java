package main.game;

import main.engine.IGameLogic;
import main.engine.Window;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

class DummyGame implements IGameLogic{

    private int direction = 0;
    private float color = 0.0f;

    private static final Renderer RENDERER =  new Renderer();

    /**
     * Initializes game renderer
     * @throws Exception
     */
    @Override
    public void init() throws Exception {
        RENDERER.init();
    }

    /**
     * Check user input for each frame
     * @param window
     */
    @Override
    public void input(Window window) {
        if (window.isKeyPressed(GLFW_KEY_UP)) {
            direction = 1;
        } else if (window.isKeyPressed(GLFW_KEY_DOWN)) {
            direction = -1;
        } else {
            direction = 0;
        }
    }

    /**
     * Update game variables for each frame
     * @param interval
     */
    @Override
    public void update(float interval) {
        color += direction * 0.01f;
        if (color > 1) {
            color = 1.0f;
        } else if ( color < 0 ) {
            color = 0.0f;
        }
    }

    @Override
    public void render(Window window) {
        if (window.isResized()) {
           glViewport(0, 0, window.getWidth(), window.getHeight());
           window.setResized(false);
        }

        window.setClearColor(color, color, color, 0.0f);
        RENDERER.clear();
    }
}
