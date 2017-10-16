/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
/**
 *
 * @author Gaby Garcia 
 */
public class ViewAscendente extends javax.swing.JPanel {

    /**
     * Creates new form ViewAscendente
     */
    public ViewAscendente() {
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

        jlb_entrada = new javax.swing.JLabel();
        jlb_resultado = new javax.swing.JLabel();
        jtf_numero_insertado = new javax.swing.JTextField();
        jsp_lista_numeros = new javax.swing.JScrollPane();
        jli_lista_numeros = new javax.swing.JList<>();
        jbtn_insertar = new javax.swing.JButton();
        jbtn_ascendente = new javax.swing.JButton();
        jbtn_promedio = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jlb_entrada.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jlb_entrada.setText("Input:");

        jlb_resultado.setBackground(new java.awt.Color(0, 204, 204));
        jlb_resultado.setFont(new java.awt.Font("PakType Naskh Basic", 1, 18)); // NOI18N
        jlb_resultado.setForeground(new java.awt.Color(240, 240, 240));
        jlb_resultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jtf_numero_insertado.setBackground(new java.awt.Color(204, 255, 255));
        jtf_numero_insertado.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N

        jli_lista_numeros.setBackground(new java.awt.Color(204, 255, 255));
        jli_lista_numeros.setForeground(new java.awt.Color(51, 51, 51));
        jsp_lista_numeros.setViewportView(jli_lista_numeros);

        jbtn_insertar.setBackground(new java.awt.Color(204, 255, 255));
        jbtn_insertar.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_insertar.setText("Insertar");

        jbtn_ascendente.setBackground(new java.awt.Color(204, 255, 255));
        jbtn_ascendente.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_ascendente.setText("Ascendente");

        jbtn_promedio.setBackground(new java.awt.Color(204, 255, 255));
        jbtn_promedio.setFont(new java.awt.Font("PakType Naskh Basic", 1, 14)); // NOI18N
        jbtn_promedio.setText("Promedio");
        jbtn_promedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_promedioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(362, 362, 362)
                        .addComponent(jlb_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlb_entrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_numero_insertado, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jsp_lista_numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtn_ascendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtn_promedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jbtn_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtn_ascendente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtn_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_numero_insertado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlb_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_insertar))
                        .addGap(26, 26, 26)
                        .addComponent(jsp_lista_numeros, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addComponent(jlb_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_promedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_promedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_promedioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_ascendente;
    public javax.swing.JButton jbtn_insertar;
    public javax.swing.JButton jbtn_promedio;
    public javax.swing.JLabel jlb_entrada;
    public javax.swing.JLabel jlb_resultado;
    public javax.swing.JList<String> jli_lista_numeros;
    public javax.swing.JScrollPane jsp_lista_numeros;
    public javax.swing.JTextField jtf_numero_insertado;
    // End of variables declaration//GEN-END:variables
}
