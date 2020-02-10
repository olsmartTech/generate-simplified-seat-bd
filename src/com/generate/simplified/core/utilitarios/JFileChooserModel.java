/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.utilitarios;
  
  import java.io.File;
  import javax.swing.JFileChooser;
  import javax.swing.JOptionPane;
  
  public class JFileChooserModel extends JFileChooser
  {
    public void approveSelection()
    {
      File f = getSelectedFile();
      if ((f.exists()) && (getDialogType() == 1)) {
        int result = JOptionPane.showConfirmDialog(getTopLevelAncestor(), "El archivo seleccionado ya existe. Â¿Desea sobreescribirlo?", "El archivo ya existe", 1, 3);
  
        switch (result) {
        case 0:
          super.approveSelection();
          return;
        case 1:
          return;
        case 2:
          cancelSelection();
          return;
        }
      }
      super.approveSelection();
    }
  } 