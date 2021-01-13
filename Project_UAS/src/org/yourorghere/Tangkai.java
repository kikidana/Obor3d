/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureCoords;
import com.sun.opengl.util.texture.TextureIO;
import java.io.IOException;
/**
 *
 * @author Perdana
 */
public class Tangkai {
    
    private float x;
    private float y;
    private float z;
    
    public Tangkai(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;        
    }
    
     
    public void Buat_Tangkai(GLAutoDrawable drawable){
        GL gl = drawable.getGL();

        gl.glLoadIdentity();
        gl.glTranslatef(x, y, z);
        
        gl.glBegin(GL.GL_QUADS);
        
        // sisi atas
        gl.glColor3f(0.74f, 0.59f, 0.33f); // Coklat Terang
        gl.glVertex3f(0.2f, 0.2f, -0.2f); // titik kanan atas belakang
        gl.glVertex3f(-0.2f, 0.2f, -0.2f); // titik kiri atas belakang
        gl.glVertex3f(-0.2f, 0.2f, 0.2f); // titik kiri atas depan
        gl.glVertex3f(0.2f, 0.2f, 0.2f); // titik kanan atas depan
        
        // sisi bawah
        gl.glColor3f(0.47f, 0.3f, 0.015f); // Coklat
        gl.glVertex3f(0.2f, -0.2f, 0.2f); // titik kanan bawah depan
        gl.glVertex3f(-0.2f, -0.2f, 0.2f); // titik kiri bawah depan 
        gl.glVertex3f(-0.2f, -0.2f, -0.2f); // titik kiri bawah belakang 
        gl.glVertex3f(0.2f, -0.2f, -0.2f); // titik kanan bawah belakang
        
        // sisi depan
        gl.glColor3f(0.74f, 0.59f, 0.33f); // Coklat Terang
        gl.glVertex3f(0.2f, 3.2f, 0.2f); // titik kanan atas depan
        gl.glColor3f(0.74f, 0.59f, 0.33f); // Coklat Terang
        gl.glVertex3f(-0.2f, 3.2f, 0.2f); // tiitk kiri atas depan
        gl.glColor3f(0.47f, 0.3f, 0.015f); // Coklat
        gl.glVertex3f(-0.2f, -0.2f, 0.2f); // titik kiri bawah depan 
        gl.glVertex3f(0.2f, -0.2f, 0.2f); // titik kanan bawah depan
        
        // sisi belakang
        gl.glColor3f(0.47f, 0.3f, 0.015f); // Coklat
        gl.glVertex3f(0.2f, -0.2f, -0.2f); // titik kanan bawah belakang 
        gl.glVertex3f(-0.2f, -0.2f, -0.2f); // titik kiri bawah belakang
        gl.glColor3f(0.74f, 0.59f, 0.33f); // Coklat Terang
        gl.glVertex3f(-0.2f, 3.2f, -0.2f); // titik kiri atas belakang
        gl.glColor3f(0.74f, 0.59f, 0.33f); // Coklat Terang
        gl.glVertex3f(0.2f, 3.2f, -0.2f); // titik kanan atas belakang
        
        // sisi kiri
        gl.glColor3f(0.74f, 0.59f, 0.33f); // Coklat Terang
        gl.glVertex3f(-0.2f, 3.2f, 0.2f); // titik kiri atas depan
        gl.glColor3f(0.74f, 0.59f, 0.33f); // Coklat Terang
        gl.glVertex3f(-0.2f, 3.2f, -0.2f); // titik kiri atas belakang
        gl.glColor3f(0.47f, 0.3f, 0.015f); // Coklat
        gl.glVertex3f(-0.2f, -0.2f, -0.2f); // titik kiri bawah belakang
        gl.glVertex3f(-0.2f, -0.2f, 0.2f); // titik kiri bawah depan
        
        // sisi kanan
        gl.glColor3f(0.74f, 0.59f, 0.33f); // Coklat Terang
        gl.glVertex3f(0.2f, 3.2f, -0.2f); // titik kanan atas belakang
        gl.glColor3f(0.74f, 0.59f, 0.33f); // Coklat Terang
        gl.glVertex3f(0.2f, 3.2f, 0.2f); // titik kanan atas depan
        gl.glColor3f(0.47f, 0.3f, 0.015f); // Coklat
        gl.glVertex3f(0.2f, -0.2f, 0.2f); // titik kanan belakang depan
        gl.glVertex3f(0.2f, -0.2f, -0.2f); // titik kanan bawah belakang
        
        gl.glEnd(); 
        gl.glFlush();
        
    }
}
