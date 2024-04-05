/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS.Pallete;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import javax.swing.JPanel;

/**
 *
 * @author ACER
 */
public class PanelCustom extends JPanel {
    
    private int roundedTopLeft = 0;
    int roundedTopRight = 0;
    int roundedBottomLeft = 0;
    int roundedBottomRight = 0;

    public int getRoundedTopLeft() {
        return roundedTopLeft;
    }

    public void setRoundedTopLeft(int roundedTopLeft) {
        this.roundedTopLeft = roundedTopLeft;
    }

    public int getRoundedTopRight() {
        return roundedTopRight;
    }

    public void setRoundedTopRight(int roundedTopRight) {
        this.roundedTopRight = roundedTopRight;
    }

    public int getRoundedBottomLeft() {
        return roundedBottomLeft;
    }

    public void setRoundedBottomLeft(int roundedBottomLeft) {
        this.roundedBottomLeft = roundedBottomLeft;
    }

    public int getRoundedBottomRight() {
        return roundedBottomRight;
    }

    public void setRoundedBottomRight(int roundedBottomRight) {
        this.roundedBottomRight = roundedBottomRight;
    }
    
    
    public PanelCustom()
    {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics graphic) {
        Graphics2D g2 = (Graphics2D) graphic.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        Area area = new Area(createRoundTopLeft());
        
        if(roundedTopRight > 0)
        {
            area.intersect(new Area(createRoundTopRight()));
        }
        
        if(roundedBottomLeft > 0)
        {
            area.intersect(new Area(createRoundBottomLeft()));
        }
        
        if(roundedBottomRight > 0)
        {
            area.intersect(new Area(createRoundBottomRight()));
        }
        
    }

    private Shape createRoundTopLeft() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Shape createRoundTopRight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Shape createRoundBottomLeft() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Shape createRoundBottomRight() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
