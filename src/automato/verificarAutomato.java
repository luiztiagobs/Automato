
package automato;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class verificarAutomato extends javax.swing.JFrame {

    
    public verificarAutomato() {
        initComponents();
        novo.setEnabled(false);
        this.setLocationRelativeTo(null);
    }
    
    String palavra,
            aceito = "Automato Aceito",
            recusado = "Automato Recusado";
    int tamanho, contador;
    public void verificar(){
        palavra = txt_expressao.getText();
        while (tamanho < palavra.length()) {            
            tamanho++;
        }
        novo.setEnabled(true);        
        txt_expressao.setEnabled(false);
        verificar.setEnabled(false);
        System.out.println("tamanho = "+ tamanho);
        estadoQ0();
    }
    public void estadoQ0(){
        if("".equals(palavra)){
            resultado.setText(recusado);
            System.out.println(recusado);
        }else{
            if(palavra.charAt(contador)== 'a'){
                System.out.println("Lendo 'a' indo para Q1");
                q0.setText("q0 Acessado");
                estadoQ1();
            }else if(palavra.charAt(contador)== 'b'){
                System.out.println("Lendo 'b' indo para Q2");
                q0.setText("q0 Acessado");
                estadoQ2();
            }else if(palavra.charAt(contador)== 'c'){
                System.out.println("Lendo 'c' indo para Q3");
                q0.setText("q0 Acessado");
                estadoQ3();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }
    }
    public void estadoQ1(){
        q1.setText("q1 Acessado");
        contador++;
        if(tamanho == contador){
            resultado.setText(aceito);
            System.out.println(aceito);
        }else{
            if(palavra.charAt(contador)== 'a'){
                System.out.println("Lendo 'a' indo para Q1");
                estadoQ1();
            }else if(palavra.charAt(contador)== 'b'){
                System.out.println("Lendo 'b' indo para Q4");
                estadoQ4();
            }else if(palavra.charAt(contador)== 'c'){
                System.out.println("Lendo 'c' indo para Q5");
                estadoQ5();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }        
    }
    public void estadoQ2(){
        q2.setText("q2 Acessado");
        contador++;
        if(tamanho == contador){
            resultado.setText(aceito);
            System.out.println(aceito);
        }else{
            if(palavra.charAt(contador)== 'a'){
                System.out.println("Lendo 'a' indo para Q6");
                estadoQ6();
            }else if(palavra.charAt(contador)== 'b'){
                System.out.println("Lendo 'b' indo para Q7");
                estadoQ7();
            }else if(palavra.charAt(contador)== 'c'){
                System.out.println("Lendo 'c' indo para Q8");
                estadoQ8();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }        
    }
    public void estadoQ3(){
        q3.setText("q3 Acessado");
        contador++;
        if(tamanho == contador){
            resultado.setText(aceito);
            System.out.println(aceito);
        }else{
            if(palavra.charAt(contador)== 'a'){
                System.out.println("Lendo 'a' indo para Q1");
                estadoQ1();
            }else if(palavra.charAt(contador)== 'b'){
                System.out.println("Lendo 'b' indo para Q4");
                estadoQ4();
            }else if(palavra.charAt(contador)== 'c'){
                System.out.println("Lendo 'c' indo para Q3");
                estadoQ3();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }        
    }
    public void estadoQ4(){
        q4.setText("q4 Acessado");
        contador++;
        if(tamanho == contador){
            resultado.setText(aceito);
            System.out.println(aceito);
        }else{
            if(palavra.charAt(contador)== 'a'){
                System.out.println("Lendo 'a' indo para Q1");
                estadoQ1();
            }else if(palavra.charAt(contador)== 'b'){
                System.out.println("Lendo 'b' indo para Q4");
                estadoQ4();
            }else if(palavra.charAt(contador)== 'c'){
                System.out.println("Lendo 'c' indo para Q5");
                estadoQ5();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }        
    }
    public void estadoQ5(){
        q5.setText("q5 Acessado");
        contador++;
        if(tamanho == contador){
            resultado.setText(aceito);
            System.out.println(aceito);
        }else{
            if(palavra.charAt(contador)== 'a'){
                System.out.println("Lendo 'a' indo para Q1");
                estadoQ1();
            }else if(palavra.charAt(contador)== 'b'){
                System.out.println("Lendo 'b' indo para Q4");
                estadoQ4();
            }else if(palavra.charAt(contador)== 'c'){
                System.out.println("Lendo 'c' indo para Q5");
                estadoQ5();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }        
    }
    public void estadoQ6(){
        q6.setText("q6 Acessado");
        contador++;
        if(tamanho == contador){
            resultado.setText(aceito);
            System.out.println(aceito);
        }else{
            if(palavra.charAt(contador)== 'a'){
                System.out.println("Lendo 'a' indo para Q6");
                estadoQ6();
            }else if(palavra.charAt(contador)== 'b'){
                System.out.println("Lendo 'b' indo para Q9");
                estadoQ9();
            }else if(palavra.charAt(contador)== 'c'){
                System.out.println("Lendo 'c' indo para Q5");
                estadoQ5();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }        
    }
    public void estadoQ7(){
        q7.setText("q7 Acessado");
        contador++;
        if(tamanho == contador){
            resultado.setText(aceito);
            System.out.println(aceito);
        }else{
            if(palavra.charAt(contador)== 'a'){
                System.out.println("Lendo 'a' indo para Q6");
                estadoQ6();
            }else if(palavra.charAt(contador)== 'b'){
                System.out.println("Lendo 'b' indo para Q9");
                estadoQ9();
            }else if(palavra.charAt(contador)== 'c'){
                System.out.println("Lendo 'c' indo para Q5");
                estadoQ5();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }        
    }
    public void estadoQ8(){
        q8.setText("q8 Acessado");
        contador++;
        if(tamanho == contador){
            resultado.setText(aceito);
            System.out.println(aceito);
        }else{
            if(palavra.charAt(contador)== 'a'){
                System.out.println("Lendo 'a' indo para Q1");
                estadoQ1();
            }else if(palavra.charAt(contador)== 'b'){
                System.out.println("Lendo 'b' indo para Q4");
                estadoQ4();
            }else if(palavra.charAt(contador)== 'c'){
                System.out.println("Lendo 'c' indo para Q5");
                estadoQ5();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }        
    }
    public void estadoQ9(){
        q9.setText("q9 Acessado");
        contador++;
        if(tamanho == contador){
            resultado.setText(aceito);
            System.out.println(aceito);
        }else{
            if(palavra.charAt(contador)== 'a'){
                System.out.println("Lendo 'a' indo para Q6");
                estadoQ6();
            }else if(palavra.charAt(contador)== 'b'){
                System.out.println("Lendo 'b' indo para Q9");
                estadoQ9();
            }else if(palavra.charAt(contador)== 'c'){
                System.out.println("Lendo 'c' indo para Q5");
                estadoQ5();
            }else{
                resultado.setText(recusado);
                System.out.println(recusado);
            }
        }        
    }
    public void novo(){
        txt_expressao.setText("");
        resultado.setText("");
        contador = 0;
        tamanho = 0;
        novo.setEnabled(false);
        verificar.setEnabled(true);
        txt_expressao.setEnabled(true);
        q0.setText("q0");
        q1.setText("q1");
        q2.setText("q2");
        q3.setText("q3");
        q4.setText("q4");
        q5.setText("q5");
        q6.setText("q6");
        q7.setText("q7");
        q8.setText("q8");
        q9.setText("q9");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_expressao = new javax.swing.JTextField();
        verificar = new javax.swing.JButton();
        novo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        resultado = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        q0 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        sair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_expressao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_expressaoKeyPressed(evt);
            }
        });

        verificar.setText("Verificar");
        verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarActionPerformed(evt);
            }
        });

        novo.setText("Novo");
        novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_expressao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(novo)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_expressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verificar)
                    .addComponent(novo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        q0.setText("q0");

        q1.setText("q1");

        q2.setText("q2");

        q3.setText("q3");

        q4.setText("q4");

        q5.setText("q5");

        q6.setText("q6");

        q7.setText("q7");

        q8.setText("q8");

        q9.setText("q9");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(q4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(q3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(q2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(q0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(q5, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
            .addComponent(q6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(q7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(q8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(q9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(q0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(q9))
        );

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/automato/expressao.png"))); // NOI18N

        jButton1.setText("Minimizado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Automato");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel2)
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sair)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarActionPerformed
        verificar();
    }//GEN-LAST:event_verificarActionPerformed

    private void novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoActionPerformed
        novo();
    }//GEN-LAST:event_novoActionPerformed

    private void txt_expressaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_expressaoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER){
            verificar();
        } 
    }//GEN-LAST:event_txt_expressaoKeyPressed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "", "Automato Minimizado",2,
                new ImageIcon(getClass().getResource("Projeto final revisado.png")));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "", "Automato AFN",2,
                new ImageIcon(getClass().getResource("Projeto a minimizar.png")));
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(verificarAutomato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verificarAutomato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verificarAutomato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verificarAutomato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verificarAutomato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton novo;
    private javax.swing.JLabel q0;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton sair;
    private javax.swing.JTextField txt_expressao;
    private javax.swing.JButton verificar;
    // End of variables declaration//GEN-END:variables
}
