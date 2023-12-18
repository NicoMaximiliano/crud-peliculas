package com.nicode.crud_peliculas.view;

import com.nicode.crud_peliculas.dao.PeliculaDao;
import com.nicode.crud_peliculas.model.Pelicula;
import javax.swing.table.DefaultTableModel;

public class VentanaPeliculas extends javax.swing.JFrame {

    public VentanaPeliculas() {}
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        DefaultTableModel modelo = new DefaultTableModel();
        PeliculaDao peliculaDao = new PeliculaDao();

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        modelo.addColumn("ID Pelicula");
        modelo.addColumn("Titulo");
        modelo.addColumn("Año");
        modelo.addColumn("Categoria");
        modelo.addColumn("Puntaje");
        modelo.addColumn("Descripcion");

        for(Pelicula p: peliculaDao.mostrarPeliculas()){
            modelo.addRow(p.datosPelicula());
        }

        tablaPeliculas = new javax.swing.JTable(modelo);

        jScrollPane1.setViewportView(tablaPeliculas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(41, Short.MAX_VALUE))
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

    public void iniciarVentanaPeliculas(){

        initComponents();
        
        setLocationRelativeTo(null);
        setVisible(true);              
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPeliculas;
    // End of variables declaration//GEN-END:variables
}
