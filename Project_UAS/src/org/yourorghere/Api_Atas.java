/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;

/**
 *
 * @author Perdana
 */
public class Api_Atas {
    private float x;
    private float y;
    private float z;
    private float anglePyramid;
    private float speedPyramid;
    
    public Api_Atas(float x, float y, float z, float anglePyramid, float speedPyramid){
        this.x = x;
        this.y = y;
        this.z = z;
        this.anglePyramid = anglePyramid;
        this.speedPyramid = speedPyramid;
    }
    
    public void BuatApi_Atas(GLAutoDrawable drawable){
        GL gl = drawable.getGL();
        
        gl.glLoadIdentity();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(anglePyramid, 0.0f, 1.0f, 0.0f); // rotate
        
        gl.glBegin(GL.GL_TRIANGLES);
        
        // sisi depan triangle
        gl.glColor3f(1.0f, 1.0f, 0.0f); // yellow
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glColor3f(1.0f, 0.0f, 0.0f);  // Red
        gl.glVertex3f(-0.7f, -0.7f, 0.7f);
        gl.glVertex3f(0.7f, -0.7f, 0.7f);
        
        // sisi kanan triangle
        gl.glColor3f(1.0f, 1.0f, 0.0f); // yellow
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glColor3f(1.0f, 0.0f, 0.0f);  // Red
        gl.glVertex3f(0.7f, -0.7f, 0.7f);
        gl.glVertex3f(0.7f, -0.7f, -0.7f);

        // sisi belakang triangle
        gl.glColor3f(1.0f, 1.0f, 0.0f); // yellow
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glColor3f(1.0f, 0.0f, 0.0f);  // Red
        gl.glVertex3f(0.7f, -0.7f, -0.7f);
        gl.glVertex3f(-0.7f, -0.7f, -0.7f);

        // sisi kiri triangle
        gl.glColor3f(1.0f, 1.0f, 0.0f); // yellow
        gl.glVertex3f(0.0f, 1.0f, 0.0f);
        gl.glColor3f(1.0f, 0.0f, 0.0f);  // Red
        gl.glVertex3f(-0.7f, -0.7f, -0.7f);
        gl.glVertex3f(-0.7f, -0.7f, 0.7f);
        
        gl.glEnd(); 
        gl.glFlush();
    }
}
