/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dominospizza;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author user
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        
    }
   
    ArrayList<admin> ozuna = new ArrayList<admin>();
    ArrayList<admin>benito = new ArrayList<admin>();
    ArrayList<admin>jcortez = new ArrayList<admin>();
    ArrayList<orden>jala = new ArrayList<orden>();

    String suc;
    String pt;
    String p;
    int p2s;
    public void pizza(){
        String cur = adSucursal.getSelectedItem().toString();
        admin pizza = new admin();
        pizza.setName(adNombre.getText());
        pizza.setSucur(adSucursal.getSelectedItem().toString());
        pizza.setPrecio(adPrecio.getText());
        pizza.setDescripcion(adDescripcion.getText());
        if(cur == "Guatemala"){
            ozuna.add(pizza);
        }else if(cur == "Jalapa"){
            benito.add(pizza);
           
        }else if(cur == "Progreso"){
            jcortez.add(pizza);
        }else{JOptionPane.showMessageDialog(null, "La pizza no pudo agregarse, vuelve a intentarlo! ");
        }   
    }
    
    
    
    public void salzza(){
        String  sucurs =adSucursal.getSelectedItem().toString();
        switch(sucurs){
            case "Progreso":
                if (jcortez.size()!=0){
         String sandu [][] = new String [jcortez.size()][3];
        for(int i=0; i<jcortez.size(); i++){
        sandu [i][0] = jcortez.get(i).getName();
        sandu [i][1] = jcortez.get(i).getDescripcion();
        sandu [i][2] = jcortez.get(i).getPrecio();
    }
    adTabla.setModel(new javax.swing.table.DefaultTableModel(
    sandu,
    new String [] {
        "Numero:","Descripcio: ", "Precio: "
    }
    ));
    }
    break;
    case "Jalapa":
        if (benito.size()!=0){
        String sandu [][] = new String [benito.size()][3];
        for(int i=0; i<benito.size(); i++){
        sandu [i][0] = benito.get(i).getName();
        sandu [i][1] = benito.get(i).getDescripcion();
        sandu [i][2] = benito.get(i).getPrecio();
    }
    adTabla.setModel(new javax.swing.table.DefaultTableModel(
    sandu,
    new String [] {
        "Numero:","Descripcio: ", "Precio: "
    }
    ));
    }
        break;
    case "Guatemala":
              if (ozuna.size()!=0){
                String sandu [][] = new String [ozuna.size()][3];
                for(int i=0; i<ozuna.size(); i++){
                sandu [i][0] = ozuna.get(i).getName();
                sandu [i][1] = ozuna.get(i).getDescripcion();
                sandu [i][2] = ozuna.get(i).getPrecio();
    }
    adTabla.setModel(new javax.swing.table.DefaultTableModel(
    sandu,
    new String [] {
        "Numero:","Descripcio: ", "Precio: "
    }
    ));
    } 
    break;
    default:
                String var = "error";   
    } 
        }
    
    
    public void sucurpizza(){
      
     if(adSucursal.getSelectedItem().toString()=="Guatemala"){
     if(ozuna.size()!=0){
         orPizzaSur.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
         String sandu[] = new String [ozuna.size()];
         for(int i = 0; i<ozuna.size();i++){
             sandu[i]=ozuna.get(i).getName();
             orPizzaSur.addItem(sandu[i]);
             
         }
     }else if(adSucursal.getSelectedItem().toString()=="Jalapa"){
      if(benito.size()!=0){
      orPizzaSur.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
      String sandu[] = new String [benito.size()];
      for(int i=0; i<benito.size(); i++){
        sandu[i] = benito.get(i).getName();
        orPizzaSur.addItem(sandu[i]); 
      }        
      }
     }
         }
    }
    
    public void ordenes(){
       
        
        switch(pt){
            case"Guatemala":
            orPizzaSur.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
            String list[]= new String [ozuna.size()];
            for( int i = 0; i<ozuna.size(); i++){
            list[i] = ozuna.get(i).getName();
            orPizzaSur.addItem(list[i]);
            }
            break;
            case "Progreso":
            orPizzaSur.setModel(new javax.swing.DefaultComboBoxModel(new String[]{}));
            String list2[]= new String [jcortez.size()];
            for( int i = 0; i<jcortez.size();i++){
            list2[i] = jcortez.get(i).getName();
            orPizzaSur.addItem(list2[i]);
            }
            break;
            case "Jalapa":
            orPizzaSur.setModel(new javax.swing.DefaultComboBoxModel(new String[]{}));
            String list3[]= new String [benito.size()];
            for( int i = 0; i<benito.size();i++){
            list3[i] = benito.get(i).getName();
            orPizzaSur.addItem(list3[i]);
            }
            break;
            default:
            orPizzaSur.setModel(new javax.swing.DefaultComboBoxModel(new String[]{}));
            break;
    
    }}
    
    
    public void valor(){
   String  valor1 = orPizzaSur.getSelectedItem().toString();
    int valor2 = orPizzaSur.getSelectedIndex();
    if(p=="Guatemala"){
        String descripcion = ozuna.get(valor2).getDescripcion();
        String precio = ozuna.get(valor2).getPrecio();
        orDescripcion.setText(descripcion);
        orprecio.setText(precio);
        
    }else if(p=="Jalapa"){
    String descripcion = benito.get(valor2).getDescripcion();
        String precio = benito.get(valor2).getPrecio();
        orDescripcion.setText(descripcion);
        orprecio.setText(precio);
    }else{
    String descripcion = jcortez.get(valor2).getDescripcion();
        String precio = jcortez.get(valor2).getPrecio();
        orDescripcion.setText(descripcion);
        orprecio.setText(precio);
    }
    }
    
    
   
     
 
  public void  compra(){
   orden compra = new orden();
   
   compra.setPizza(orPizzaSur.getSelectedItem().toString());
   compra.setnumero(orprecio.getText());
   compra.setDescripcion(orDescripcion.getText());
   compra.setSurcursal(orSucursal.getSelectedItem().toString());
   jala.add(compra);
   String ma [][]= new String[jala.size()][5];
   
   
   
   for(int z = 0; z<jala.size(); z++){
       p2s++;
   ma[z][0] =Integer.toString(z+1);
   ma[z][1] = jala.get(z).getnumero();
   ma[z][2] = jala.get(z).getDescripcion();
   ma[z][3] = jala.get(z).getSurcursal();
   }
   orTabla.setModel(new javax.swing.table.DefaultTableModel(
    ma,
    new String [] {
        "Numero", "Pizzas", "Descripcion", "Surcursal"
    }
));
   }
    
    // new javax.swing.DefaultComboBoxModel(new String[] {})

      

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        adSucursal = new javax.swing.JComboBox<>();
        adNombre = new javax.swing.JTextField();
        adPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        adDescripcion = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        adTabla = new javax.swing.JTable();
        adBoton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orDescripcion = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        orTabla = new javax.swing.JTable();
        orPizzaSur = new javax.swing.JComboBox<>();
        orBoton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        orprecio = new javax.swing.JTextField();
        orSucursal = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(220, 195, 195));

        jPanel2.setBackground(new java.awt.Color(234, 208, 208));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setText("Surcursal");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setText("Nombre");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setText("Pizzas");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel9.setBackground(new java.awt.Color(204, 102, 255));
        jLabel9.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        jLabel9.setText("Descripcion ");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 160, 20));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel10.setText("Precio");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 60, -1));

        adSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guatemala", "Jalapa", "Progreso" }));
        adSucursal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                adSucursalItemStateChanged(evt);
            }
        });
        jPanel2.add(adSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, 30));

        adNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adNombreActionPerformed(evt);
            }
        });
        jPanel2.add(adNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 144, -1));
        jPanel2.add(adPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 109, -1));

        adDescripcion.setColumns(20);
        adDescripcion.setRows(5);
        jScrollPane2.setViewportView(adDescripcion);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 246, 109));

        adTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre ", "Descripcion", "Precio"
            }
        ));
        adTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adTablaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(adTabla);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 503, 235));

        adBoton.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        adBoton.setText("Crear");
        adBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adBotonMouseClicked(evt);
            }
        });
        adBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adBotonActionPerformed(evt);
            }
        });
        jPanel2.add(adBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 107, 49));

        jLabel11.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        jLabel11.setText("Bienvenidos a Dominos Pizza");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 488, -1));

        jTabbedPane1.addTab("Administracion ", jPanel2);

        jPanel1.setBackground(new java.awt.Color(211, 230, 236));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel1.setText("Surcursal");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel3.setText("Pizzas");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 18)); // NOI18N
        jLabel4.setText("Descripcion ");

        orDescripcion.setColumns(20);
        orDescripcion.setRows(5);
        jScrollPane1.setViewportView(orDescripcion);

        orTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero", "Pizzas", "Descripcion", "Surcursal"
            }
        ));
        orTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orTablaMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(orTabla);

        orPizzaSur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                orPizzaSurItemStateChanged(evt);
            }
        });
        orPizzaSur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orPizzaSurActionPerformed(evt);
            }
        });

        orBoton.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        orBoton.setText("Ordenar");
        orBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orBotonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        jLabel2.setText("Bienvenidos a Dominos Pizza");

        orSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guatemala", "Jalapa", "Progreso" }));
        orSucursal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                orSucursalItemStateChanged(evt);
            }
        });
        orSucursal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orSucursalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(orPizzaSur, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(orSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(jLabel2)))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(orprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(orPizzaSur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(orprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );

        jTabbedPane1.addTab("Ordenes", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 919, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adBotonActionPerformed
      
    }//GEN-LAST:event_adBotonActionPerformed

    private void adNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adNombreActionPerformed

    private void orPizzaSurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orPizzaSurActionPerformed
        
    }//GEN-LAST:event_orPizzaSurActionPerformed

    private void orPizzaSurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_orPizzaSurItemStateChanged
        valor();
        
    }//GEN-LAST:event_orPizzaSurItemStateChanged

    private void adBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adBotonMouseClicked
        pizza();
        salzza();
    }//GEN-LAST:event_adBotonMouseClicked

    private void orSucursalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_orSucursalItemStateChanged
        pt = orSucursal.getSelectedItem().toString();
                ordenes();
    }//GEN-LAST:event_orSucursalItemStateChanged

    private void orSucursalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orSucursalMouseClicked
    pt = orSucursal.getSelectedItem().toString();
    ordenes();
    }//GEN-LAST:event_orSucursalMouseClicked

    private void adTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adTablaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adTablaMouseClicked

    private void orTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orTablaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_orTablaMouseClicked

    private void adSucursalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_adSucursalItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_adSucursalItemStateChanged

    private void orBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orBotonActionPerformed
        compra();
    }//GEN-LAST:event_orBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adBoton;
    private javax.swing.JTextArea adDescripcion;
    private javax.swing.JTextField adNombre;
    private javax.swing.JTextField adPrecio;
    private javax.swing.JComboBox<String> adSucursal;
    private javax.swing.JTable adTabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton orBoton;
    private javax.swing.JTextArea orDescripcion;
    private javax.swing.JComboBox<String> orPizzaSur;
    private javax.swing.JComboBox<String> orSucursal;
    private javax.swing.JTable orTabla;
    private javax.swing.JTextField orprecio;
    // End of variables declaration//GEN-END:variables
}
