import javax.swing.*;

public class Main_Title extends JFrame
{

    private JPanel panel1;
    private JButton MYINFOButton;
    private JButton LOGOUTButton;
    private JButton APPLYSTATUSButton;
    private JButton NOTICEButton;
    private JButton SUBJECTButton;
    private JScrollPane scrollPane1;

    public Main_Title()
    {
        setContentPane(panel1);
        setTitle("User_Info");
        setSize(1000,500);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
