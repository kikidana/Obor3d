/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Perdana
 */
public class kotak3d {
    private float x;
    private float y;
    private float z;
    
    public kotak3d(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
     
    public void kotak(GLAutoDrawable drawable){
        GL gl = drawable.getGL();
        
        gl.glLoadIdentity();
        gl.glTranslatef(x, y, z);
        
        gl.glBegin(GL.GL_QUADS);
        
        // sisi atas
        gl.glColor3f(0.0f, 1.0f, 0.0f); // green
        gl.glVertex3f(1.0f, 1.0f, -1.0f);
        gl.glVertex3f(-1.0f, 1.0f, -1.0f);
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        
        // sisi bawah
        gl.glColor3f(1.0f, 0.5f, 0.0f); // orange
        gl.glVertex3f(1.0f, -1.0f, 1.0f); 
        gl.glVertex3f(-1.0f, -1.0f, 1.0f);  
        gl.glVertex3f(-1.0f, -1.0f, -1.0f);  
        gl.glVertex3f(1.0f, -1.0f, -1.0f);
        
        // sisi depan
        gl.glColor3f(1.0f, 0.0f, 0.0f); // red
        gl.glVertex3f(1.0f, 4.0f, 1.0f); // titik kanan atas depan
        gl.glVertex3f(-1.0f, 4.0f, 1.0f); // tiitk kiri atas depan
        gl.glVertex3f(-1.0f, -1.0f, 1.0f); // titik kiri bawah depan 
        gl.glVertex3f(1.0f, -1.0f, 1.0f); // titik kanan bawah depan
        
        // sisi belakang
        gl.glColor3f(1.0f, 1.0f, 0.0f); // yellow
        gl.glVertex3f(1.0f, -1.0f, -1.0f); // titik kanan bawah belakang 
        gl.glVertex3f(-1.0f, -1.0f, -1.0f); // titik kiri bawah belakang
        gl.glVertex3f(-1.0f, 4.0f, -1.0f); // titik kiri atas belakang
        gl.glVertex3f(1.0f, 4.0f, -1.0f); // titik kanan atas belakang
        
        // sisi kiri
        gl.glColor3f(0.0f, 0.0f, 1.0f); // blue
        gl.glVertex3f(-1.0f, 4.0f, 1.0f); // titik kiri atas depan
        gl.glVertex3f(-1.0f, 4.0f, -1.0f); // titik kiri atas belakang
        gl.glVertex3f(-1.0f, -1.0f, -1.0f); // titik kiri bawah belakang
        gl.glVertex3f(-1.0f, -1.0f, 1.0f); // titik kiri bawah depan
        
        // sisi kanan
        gl.glColor3f(1.0f, 0.0f, 1.0f); // violet
        gl.glVertex3f(1.0f, 4.0f, -1.0f); // titik kanan atas belakang
        gl.glVertex3f(1.0f, 4.0f, 1.0f); // titik kanan atas depan
        gl.glVertex3f(1.0f, -1.0f, 1.0f); // titik kanan belakang depan
        gl.glVertex3f(1.0f, -1.0f, -1.0f); // titik kanan bawah belakang
        
        gl.glEnd(); 
        gl.glFlush();
    }
}
