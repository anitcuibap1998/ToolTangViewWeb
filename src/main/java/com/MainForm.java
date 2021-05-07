/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.controller.ViewWeb;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import javax.swing.*;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author anitc
 */
public class MainForm extends javax.swing.JFrame {
    static {
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
    }
    /**
     * Creates new form MainFoem
     */
    public MainForm() {
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

        txtLinkWeb = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtViewCanTang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTrangThaiApp = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSoLuotViewDaChay = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtClearCacheAuto = new javax.swing.JButton();
        txtClearCache1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtLinkWeb.setText("https://news88.org/");
        txtLinkWeb.setName("txtLinkWeb"); // NOI18N
        txtLinkWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkWebActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tool Tăng View Website");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Link Web site:");

        txtViewCanTang.setName("txtSoViewCanTang"); // NOI18N

        jLabel3.setText("Số View cần tăng:");

        txtSoLuong.setText("10");
        txtSoLuong.setName("txtSoLuongCanChay"); // NOI18N

        jLabel4.setText("Số Luồng:");

        jLabel5.setText("Trạng Thái:");

        jLabel6.setText("Số View Đã Chạy Được:");

        txtTrangThaiApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTrangThaiApp.setName("labelTrangThaiApp"); // NOI18N

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("50s -> 60s");

        jLabel9.setText("Thời gian mỗi view:");

        txtSoLuotViewDaChay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSoLuotViewDaChay.setText("0/0");
        txtSoLuotViewDaChay.setName("labelSoLuotViewed"); // NOI18N

        jButton1.setText("Bắt Đầu");
        jButton1.setName("btnStart"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtClearCacheAuto.setText("Thoát");
        txtClearCacheAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClearCacheAutoActionPerformed(evt);
            }
        });

        txtClearCache1.setText("Clear Cache");
        txtClearCache1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClearCache1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLinkWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtViewCanTang, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(txtClearCache1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(txtClearCacheAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSoLuotViewDaChay, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                            .addComponent(txtTrangThaiApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTrangThaiApp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuotViewDaChay, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLinkWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtViewCanTang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClearCacheAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClearCache1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClearCacheAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClearCacheAutoActionPerformed
        try {
            System.out.println("vào hàm clear cache");
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
            Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
            Runtime.getRuntime().exec("taskkill /F /IM conhost.exe");
        }catch (IOException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }//GEN-LAST:event_txtClearCacheAutoActionPerformed

    private void txtClearCache1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClearCache1ActionPerformed

        try {
            System.out.println("vào hàm clear cache");
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
            Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
            Runtime.getRuntime().exec("taskkill /F /IM conhost.exe");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtClearCache1ActionPerformed

    private void txtLinkWebActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            firefoxOptions.setHeadless(true);
            WebDriver driver = new FirefoxDriver(firefoxOptions);
            driver.get("https://news88.org/truong-ngoc-anh-dien-ao-tam-nong-bong-tinh-tu-ben-ban-trai-tin-don/");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        try {
            jButton1.setEnabled(true);
            String urlWebTarget = txtLinkWeb.getText();
            int soLuong = Integer.parseInt(txtSoLuong.getText());
            int soViewCanTang = Integer.parseInt(txtViewCanTang.getText());
            AtomicInteger countView = new AtomicInteger();
            AtomicInteger countThatBai = new AtomicInteger();
            txtTrangThaiApp.setText("Đang Chay .....");
            txtSoLuotViewDaChay.setText(0 + "/" + soViewCanTang);
            txtSoLuotViewDaChay.paintImmediately(txtSoLuotViewDaChay.getVisibleRect());
            if (soLuong>15){
                soLuong =10 ;
            }
            if(soLuong<10){
                soLuong = 8;
            }
            final ExecutorService executorService = Executors.newFixedThreadPool(soLuong);
            if (soViewCanTang != -99) {
                for (int i = 0; i < soViewCanTang; i++) {
                    executorService.execute(() -> {
                        if (ViewWeb.view("https://news88.org")) {
                            countView.getAndIncrement();
                            txtSoLuotViewDaChay.setText(countView + "/" + soViewCanTang);
                            txtSoLuotViewDaChay.paintImmediately(txtSoLuotViewDaChay.getVisibleRect());
                        }else {
                            countThatBai.getAndIncrement();
                        }
                        if ((Integer.parseInt(countView.toString()) + (Integer.parseInt(countThatBai.toString())) == soViewCanTang)) {
                            txtTrangThaiApp.setText("Đã Chạy Xong");
                            txtTrangThaiApp.paintImmediately(txtTrangThaiApp.getVisibleRect());
                            jButton1.setEnabled(true);
                        }
                    });
                }
            }else if(soViewCanTang == -99){
                int i = 0;
                while (i < 10000000){
                    txtTrangThaiApp.setText("Đang Chay .....");
                    txtSoLuotViewDaChay.setText(0 + "/" + soViewCanTang);
                    ViewWeb.view(urlWebTarget);
                    i++;
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            jButton1.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Các Input đầu vào chưa hợp lệ");
        }
        finally {
            try {
                Thread thread1 = new Thread(new ViewWeb());
                thread1.start();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton txtClearCache1;
    private javax.swing.JButton txtClearCacheAuto;
    private javax.swing.JTextField txtLinkWeb;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JLabel txtSoLuotViewDaChay;
    private javax.swing.JLabel txtTrangThaiApp;
    private javax.swing.JTextField txtViewCanTang;
    // End of variables declaration//GEN-END:variables
}
