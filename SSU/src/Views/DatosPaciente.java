/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Beneficiario;
import Views.Examenes_Laboratorio;

/**
 *
 * @author Miguel
 */
public class DatosPaciente extends javax.swing.JPanel {
    private Beneficiario paciente ;
    /**
     * Creates new form DatosPaciente
     */
    public DatosPaciente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        panel2 = new java.awt.Panel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sexoLabel = new javax.swing.JLabel();
        edadLabel = new javax.swing.JLabel();
        ocupacionLabel = new javax.swing.JLabel();
        instLabel = new javax.swing.JLabel();
        imagenUsuario = new javax.swing.JLabel();
        nombrePacienteText = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bug = new javax.swing.JLabel();
        bug2 = new javax.swing.JLabel();
        tipoBeneficiarioText = new javax.swing.JLabel();
        ocupacionText = new javax.swing.JLabel();
        institucionText = new javax.swing.JLabel();
        DomicilioPacienteText = new javax.swing.JLabel();
        sexoText = new javax.swing.JLabel();
        edadText = new javax.swing.JLabel();
        fechaNacimientoText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 204));

        panel1.setBackground(new java.awt.Color(204, 255, 204));
        panel1.setForeground(new java.awt.Color(102, 102, 102));

        panel2.setBackground(new java.awt.Color(0, 51, 204));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\gitRepos\\TESIS\\SSU-LPS\\SSU\\src\\Resources\\farmacia.png")); // NOI18N
        jButton2.setText("FARMACIA");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton3.setText("LABORATORIO");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("IMAGENOLOGIA");
        jButton4.setToolTipText("");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton5.setText("Fisioterapia");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton6.setText("Referencia");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton7.setText("Baja Médica");
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jButton8.setText("Interacción");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Junta médica");
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("TRABAJO SOCIAL");
        jButton10.setToolTipText("");
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("PACIENTE :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("DOMICILIO :");
        jLabel1.setToolTipText("");

        fechaLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fechaLabel.setForeground(new java.awt.Color(0, 0, 153));
        fechaLabel.setText("FECH. NAC. :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("TIPO :");

        sexoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sexoLabel.setForeground(new java.awt.Color(0, 0, 153));
        sexoLabel.setText("SEXO :");

        edadLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        edadLabel.setForeground(new java.awt.Color(0, 0, 153));
        edadLabel.setText("EDAD :");

        ocupacionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ocupacionLabel.setForeground(new java.awt.Color(0, 0, 153));
        ocupacionLabel.setText("OCUPACIÓN :");

        instLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instLabel.setForeground(new java.awt.Color(0, 0, 153));
        instLabel.setText("INSTITUCIÓN :");

        imagenUsuario.setIcon(new javax.swing.ImageIcon("C:\\gitRepos\\TESIS\\SSU-LPS\\SSU\\src\\Resources\\UserIcon.png")); // NOI18N

        nombrePacienteText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nombrePacienteText.setText(" ");

        bug.setToolTipText("");

        tipoBeneficiarioText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        DomicilioPacienteText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DomicilioPacienteText.setToolTipText("");

        sexoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        edadText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        fechaNacimientoText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(imagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fechaLabel)
                                    .addComponent(jLabel1))
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(fechaNacimientoText, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ocupacionLabel))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(DomicilioPacienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12))))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(sexoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sexoText, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(edadLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(edadText, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(instLabel))))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(nombrePacienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(tipoBeneficiarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(155, 155, 155)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombrePacienteText)
                            .addComponent(jLabel5)
                            .addComponent(tipoBeneficiarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel12))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(DomicilioPacienteText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fechaNacimientoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ocupacionLabel)))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(20, 20, 20)
                                        .addComponent(fechaLabel)))))
                        .addGap(2, 2, 2)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(sexoLabel))
                            .addComponent(sexoText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edadText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edadLabel)
                            .addComponent(instLabel)))
                    .addComponent(imagenUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Examenes_Laboratorio lab = new Examenes_Laboratorio();
                lab.setVisible(true);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public Beneficiario getPaciente(){
        return paciente;
    }
    
    
    public void mostrarDatosPaciente(Beneficiario ben){
        nombrePacienteText.setText( ben.getPrimerNombre() + " " + ben.getPrimerApellido() + " " +ben.getSegundoApellido()    );
        DomicilioPacienteText.setText(ben.getDireccion());
        fechaNacimientoText.setText(ben.getFechaNacimiento().toString());
        tipoBeneficiarioText.setText(ben.getTipoDeSeguro());
        sexoText.setText(ben.getGenero()); 
        if(ben.getOcupacion()!=null) ocupacionText.setText(ben.getOcupacion());
        edadText.setText(""+ ben.getEdad());
        //institucionText.setText();
        
//        imagenUsuario.setIcon(icon);
        paciente = ben;
        System.out.println("Datos Paciente tiene al paciente " + paciente.getPrimerNombre() +" " + paciente.getPrimerApellido() + " id: " + paciente.getID());
    }
    
    
    
    
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DomicilioPacienteText;
    private javax.swing.JLabel bug;
    private javax.swing.JLabel bug2;
    private javax.swing.JLabel edadLabel;
    private javax.swing.JLabel edadText;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel fechaNacimientoText;
    private javax.swing.JLabel imagenUsuario;
    private javax.swing.JLabel instLabel;
    private javax.swing.JLabel institucionText;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nombrePacienteText;
    private javax.swing.JLabel ocupacionLabel;
    private javax.swing.JLabel ocupacionText;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JLabel sexoLabel;
    private javax.swing.JLabel sexoText;
    private javax.swing.JLabel tipoBeneficiarioText;
    // End of variables declaration//GEN-END:variables
}