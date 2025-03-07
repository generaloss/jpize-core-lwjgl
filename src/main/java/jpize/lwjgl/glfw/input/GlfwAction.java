package jpize.lwjgl.glfw.input;

import jpize.context.input.Action;

import static org.lwjgl.glfw.GLFW.*;

public class GlfwAction {

    public static Action byGlfwValue(int value) {
        return switch(value) {
            case GLFW_RELEASE -> Action.RELEASE;
            case GLFW_PRESS   -> Action.PRESS;
            case GLFW_REPEAT  -> Action.REPEAT;
            default -> null;
        };
    }

}
