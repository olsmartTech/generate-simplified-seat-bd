/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.quinto.swing.table.view;

import com.generate.simplified.core.utilitarios.Constants;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

import com.generate.simplified.core.model.HeaderTab;
import com.generate.simplified.core.model.ParamBean;
import com.generate.simplified.core.model.Position;
import com.sun.java.swing.plaf.motif.MotifLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Toolkit;
import com.generate.simplified.core.model.ParamRC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.MetalTheme;
import javax.swing.plaf.metal.OceanTheme;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.table.TableColumn;
import org.apache.log4j.Logger;
import org.quinto.swing.table.model.IModelFieldGroup;
import org.quinto.swing.table.model.ModelData;
import org.quinto.swing.table.model.ModelField;
import org.quinto.swing.table.model.ModelFieldGroup;
import org.quinto.swing.table.model.ModelRow;
import org.quinto.swing.table.model.Utils;
import com.generate.simplified.core.accounting.service.AccountingCategoryServiceImpl;
import com.generate.simplified.core.entity.AccountCategories;
import com.generate.simplified.core.entity.AccountCategoriesDet;
import com.generate.simplified.core.entity.JModernScrollPane;
import com.generate.simplified.core.utilitarios.Constants;
import static com.sun.javafx.tk.Toolkit.getToolkit;
import com.generate.simplified.core.model.CajaBancosBean;
import com.generate.simplified.core.model.ParamSeat;
import com.generate.simplified.core.rc.service.impl.RcServiceImpl;
import com.generate.simplified.core.utilitarios.JFileChooserModel;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JViewport;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumnModel;
import com.generate.simplified.core.table.exporter.ExcelWriter;
import org.quinto.swing.table.view.CustomTableHeaderRenderer;
import org.quinto.swing.table.view.JBroTable;

/**
 *
 * @author samsung
 */
public class PanelAsientoSimplificado extends JPanel {

    private static final Logger LOGGER = Logger.getLogger(PanelAsientoSimplificado.class);
    public FileNameExtensionFilter filterXLX = new FileNameExtensionFilter("xlsx", new String[]{"xlsx"});
    private final JFileChooserModel fileChooser = new JFileChooserModel();
    private JPanel paneControls, paneTable;
    private List<HeaderTab> lstTitle = null;// = new ArrayList();
    private List<HeaderTab> lstHead = null;// new ArrayList();
    private JBroTable tableSeatSimp;
    private JDateChooser fechaSearchStart, fechaSearchEnd;
    private JRadioButton rbByPeriodic, rbByDate;
    private JYearChooser jYearChooser1;
    private JMonthChooser jMonthChooser1;
    private JTextField txtHaber, txtDiferencia, txtDebe;
    private ParamSeat paramSeat;
    public PanelAsientoSimplificado(ParamSeat paramSeat) {
        this.paramSeat=paramSeat;
        Inicio();
        controls();
    }

    private void Inicio() {
        setLayout(null);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);
        setOpaque(true);
        setBackground(null);
    }

    private void controls() {
        paneControls = new JPanel();
        paneControls.setLayout(null);
        paneControls.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Constants.COLOR_BORDER_PANEL));
        paneControls.setBackground(Constants.COLOR_FONDO_PANEL);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        paneControls.setBounds(0, 0, screenSize.width, screenSize.height);

        JLabel lblPeriodo = new JLabel("Periodo");
        lblPeriodo.setBounds(5, 5, 50, 20);
        lblPeriodo.setFont(new java.awt.Font("Verdana", 0, 12));
        paneControls.add(lblPeriodo);
        
        jYearChooser1 = new JYearChooser();
        jYearChooser1.setBounds(lblPeriodo.getWidth() + lblPeriodo.getX(), lblPeriodo.getY(), 80, 25);
        jYearChooser1.setEnabled(true);
        paneControls.add(jYearChooser1);
        
        JLabel lblFecFin = new JLabel("Mes:");
        lblFecFin.setBounds(jYearChooser1.getWidth() + jYearChooser1.getX() + 10, jYearChooser1.getY(), 30, 20);
        lblFecFin.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        paneControls.add(lblFecFin);

        jMonthChooser1 = new JMonthChooser();
        jMonthChooser1.setBounds(lblFecFin.getWidth() + lblFecFin.getX(), lblFecFin.getY(), 150, 25);
        jMonthChooser1.setEnabled(true);
        paneControls.add(jMonthChooser1);

        JLabel lblFecStart = new JLabel("Desde:");
        lblFecStart.setBounds(jMonthChooser1.getX() + jMonthChooser1.getWidth(), jMonthChooser1.getY(), 50, 20);
        lblFecStart.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        paneControls.add(lblFecStart);

        fechaSearchStart = new JDateChooser();
        fechaSearchStart.setBounds(lblFecStart.getX() + lblFecStart.getWidth(), lblFecStart.getY(), 150, 25);
        fechaSearchStart.setDate(new Date());
        fechaSearchStart.setEnabled(true);
        paneControls.add(fechaSearchStart);

        JLabel lblFecEnd = new JLabel("Hasta:");
        lblFecEnd.setBounds(fechaSearchStart.getX() + fechaSearchStart.getWidth() + 5, fechaSearchStart.getY(), 50, 20);
        lblFecEnd.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        paneControls.add(lblFecEnd);

        fechaSearchEnd = new JDateChooser();
        fechaSearchEnd.setBounds(lblFecEnd.getX() + lblFecEnd.getWidth(), lblFecEnd.getY(), 150, 25);
        fechaSearchEnd.setDate(new Date());
        fechaSearchEnd.setEnabled(true);
        paneControls.add(fechaSearchEnd);

        rbByPeriodic = new JRadioButton("Por Periodo");
        rbByPeriodic.setBounds(fechaSearchEnd.getX() + fechaSearchEnd.getWidth(), fechaSearchEnd.getY(), 100, 25);
        rbByPeriodic.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N  
        rbByPeriodic.setEnabled(true);
        paneControls.add(rbByPeriodic);

        rbByDate = new JRadioButton("Por Fechas");
        rbByDate.setBounds(rbByPeriodic.getX() + rbByPeriodic.getWidth(), rbByPeriodic.getY(), 100, 25);
        rbByDate.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N  
        rbByDate.setEnabled(true);
        paneControls.add(rbByDate);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rbByPeriodic);
        bg.add(rbByDate);
        rbByPeriodic.setSelected(true);

        JButton btnProccess = new JButton("Procesar");
        btnProccess.setBounds(rbByDate.getX() + rbByDate.getWidth(), rbByDate.getY(), 100, 30);
        btnProccess.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N 
        btnProccess.addActionListener(new ProccessSeat());
        paneControls.add(btnProccess);

        paneTable = new JPanel();
        paneTable.setLayout(null);
        paneTable.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Constants.COLOR_BORDER_PANEL));
        paneTable.setBackground(Constants.COLOR_FONDO_PANEL);
        paneTable.setBounds(10, btnProccess.getY() + btnProccess.getHeight() + 10, paneControls.getWidth() - 50, paneControls.getHeight() - 130);

        add(paneControls);
    }

    private void viewGraphifTable() {
        AccountCategories ac = new AccountCategories();
        ac.setCtaOrga(paramSeat.getCtaOrgaId());
        AccountingCategoryServiceImpl impl = new AccountingCategoryServiceImpl();
        LOGGER.info("-------------FORMANDO EL ENCABEZADO----------");
        HeaderTab title;
        HeaderTab head = new HeaderTab();
        head.setKey("Nro Asiento");
        head.setCta("Nro Asiento");
        lstHead.add(head);
        head = new HeaderTab();
        head.setKey("Fecha");
        head.setCta("Fecha");
        lstHead.add(head);
        head = new HeaderTab();
        head.setKey("Descripción");
        head.setCta("Descripción");
        lstHead.add(head);
        List<AccountCategories> list = impl.listViewAccounting(ac);
        for (AccountCategories b : list) {
            ParamBean par = new ParamBean();
            par.setCtaOrga(paramSeat.getCtaOrgaId());
            par.setCodCompany(paramSeat.getCodCompany());
            par.setCcosto(paramSeat.getCcosto());
            par.setCodTypeCta(b.getCodtypecta());
            List<AccountCategoriesDet> listDet = impl.listViewAccountingDet(par);
            title = new HeaderTab();
            title.setKey(b.getName_accounting());
            lstTitle.add(title);
            for (AccountCategoriesDet d : listDet) {
                head = new HeaderTab();
                head.setKey(b.getName_accounting() + "-" + d.getConta().getIde_conta_plantplanconta());
                head.setCta(d.getConta().getIde_conta_plantplanconta());
                head.setNaturaleza(d.getNaturaleza());
                head.setCategory(b.getName_accounting());
                //System.out.println(" -- > "+b.getName_accounting() + " -> " + d.getConta().getIde_conta_plantplanconta());
                lstHead.add(head);
            }
        }
        // Table model.
        int colCnt = lstHead.size();
        List<CajaBancosBean> listRow = listarAsientoContableONLY("_ONLY_ONE");
        listarAsientoContable("_ALL");
        int rowCnt = listRow.size() + 1;
        ModelField fields[] = new ModelField[colCnt];
        String[] nameColl = new String[colCnt];
        String[] modeCta = new String[colCnt];
        String[] category = new String[colCnt];
        String[] headExcel = new String[colCnt];
        //for (int i = 0; i < fields.length; i++) {
        for (int i = 0; i < lstHead.size(); i++) {
            String[] name = lstHead.get(i).getKey().split("-");
            if (i > 2) {
                fields[i] = new ModelField(String.valueOf((char) ('A' + i)), name[1]);
                nameColl[i] = name[1];
                modeCta[i] = lstHead.get(i).getNaturaleza();
                category[i] = lstHead.get(i).getCategory();
            } else {
                fields[i] = new ModelField(String.valueOf((char) ('A' + i)), lstHead.get(i).getKey());
            }
        }
        //}
        ModelFieldGroup groupA = new ModelFieldGroup("OTROS", "OTROS");
        for (int i = 0; i < 3; i++) {
            groupA.withChild(fields[i]);
        }
        ModelFieldGroup groupB = null;
        for (int f = 3; f < lstHead.size(); f++) {
            String[] name = lstHead.get(f).getKey().split("-");
            groupB = new ModelFieldGroup(name[0], name[0]);
            Position pos = checkOutTitle(name[0]);
            //System.out.println(name[0] + " POSITION START: " + pos.getPosiIni() + " POSITION END -> " + pos.getPosiEnd());
            for (int i = pos.getPosiIni(); i < pos.getPosiEnd() + 1; i++) {
                groupB.withChild(fields[i]);
                headExcel[i] = pos.getDescrip() + ":" + pos.getPosiIni() + ":" + (pos.getPosiEnd());
            }
        }
        ModelData data = new ModelData(fields);
        //System.out.println(" DATA HEAD->>" + data.getHeaderString());
        ModelRow rows[] = new ModelRow[rowCnt];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new ModelRow(fields.length);
            for (int j = 0; j < fields.length; j++) {
                if (i < rows.length - 1) {
                    String vaoucher = listRow.get(i).getVoucherOrigin();
                    if (j == 0) {
                        rows[i].setValue(j, vaoucher);
                    }
                    if (j == 1) {
                        String fecha = listData.get(i).getFechaContable();
                        rows[i].setValue(j, fecha);
                    }
                    if (j == 2) {
                        String glosa = listRow.get(i).getGlosa();//listData.get(i).getGlosa();
                        rows[i].setValue(j, glosa);
                    }
                    if (j > 2) {
                        //System.out.println("(" + j + " - " + i + ") nameColl ->> " + nameColl[j]);
                        String date = chechOutDataCell(listRow.get(i).getVoucherOrigin(),
                                Integer.parseInt(listRow.get(i).getCodLibro()),
                                nameColl[j],
                                modeCta[j], category[j]);
                        rows[i].setValue(j, date);
                    }
                } else {
                    System.out.println("NUMERO 37");
                    if (j >= 0 && j < 2) {
                        rows[i].setValue(j, "-");
                    }
                    if (j == 2) {
                        rows[i].setValue(j, "TOTALES");
                    }
                    if (j > 2) {
                        rows[i].setValue(j, "-");
                    }
                }
            }
        }
        data.setRows(rows);
        tableSeatSimp = new JBroTable(data);
        tableSeatSimp.setAutoCreateRowSorter(true);
        tableSeatSimp.setAutoscrolls(true);
        tableSeatSimp.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableSeatSimp.getTableHeader().getUI().setCustomRenderer(new CustomTableHeaderRenderer() {
            @Override
            public Component getTableCellRendererComponent(final Component originalComponent,
                    JBroTable table, Object value, boolean isSelected,
                    boolean hasFocus, boolean isDragged, int row,
                    int viewColumn, int modelColumn, IModelFieldGroup dataField) {
                if (dataField == null || !(originalComponent instanceof JLabel)) {
                    return originalComponent;
                }
                JLabel ret = (JLabel) originalComponent;
                String fieldName = dataField.getIdentifier();
                // "GC" cell is right aligned. Other cells are centered.
                ret.setHorizontalAlignment("GC".equals(fieldName) ? SwingConstants.RIGHT : SwingConstants.CENTER);
                // "D" cell caption is written in bold. Other captions have plain font.
                ret.setFont(ret.getFont().deriveFont("D".equals(fieldName) ? Font.BOLD : Font.PLAIN));
                // "B" cell would be half-transparent red with Windows L&F (not classic).
                // Note that background is reset on each call by underlying renderer so there's no need to reset background for other cells.
                // Properties like alignment and font should be reset on each call if they were changed before.
                if ("B".equals(fieldName) && !originalComponent.getClass().getName().contains("DefaultTableCellHeaderRenderer")) {
                    ret.setBackground(new Color(220, 50, 50, 50));
                }
                // "C" cell would be half-transparent red.
                if ("C".equals(fieldName)) {
                    JPanel p = new JPanel(new GridLayout(1, 1)) {
                        @Override
                        public void paint(Graphics g) {
                            super.paint(g);
                            g.setColor(new Color(220, 50, 50, 50));
                            g.fillRect(0, 0, getWidth(), getHeight());
                        }
                    };
                    p.add(ret);
                    return p;
                }
                return ret;
            }
        });
        setWidthColumns(tableSeatSimp);
        double value = 0;
        for (int c = 3; c < tableSeatSimp.getColumnCount(); c++) {
            for (int f = 0; f < tableSeatSimp.getRowCount() - 1; f++) {
                if (!tableSeatSimp.getValueAt(f, c).toString().equals("")) {
                    value = value + Double.parseDouble(tableSeatSimp.getValueAt(f, c).toString());
                }
            }
            tableSeatSimp.setValueAt(value, tableSeatSimp.getRowCount() - 1, c);
            value = 0;
        }
        //--------------------------------------------------------------
        /**
         * ******************Tabla para diferencia de asientos*********
         */
        //--------------------------------------------------------------
        List<CajaBancosBean> listDif = listSeatSimplifiedDif("");
        String[] headDif = {"NRO ASIENTO", "DIFERENCIA", "DEBE", "HABER"};
        int colCntDif = headDif.length;
        int rowCntDif = listDif.size();
        ModelField fieldDif[] = new ModelField[colCntDif];
        for (int i = 0; i < fieldDif.length; i++) {
            fieldDif[i] = new ModelField(String.valueOf((char) ('A' + i)), headDif[i]);
        }
        ModelFieldGroup groupAA = new ModelFieldGroup("DIFERENCIA DE ASIENTOS", "DIFERENCIA DE ASIENTOS");
        for (int i = 0; i < 4; i++) {
            groupAA.withChild(fieldDif[i]);
        }
        ModelData dataDif = new ModelData(fieldDif);
        ModelRow rowsDif[] = new ModelRow[rowCntDif];
        for (int i = 0; i < rowsDif.length; i++) {
            rowsDif[i] = new ModelRow(fieldDif.length);
            for (int j = 0; j < fieldDif.length; j++) {
                String vaoucher = listDif.get(i).getNroAsiento();
                if (j == 0) {
                    rowsDif[i].setValue(j, vaoucher);
                }
                if (j == 1) {
                    rowsDif[i].setValue(j, listDif.get(i).getDiferencia());
                }
                if (j == 2) {
                    rowsDif[i].setValue(j, listDif.get(i).getDebe());
                }
                if (j == 3) {
                    rowsDif[i].setValue(j, listDif.get(i).getHaber());
                }
            }
        }
        dataDif.setRows(rowsDif);

        // Table view.
        JBroTable tableDif = new JBroTable(dataDif);
        tableDif.setAutoCreateRowSorter(true);
        tableDif.getTableHeader().getUI().setCustomRenderer(new CustomTableHeaderRenderer() {
            @Override
            public Component getTableCellRendererComponent(final Component originalComponent, JBroTable table, Object value, boolean isSelected, boolean hasFocus, boolean isDragged, int row, int viewColumn, int modelColumn, IModelFieldGroup dataField) {
                if (dataField == null || !(originalComponent instanceof JLabel)) {
                    return originalComponent;
                }
                JLabel ret = (JLabel) originalComponent;
                String fieldName = dataField.getIdentifier();
                // "GC" cell is right aligned. Other cells are centered.
                ret.setHorizontalAlignment("GC".equals(fieldName) ? SwingConstants.RIGHT : SwingConstants.CENTER);
                // "D" cell caption is written in bold. Other captions have plain font.
                ret.setFont(ret.getFont().deriveFont("D".equals(fieldName) ? Font.BOLD : Font.PLAIN));
                // "B" cell would be half-transparent red with Windows L&F (not classic).
                // Note that background is reset on each call by underlying renderer so there's no need to reset background for other cells.
                // Properties like alignment and font should be reset on each call if they were changed before.
                if ("B".equals(fieldName) && !originalComponent.getClass().getName().contains("DefaultTableCellHeaderRenderer")) {
                    ret.setBackground(new Color(220, 50, 50, 50));
                }
                // "C" cell would be half-transparent red.
                if ("C".equals(fieldName)) {
                    JPanel p = new JPanel(new GridLayout(1, 1)) {
                        @Override
                        public void paint(Graphics g) {
                            super.paint(g);
                            g.setColor(new Color(220, 50, 50, 50));
                            g.fillRect(0, 0, getWidth(), getHeight());
                        }
                    };
                    p.add(ret);
                    return p;
                }
                return ret;
            }
        });

        /*fin Tabla para asientos diferentes*/
        JButton btn = new JButton("Exportar a Excel");
        btn.setBounds(10, 10, 150, 30);
        btn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N 
        btn.addActionListener(new Exporter(headExcel));
        paneTable.add(btn);

        JLabel lblDebe = new JLabel("Debe:");
        lblDebe.setBounds(paneTable.getWidth() / 2 - 200, 5, 100, 20);
        lblDebe.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblDebe.setHorizontalTextPosition(SwingConstants.CENTER);
        paneTable.add(lblDebe);

        txtDebe = new JTextField();
        txtDebe.setBounds(lblDebe.getX(), lblDebe.getY() + lblDebe.getHeight(), 100, 25);
        txtDebe.setFont(new java.awt.Font("Verdana", 0, 12));
        paneTable.add(txtDebe);

        JLabel lblHaber = new JLabel("Haber:");
        lblHaber.setBounds(lblDebe.getWidth() + lblDebe.getX() + 10, lblDebe.getY(), 100, 20);
        lblHaber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblHaber.setHorizontalTextPosition(SwingConstants.CENTER);
        paneTable.add(lblHaber);

        txtHaber = new JTextField();
        txtHaber.setBounds(lblHaber.getX(), lblHaber.getY() + lblHaber.getHeight(), 100, 25);
        txtHaber.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtHaber.setEditable(false);
        paneTable.add(txtHaber);

        JLabel lblDif = new JLabel("Diferencia");
        lblDif.setBounds(lblHaber.getWidth() + lblHaber.getX() + 10, lblHaber.getY(), 100, 20);
        lblDif.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblDif.setHorizontalTextPosition(SwingConstants.CENTER);
        paneTable.add(lblDif);

        txtDiferencia = new JTextField();
        txtDiferencia.setBounds(lblDif.getX(), lblDif.getY() + lblDif.getHeight(), 100, 25);
        txtDiferencia.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        //txtDiferencia.setDocument(new validarCampo(txtDiferencia, 10));
        paneTable.add(txtDiferencia);

        JModernScrollPane jpDif = new JModernScrollPane(tableDif.getScrollPane());
        jpDif.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        jpDif.setForeground(Constants.COLOR_BACKGROUND_PANEL_TABLES_REST);
        jpDif.setBounds(10, btn.getHeight() + btn.getY() + 10, 300, paneControls.getHeight() - 200);
        paneTable.add(jpDif);

        JModernScrollPane jp = new JModernScrollPane(tableSeatSimp.getScrollPane());
        jp.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.WHITE));
        jp.setForeground(Constants.COLOR_BACKGROUND_PANEL_TABLES_REST);
        jp.setBounds(jpDif.getWidth() + jpDif.getX() + 5, btn.getHeight() + btn.getY() + 10, paneTable.getWidth() - (jpDif.getWidth() + 25), paneControls.getHeight() - 200);
        paneTable.add(jp);
        paneControls.add(paneTable);

    }

    class ProccessSeat implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            lstTitle = new ArrayList();
            lstHead = new ArrayList();
            paneTable.removeAll();
            viewGraphifTable();
            paneTable.updateUI();
        }

    }

    private Position checkOutTitle(String title) {
        Position pos = null;
        int posiStart = 0;
        int count = 0;
        boolean flagStart = false;
        boolean flag = false;
        boolean flagEnd = false;
        for (int h = 3; h < lstHead.size(); h++) {
            String[] name = lstHead.get(h).getKey().split("-");
            if (name[0].equals(title)) {
                pos = new Position();
                pos.setDescrip(title);
                pos.setPosition(h);
                pos.setPosiEnd(h);
                pos.setHowMany(count++);
                flag = true;
                if (!flagStart) {
                    posiStart = h;
                }
                flagStart = true;
                //System.out.println(lstHead.get(h).getKey() + " pos.getPosiIni() " + pos.getPosiIni() + " pos.setPosiEnd() " + pos.getPosiEnd() + " count> " + count);
            } else {
                if (count > 0) {
                    //System.out.println("M:checkOutTitle else 3 ->> " + title + " h " + h);
                    flagEnd = true;
                    break;
                }
            }
        }
        pos.setPosiIni(posiStart);
        return pos;
    }

    private List<CajaBancosBean> listarAsientoContable(String mode) {
        String StrMEs = "";
        String StrAnio = String.valueOf(this.jYearChooser1.getYear());
        int Mes = this.jMonthChooser1.getMonth() + 1;
        if (Mes < 10) {
            StrMEs = "0" + String.valueOf(Mes);
        } else {
            StrMEs = String.valueOf(Mes);
        }
        ParamRC p = new ParamRC();
        p.setCodEmpresa(paramSeat.getCodCompany());
        p.setCode(paramSeat.getCodCompany() + StrAnio + StrMEs);
        p.setFlagMode(mode);
        if (rbByDate.isSelected()) {
            p.setDateIni(fechaSearchStart.getDate());
            p.setDateFin(fechaSearchEnd.getDate());
            p.setFlagDate(Constants.FLAG_DATE_YES);
        }
        if (rbByPeriodic.isSelected()) {
            p.setDateIni(new Date());
            p.setDateFin(new Date());
            p.setFlagDate(Constants.FLAG_DATE_NOT);
        }
        try {
            listData = RcServiceImpl.listAsientoSimplificado(p);
            /*for (CajaBancosBean c : listData) {
                System.out.println("VOUCHER " + c.getVoucher() + " CTA: " + c.getCuenta() + " DEBE: " + c.getDebe() + " HABER: " + c.getHaber());
            }*/
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listData;
    }

    private List<CajaBancosBean> listarAsientoContableONLY(String mode) {
        String StrMEs = "";
        String StrAnio = String.valueOf(this.jYearChooser1.getYear());
        int Mes = this.jMonthChooser1.getMonth() + 1;
        if (Mes < 10) {
            StrMEs = "0" + String.valueOf(Mes);
        } else {
            StrMEs = String.valueOf(Mes);
        }
        ParamRC p = new ParamRC();
        p.setCodEmpresa(paramSeat.getCodCompany());
        p.setCode(paramSeat.getCodCompany() + StrAnio + StrMEs);
        p.setFlagMode(mode);
        if (rbByDate.isSelected()) {
            p.setDateIni(fechaSearchStart.getDate());
            p.setDateFin(fechaSearchEnd.getDate());
            p.setFlagDate(Constants.FLAG_DATE_YES);
        }
        if (rbByPeriodic.isSelected()) {
            p.setDateIni(new Date());
            p.setDateFin(new Date());
            p.setFlagDate(Constants.FLAG_DATE_NOT);
        }
        List<CajaBancosBean> list = null;
        try {
            list = RcServiceImpl.listViewSeatSimplifiedByBook(p);
            /*for (CajaBancosBean c : list) {
             System.out.println("VOUCHER " + c.getVoucher() + " CTA: " + c.getCuenta() + " DEBE: " + c.getDebe() + " HABER: " + c.getHaber());
             }*/
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    private List<CajaBancosBean> listSeatSimplifiedDif(String mode) {
        String StrMEs = "";
        String StrAnio = String.valueOf(this.jYearChooser1.getYear());
        int Mes = this.jMonthChooser1.getMonth() + 1;
        if (Mes < 10) {
            StrMEs = "0" + String.valueOf(Mes);
        } else {
            StrMEs = String.valueOf(Mes);
        }
        ParamRC p = new ParamRC();
        p.setCodEmpresa(paramSeat.getCodCompany());
        p.setCode(paramSeat.getCodCompany() + StrAnio + StrMEs);
        p.setFlagMode(mode);
        if (rbByDate.isSelected()) {
            p.setDateIni(fechaSearchStart.getDate());
            p.setDateFin(fechaSearchEnd.getDate());
            p.setFlagDate(Constants.FLAG_DATE_YES);
        }
        if (rbByPeriodic.isSelected()) {
            p.setDateIni(new Date());
            p.setDateFin(new Date());
            p.setFlagDate(Constants.FLAG_DATE_NOT);
        }
        List<CajaBancosBean> list = null;
        try {
            list = RcServiceImpl.lstDiarioJframeAsiento(p);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    private String chechOutDataCell(String voucher, int codBook, String cta, String mode, String categorya) {
        String monto = "";
        for (CajaBancosBean c : listData) {
            int length=c.getVoucherOrigin().length();
            String voucherLast=c.getVoucher().substring(0, length);
            /**********************************/
            //String voucherFirts=voucher.substring(0, length);
            if (voucherLast.equals(voucher) && c.getCuenta().equals(cta)) {
                //System.out.println("BOOK " + codBook + " HABER " + c.getHaber() + " DEBE " + c.getDebe() + " Naturaleza -> " + mode + " categorya " + categorya + " CUENTA:  " + cta);
                if (Double.valueOf(c.getDebe()) > 0 && mode.equals("D") && categorya.equals("ACTIVO")) {
                    if (codBook == 8) {
                        monto = c.getDebe();
                    }
                    if (codBook == 1) {
                        monto = c.getDebe();
                        if (!cta.equals("101101")) {
                            monto = "";
                        }
                    }
                    if (codBook == 14) {
                        monto = c.getDebe();
                    }
                    break;
                }
                if (Double.valueOf(c.getHaber()) > 0 && mode.equals("H") && categorya.equals("ACTIVO")) {
                    if (codBook == 8) {
                        monto = "-" + c.getHaber();
                        if (cta.equals("101101")) {
                            monto = "";
                        }
                    }
                    if (codBook == 1) {
                        monto = "-" + c.getHaber();
                    }
                    if (codBook == 14) {
                        monto = c.getHaber();
                    }
                    break;
                }
                //Caso especial para las cuentas de activos: 
                if (Double.valueOf(c.getDebe()) > 0 && mode.equals("H") && categorya.equals("ACTIVO")) {
                    monto = c.getDebe();//ESte es un caso especial                     
                    break;
                }
                if (Double.valueOf(c.getHaber()) > 0 && mode.equals("D") && categorya.equals("ACTIVO")) {
                    monto = "-" + c.getHaber();//ESte es un caso especial                     
                    break;
                }
                if (Double.valueOf(c.getDebe()) > 0 && mode.equals("D") && categorya.equals("PASIVO Y PATRIMONIO")) {
                    if (codBook == 8) {
                        monto = "-" + c.getDebe();
                    }
                    if (codBook == 1) {
                        monto = "";
                    }
                    if (codBook == 14) {
                        monto = c.getHaber();//ESte es un caso especial
                    }
                    break;
                }
                //Caso especial cuando es con naturaleza D --> con haber mayor a cero
                if (Double.valueOf(c.getHaber()) > 0 && mode.equals("D") && categorya.equals("PASIVO Y PATRIMONIO")) {
                    monto = c.getHaber();//ESte es un caso especial                     
                    break;
                }
                if (Double.valueOf(c.getHaber()) > 0 && mode.equals("H") && categorya.equals("PASIVO Y PATRIMONIO")) {
                    //System.out.println(codBook+" BOOK  PASIVO Y PATRIMONIO H -->  " + c.getDebe());
                    if (codBook == 8) {
                        monto = c.getHaber();
                    }
                    if (codBook == 1) {
                        monto = "";
                        if (cta.equals("421201")) {
                            monto = "-" + c.getHaber();
                        }
                    }
                    if (codBook == 14) {
                        monto = c.getHaber();
                    }
                    break;
                }
                if (Double.valueOf(c.getDebe()) > 0 && mode.equals("D") && categorya.equals("PERDIDAS O GASTOS") && codBook == 8) {
                    monto = c.getDebe();
                    break;
                }
                if (Double.valueOf(c.getHaber()) > 0 && mode.equals("H") && categorya.equals("PERDIDAS O GASTOS") && codBook == 8) {
                    monto = "-" + c.getHaber();
                    break;
                }
                if (Double.valueOf(c.getDebe()) > 0 && mode.equals("D") && categorya.equals("PERDIDAS O GASTOS") && codBook == 1) {
                    monto = "";// c.getDebe(); 
                    break;
                }
                if (Double.valueOf(c.getHaber()) > 0 && mode.equals("H") && categorya.equals("PERDIDAS O GASTOS") && codBook == 1) {
                    monto = "";// + c.getHaber(); 
                    break;
                }
                if (Double.valueOf(c.getDebe()) > 0 && mode.equals("D") && categorya.equals("GANANCIAS")) {
                    monto = "-" + c.getDebe();
                    break;
                }
                if (Double.valueOf(c.getHaber()) > 0 && mode.equals("H") && categorya.equals("GANANCIAS")) {
                    monto = c.getHaber();
                    break;
                }
                if (Double.valueOf(c.getDebe()) > 0 && mode.equals("D") && categorya.equals("ANALITICOS")) {
                    monto = c.getDebe();
                    break;
                }
                if (Double.valueOf(c.getHaber()) > 0 && mode.equals("H") && categorya.equals("ANALITICOS")) {
                    monto = "-" + c.getHaber();
                    break;
                }
                if (mode.equals("N")) {
                    monto = "0";
                }
            } else {
                //System.out.println("Llegó  aqui ");
                monto = "";
            }
        }
        return monto;
    }

    class Exporter implements ActionListener {

        String[] headExcel;

        public Exporter(String[] headExcel) {
            this.headExcel = headExcel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                ExcelWriter ew = new ExcelWriter();
                ew.Writer(tableSeatSimp, headExcel);
            } catch (Exception ex) {
                java.util.logging.Logger.getLogger(PanelAsientoSimplificado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void setWidthColumns(JBroTable tb) {
        int anchoColumna = 0;
        TableColumnModel modeloColumna = tb.getColumnModel();
        TableColumn columnaTabla;
        for (int i = 0; i < tb.getColumnCount(); i++) {
            columnaTabla = modeloColumna.getColumn(i);
            switch (i) {
                case 0:
                    anchoColumna = 130;
                    break;
                case 1:
                    anchoColumna = 80;
                    break;
                case 2:
                    anchoColumna = 150;
                    break;
                default:
                    anchoColumna = 80;
                    break;
            }
            columnaTabla.setPreferredWidth(anchoColumna);
        }
    }

    private List<CajaBancosBean> listData;

}
