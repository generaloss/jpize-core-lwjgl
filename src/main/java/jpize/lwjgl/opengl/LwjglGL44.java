package jpize.lwjgl.opengl;

import jpize.opengl.gl.GLI44;
import org.lwjgl.opengl.GL44;
import java.nio.*;

public class LwjglGL44 extends LwjglGL43 implements GLI44 {

    @Override
    public void nglBufferStorage(int target, long size, long data, int flags) {
        GL44.nglBufferStorage(target, size, data, flags);
    }

    @Override
    public void glBufferStorage(int target, long size, int flags) {
        GL44.glBufferStorage(target, size, flags);
    }

    @Override
    public void glBufferStorage(int target, ByteBuffer data, int flags) {
        GL44.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, ShortBuffer data, int flags) {
        GL44.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, IntBuffer data, int flags) {
        GL44.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, FloatBuffer data, int flags) {
        GL44.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, DoubleBuffer data, int flags) {
        GL44.glBufferStorage(target, data, flags);
    }

    @Override
    public void nglClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, long data) {
        GL44.nglClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ByteBuffer data) {
        GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, ShortBuffer data) {
        GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, IntBuffer data) {
        GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, FloatBuffer data) {
        GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, DoubleBuffer data) {
        GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void nglClearTexImage(int texture, int level, int format, int type, long data) {
        GL44.nglClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, ByteBuffer data) {
        GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, ShortBuffer data) {
        GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, IntBuffer data) {
        GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, FloatBuffer data) {
        GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, DoubleBuffer data) {
        GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void nglBindBuffersBase(int target, int first, int count, long buffers) {
        GL44.nglBindBuffersBase(target, first, count, buffers);
    }

    @Override
    public void glBindBuffersBase(int target, int first, IntBuffer buffers) {
        GL44.glBindBuffersBase(target, first, buffers);
    }

    @Override
    public void nglBindBuffersRange(int target, int first, int count, long buffers, long offsets, long sizes) {
        GL44.nglBindBuffersRange(target, first, count, buffers, offsets, sizes);
    }

    @Override
    public void nglBindTextures(int first, int count, long textures) {
        GL44.nglBindTextures(first, count, textures);
    }

    @Override
    public void glBindTextures(int first, IntBuffer textures) {
        GL44.glBindTextures(first, textures);
    }

    @Override
    public void nglBindSamplers(int first, int count, long samplers) {
        GL44.nglBindSamplers(first, count, samplers);
    }

    @Override
    public void glBindSamplers(int first, IntBuffer samplers) {
        GL44.glBindSamplers(first, samplers);
    }

    @Override
    public void nglBindImageTextures(int first, int count, long textures) {
        GL44.nglBindImageTextures(first, count, textures);
    }

    @Override
    public void glBindImageTextures(int first, IntBuffer textures) {
        GL44.glBindImageTextures(first, textures);
    }

    @Override
    public void nglBindVertexBuffers(int first, int count, long buffers, long offsets, long strides) {
        GL44.nglBindVertexBuffers(first, count, buffers, offsets, strides);
    }

    @Override
    public void glBufferStorage(int target, short[] data, int flags) {
        GL44.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, int[] data, int flags) {
        GL44.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, float[] data, int flags) {
        GL44.glBufferStorage(target, data, flags);
    }

    @Override
    public void glBufferStorage(int target, double[] data, int flags) {
        GL44.glBufferStorage(target, data, flags);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, short[] data) {
        GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, int[] data) {
        GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, float[] data) {
        GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth, int format, int type, double[] data) {
        GL44.glClearTexSubImage(texture, level, xoffset, yoffset, zoffset, width, height, depth, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, short[] data) {
        GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, int[] data) {
        GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, float[] data) {
        GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glClearTexImage(int texture, int level, int format, int type, double[] data) {
        GL44.glClearTexImage(texture, level, format, type, data);
    }

    @Override
    public void glBindBuffersBase(int target, int first, int[] buffers) {
        GL44.glBindBuffersBase(target, first, buffers);
    }

    @Override
    public void glBindTextures(int first, int[] textures) {
        GL44.glBindTextures(first, textures);
    }

    @Override
    public void glBindSamplers(int first, int[] samplers) {
        GL44.glBindSamplers(first, samplers);
    }

    @Override
    public void glBindImageTextures(int first, int[] textures) {
        GL44.glBindImageTextures(first, textures);
    }

}