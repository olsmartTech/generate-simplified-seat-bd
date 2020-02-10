/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.table.exporter;

import com.generate.simplified.core.utilitarios.JFileChooserModel;
import java.awt.Color;
import java.awt.Desktop;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author samsung
 */
public class ExcelWriter {

    private static final Logger LOGGER = Logger.getLogger(ExcelWriter.class);

    public void Writer(JTable table, String[] headExcel) {
        JFileChooser save = new JFileChooser();
        save.setDialogTitle("Save as...");
        save.setFileFilter(new FileNameExtensionFilter("xls", "xlsx", "xlsm"));
        File file = new File("FormatAsientoSimplificado.xlsx");
        save.setSelectedFile(file);
        save.getSelectedFile();
        System.out.println("MOSTRANDO EL CONTENIDO DEL VECTOR: " + table.getRowCount());
        int choose = save.showSaveDialog(null);
        if (choose == JFileChooser.APPROVE_OPTION) {
            XSSFWorkbook export = new XSSFWorkbook();
            XSSFSheet sheet = export.createSheet("Asiento simplificado");
            try {
                /*Row header = sheet.createRow(0);
                Cell cell;
                cell = header.createCell(0);
                cell.setCellValue("RAZON SOCIAL");
                */
                TableModel tableModel = table.getModel();
                XSSFFont titleFont = export.createFont();
                titleFont.setFontName("simsun");
                titleFont.setBold(true);
                // titleFont.setFontHeightInPoints((short) 14);
                titleFont.setColor(IndexedColors.BLACK.getIndex()); 
                
                sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, 2));
                //for (int i = 5; i < 6; i++) {
                for (int j = 0; j < headExcel.length - 1; j++) {
                    if (headExcel[j] != null) {
                        String[] v = headExcel[j].split(":");
                        int colIni = Integer.parseInt(v[1]);
                        int colEnd = Integer.parseInt(v[2]);
                        if (j == colIni) {
                            //System.out.println("EMCABEZADO EXCEL>>: ( " + j + " )" + headExcel[j]);
                            sheet.addMergedRegion(new CellRangeAddress(0, 0, colIni, colEnd));
                        }
                    }
                }
                //}
                
                for (int i = 0; i < tableModel.getRowCount(); i++) {
                    XSSFRow newRow = sheet.createRow(i);
                    for (int j = 0; j < tableModel.getColumnCount(); j++) {
                        XSSFCell newCell = newRow.createCell((short) j);
                        if (i == 0) {
                            XSSFCellStyle style = export.createCellStyle();
                            style.setFillForegroundColor(new XSSFColor(new Color(255, 255, 255)));
                            style.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
                            style.setFont(titleFont);
                            style.setAlignment(HorizontalAlignment.CENTER);
                            style.setBorderBottom(BorderStyle.THIN);
                            style.setBorderTop(BorderStyle.THIN);
                            style.setBorderLeft(BorderStyle.THIN);
                            style.setBorderRight(BorderStyle.THIN);
                            newCell.setCellStyle(style);
                            //System.out.println("EMCABEZADO EXCEL>>: " + headExcel[j]);
                            if (headExcel[j] != null) {
                                String[] v = headExcel[j].split(":");
                                newCell.setCellValue(v[0]);
                            }
                            if (j == 0) {
                                newCell.setCellValue("DESCRIPCIONES");
                            }
                        } else if (i == 1) {
                            XSSFCellStyle style = export.createCellStyle();
                            style.setFillForegroundColor(new XSSFColor(new Color(255, 255, 255)));
                            style.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
                            style.setAlignment(HorizontalAlignment.CENTER);
                            style.setFont(titleFont);
                            style.setBorderBottom(BorderStyle.THIN);
                            style.setBorderTop(BorderStyle.THIN);
                            style.setBorderLeft(BorderStyle.THIN);
                            style.setBorderRight(BorderStyle.THIN);
                            newCell.setCellStyle(style);
                            newCell.setCellValue(tableModel.getColumnName(j));
                        } else if (i > 1) {
                            XSSFCellStyle style = export.createCellStyle();
                            style.setBorderBottom(BorderStyle.THIN);
                            style.setBorderTop(BorderStyle.THIN);
                            style.setBorderLeft(BorderStyle.THIN);
                            style.setBorderRight(BorderStyle.THIN);
                            newCell.setCellStyle(style);
                            newCell.setCellValue(tableModel.getValueAt(i, j).toString());
                        }
                    }
                }
                System.out.println(" >>>RUTA DE EXCELL: " + save.getSelectedFile());
                FileOutputStream otp = new FileOutputStream(save.getSelectedFile());
                BufferedOutputStream bos = new BufferedOutputStream(otp);
                export.write(bos);
                bos.close();
                otp.close();
                String path = save.getSelectedFile().toString().replace("\\", "/");
                System.out.println("new RUTA DE EXCELL: " + path);
                File dir = new File(path);
                Desktop.getDesktop().open(dir);
                JOptionPane.showMessageDialog(null, "EL DOCUMENTO FUE CREADO CON EXITO!", "ALERT", 1);
            } catch (Exception e) {
                //JOptionPane.showMessageDialog(null, e);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "EL ARCHIVO NO FUE SELECCIONADO", "ALERT", 1);
        }
    }

}
