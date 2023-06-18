

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class LoginForm extends JFrame {
    private JPanel panel;
    private JLabel usuarioLabel;
    private JLabel contrasenaLabel;
    private JTextField usuarioTextField;
    private JPasswordField contrasenaPasswordField;
    private JButton loginButton;
    private JButton crearCuentaButton;

    private Map<String, String> cuentas;

    public LoginForm() {
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        panel = new JPanel();
        usuarioLabel = new JLabel("Usuario:");
        contrasenaLabel = new JLabel("Contraseña:");
        usuarioTextField = new JTextField(15);
        contrasenaPasswordField = new JPasswordField(15);
        loginButton = new JButton("Login");
        crearCuentaButton = new JButton("Crear Cuenta");

        panel.add(usuarioLabel);
        panel.add(usuarioTextField);
        panel.add(contrasenaLabel);
        panel.add(contrasenaPasswordField);
        panel.add(loginButton);
        panel.add(crearCuentaButton);

        add(panel);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioTextField.getText();
                String contrasena = new String(contrasenaPasswordField.getPassword());

                if (cuentas.containsKey(usuario) && cuentas.get(usuario).equals(contrasena)) {
                    JOptionPane.showMessageDialog(null, "¡Bienvenido " + usuario + "!");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }

                usuarioTextField.setText("");
                contrasenaPasswordField.setText("");
            }
        });

        crearCuentaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioTextField.getText();
                String contrasena = new String(contrasenaPasswordField.getPassword());

                if (usuario.isEmpty() || contrasena.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese un usuario y contraseña válidos.");
                } else if (cuentas.containsKey(usuario)) {
                    JOptionPane.showMessageDialog(null, "El usuario ya existe.");
                } else {
                    cuentas.put(usuario, contrasena);
                    JOptionPane.showMessageDialog(null, "Cuenta creada con éxito. Ahora puede iniciar sesión.");
                    usuarioTextField.setText("");
                    contrasenaPasswordField.setText("");
                }
            }
        });

        cuentas = new HashMap<>();
        cuentas.put("usuario1", "contrasena1");
        cuentas.put("usuario2", "contrasena2");
    }

    public static void main(String[] args) {
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}