import javax.swing.*;

public class User_Info extends JFrame
{
    private JPanel user_panel;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JRadioButton a3RadioButton;
    private JRadioButton a5RadioButton;
    private JRadioButton a4RadioButton;
    private JRadioButton a1RadioButton1;
    private JRadioButton a2RadioButton1;
    private JRadioButton a3RadioButton1;
    private JRadioButton a4RadioButton1;
    private JRadioButton a5RadioButton1;
    private JRadioButton a1RadioButton2;
    private JRadioButton a2RadioButton2;
    private JRadioButton a3RadioButton2;
    private JRadioButton a4RadioButton2;
    private JRadioButton a5RadioButton2;
    private JRadioButton a1RadioButton3;
    private JRadioButton a1RadioButton4;
    private JRadioButton a2RadioButton3;
    private JRadioButton a2RadioButton4;
    private JRadioButton a3RadioButton3;
    private JRadioButton a3RadioButton4;
    private JRadioButton a4RadioButton3;
    private JRadioButton a4RadioButton4;
    private JRadioButton a5RadioButton3;
    private JRadioButton a5RadioButton4;
    private JRadioButton a1RadioButton5;
    private JRadioButton a2RadioButton5;
    private JRadioButton a3RadioButton5;
    private JRadioButton a4RadioButton5;
    private JRadioButton a5RadioButton5;
    private JButton 완료Button;
    private JRadioButton teamaterbtn1;
    private JRadioButton teamaterbtn2;

    private String User_name;
    private int User_info_int[] = new int[9];

    public User_Info()
    {
        setContentPane(user_panel);
        setTitle("User_Info");
        setSize(1000,500);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);

    }

    public void input_data()
    {
        User_name = textField1.getText();
        User_info_int[0] = Integer.parseInt(textField2.getText());
        User_info_int[1] = combobtn_1();
        User_info_int[2] = rbutn_1();
        User_info_int[3] = rbutn_2();
        User_info_int[4] = rbutn_3();
        User_info_int[5] = rbutn_4();
        User_info_int[6] = rbutn_5();
        User_info_int[7] = rbutn_6();
        User_info_int[8] = rbutn_7();
    }

    public int combobtn_1()
    {
        return comboBox1.getSelectedIndex();
    }

    public int rbutn_1()
    {
        if(a1RadioButton.isSelected())
            return 1;
        else if (a2RadioButton.isSelected())
            return 2;
        else if (a2RadioButton.isSelected())
            return 3;
        else if (a2RadioButton.isSelected())
            return 4;
        else if (a2RadioButton.isSelected())
            return 5;
        else
            return 0;
    }
    public int rbutn_2()
    {
        if(a1RadioButton1.isSelected())
            return 1;
        else if (a2RadioButton1.isSelected())
            return 2;
        else if (a2RadioButton1.isSelected())
            return 3;
        else if (a2RadioButton1.isSelected())
            return 4;
        else if (a2RadioButton1.isSelected())
            return 5;
        else
            return 0;
    }

    public int rbutn_3()
    {
        if(a1RadioButton2.isSelected())
            return 1;
        else if (a2RadioButton2.isSelected())
            return 2;
        else if (a2RadioButton2.isSelected())
            return 3;
        else if (a2RadioButton2.isSelected())
            return 4;
        else if (a2RadioButton2.isSelected())
            return 5;
        else
            return 0;
    }

    public int rbutn_4()
    {
        if(a1RadioButton3.isSelected())
            return 1;
        else if (a2RadioButton3.isSelected())
            return 2;
        else if (a2RadioButton3.isSelected())
            return 3;
        else if (a2RadioButton3.isSelected())
            return 4;
        else if (a2RadioButton3.isSelected())
            return 5;
        else
            return 0;
    }

    public int rbutn_5()
    {
        if(a1RadioButton4.isSelected())
            return 1;
        else if (a2RadioButton4.isSelected())
            return 2;
        else if (a2RadioButton4.isSelected())
            return 3;
        else if (a2RadioButton4.isSelected())
            return 4;
        else if (a2RadioButton4.isSelected())
            return 5;
        else
            return 0;
    }

    public int rbutn_6()
    {
        if(a1RadioButton5.isSelected())
            return 1;
        else if (a2RadioButton5.isSelected())
            return 2;
        else if (a2RadioButton5.isSelected())
            return 3;
        else if (a2RadioButton5.isSelected())
            return 4;
        else if (a2RadioButton5.isSelected())
            return 5;
        else
            return 0;
    }
    public int rbutn_7()
    {
        if(teamaterbtn1.isSelected())
            return 1;
        else if(teamaterbtn2.isSelected())
            return 0;
        else
            return 3;
    }

}
