import jpize.context.Jpize;
import jpize.context.JpizeApplication;
import jpize.lwjgl.app.GlfwContextBuilder;
import jpize.util.font.Font;
import jpize.opengl.texture.Texture2D;
import jpize.util.mesh.TextureBatch;

public class LoadingWindowTest {

    private static class MainWindow extends JpizeApplication { /* ... */ }

    private static class LoadingWindow extends JpizeApplication {
        TextureBatch batch = new TextureBatch();
        Texture2D bg = new Texture2D("/bg.png");
        Font font = new Font().loadFNT("/font.fnt", false);//.loadDefault();
        public void init() {
            font.getOptions().scale().set(3F);
            // show window because usually the window shows after init()
            Jpize.window.show();

            // render
            batch.setup();
            batch.draw(bg, 0, 0, Jpize.getWidth(), Jpize.getHeight());
            font.drawText(batch, "Loading...", 50, 50);
            batch.render();

            // swap buffers to display the rendered content
            Jpize.window.swapBuffers();
            // disable render() to prevent epilepsy
            Jpize.context.disableRender(true);

            // create main window in 2 seconds
            Jpize.syncExecutor().execLater(2F, () -> {
                GlfwContextBuilder.create(1280, 720, "Content Window")
                    .icon("/icon.png").build()
                    .setApp(new MainWindow());
                // close loading window
                Jpize.exitOthers();
            });
        }
        public void dispose() {
            batch.dispose();
            bg.dispose();
            font.dispose();
        }
    }

    public static void main(String[] args) {
        GlfwContextBuilder.create(720, 480, "Loading...")
            .decorated(false).resizable(false)
            .build().setApp(new LoadingWindow());

        Jpize.run();
    }

}
