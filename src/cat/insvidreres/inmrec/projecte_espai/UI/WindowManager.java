package cat.insvidreres.inmrec.projecte_espai.UI;

import javax.swing.*;

public class WindowManager extends JFrame{
    
    public WindowManager() {
        initComponents();
    }
    
     private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PES");
        
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("DADES", new DadesPanel());
        tabbedPane.addTab("CRUD", new CrudPanel());
        
    }
}
class DadesPanel extends JPanel {
    public DadesPanel(){
        JButton b1 = new JButton("PROVA1");
        add(b1);
    }
}

class CrudPanel extends JPanel {
    public CrudPanel(){
        JButton b1 = new JButton("PROVA2");
        add(b1);
    }
}