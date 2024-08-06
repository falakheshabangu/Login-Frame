
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class LoginFrame extends JFrame{
    
    private JPanel headingPnl;
    private JPanel usernameJPnl;
    private JPanel passwordPnl;
    private JPanel btnPnl;
    private JPanel mainPnl;
    private JPanel usernameAndPasswordPnl;
    
    private JLabel headingLbl;
    private JLabel usernameLbl;
    private JLabel passwordLbl;
    
    private JTextField usernameTxtFld;
    
    private JPasswordField passwordTxtFld;
    
    private JButton submitBtn;
    private JButton clearBtn;
    private JButton exitBtn;

    public LoginFrame() {
        
        setTitle("LogIn Page");
        setSize(600, 650);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        usernameJPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        usernameAndPasswordPnl = new JPanel(new GridLayout(2,1,1,1));
        usernameAndPasswordPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Login Details"));
        
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Login");
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLbl.setFont(new Font(Font.SANS_SERIF, Font.BOLD + Font.ITALIC, 30));
        headingLbl.setForeground(Color.red);
        
        usernameLbl = new JLabel("Username: ");
        passwordLbl = new JLabel("Password: ");
        
        usernameTxtFld = new JTextField(10);
        usernameTxtFld.setFocusable(true);
        
        passwordTxtFld = new JPasswordField(10);
        
        submitBtn = new JButton("Submit");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        headingPnl.add(headingLbl);
        usernameJPnl.add(usernameLbl);
        usernameJPnl.add(usernameTxtFld);
        
        passwordPnl.add(passwordLbl);
        passwordPnl.add(passwordTxtFld);
        
        usernameAndPasswordPnl.add(usernameJPnl);
        usernameAndPasswordPnl.add(passwordPnl);
        
        btnPnl.add(submitBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        mainPnl.add(headingLbl, BorderLayout.NORTH);
        mainPnl.add(usernameAndPasswordPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        setVisible(true);
        
        
    }
    
    
    
}
