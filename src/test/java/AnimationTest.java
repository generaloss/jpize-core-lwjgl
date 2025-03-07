import jpize.app.Jpize;
import jpize.app.JpizeApplication;
import jpize.lwjgl.app.GlfwContextBuilder;
import jpize.opengl.gl.Gl;
import jpize.opengl.texture.Texture2D;
import jpize.util.mesh.TextureBatch;
import jpize.util.Animation;
import jpize.util.region.TextureRegion;

public class AnimationTest extends JpizeApplication {

    private TextureBatch batch;
    private Animation<TextureRegion> animation;
    private float time;

    public void init() {
        this.batch = new TextureBatch();
        Gl.clearColor(0.3, 0.4, 0.7);

        final Texture2D texture = new Texture2D("/animation.png");

        final int COLUMNS = 4;
        final int ROWS = 1;
        final int frameWidth = texture.getWidth() / COLUMNS;
        final int frameHeight = texture.getHeight() / ROWS;

        final TextureRegion[] regions = new TextureRegion[COLUMNS * ROWS];
        for(int i = 0; i < COLUMNS; i++)
            regions[i] = new TextureRegion(texture, i * frameWidth, 0, frameWidth, frameHeight);

        this.animation = new Animation<>(0.15F, Animation.Mode.LOOP, regions);
    }

    @Override
    public void render() {
        Gl.clearColorBuffer();
        batch.setup();

        time += Jpize.getDeltaTime();
        batch.draw(animation.getKeyFrame(time), 100, 100, 300, 300);

        batch.render();
    }

    @Override
    public void dispose() {
        batch.dispose();
    }


    public static void main(String[] args) {
        GlfwContextBuilder.create(720, 480, "Window")
            .build().setApp(new AnimationTest());
        Jpize.run();
    }

}
