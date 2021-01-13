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
public class Penyangga {
    private float x;
    private float y;
    private float z;
    
    public Penyangga(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Penyangga(float f, float f0, float f1, float textureTop, float textureBottom, float textureLeft, float textureRight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    public void Buat_Penyangga(GLAutoDrawable drawable){
        GL gl = drawable.getGL();
        
        gl.glLoadIdentity();
        gl.glTranslatef(x, y, z);
        
        gl.glBegin(GL.GL_QUADS);
        
        // sisi atas
        gl.glColor3f(0.2f, 0.2f, 0.17f); // Itam abu
        gl.glVertex3f(0.3f, 0.3f, -0.3f); // titik kanan atas belakang
        gl.glVertex3f(-0.3f, 0.3f, -0.3f); // titik kiri atas belakang
        gl.glVertex3f(-0.3f, 0.3f, 0.3f); // titik kiri atas depan
        gl.glVertex3f(0.3f, 0.3f, 0.3f); // titik kanan atas depan
        
        // sisi bawah
        gl.glColor3f(0.2f, 0.2f, 0.17f); // Itam abu
        gl.glVertex3f(0.3f, -0.3f, 0.3f); // titik kanan bawah depan
        gl.glVertex3f(-0.3f, -0.3f, 0.3f); // titik kiri bawah depan 
        gl.glVertex3f(-0.3f, -0.3f, -0.3f); // titik kiri bawah belakang 
        gl.glVertex3f(0.3f, -0.3f, -0.3f); // titik kanan bawah belakang
        
        // sisi depan
        gl.glColor3f(0.2f, 0.2f, 0.17f); // Itam abu
        gl.glVertex3f(0.3f, 0.5f, 0.3f); // titik kanan atas depan
        gl.glVertex3f(-0.3f, 0.5f, 0.3f); // tiitk kiri atas depan
        gl.glVertex3f(-0.3f, -0.3f, 0.3f); // titik kiri bawah depan 
        gl.glVertex3f(0.3f, -0.3f, 0.3f); // titik kanan bawah depan
        
        // sisi belakang
        gl.glColor3f(0.2f, 0.2f, 0.17f); // Itam abu
        gl.glVertex3f(0.3f, -0.3f, -0.3f); // titik kanan bawah belakang 
        gl.glVertex3f(-0.3f, -0.3f, -0.3f); // titik kiri bawah belakang
        gl.glVertex3f(-0.3f, 0.5f, -0.3f); // titik kiri atas belakang
        gl.glVertex3f(0.3f, 0.5f, -0.3f); // titik kanan atas belakang
        
        // sisi kiri
        gl.glColor3f(0.2f, 0.2f, 0.17f); // Itam abu
        gl.glVertex3f(-0.3f, 0.5f, 0.3f); // titik kiri atas depan
        gl.glVertex3f(-0.3f, 0.5f, -0.3f); // titik kiri atas belakang
        gl.glVertex3f(-0.3f, -0.3f, -0.3f); // titik kiri bawah belakang
        gl.glVertex3f(-0.3f, -0.3f, 0.3f); // titik kiri bawah depan
        
        // sisi kanan
        gl.glColor3f(0.2f, 0.2f, 0.17f); // Itam abu
        gl.glVertex3f(0.3f, 0.5f, -0.3f); // titik kanan atas belakang
        gl.glVertex3f(0.3f, 0.5f, 0.3f); // titik kanan atas depan
        gl.glVertex3f(0.3f, -0.3f, 0.3f); // titik kanan belakang depan
        gl.glVertex3f(0.3f, -0.3f, -0.3f); // titik kanan bawah belakang
        
        gl.glEnd(); 
        gl.glFlush();
        
    }
}
