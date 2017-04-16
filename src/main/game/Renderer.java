package main.game;

import static org.lwjgl.opengl.GL11.*;

class Renderer {

    Renderer() {
    }

    void init() throws Exception {
    }

    void clear() {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    }
}
