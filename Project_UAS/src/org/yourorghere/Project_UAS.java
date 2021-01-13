package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;



/**
 * Project_UAS.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Project_UAS implements GLEventListener {

     private static String TITLE = "3D Shapes";
    private static final int CANVAS_WIDTH = 320;  // width of the drawable
    private static final int CANVAS_HEIGHT = 240; // height of the drawable
    private static final int FPS = 50; // animator's target frames per second
    
    // Setup OpenGL Graphics Renderer
    private GLU glu;  // for the GL Utility
    private float anglePyramid = 0.0f;  // rotational angle in degree for pyramid
    private float speedPyramid = 2.0f;  // rotational speed for pyramid
    
    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Project_UAS());
        frame.add(canvas);
        frame.setSize(640, 480);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        //kotak3d ktk = new kotak3d(0.0f, -2.0f, -15.0f);
        //ktk.kotak(drawable);
        GL gl = drawable.getGL();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT); // clear color and depth buffers
        gl.glLoadIdentity();  // reset the model-view matrix
        
        // Obor
        Tangkai tgk = new Tangkai(0.0f, -3.0f, -9.0f);
        tgk.Buat_Tangkai(drawable);
        
        Api_Bawah apb = new Api_Bawah(0.0f, 0.2f, -8.0f,anglePyramid,speedPyramid);
        apb.BuatApi_Bawah(drawable);
        
        Api_Atas apt = new Api_Atas(0.0f, 1.6f, -8.0f, anglePyramid,speedPyramid);
        apt.BuatApi_Atas(drawable);
        
        Penyangga pnygg = new Penyangga(0.0f, -0.4f, -8.0f);
        pnygg.Buat_Penyangga(drawable);
        
        anglePyramid += speedPyramid;
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
}

