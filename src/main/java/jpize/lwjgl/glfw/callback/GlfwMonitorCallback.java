package jpize.lwjgl.glfw.callback;

import jpize.context.input.ConnectEvent;
import jpize.lwjgl.glfw.monitor.GlfwMonitor;

public interface GlfwMonitorCallback {

    void invoke(GlfwMonitor monitor, ConnectEvent event);

}
