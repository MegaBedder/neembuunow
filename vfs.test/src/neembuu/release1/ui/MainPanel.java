/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package neembuu.release1.ui;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import neembuu.release1.Main;

/**
 *
 * @author Shashank Tulsyan
 */
public class MainPanel extends javax.swing.JPanel {

    private final NeembuuUI nui;

    /**
     * Creates new form MainPanel
     */
    MainPanel(NeembuuUI nui) {
        this.nui = nui;
        initComponents();
        progressAnimated.setVisible(false);
        statusLabel.setVisible(false);
        initStyle();
    }

    private void initStyle(){
        addLinksButton.setBackground(Colors.PROGRESS_BAR_FILL_BUFFER);
        addOnlyFilesButton.setBackground(Colors.BUTTON_TINT);

        TextBubbleBorder border2 = new TextBubbleBorder(Colors.BORDER , 3, 15, 0);
        border2.getBorderInsets(null).bottom = 8;
        border2.getBorderInsets(null).top = 8;
        border2.getBorderInsets(null).right = 5;
        border2.getBorderInsets(null).left = 5;
        
        listOfLinksScroll.setBorder(border2);
        listOfLinks.setBackground(Colors.TEXT_BACKGROUND);
        addLinksPanel.setVisible(false);
        
        TextBubbleBorder border3 = new TextBubbleBorder(Colors.PROGRESS_BAR_FILL_ACTIVE, 3, 15, 0);
        border3.getBorderInsets(null).bottom = 0;
        border3.getBorderInsets(null).top = 8;
        //border3.getBorderInsets(null).right = 1;
        //border3.getBorderInsets(null).left = 1;
        addLinksPanel.setBorder(border3);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upperControlsPane = new javax.swing.JPanel();
        neembuuVirtualFolderButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        aboutButton = HiddenBorderButton.make("");
        helpButton = HiddenBorderButton.make("");
        showAddLinkUIButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        progressAnimated = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel("",SwingConstants.CENTER);
        addLinksPanel = new javax.swing.JPanel();
        addLinksButton = new javax.swing.JButton();
        listOfLinksScroll = new javax.swing.JScrollPane();
        listOfLinks = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        linkAddStatusLabel = new javax.swing.JLabel();
        addOnlyFilesButton = new javax.swing.JButton();
        linksScrollPane = new javax.swing.JScrollPane();
        linksPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 255));

        upperControlsPane.setBackground(new java.awt.Color(255, 255, 255));
        upperControlsPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upperControlsPaneMouseClicked(evt);
            }
        });

        neembuuVirtualFolderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neembuu/release1/ui/images/logo_7_unselected.PNG"))); // NOI18N
        neembuuVirtualFolderButton.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.neembuuVirtualFolderButton.text")); // NOI18N
        neembuuVirtualFolderButton.setToolTipText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.neembuuVirtualFolderButton.toolTipText")); // NOI18N
        neembuuVirtualFolderButton.setBorderPainted(false);
        neembuuVirtualFolderButton.setContentAreaFilled(false);
        neembuuVirtualFolderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        neembuuVirtualFolderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                neembuuVirtualFolderButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                neembuuVirtualFolderButtonMouseExited(evt);
            }
        });
        neembuuVirtualFolderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neembuuVirtualFolderButtonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Futura-Light", 0, 18)); // NOI18N
        title.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.title.text")); // NOI18N

        aboutButton.setFont(new java.awt.Font("Futura-Light", 0, 14)); // NOI18N
        aboutButton.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.aboutButton.text")); // NOI18N
        aboutButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        aboutButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });

        helpButton.setFont(new java.awt.Font("Futura-Light", 0, 14)); // NOI18N
        helpButton.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.helpButton.text")); // NOI18N
        helpButton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        helpButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        showAddLinkUIButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neembuu/release1/ui/images/+.png"))); // NOI18N
        showAddLinkUIButton.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.showAddLinkUIButton.text")); // NOI18N
        showAddLinkUIButton.setToolTipText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.showAddLinkUIButton.toolTipText")); // NOI18N
        showAddLinkUIButton.setContentAreaFilled(false);
        showAddLinkUIButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showAddLinkUIButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAddLinkUIButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Futura-Light", 0, 14)); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.jLabel1.text")); // NOI18N

        progressAnimated.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neembuu/release1/ui/images/Animation.gif"))); // NOI18N
        progressAnimated.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.progressAnimated.text")); // NOI18N

        statusLabel.setFont(new java.awt.Font("Futura-Light", 0, 13)); // NOI18N
        statusLabel.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.statusLabel.text")); // NOI18N
        statusLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        addLinksPanel.setBackground(new java.awt.Color(255, 255, 255));
        addLinksPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        addLinksButton.setFont(Fonts.MyriadPro.deriveFont(15f));
        addLinksButton.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.addLinksButton.text")); // NOI18N
        addLinksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLinksButtonActionPerformed(evt);
            }
        });

        listOfLinks.setColumns(20);
        listOfLinks.setFont(Fonts.MyriadPro.deriveFont(14f)
        );
        listOfLinks.setRows(5);
        listOfLinks.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.listOfLinks.text")); // NOI18N
        listOfLinksScroll.setViewportView(listOfLinks);

        jLabel2.setFont(new java.awt.Font("Futura-Light", 0, 16)); // NOI18N
        jLabel2.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.jLabel2.text")); // NOI18N

        linkAddStatusLabel.setFont(new java.awt.Font("Futura-Light", 0, 14)); // NOI18N
        linkAddStatusLabel.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.linkAddStatusLabel.text")); // NOI18N

        addOnlyFilesButton.setFont(Fonts.MyriadPro.deriveFont(14f));
        addOnlyFilesButton.setText(org.openide.util.NbBundle.getMessage(MainPanel.class, "MainPanel.addOnlyFilesButton.text")); // NOI18N
        addOnlyFilesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOnlyFilesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addLinksPanelLayout = new javax.swing.GroupLayout(addLinksPanel);
        addLinksPanel.setLayout(addLinksPanelLayout);
        addLinksPanelLayout.setHorizontalGroup(
            addLinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLinksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addLinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(linkAddStatusLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listOfLinksScroll, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addLinksPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addLinksPanelLayout.createSequentialGroup()
                        .addComponent(addLinksButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addOnlyFilesButton)))
                .addContainerGap())
        );
        addLinksPanelLayout.setVerticalGroup(
            addLinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLinksPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linkAddStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(listOfLinksScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addLinksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addLinksButton)
                    .addComponent(addOnlyFilesButton))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout upperControlsPaneLayout = new javax.swing.GroupLayout(upperControlsPane);
        upperControlsPane.setLayout(upperControlsPaneLayout);
        upperControlsPaneLayout.setHorizontalGroup(
            upperControlsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperControlsPaneLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(upperControlsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upperControlsPaneLayout.createSequentialGroup()
                        .addComponent(neembuuVirtualFolderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(upperControlsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(upperControlsPaneLayout.createSequentialGroup()
                                .addComponent(title)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(upperControlsPaneLayout.createSequentialGroup()
                                .addGroup(upperControlsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(aboutButton)
                                    .addComponent(helpButton))
                                .addGap(61, 61, 61)
                                .addComponent(progressAnimated)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, upperControlsPaneLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showAddLinkUIButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(upperControlsPaneLayout.createSequentialGroup()
                        .addComponent(addLinksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        upperControlsPaneLayout.setVerticalGroup(
            upperControlsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(upperControlsPaneLayout.createSequentialGroup()
                .addGroup(upperControlsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upperControlsPaneLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(upperControlsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neembuuVirtualFolderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(upperControlsPaneLayout.createSequentialGroup()
                                .addGroup(upperControlsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(upperControlsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(upperControlsPaneLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(aboutButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(helpButton))
                                    .addComponent(progressAnimated))
                                .addGap(0, 0, 0)
                                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(upperControlsPaneLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(showAddLinkUIButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addLinksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        linksScrollPane.setBorder(null);
        linksScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        linksScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        linksPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout linksPanelLayout = new javax.swing.GroupLayout(linksPanel);
        linksPanel.setLayout(linksPanelLayout);
        linksPanelLayout.setHorizontalGroup(
            linksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        linksPanelLayout.setVerticalGroup(
            linksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );

        linksScrollPane.setViewportView(linksPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upperControlsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(linksScrollPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(upperControlsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(linksScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showAddLinkUIButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAddLinkUIButtonActionPerformed
        addLinksPanel.setVisible(!addLinksPanel.isVisible());
        nui.updateHeight();
    }//GEN-LAST:event_showAddLinkUIButtonActionPerformed

    private void neembuuVirtualFolderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neembuuVirtualFolderButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_neembuuVirtualFolderButtonActionPerformed

    private void neembuuVirtualFolderButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neembuuVirtualFolderButtonMouseExited
        neembuuVirtualFolderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neembuu/release1/ui/images/logo_7_unselected.PNG"))); // NOI18N
    }//GEN-LAST:event_neembuuVirtualFolderButtonMouseExited

    private void neembuuVirtualFolderButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_neembuuVirtualFolderButtonMouseEntered
        neembuuVirtualFolderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/neembuu/release1/ui/images/logo_7_selected.png"))); // NOI18N
    }//GEN-LAST:event_neembuuVirtualFolderButtonMouseEntered

    private void addLinksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLinksButtonActionPerformed
        nui.addLinks(true);
    }//GEN-LAST:event_addLinksButtonActionPerformed

    private void addOnlyFilesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOnlyFilesButtonActionPerformed
        // TODO add your handling code here:
        nui.addLinks(false);
    }//GEN-LAST:event_addOnlyFilesButtonActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
        // TODO add your handling code here:
        try{
            java.awt.Desktop.getDesktop().browse(new java.net.URI("http://neembuu.com/now/"));
        }catch(Exception a){
            JOptionPane.showMessageDialog(nui.getFrame(), "Please visit\nhttp://neembuu.com/now/", "Could not automatically open link", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        try{
            java.awt.Desktop.getDesktop().browse(new java.net.URI("http://neembuu.com/now/help/"));
        }catch(Exception a){
            JOptionPane.showMessageDialog(nui.getFrame(), "Please visit\nhttp://neembuu.com/now/help/", "Could not automatically open link", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_helpButtonActionPerformed

    private void upperControlsPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperControlsPaneMouseClicked
        Main.printPendingRequests();
    }//GEN-LAST:event_upperControlsPaneMouseClicked

    public String getLinksText(){
        return listOfLinks.getText();
    }
    
    public void setLinksText(String a){
        listOfLinks.setText(a);
    }
    
    void showIndefiniteProgress(boolean t,String message){
        if(!t){
            progressAnimated.setVisible(false);
            statusLabel.setVisible(false);
            return;
        }
        progressAnimated.setVisible(true);
        statusLabel.setText(message);
        statusLabel.setVisible(true);
    }
    public void addLinkProgressSet(String a){
        linkAddStatusLabel.setText(a);
    }
    public void addLinksPanelShow(boolean show){
        addLinksPanel.setVisible(show);
    }
    public void addLinksPanelEnable(boolean enable){
        addLinksButton.setEnabled(enable);
        addOnlyFilesButton.setEnabled(enable);
        listOfLinks.setEditable(enable);
        addLinksPanel.setEnabled(enable);
    }
    
    public static void main(String[] args) {
        Main.main(args);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutButton;
    private javax.swing.JButton addLinksButton;
    javax.swing.JPanel addLinksPanel;
    private javax.swing.JButton addOnlyFilesButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel linkAddStatusLabel;
    javax.swing.JPanel linksPanel;
    private javax.swing.JScrollPane linksScrollPane;
    javax.swing.JTextArea listOfLinks;
    private javax.swing.JScrollPane listOfLinksScroll;
    javax.swing.JButton neembuuVirtualFolderButton;
    private javax.swing.JLabel progressAnimated;
    private javax.swing.JButton showAddLinkUIButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel title;
    private javax.swing.JPanel upperControlsPane;
    // End of variables declaration//GEN-END:variables
}
