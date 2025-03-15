package jpize.lwjgl.glfw.input;

import jpize.context.input.Action;
import jpize.context.input.Key;
import jpize.context.input.Mods;
import jpize.context.input.MouseBtn;
import jpize.lwjgl.context.GlfwContext;

import java.util.BitSet;

public class InputMonitor {

    private final BitSet keysDown, keysPressed, keysUp;
    private final BitSet btnsDown, btnsPressed, btnsUp;
    private float scrollX, scrollY;

    public InputMonitor(GlfwContext context) {
        this.keysDown = new BitSet(Key.values().length);
        this.keysPressed = new BitSet(Key.values().length);
        this.keysUp = new BitSet(Key.values().length);

        this.btnsDown = new BitSet(MouseBtn.values().length);
        this.btnsPressed = new BitSet(MouseBtn.values().length);
        this.btnsUp = new BitSet(MouseBtn.values().length);

        context.getCallbacks().addKey(this::onKey);
        context.getCallbacks().addMouseButton(this::onButton);
        context.getCallbacks().addScroll(this::onScroll);
    }

    private void onKey(Key key, int scancode, Action action, Mods mods) {
        final int index = key.ordinal();
        if(action.isPressed()) {
            keysDown.set(index);
            keysPressed.set(index, true);
        }else{
            keysUp.set(index);
            keysPressed.set(index, false);
        }
    }

    private void onButton(MouseBtn button, Action action, Mods mods) {
        final int index = button.ordinal();
        if(action.isPressed()) {
            btnsDown.set(index);
            btnsPressed.set(index, true);
        }else{
            btnsUp.set(index);
            btnsPressed.set(index, false);
        }
    }

    private void onScroll(float scrollX, float scrollY) {
        this.scrollX += scrollX;
        this.scrollY += scrollY;
    }

    public void clear() {
        keysDown.clear();
        keysUp.clear();
        btnsDown.clear();
        btnsUp.clear();
        scrollX = 0;
        scrollY = 0;
    }
    
    public boolean isKeyDown(Key key) {
        return keysDown.get(key.ordinal());
    }

    public boolean isKeyPressed(Key key) {
        return keysPressed.get(key.ordinal());
    }

    public boolean isKeyUp(Key key) {
        return keysUp.get(key.ordinal());
    }

    public boolean isMouseButtonDown(MouseBtn button) {
        return btnsDown.get(button.ordinal());
    }

    public boolean isMouseButtonPressed(MouseBtn button) {
        return btnsPressed.get(button.ordinal());
    }

    public boolean isMouseButtonUp(MouseBtn button) {
        return btnsUp.get(button.ordinal());
    }

    public float getScrollX() {
        return scrollX;
    }

    public float getScrollY() {
        return scrollY;
    }

}
