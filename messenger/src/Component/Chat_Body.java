/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component;

import java.awt.Adjustable;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;
import net.miginfocom.swing.MigLayout;
import swing.ScrollBar;

/**
 *
 * @author bhavp
 */
public class Chat_Body extends javax.swing.JPanel {

    public Chat_Body() {
        initComponents();
        init();
        addItemRight("Send a text message to a group of contacts. Include photos, personalize your texts, and track who clicked your links.",  new ImageIcon(getClass().getResource("/icons/test/pic.jpg")),  new ImageIcon(getClass().getResource("/icons/test/pic.jpg")));
        addItemRight("hello\nHi");
//        addItemLeft("Simpletext started as a passion project because I couldn’t find what I was looking for. Most apps were trying to do too much and ended up bloated with features I don’t need. So I built Simpletext based on a simple premise — what if there’s an app that refuses to do more, choosing instead to do just one thing, and do it well? For Simpletext, that one thing is writing.", "Raven", new ImageIcon(getClass().getResource("/com/raven/icon/testing/dog.jpg")), new ImageIcon(getClass().getResource("/com/raven/icon/testing/pic.jpg")));
//        addDate("05/06/2021");
//        String img[] = {"LRMj,K-:?G9G_JIon}WqD~ITRPs,", "LCGlO@00.R~o.9DOO[%L02?aJ7D*"};
//        addItemLeft("hello\nerererew\newewe", "Dara", img);
//        addItemRight("hello\nerererew\newewe", new ImageIcon(getClass().getResource("/com/raven/icon/testing/pic.jpg")));
//        addItemLeft("Hello this is my friend", "Jonh", new ImageIcon(getClass().getResource("/com/raven/icon/testing/dog.jpg")), new ImageIcon(getClass().getResource("/com/raven/icon/testing/dog.jpg")));
        addItemRight("Ok\nWhat is he name ?");
       addItemLeft("", "Ro", new ImageIcon(getClass().getResource("/icons/test/pic.jpg")));
        addItemFile("", "Dara", "my doc.pdf", "1 MB");
        addItemFileRight("", "myfile.rar", "15 MB");
    }

    private void init() {
        Body.setLayout(new MigLayout("fillx", "", "5[]5"));
        sp.setVerticalScrollBar(new ScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.WHITE);
    }

    public void addItemLeft(String text, String user, Icon... image) {
        Chat_Left_Profile item = new Chat_Left_Profile();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        Body.add(item, "wrap, w 100::80%");
        //  ::80% set max with 80%
        Body.repaint();
        Body.revalidate();
    }

    public void addItemLeft(String text, String user, String[] image) {
        Chat_Left_Profile item = new Chat_Left_Profile();
        item.setText(text);
        item.setImage(image);
        item.setTime();
        item.setUserProfile(user);
        Body.add(item, "wrap, w 100::80%");
        //  ::80% set max with 80%
        Body.repaint();
        Body.revalidate();
    }

    public void addItemFile(String text, String user, String fileName, String fileSize) {
        Chat_Left_Profile item = new Chat_Left_Profile();
        item.setText(text);
        item.setFile(fileName, fileSize);
        item.setTime();
        item.setUserProfile(user);
        Body.add(item, "wrap, w 100::80%");
        //  ::80% set max with 80%
        Body.repaint();
        Body.revalidate();
    }

    public void addItemRight(String text, Icon... image) {
        Chat_Right item = new Chat_Right();
        item.setText(text);
        item.setImage(image);
        Body.add(item, "wrap, al right, w 100::80%");
        //  ::80% set max with 80%
        Body.repaint();
        Body.revalidate();
        item.setTime();
        scrollToBottom();
    }

    public void addItemFileRight(String text, String fileName, String fileSize) {
        Chat_Right item = new Chat_Right();
        item.setText(text);
        item.setFile(fileName, fileSize);
        Body.add(item, "wrap, al right, w 100::80%");
        //  ::80% set max with 80%
        Body.repaint();
        Body.revalidate();
    }

    public void addDate(String date) {
        Chat_Date item = new Chat_Date();
        item.setDate(date);
        Body.add(item, "wrap, al center");
        Body.repaint();
        Body.revalidate();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        Body = new javax.swing.JPanel();

        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        Body.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BodyLayout = new javax.swing.GroupLayout(Body);
        Body.setLayout(BodyLayout);
        BodyLayout.setHorizontalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );
        BodyLayout.setVerticalGroup(
            BodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        sp.setViewportView(Body);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void scrollToBottom() {
        JScrollBar verticalBar = sp.getVerticalScrollBar();
        AdjustmentListener downScroller = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                Adjustable adjustable = e.getAdjustable();
                adjustable.setValue(adjustable.getMaximum());
                verticalBar.removeAdjustmentListener(this);
            }
        };
        verticalBar.addAdjustmentListener(downScroller);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Body;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
