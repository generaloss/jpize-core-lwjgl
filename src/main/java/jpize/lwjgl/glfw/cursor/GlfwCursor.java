package jpize.lwjgl.glfw.cursor;

import jpize.io.input.ICursor;
import jpize.lwjgl.glfw.GlfwImage;
import jpize.lwjgl.glfw.GlfwObjectLong;
import jpize.util.Disposable;

import static org.lwjgl.glfw.GLFW.*;

public class GlfwCursor extends GlfwObjectLong implements Disposable, ICursor {

    public GlfwCursor(GlfwImage image, int hotspotX, int hotspotY) {
        super(glfwCreateCursor(image.getGLFWImage(), hotspotX, hotspotY));
    }

    public GlfwCursor(GlfwCursorShape shape) {
        super(glfwCreateStandardCursor(shape.value));
    }

    @Override
    public void dispose() {
        glfwDestroyCursor(ID);
    }

}
