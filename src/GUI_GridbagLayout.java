import java.awt.*;
import javax.swing.*;

class VentanaGui extends JFrame {
    public VentanaGui() {

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        getContentPane().setLayout(new GridBagLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 500);
        setTitle("FORMULARIO DE REGISTRO GUI");
        setVisible(true);

        JLabel txtPrimero = new JLabel("The Classic Form includes all visible fields for this list.");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.WEST; //alinearlos a la izquierda
        add(txtPrimero, gbc);

        JLabel txtSegundo = new JLabel("FORM OPTIONS");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        add(txtSegundo, gbc);

        JLabel txtTercero = new JLabel("Include the following: ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        add(txtTercero, gbc);

        JCheckBox checkTitle = new JCheckBox("a title for your form");
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(checkTitle, gbc);

        JTextField Caja1 = new JTextField(10);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(Caja1, gbc);

        JRadioButton txtQuinto = new JRadioButton("Only required field");
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(txtQuinto, gbc);

        JRadioButton radiofields = new JRadioButton("All fields");
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(radiofields, gbc);

        JLabel txtTextoAz = new JLabel("<html>(edit required fields in <font color='blue'>the form builder</font>)</html>");
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(txtTextoAz, gbc);

        JCheckBox txtSexto = new JCheckBox("Interest group field");
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(txtSexto, gbc);

        JCheckBox txtSeven = new JCheckBox("Required field indicators");
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(txtSeven, gbc);

        JLabel txtOctavo = new JLabel("Set form width");
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(txtOctavo, gbc);

        JTextField Caja2 = new JTextField(10);
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(Caja2, gbc);

        JLabel txtNoveno = new JLabel("Enhance your form");
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(txtNoveno, gbc);

        JCheckBox txtDiez = new JCheckBox("Enable evil popup mode");
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(txtDiez, gbc);

        JCheckBox txtOnce = new JCheckBox("Disable all JavaScript");
        gbc.gridx = 0;
        gbc.gridy = 14;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(txtOnce, gbc);

        JCheckBox txtDoce = new JCheckBox("Include archive link");
        gbc.gridx = 0;
        gbc.gridy = 15;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(txtDoce, gbc);

        JCheckBox txtTrece = new JCheckBox("<html>Include <font color='blue'>MonkeyRewards link</font></html>");
        gbc.gridx = 0;
        gbc.gridy = 16;
        gbc.gridwidth = 6;
        gbc.gridheight = 1;
        add(txtTrece, gbc);

        JLabel txtCatorce = new JLabel("   Preview                 *indicates");
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        gbc.anchor = GridBagConstraints.WEST; 
        add(txtCatorce, gbc);


        JLabel lblEmail = new JLabel("Email Address");
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(lblEmail, gbc);

        JFormattedTextField formattedEmail = new JFormattedTextField();
        formattedEmail.setColumns(10); //acepta un apro de ... caracteres
        gbc.gridx = 5;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        add(formattedEmail, gbc);

        JLabel lblFirstName = new JLabel("First Name");
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(lblFirstName, gbc);

        JTextField txtFirstName = new JTextField(10);
        gbc.gridx = 5;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(txtFirstName, gbc);

        JLabel lblLastName = new JLabel("Last Name");
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        add(lblLastName, gbc);

        JTextField txtLastName = new JTextField(10);
        gbc.gridx = 5;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        add(txtLastName, gbc);

        JButton btnSubscribe = new JButton("Subscribe");
        gbc.gridx = 3;
        gbc.gridy = 8;
        gbc.gridwidth = 3;
        add(btnSubscribe, gbc);

        JLabel lblCopyPaste = new JLabel("Copy/paste onto your site");
        gbc.gridx = 3;
        gbc.gridy = 9;
        gbc.gridwidth = 3;
        add(lblCopyPaste, gbc);

        JTextArea txtCopyPaste = new JTextArea(5, 20);
        gbc.gridx = 3;
        gbc.gridy = 10;
        gbc.gridwidth = 3;
        add(txtCopyPaste, gbc);
    }
}

public class GUI_GridbagLayout {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                new VentanaGui();
            }
        });
    }
}