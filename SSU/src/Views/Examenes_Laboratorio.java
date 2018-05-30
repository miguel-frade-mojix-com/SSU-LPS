/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Beneficiario;
import Classes.Examenes;
import Controllers.ExamenesDAO;
import java.util.LinkedList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel
 */
public class Examenes_Laboratorio extends javax.swing.JFrame {

    private Examenes examenDisponible ;
    private Examenes examenSeleccionado;
    
    private DefaultTableModel tablaExamenesSeleccionados;
    private DefaultTableModel tablaExamenesDisponibles;
    private LinkedList<Examenes> examenes;
    int rowSelected  =0;
    Beneficiario paciente;
    Consulta consulta;
    
    
    /**
     * Creates new form Examenes_Laboratorio
     */
    public Examenes_Laboratorio() {
        initComponents();
        getExamenDisponible();
        getExamenSeleccionado();
        getExamenes();
    }

    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        agregarBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacionesTxt = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        examenesDisponibles = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        examenesSeleccionados = new javax.swing.JTable();
        categoriaSelector = new javax.swing.JComboBox<>();
        salitBtn = new javax.swing.JButton();
        guardarBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laboratorio");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Estudio : ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Obervaciones : ");

        agregarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agregarBtn.setIcon(new javax.swing.ImageIcon("C:\\gitRepos\\TESIS\\SSU-LPS\\SSU\\src\\Resources\\adelante.png")); // NOI18N
        agregarBtn.setText("AGREGAR");
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\gitRepos\\TESIS\\SSU-LPS\\SSU\\src\\Resources\\atras.png")); // NOI18N
        jButton2.setText("QUITAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        observacionesTxt.setColumns(20);
        observacionesTxt.setRows(5);
        jScrollPane1.setViewportView(observacionesTxt);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-Examenes de Laboratorio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        examenesDisponibles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        examenesDisponibles.setGridColor(new java.awt.Color(0, 0, 204));
        jScrollPane2.setViewportView(examenesDisponibles);
        if (examenesDisponibles.getColumnModel().getColumnCount() > 0) {
            examenesDisponibles.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        examenesSeleccionados.setBackground(new java.awt.Color(255, 255, 204));
        examenesSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        examenesSeleccionados.setGridColor(new java.awt.Color(0, 51, 204));
        jScrollPane3.setViewportView(examenesSeleccionados);
        if (examenesSeleccionados.getColumnModel().getColumnCount() > 0) {
            examenesSeleccionados.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        categoriaSelector.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        categoriaSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaSelectorActionPerformed(evt);
            }
        });

        salitBtn.setIcon(new javax.swing.ImageIcon("C:\\gitRepos\\TESIS\\SSU-LPS\\SSU\\src\\Resources\\cancelar.png")); // NOI18N
        salitBtn.setText("SALIR");
        salitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salitBtnActionPerformed(evt);
            }
        });

        guardarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/guardar.png"))); // NOI18N
        guardarBtn.setText("GUARDAR");
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 204));
        jLabel4.setText("Seleccionados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(categoriaSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardarBtn)
                .addGap(42, 42, 42)
                .addComponent(salitBtn)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(categoriaSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(agregarBtn)
                                .addGap(29, 29, 29)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salitBtn)
                    .addComponent(guardarBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        tablaExamenesSeleccionados = (DefaultTableModel) examenesSeleccionados.getModel();
        if(examenDisponible!=null)
            tablaExamenesSeleccionados.addRow(new Object[]{examenDisponible.getNombre()  });
        
        
        
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        if (rowSelected!=0 ){
            tablaExamenesSeleccionados.removeRow(rowSelected);
            rowSelected=0;
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void setConsulta(Consulta cons){
        this.consulta=cons;
    }
    
    private void categoriaSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaSelectorActionPerformed
        tablaExamenesDisponibles = (DefaultTableModel)examenesDisponibles.getModel();
        limpiarLista( tablaExamenesDisponibles );
        
        if(evt.getSource()== categoriaSelector){
            int result=  categoriaSelector.getSelectedIndex() +1;
            
            String categoria="cat00" +result;
            System.out.println("ssu.Views.Examenes_Laboratorio.categoriaSelectorActionPerformed() result: " + result + " cat: "+  categoria + " examenes:" + examenes.size());
            for(int i=0;i<examenes.size();i++){
                Examenes aux = (Examenes)examenes.get(i);
                if(aux.getCategoria().compareToIgnoreCase(categoria)==0){
                    tablaExamenesDisponibles.addRow(new Object[]{aux.getNombre()} );
                }
                
            }
            
        }
        
        
        
        
    }//GEN-LAST:event_categoriaSelectorActionPerformed

    private void salitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salitBtnActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_salitBtnActionPerformed

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        int contenidos = tablaExamenesSeleccionados.getRowCount();
        String codigosExamenes[] = new String[contenidos];
        
        StringBuilder sb = new StringBuilder("");
        sb.append("---------SOLICITUD DE LABORATORIO---------\n");
        for (int i=0;i<contenidos;i++){
            String examen =(String)tablaExamenesSeleccionados.getValueAt(i, 0);
            for(int j=0;j<examenes.size();j++){
                if(examen.compareTo(examenes.get(j).getNombre())==0){
                    codigosExamenes[i]=examenes.get(j).getCodigo();
                }
            }
            sb.append(""+(i+1) + ".- "+ examen + " \n");
        }
        
        
        String detalles = observacionesTxt.getText();
        
        ExamenesDAO.agendarExamenes(paciente, detalles, codigosExamenes);
        consulta.fillPlanExamenes(sb.toString());
        this.setVisible(false);
    }//GEN-LAST:event_guardarBtnActionPerformed

    
    public void getExamenSeleccionado(){
        final ListSelectionModel  model = examenesSeleccionados.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener(){ 
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!model.isSelectionEmpty()){
                    int result = model.getMinSelectionIndex();
                    rowSelected=result;
                }   
           }    
        });
    }

    public void getExamenDisponible(){
        final ListSelectionModel  model = examenesDisponibles.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener(){ 
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!model.isSelectionEmpty()){
                    int result = model.getMinSelectionIndex();
                    String res= (String)examenesDisponibles.getValueAt(result, 0);
                    System.out.println(".valueChanged()" +  res + "  ");
                    for(int i =0;i<examenes.size();i++){
                        if(examenes.get(i).getNombre().compareTo(res)==0 ){
                            examenDisponible=examenes.get(i);
                            break;
                        }
                    }
                        
                }   
           }    
        });
    }    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Examenes_Laboratorio().setVisible(true);
            }
        });
    }

 
        
    public void limpiarLista(DefaultTableModel tabla){
         for(int i= tabla.getRowCount()-1;i>=0;i--   ){
            tabla.removeRow(i);
        }
    }
    
    public void setBeneficiario(Beneficiario ben){
        paciente=ben;
    }
    
    public void getExamenes(){
        examenes=ExamenesDAO.getExamenes();
        categoriaSelector.addItem("Hematologia");
        categoriaSelector.addItem("Qimica Sanguinea");
        categoriaSelector.addItem("Bactereologia"); 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JComboBox<String> categoriaSelector;
    private javax.swing.JTable examenesDisponibles;
    private javax.swing.JTable examenesSeleccionados;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea observacionesTxt;
    private javax.swing.JButton salitBtn;
    // End of variables declaration//GEN-END:variables
}


