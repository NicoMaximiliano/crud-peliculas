
package com.nicode.crud_peliculas.view;

import com.nicode.crud_peliculas.dao.PeliculaDao;
import com.nicode.crud_peliculas.model.Pelicula;
import com.nicode.crud_peliculas.view.validacion.Validacion;
import javax.swing.JOptionPane;

public class VentanaActualizar extends javax.swing.JFrame {

    public VentanaActualizar() {}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajaTextoTitulo = new javax.swing.JTextField();
        cajaTextoAnio = new javax.swing.JTextField();
        cajaTextoCategoria = new javax.swing.JTextField();
        cajaTextoPuntaje = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTextoDescripcion = new javax.swing.JTextArea();
        btnActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cajaTextoId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa el titulo:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa el año de estreno:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresa la categoria:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingresa el puntaje:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingresa la descripcion:");

        cajaTextoTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cajaTextoAnio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cajaTextoCategoria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cajaTextoPuntaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        areaTextoDescripcion.setColumns(20);
        areaTextoDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        areaTextoDescripcion.setRows(5);
        jScrollPane1.setViewportView(areaTextoDescripcion);

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizar.setText("Actualizar pelicula");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Ingresa el id:");

        cajaTextoId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cajaTextoTitulo)
                    .addComponent(cajaTextoAnio)
                    .addComponent(cajaTextoCategoria)
                    .addComponent(cajaTextoPuntaje)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(cajaTextoId))
                .addGap(141, 141, 141))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaTextoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cajaTextoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cajaTextoAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajaTextoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cajaTextoPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnActualizar)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void iniciarVentanaActualizar(){
        initComponents();
        
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    
    public void limpiar(){
        cajaTextoId.setText("");
        cajaTextoTitulo.setText("");
        cajaTextoAnio.setText("");
        cajaTextoCategoria.setText("");
        cajaTextoPuntaje.setText("");
        areaTextoDescripcion.setText("");
    }
    
    public boolean validar(){
        Validacion validacion = new Validacion();
        boolean camposValidos = true;
        
        if(!(validacion.validarTitulo(cajaTextoTitulo))){
            camposValidos = false;
        }
        else if(!(validacion.validarAnio(cajaTextoAnio))){
            camposValidos = false;
        }
        else if(!(validacion.validarCategoria(cajaTextoCategoria))){
            camposValidos = false;
        }
        else if(!(validacion.validarPuntaje(cajaTextoPuntaje))){
            camposValidos = false;
        }
        else if(!(validacion.validarDescripcion(areaTextoDescripcion))){
            camposValidos = false;
        }
        
        return camposValidos;
    }
    
    public void actualizar(){
        Validacion validacion = new Validacion();
        
        if(validacion.validarId(cajaTextoId)){
            if(validar()){
                PeliculaDao peliculaDao = new PeliculaDao();
                Pelicula pelicula = new Pelicula();

                int id = Integer.parseInt(cajaTextoId.getText());
                String titulo = cajaTextoTitulo.getText();
                int anio = Integer.parseInt(cajaTextoAnio.getText());
                String categoria = cajaTextoCategoria.getText();
                double puntaje = Double.parseDouble(cajaTextoPuntaje.getText());
                String descripcion = areaTextoDescripcion.getText();

                pelicula.setId(id);
                pelicula.setTitulo(titulo);
                pelicula.setAnio(anio);
                pelicula.setCategoria(categoria);
                pelicula.setPuntaje(puntaje);
                pelicula.setDescripcion(descripcion);

                peliculaDao.actualizarPelicula(pelicula);

                JOptionPane.showMessageDialog(null, "La pelicula se actualizo correctamente");

                limpiar();
            }           
        }
        else{
            JOptionPane.showMessageDialog(null, "La pelicula no se pudo actualizar");
        }       
    }
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTextoDescripcion;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JTextField cajaTextoAnio;
    private javax.swing.JTextField cajaTextoCategoria;
    private javax.swing.JTextField cajaTextoId;
    private javax.swing.JTextField cajaTextoPuntaje;
    private javax.swing.JTextField cajaTextoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
