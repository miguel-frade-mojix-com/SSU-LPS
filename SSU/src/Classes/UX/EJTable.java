/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes.UX;

/**
 *
 * @author Miguel
 */

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import  java.awt.Component;



public class EJTable extends JTable {

    
    @Override
    public Component prepareRenderer(TableCellRenderer ren, int row, int col){
        Component comp= super.prepareRenderer(ren, row, col);
        if( Short.class.equals(this.getColumnClass(col)) && getValueAt(row, col)!=null  ){

            int val = Integer.parseInt(getValueAt(row, col).toString());

            System.out.println("Classes.UX.EJTable.prepareRenderer()   "+ val);

            if(val>0){
              paintComponent(ren,row,col,Color.GREEN);
            }else if(val<0){
                  paintComponent(ren,row,col,Color.RED);
            }        
        }else if (this.isCellSelected(row, col) ){
            paintComponent(ren, row, 4, Color.cyan);
            
        }
        
        return comp;
    }
    
    
    public void paintComponent(TableCellRenderer ren,int row ,int col, Color color){
        for(int i=0;i<col;i++){
            Component comp= super.prepareRenderer(ren, row, i);
            comp.setBackground(color);
        }
    
    }
    
}
