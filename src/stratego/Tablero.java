package stratego;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Tablero extends JFrame implements ActionListener {

    ControladorLogin controladorlogin;
    Login login;
    PedirSegundoPlayer pedirsegundoplayer;
    MenuPrincipal menuprincipal;
    cambioturno cambio = new cambioturno(this);

    public boolean turnoHeroes;

    private JButton Bt_rendirse;
    JLabel labelTurno = new JLabel("Texto del JLabel");
    JTextArea eliminadasH = new JTextArea();
    JTextArea eliminadasV = new JTextArea();

    //Para los movimientos
    private String textoPrimeraFichaSeleccionada;
    private String textoSegundaFichaSeleccionada;
    private int posicionInicialx;
    private int posicionInicialy;
    private int posicionFinalx;
    private int posicionFinaly;
    private String fichaseleccionada;
    private String ganador = "";
    private boolean GananHeroes;
    private boolean GananVillanos;
    private int FichasRestantesVillanos = 33;
    private int FichasRestantesHeroes = 33;
    private String heroes;
    private String villanos;

    private int vecesClickeadas = 0;
    private JButton botonClickeado;
    private JButton[][] botones;
    ArrayList<String> rangos2Heroes = new ArrayList();
    ArrayList<String> rangos2Villanos = new ArrayList();
    ArrayList<String> rangossobrantesH = new ArrayList();
    ArrayList<String> rangossobrantesV = new ArrayList();
    //Crear los JLabel para mostrar los datos de la ficha
    JLabel lblrango = new JLabel("Rango");
    JLabel lblidentidad = new JLabel("Identidad");
    

    public Tablero(PedirSegundoPlayer pedirsegundoplayer, ControladorLogin controladorlogin, Login login) {
        this.controladorlogin = controladorlogin;
        this.login = login;
        this.pedirsegundoplayer = pedirsegundoplayer;
        this.menuprincipal = new MenuPrincipal(login, controladorlogin);
        fichaseliminadasH.fichas.clear();
        fichaseliminadasV.fichas.clear();
        if (pedirsegundoplayer.bandoElegido.equals("HEROES")) {
            turnoHeroes = true;
            heroes = controladorlogin.UsuarioLogeado;
            villanos = pedirsegundoplayer.segundoPlayer;
            controladorlogin.buscarUsuario(heroes).setVecesJugadasHeroes(1);
            controladorlogin.buscarUsuario(villanos).setVecesJugadasVillanos(1);
        } else if (pedirsegundoplayer.bandoElegido.equals("VILLANOS")) {
            turnoHeroes = false;
            heroes = pedirsegundoplayer.segundoPlayer;
            villanos = controladorlogin.UsuarioLogeado;
            controladorlogin.buscarUsuario(heroes).setVecesJugadasHeroes(1);
            controladorlogin.buscarUsuario(villanos).setVecesJugadasVillanos(1);
        }

        //Rangos 2 Heroes
        rangos2Heroes.add("GambitH");
        rangos2Heroes.add("Spider-GirlH");
        rangos2Heroes.add("Ice-ManH");
        rangos2Heroes.add("StormH");
        rangos2Heroes.add("PhoenixH");
        rangos2Heroes.add("Dr-StrangeH");
        rangos2Heroes.add("ElektraH");
        rangos2Heroes.add("NightcrawlerH");

        //Rangos 2 Villanos
        rangos2Villanos.add("Mr-SinisterV");
        rangos2Villanos.add("Sentinel-1V");
        rangos2Villanos.add("Sentinel-2V");
        rangos2Villanos.add("UltronV");
        rangos2Villanos.add("SandmanV");
        rangos2Villanos.add("LeaderV");
        rangos2Villanos.add("ViperV");
        rangos2Villanos.add("ElectroV");

        //Rangos sobrantes Heroes
        rangossobrantesH.add("Mr-FantasticH"); //RANGO 10
        rangossobrantesH.add("Capitan-AmericaH"); //RANGO 9
        rangossobrantesH.add("ProfesorXH"); // 8
        rangossobrantesH.add("Nick-FuryH");//8
        rangossobrantesH.add("SpidermanH");//7
        rangossobrantesH.add("WolverineH");//7
        rangossobrantesH.add("NamorH");//7
        rangossobrantesH.add("DaredevilH");//6
        rangossobrantesH.add("Silver-SurferH");//6
        rangossobrantesH.add("HulkH");//6
        rangossobrantesH.add("Iron-ManH");//6
        rangossobrantesH.add("ThorH");//5
        rangossobrantesH.add("Human-TorchH");//5
        rangossobrantesH.add("CyclopsH");//5
        rangossobrantesH.add("Invisible-womanH");//5
        rangossobrantesH.add("Ghost-riderH");//4
        rangossobrantesH.add("PunisherH");//4
        rangossobrantesH.add("BladeH");//4
        rangossobrantesH.add("ThingH");//4
        rangossobrantesH.add("Emma-FrostH");//3
        rangossobrantesH.add("She-HulkH");//3
        rangossobrantesH.add("Giant-ManH");//3
        rangossobrantesH.add("BeastH");//3
        rangossobrantesH.add("ColossusH");//3
        rangossobrantesH.add("BlackWidowH");//1

        //Rangos Sobrantes Villanos
        rangossobrantesV.add("Dr-DoomV");//10
        rangossobrantesV.add("GalactusV");//9
        rangossobrantesV.add("KingpinV");//8
        rangossobrantesV.add("MagnetoV");//8
        rangossobrantesV.add("ApocalypseV");//7
        rangossobrantesV.add("Green-GoblinV");//7
        rangossobrantesV.add("VenomV");//7
        rangossobrantesV.add("BullseyeV");//6
        rangossobrantesV.add("Omega-redV");//6
        rangossobrantesV.add("OnslaughtV");//6
        rangossobrantesV.add("Red-skullV");//6
        rangossobrantesV.add("MystiqueV");//5
        rangossobrantesV.add("MysterioV");//5
        rangossobrantesV.add("Dr-OctopusV");//5
        rangossobrantesV.add("DeadpoolV");//5
        rangossobrantesV.add("AbominationV");//4
        rangossobrantesV.add("ThanosV");//4
        rangossobrantesV.add("Black-CatV");//4
        rangossobrantesV.add("SabretoothV");//4
        rangossobrantesV.add("JuggernautV");//3
        rangossobrantesV.add("RhinoV");//3
        rangossobrantesV.add("CarnageV");//3
        rangossobrantesV.add("Mole-ManV");//3
        rangossobrantesV.add("LizardV");//3
        rangossobrantesV.add("Black-WidowV");//1
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tablero de Botones");
        setResizable(false);

        Font Arial = new Font("Arial", Font.BOLD, 18);
        botones = new JButton[10][10];

        // Crear el contenedor principal (JPanel) con GridBagLayout
        JPanel mainPanel = new JPanel(new GridBagLayout());
        Color fondoMainPanel = new Color(12, 81, 109);
        mainPanel.setBackground(fondoMainPanel);

        lblrango.setFont(Arial);
        lblidentidad.setFont(Arial);

        // Establecer las restricciones para la primer jlabel
        GridBagConstraints gbc1 = new GridBagConstraints();
        gbc1.anchor = GridBagConstraints.NORTHEAST; 
        gbc1.insets = new Insets(10, 10, 0, 0); // Márgenes internos de la etiqueta
        gbc1.gridx = 6; // Posición en la cuadrícula X
        gbc1.gridy = 1; // Posición en la cuadrícula Y

        // Establecer las restricciones para la segunda etiqueta
        GridBagConstraints gbc2 = new GridBagConstraints();
        gbc2.anchor = GridBagConstraints.NORTHEAST; 
        gbc2.insets = new Insets(10, 10, 0, 0); // Márgenes internos de la etiqueta
        gbc2.gridx = 6; // Posición en la cuadrícula X
        gbc2.gridy = 0; // Posición en la cuadrícula Y

        // Agregar las etiquetas al panel principal con las restricciones
        mainPanel.add(lblrango, gbc1);
        mainPanel.add(lblidentidad, gbc2);
        // Crear el JPanel adicional
        JPanel panelAdicional = new JPanel();
        panelAdicional.setBackground(Color.black);

        // Crear el JPanel del tablero
        JPanel tableroPanel = new JPanel();
        tableroPanel.setLayout(null);
        tableroPanel.setBounds(380, 100, 790, 628);
        tableroPanel.setLayout(new GridBagLayout());

        //Area de texto para fichas heroes
        JLabel fichasvencidasH = new JLabel("FICHAS ELIMINADAS HEROES");
        fichasvencidasH.setFont(Arial);
        fichasvencidasH.setBounds(1250, 100, 500, 25);
        fichasvencidasH.setForeground(Color.WHITE);
        add(fichasvencidasH);
        Color colorarea = new Color(0, 0, 102);
        eliminadasH.setFont(Arial);
        eliminadasH.setForeground(Color.WHITE);
        eliminadasH.setLayout(null);
        eliminadasH.setBounds(1280, 140, 240, 600);

        add(eliminadasH);
        eliminadasH.setBackground(colorarea);

        //Area de texto para fichas villanos
        JLabel fichasvencidasV = new JLabel("FICHAS ELIMINADAS VILLANOS");
        fichasvencidasV.setFont(Arial);
        fichasvencidasV.setBounds(20, 100, 500, 25);
        fichasvencidasV.setForeground(Color.WHITE);
        add(fichasvencidasV);
        eliminadasV.setFont(Arial);
        eliminadasV.setForeground(Color.WHITE);
        eliminadasV.setLayout(null);
        eliminadasV.setBounds(20, 140, 240, 600);
        eliminadasV.setEditable(false);

        add(eliminadasV);
        eliminadasV.setBackground(colorarea);
        //boton rendirse
        Bt_rendirse = new JButton();
        Bt_rendirse.setText("RENDIRSE");
        Bt_rendirse.setLayout(null);
        Bt_rendirse.setBounds(1400, 20, 100, 30);
        add(Bt_rendirse);
        Bt_rendirse.addActionListener(this);

        // Agregar los botones al JPanel del tablero
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagConstraints gbcTurnos = new GridBagConstraints();
        gbcTurnos.anchor = GridBagConstraints.NORTHWEST; // Ancla en la esquina superior izquierda
        gbcTurnos.insets = new Insets(10, 10, 0, 0); // Márgenes internos del JLabel
        gbcTurnos.gridx = 0; // Posición en la cuadrícula X
        gbcTurnos.gridy = 0; // Posición en la cuadrícula Y

        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                JButton boton = new JButton("");
                boton.putClientProperty("x", fila);
                boton.putClientProperty("y", columna);
                boton.setForeground(Color.BLACK);
                boton.addActionListener(new ActionListener() {

                    //QUE PASA CUANDO SE PRESIONA EL BOTON
                    public void actionPerformed(ActionEvent e) {
                        vecesClickeadas++;
                        JButton botonClickeado = (JButton) e.getSource();
                        System.out.println("Boton presionado: " + botonClickeado.getText());
                        int x = (int) botonClickeado.getClientProperty("x");
                        int y = (int) botonClickeado.getClientProperty("y");
                        textoPrimeraFichaSeleccionada = botones[x][y].getText();
                        System.out.println(String.valueOf(x + ", " + y));
                        ponerIdentidadYRango();
                        hacerMovimientoYTurnos(boton, botonClickeado);
                        asignarColorBotones();
                        moverimagen();
                        System.out.println("veces clickeadas: " + vecesClickeadas);
                        if (GananHeroes == true || FichasRestantesVillanos == 0) {
                            if (FichasRestantesVillanos == 0) {
                                controladorlogin.logs = villanos + " USANDO VILLANOS HA PERDIDO POR NO TENER MOVIMIENTOS VALIDOS DISPONIBLES ANTE " + heroes + " - 19/6/2023";
                                controladorlogin.buscarUsuario(heroes).setPuntos(3);
                                controladorlogin.vecesQueGanaronHeroes++;
                            } else {
                                controladorlogin.buscarUsuario(heroes).setPuntos(3);
                                controladorlogin.vecesQueGanaronHeroes++;
                                controladorlogin.logs = heroes + "USANDO LOS HEROES HA SALVADO LA TIERRA! VENCIENDO A " + villanos + " - 19/6/2023\n" + controladorlogin.logs;
                                JOptionPane.showMessageDialog(null, "LA TIERRA HA SIDO SALVADA!\nLOS HEROES HAN GANADO!");
                                menuprincipal.setVisible(true);
                                dispose();

                            }

                        }
                        if (GananVillanos == true || FichasRestantesHeroes == 0) {
                            if (FichasRestantesHeroes == 0) {
                                controladorlogin.logs = heroes + " USANDO HEROES HA PERDIDO POR NO TENER MOVIMIENTOS VALIDOS DISPONIBLES ANTE " + villanos + " - 19/6/2023";
                                controladorlogin.buscarUsuario(villanos).setPuntos(3);
                                controladorlogin.vecesQueGanaronVillanos++;
                            } else {
                                controladorlogin.buscarUsuario(villanos).setPuntos(3);
                                controladorlogin.vecesQueGanaronVillanos++;
                                controladorlogin.logs = villanos + "USANDO LOS VILLANOS HA CAPTURADO LA TIERRA! VENCIENDO A " + heroes + " - 19/6/2023\n" + controladorlogin.logs;
                                JOptionPane.showMessageDialog(null, "LA TIERRA HA SIDO CAPTURADA!\nLOS VILLANOS HAN GANADO!");
                                menuprincipal.setVisible(true);
                                dispose();

                            }
                        }

                    }
                });
                boton.setPreferredSize(new Dimension(80, 80));
                gbc.gridx = columna;
                gbc.gridy = fila;
                tableroPanel.add(boton, gbc);
                botones[fila][columna] = boton; // Guardar el botón en la matriz

            }
        }

        // Agregar el JPanel adicional al contenedor principal
        gbc.gridx = 0;
        gbc.gridy = 0;
        mainPanel.add(panelAdicional, gbc);

        // Agregar el JPanel del tablero al contenedor principal
        gbc.gridx = 0;
        gbc.gridy = 1;
        mainPanel.add(tableroPanel, gbc);

        //Agregar el label de turnos al contenedor principal
        mainPanel.add(labelTurno, gbcTurnos);
        labelTurno.setFont(Arial);
        labelTurno.setForeground(Color.WHITE);

        // Agregar el contenedor principal al JFrame
        add(mainPanel);

        pack();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Hacer que la ventana esté en pantalla completa
        setVisible(true);

        //PARA EJECUTAR METODOS
        ponerFichasHeroes();
        ponerFichasVillanos();
        agregarArraylistsDenuevo();
        asignarColorBotones();
        ponerTextoAlLabelDeTurno();
        ponerZonaProhibida();
        moverimagen();

    }

    private void ponerIdentidadYRango() {
        textoPrimeraFichaSeleccionada = botones[posicionInicialx][posicionInicialy].getText();
        //Para turno heroes
        
        if (turnoHeroes == true) {
            if (rangos2Heroes.contains(textoPrimeraFichaSeleccionada)) {
                lblrango.setText("Rango: 2");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (textoPrimeraFichaSeleccionada.equals("Mr-FantasticH")) {
                lblrango.setText("Rango: 10");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (textoPrimeraFichaSeleccionada.equals("Capitan-AmericaH")) {
                lblrango.setText("Rango: 9");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if ((textoPrimeraFichaSeleccionada.equals("ProfesorXH") || textoPrimeraFichaSeleccionada.equals("Nick-FuryH"))) {
                lblrango.setText("Rango: 8");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if ((textoPrimeraFichaSeleccionada.equals("SpidermanH") || textoPrimeraFichaSeleccionada.equals("WolverineH") || textoPrimeraFichaSeleccionada.equals("NamorH"))) {
                lblrango.setText("Rango: 7");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if ((textoPrimeraFichaSeleccionada.equals("DaredevilH") || textoPrimeraFichaSeleccionada.equals("Silver-SurferH") || textoPrimeraFichaSeleccionada.equals("HulkH") || textoPrimeraFichaSeleccionada.equals("Iron-ManH"))) {
                lblrango.setText("Rango: 6");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if ((textoPrimeraFichaSeleccionada.equals("ThorH") || textoPrimeraFichaSeleccionada.equals("Human-TorchH") || textoPrimeraFichaSeleccionada.equals("CyclopsH") || textoPrimeraFichaSeleccionada.equals("Invisible-womanH"))) {
                lblrango.setText("Rango: 5");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if ((textoPrimeraFichaSeleccionada.equals("Ghost-riderH") || textoPrimeraFichaSeleccionada.equals("PunisherH") || textoPrimeraFichaSeleccionada.equals("BladeH") || textoPrimeraFichaSeleccionada.equals("ThingH"))) {
                lblrango.setText("Rango: 4");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if ((textoPrimeraFichaSeleccionada.equals("Emma-FrostH") || textoPrimeraFichaSeleccionada.equals("She-HulkH") || textoPrimeraFichaSeleccionada.equals("Giant-ManH") || textoPrimeraFichaSeleccionada.equals("BeastH") || textoPrimeraFichaSeleccionada.equals("ColossusH"))) {
                lblrango.setText("Rango: 3");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (textoPrimeraFichaSeleccionada.equals("BlackWidowH")) {
                lblrango.setText("Rango: 1");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
        }
        if (turnoHeroes == false) {
            if (textoPrimeraFichaSeleccionada.equals("Dr-DoomV")) {
                lblrango.setText("Rango: 10");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (textoPrimeraFichaSeleccionada.equals("GalactusV")) {
                lblrango.setText("Rango: 9");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (textoPrimeraFichaSeleccionada.equals("KingpinV") || textoPrimeraFichaSeleccionada.equals("MagnetoV")) {
                lblrango.setText("Rango: 8");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (textoPrimeraFichaSeleccionada.equals("ApocalypseV") || textoPrimeraFichaSeleccionada.equals("Green-GoblinV") || textoPrimeraFichaSeleccionada.equals("VenomV")) {
                lblrango.setText("Rango: 7");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (textoPrimeraFichaSeleccionada.equals("BullseyeV") || textoPrimeraFichaSeleccionada.equals("Omega-redV") || textoPrimeraFichaSeleccionada.equals("OnslaughtV") || textoPrimeraFichaSeleccionada.equals("Red-skullV")) {
                lblrango.setText("Rango: 6");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (textoPrimeraFichaSeleccionada.equals("MystiqueV") || textoPrimeraFichaSeleccionada.equals("MysterioV") || textoPrimeraFichaSeleccionada.equals("Dr-OctopusV") || textoPrimeraFichaSeleccionada.equals("DeadpoolV")) {
                lblrango.setText("Rango: 5");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (textoPrimeraFichaSeleccionada.equals("AbominationV") || textoPrimeraFichaSeleccionada.equals("ThanosV") || textoPrimeraFichaSeleccionada.equals("Black-CatV") || textoPrimeraFichaSeleccionada.equals("SabretoothV")) {
                lblrango.setText("Rango: 4");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (textoPrimeraFichaSeleccionada.equals("JuggernautV") || textoPrimeraFichaSeleccionada.equals("RhinoV") || textoPrimeraFichaSeleccionada.equals("CarnageV") || textoPrimeraFichaSeleccionada.equals("Mole-ManV") || textoPrimeraFichaSeleccionada.equals("LizardV")) {
                lblrango.setText("Rango: 3");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (rangos2Villanos.contains(textoPrimeraFichaSeleccionada)) {
                lblrango.setText("Rango: 2");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }
            if (textoPrimeraFichaSeleccionada.equals("Black-WidowV")) {
                lblrango.setText("Rango: 1");
                String nombreFicha = textoPrimeraFichaSeleccionada;
                String fichaSinUltimaLetra = nombreFicha.substring(0, textoPrimeraFichaSeleccionada.length() - 1);
                lblidentidad.setText(fichaSinUltimaLetra);
            }

        }

    }

    private void asignarColorBotones() {
        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                JButton boton = botones[fila][columna];
                Color colorZonaProhibidaDerecha = new Color(121, 9, 167);
                if (!botones[fila][columna].getBackground().equals(Color.YELLOW) && !botones[fila][columna].getBackground().equals(colorZonaProhibidaDerecha)) {
                    String textoBoton = boton.getText();
                    Color colorHeroes = new Color(17, 133, 6);
                    Color colorVillanos = new Color(167, 9, 9);
                    if (textoBoton.equals("")) {
                        boton.setBackground(Color.WHITE);
                    }
                    if (rangos2Heroes.contains(textoBoton)) {
                        boton.setBackground(colorHeroes);
                    }
                    if (textoBoton.equals("pumpkin-bomb")) {
                        boton.setBackground(colorVillanos);
                    }
                    if (textoBoton.equals("nova-blast")) {
                        boton.setBackground(colorHeroes);
                    }
                    if (textoBoton.equals("tierraH")) {
                        boton.setBackground(colorHeroes);
                    }
                    if (textoBoton.equals("tierraV")) {
                        boton.setBackground(colorVillanos);
                    }

                    if (rangossobrantesH.contains(textoBoton)) {
                        boton.setBackground(colorHeroes);
                    }
                    if (rangos2Villanos.contains(textoBoton)) {
                        boton.setBackground(colorVillanos);
                    }
                    if (rangossobrantesV.contains(textoBoton)) {
                        boton.setBackground(colorVillanos);
                    }
                }
            }

        }
    }

    private void moverimagen() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                ImageIcon imagen = null;
                JButton boton = botones[i][j];
                String textoBoton = boton.getText();

                if (pedirsegundoplayer.bandoElegido.equals("HEROES")) {
                    if (turnoHeroes == true) {
                        if (textoBoton.equals("")) {
                            imagen = new ImageIcon(getClass().getResource("/imagenes/villanos/fondoblanco.png"));
                        }
                        if (rangos2Villanos.contains(textoBoton) || rangossobrantesV.contains(textoBoton) || textoBoton.equals("pumpkin-bomb") || textoBoton.equals("tierraV")) {
                            imagen = new ImageIcon(getClass().getResource("/imagenes/villanos/fondovillanos.png"));
                        }
                    }
                    if (turnoHeroes == false) {
                        if (textoBoton.equals("")) {
                            imagen = new ImageIcon(getClass().getResource("/imagenes/villanos/fondoblanco.png"));
                        }
                        if (rangos2Heroes.contains(textoBoton) || rangossobrantesH.contains(textoBoton) || textoBoton.equals("nova-blast") || textoBoton.equals("tierraH")) {
                            imagen = new ImageIcon(getClass().getResource("/imagenes/Heroes/fondoheroes.jpg"));
                        }
                        boton.setIcon(null);

                    }
                    if (turnoHeroes == true) {
                        if (rangos2Heroes.contains(textoBoton) || rangossobrantesH.contains(textoBoton) || textoBoton.equals("nova-blast") || textoBoton.equals("tierraH")) {
                            boton.setIcon(null);
                        }

                    }
                }

                //bandi villanos
                if (pedirsegundoplayer.bandoElegido.equals("VILLANOS")) {
                    if (turnoHeroes == false) {
                        if (textoBoton.equals("")) {
                            imagen = new ImageIcon(getClass().getResource("/imagenes/villanos/fondoblanco.png"));
                        }
                        if (rangos2Heroes.contains(textoBoton) || rangossobrantesH.contains(textoBoton) || textoBoton.equals("nova-blast") || textoBoton.equals("tierraH")) {
                            imagen = new ImageIcon(getClass().getResource("/imagenes/Heroes/fondoheroes.jpg"));
                        }
                    }
                    if (turnoHeroes == true) {
                        if (textoBoton.equals("")) {
                            imagen = new ImageIcon(getClass().getResource("/imagenes/villanos/fondoblanco.png"));
                        }
                        if (rangos2Villanos.contains(textoBoton) || rangossobrantesV.contains(textoBoton) || textoBoton.equals("pumpkin-bomb") || textoBoton.equals("tierraV")) {
                            imagen = new ImageIcon(getClass().getResource("/imagenes/villanos/fondovillanos.png"));
                        }
                        boton.setIcon(null);
                    }
                    if (turnoHeroes == false) {
                        if (rangos2Villanos.contains(textoBoton) || rangossobrantesV.contains(textoBoton) || textoBoton.equals("pumpkin-bomb") || textoBoton.equals("tierraV")) {
                            boton.setIcon(null);
                        }
                    }
                }
                // Establecer la imagen en el botón
                if (imagen != null) {
                    boton.setIcon(imagen);
                }
            }
        }

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Bt_rendirse) {
            int respuesta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea rendirse?", "", JOptionPane.YES_NO_OPTION);
            if (respuesta == 0) {
                if (turnoHeroes == true) {
                    controladorlogin.buscarUsuario(villanos).setPuntos(3);
                    controladorlogin.vecesQueGanaronVillanos++;
                    controladorlogin.logs = villanos + " USANDO VILLANOS HA GANADO YA QUE " + heroes + " USANDO HEROES SE HA RETIRADO DEL JUEGO - 19/6/2023\n" + controladorlogin.logs;
                    JOptionPane.showMessageDialog(null, "LOS HEROES SE HAN RENDIDO!\nLOS VILLANOS HAN GANADO!");
                }
                if (turnoHeroes == false) {
                    controladorlogin.buscarUsuario(heroes).setPuntos(3);
                    controladorlogin.vecesQueGanaronHeroes++;
                    controladorlogin.logs = heroes + " USANDO HEROES HA GANADO YA QUE " + villanos + " USANDO VILLANOS SE HA RETIRADO DEL JUEGO - 19/6/2023\n" + controladorlogin.logs;
                    JOptionPane.showMessageDialog(null, "LOS VILLANOS SE HAN RENDIDO!\nLOS HEROES HAN GANADO!");
                }

                menuprincipal.setVisible(true);
                this.dispose();
            }
        }
    }

    private void ponerZonaProhibida() {
        //Zona prohibida lado izquierdo
        botones[4][2].setEnabled(false);
        botones[4][2].setBackground(Color.YELLOW);
        botones[4][2].setText(".");
        botones[4][3].setEnabled(false);
        botones[4][3].setBackground(Color.YELLOW);
        botones[4][3].setText(".");
        botones[5][2].setEnabled(false);
        botones[5][2].setBackground(Color.YELLOW);
        botones[5][2].setText(".");
        botones[5][3].setEnabled(false);
        botones[5][3].setBackground(Color.YELLOW);
        botones[5][3].setText(".");
        Color colorZonaProhibidaDerecha = new Color(121, 9, 167);
        //Zona prohibida lado derecho
        botones[4][6].setEnabled(false);
        botones[4][6].setBackground(colorZonaProhibidaDerecha);
        botones[4][6].setText(".");
        botones[4][7].setEnabled(false);
        botones[4][7].setBackground(colorZonaProhibidaDerecha);
        botones[4][7].setText(".");
        botones[5][6].setEnabled(false);
        botones[5][6].setBackground(colorZonaProhibidaDerecha);
        botones[5][6].setText(".");
        botones[5][7].setEnabled(false);
        botones[5][7].setBackground(colorZonaProhibidaDerecha);
        botones[5][7].setText(".");

    }

    private void ponerFichasHeroes() {
        Random nAzar = new Random();
        int numeroAlAzar = 0;
        numeroAlAzar = nAzar.nextInt(1, 9);
        //Colocar tierras
        colocarTierraH(numeroAlAzar);

        //Colocar bombas alrededor
        colocarBombaH(9, numeroAlAzar - 1);//IZQUIERDA
        colocarBombaH(9, numeroAlAzar + 1);//DERECHA
        colocarBombaH(8, numeroAlAzar);//ARRIBA
        int numerodebombas = 0;
        Random nAzarFila = new Random();
        Random nAzarColumna = new Random();

        //PONER LAS OTRAS TRES BOMBAS
        do {
            int posicionFila = nAzarFila.nextInt(8, 10); // Número aleatorio de 1 a 20
            int posicionColumna = nAzarColumna.nextInt(0, 10); // Número aleatorio de 1 a 20
            if (!botones[posicionFila][posicionColumna].getText().equals("tierraH") && !botones[posicionFila][posicionColumna].getText().equals("nova-blast") && !botones[posicionFila][posicionColumna].getText().equals("nova-blast")) {
                colocarBombaH(posicionFila, posicionColumna);
                numerodebombas++;

            }

        } while (numerodebombas != 3);

        //PONER RANGO 2 HEROES Y VILLANOS
        int vecesrepetidas = 0;
        do {

            int posicionFila = nAzarFila.nextInt(6, 8);
            int posicionColumna = nAzarColumna.nextInt(0, 10);
            if (revisarSiEstaVacio(posicionFila, posicionColumna) == true) {
                colocarRango2(posicionFila, posicionColumna, 1);
                vecesrepetidas++;
            }
        } while (vecesrepetidas != 8);

        vecesrepetidas = 0;
        do {

            int posicionFila = nAzarFila.nextInt(2, 4);
            int posicionColumna = nAzarColumna.nextInt(0, 10);
            if (revisarSiEstaVacio(posicionFila, posicionColumna) == true) {
                colocarRango2(posicionFila, posicionColumna, 2);
                vecesrepetidas++;
            }
        } while (vecesrepetidas != 8);

        vecesrepetidas = 0;
        //heroes sobrantes
        do {
            int posicionFila = nAzar.nextInt(6, 10);
            int posicionColumna = nAzarColumna.nextInt(0, 10);
            if (revisarSiEstaVacio(posicionFila, posicionColumna) == true) {
                fichasSobrantesHeroes(posicionFila, posicionColumna);
                vecesrepetidas++;
            }
        } while (vecesrepetidas < 25);

    }

    private void ponerFichasVillanos() {
        Random nAzar = new Random();
        int numeroAlAzar = 0;
        numeroAlAzar = nAzar.nextInt(1, 9);
        //Colocar tierras
        colocarTierraV(0, numeroAlAzar);

        //Colocar bombas alrededor
        colocarBombaV(0, numeroAlAzar - 1);//IZQUIERDA
        colocarBombaV(0, numeroAlAzar + 1);//DERECHA
        colocarBombaV(1, numeroAlAzar);//ABAJO
        int numerodebombas = 0;
        Random nAzarFila = new Random();
        Random nAzarColumna = new Random();

        //PONER LAS OTRAS 3 BOMBAS
        do {
            int posicionFila = nAzarFila.nextInt(0, 2); // Número aleatorio de 0 a 1
            int posicionColumna = nAzarColumna.nextInt(0, 10); // Número aleatorio de 0 a 9
            if (!botones[posicionFila][posicionColumna].getText().equals("tierraV") && !botones[posicionFila][posicionColumna].getText().equals("pumpkin-bomb") && !botones[posicionFila][posicionColumna].getText().equals("pumpkin-bomb")) {
                colocarBombaV(posicionFila, posicionColumna);
                numerodebombas++;
            }

        } while (numerodebombas != 3);
        //villanos sobrantes
        int vecesrepetidas = 0;
        do {
            int posicionFila = nAzar.nextInt(0, 4);
            int posicionColumna = nAzarColumna.nextInt(0, 10);
            if (revisarSiEstaVacio(posicionFila, posicionColumna) == true) {
                fichasSobrantesVillanos(posicionFila, posicionColumna);
                vecesrepetidas++;
            }
        } while (vecesrepetidas < 25);

    }

    public void agregarArraylistsDenuevo() {
        //Rangos 2 Heroes
        rangos2Heroes.add("GambitH");
        rangos2Heroes.add("Spider-GirlH");
        rangos2Heroes.add("Ice-ManH");
        rangos2Heroes.add("StormH");
        rangos2Heroes.add("PhoenixH");
        rangos2Heroes.add("Dr-StrangeH");
        rangos2Heroes.add("ElektraH");
        rangos2Heroes.add("NightcrawlerH");

        //se pueden mover donde deseen
        //Rangos 2 Villanos
        rangos2Villanos.add("Mr-SinisterV");
        rangos2Villanos.add("Sentinel-1V");
        rangos2Villanos.add("Sentinel-2V");
        rangos2Villanos.add("UltronV");
        rangos2Villanos.add("SandmanV");
        rangos2Villanos.add("LeaderV");
        rangos2Villanos.add("ViperV");
        rangos2Villanos.add("ElectroV");

        //Rangos sobrantes Heroes
        rangossobrantesH.add("Mr-FantasticH"); //RANGO 10
        rangossobrantesH.add("Capitan-AmericaH"); //RANGO 9
        rangossobrantesH.add("ProfesorXH"); // 8
        rangossobrantesH.add("Nick-FuryH");//8
        rangossobrantesH.add("SpidermanH");//7
        rangossobrantesH.add("WolverineH");//7
        rangossobrantesH.add("NamorH");//7
        rangossobrantesH.add("DaredevilH");//6
        rangossobrantesH.add("Silver-SurferH");//6
        rangossobrantesH.add("HulkH");//6
        rangossobrantesH.add("Iron-ManH");//6
        rangossobrantesH.add("ThorH");//5
        rangossobrantesH.add("Human-TorchH");//5
        rangossobrantesH.add("CyclopsH");//5
        rangossobrantesH.add("Invisible-womanH");//5
        rangossobrantesH.add("Ghost-riderH");//4
        rangossobrantesH.add("PunisherH");//4
        rangossobrantesH.add("BladeH");//4
        rangossobrantesH.add("ThingH");//4
        rangossobrantesH.add("Emma-FrostH");//3
        rangossobrantesH.add("She-HulkH");//3
        rangossobrantesH.add("Giant-ManH");//3
        rangossobrantesH.add("BeastH");//3
        rangossobrantesH.add("ColossusH");//3
        rangossobrantesH.add("BlackWidowH");//1

        //Rangos Sobrantes Villanos
        rangossobrantesV.add("Dr-DoomV");//10
        rangossobrantesV.add("GalactusV");//9
        rangossobrantesV.add("KingpinV");//8
        rangossobrantesV.add("MagnetoV");//8
        rangossobrantesV.add("ApocalypseV");//7
        rangossobrantesV.add("Green-GoblinV");//7
        rangossobrantesV.add("VenomV");//7
        rangossobrantesV.add("BullseyeV");//6
        rangossobrantesV.add("Omega-redV");//6
        rangossobrantesV.add("OnslaughtV");//6
        rangossobrantesV.add("Red-skullV");//6
        rangossobrantesV.add("MystiqueV");//5
        rangossobrantesV.add("MysterioV");//5
        rangossobrantesV.add("Dr-OctopusV");//5
        rangossobrantesV.add("DeadpoolV");//5
        rangossobrantesV.add("AbominationV");//4
        rangossobrantesV.add("ThanosV");//4
        rangossobrantesV.add("Black-CatV");//4
        rangossobrantesV.add("SabretoothV");//4
        rangossobrantesV.add("JuggernautV");//3
        rangossobrantesV.add("RhinoV");//3
        rangossobrantesV.add("CarnageV");//3
        rangossobrantesV.add("Mole-ManV");//3
        rangossobrantesV.add("LizardV");//3
        rangossobrantesV.add("Black-WidowV");//1
    }

    public void colocarTierraH(int posicionY) {
        switch (posicionY) {
            case 1:
                botones[9][posicionY].setText("tierraH");
                break;
            case 2:
                botones[9][posicionY].setText("tierraH");
                break;
            case 3:
                botones[9][posicionY].setText("tierraH");
                break;
            case 4:
                botones[9][posicionY].setText("tierraH");
                break;
            case 5:
                botones[9][posicionY].setText("tierraH");
                break;
            case 6:
                botones[9][posicionY].setText("tierraH");
                break;
            case 7:
                botones[9][posicionY].setText("tierraH");
                break;
            case 8:
                botones[9][posicionY].setText("tierraH");
                break;

        }
    }

    public void colocarTierraV(int posicionX, int posicionY) {
        switch (posicionY) {
            case 1:
                botones[0][posicionY].setText("tierraV");
                break;
            case 2:
                botones[0][posicionY].setText("tierraV");
                break;
            case 3:
                botones[0][posicionY].setText("tierraV");
                break;
            case 4:
                botones[0][posicionY].setText("tierraV");
                break;
            case 5:
                botones[0][posicionY].setText("tierraV");
                break;
            case 6:
                botones[0][posicionY].setText("tierraV");
                break;
            case 7:
                botones[0][posicionY].setText("tierraV");
                break;
            case 8:
                botones[0][posicionY].setText("tierraV");
                break;

        }

    }

    public void colocarBombaH(int posicionX, int posicionY) {
        switch (posicionY) {
            case 0:
                botones[posicionX][posicionY].setText("nova-blast");
                break;
            case 1:
                botones[posicionX][posicionY].setText("nova-blast");
                break;
            case 2:
                botones[posicionX][posicionY].setText("nova-blast");
                break;
            case 3:
                botones[posicionX][posicionY].setText("nova-blast");
                break;
            case 4:
                botones[posicionX][posicionY].setText("nova-blast");
                break;
            case 5:
                botones[posicionX][posicionY].setText("nova-blast");
                break;
            case 6:
                botones[posicionX][posicionY].setText("nova-blast");
                break;
            case 7:
                botones[posicionX][posicionY].setText("nova-blast");
                break;
            case 8:
                botones[posicionX][posicionY].setText("nova-blast");
                break;
            case 9:
                botones[posicionX][posicionY].setText("nova-blast");
                break;

        }
    }

    public void colocarBombaV(int posicionX, int posicionY) {
        switch (posicionY) {
            case 0:
                botones[posicionX][posicionY].setText("pumpkin-bomb");
                break;
            case 1:
                botones[posicionX][posicionY].setText("pumpkin-bomb");
                break;
            case 2:
                botones[posicionX][posicionY].setText("pumpkin-bomb");
                break;
            case 3:
                botones[posicionX][posicionY].setText("pumpkin-bomb");
                break;
            case 4:
                botones[posicionX][posicionY].setText("pumpkin-bomb");
                break;
            case 5:
                botones[posicionX][posicionY].setText("pumpkin-bomb");
                break;
            case 6:
                botones[posicionX][posicionY].setText("pumpkin-bomb");
                break;
            case 7:
                botones[posicionX][posicionY].setText("pumpkin-bomb");
                break;
            case 8:
                botones[posicionX][posicionY].setText("pumpkin-bomb");
                break;
            case 9:
                botones[posicionX][posicionY].setText("pumpkin-bomb");
                break;

        }
    }

    int numeroAlAzar;

    boolean espaciovacio;

    private boolean revisarSiEstaVacio(int posicionX, int posicionY) {
        if (botones[posicionX][posicionY].getText().equals("")) {
            espaciovacio = true;
        } else {
            espaciovacio = false;
        }
        return espaciovacio;
    }

    int limitedelgenerador = 8;
    int index;

    private void colocarRango2(int posicionX, int posicionY, int HeroeOVillano) {//HEROE = 1, VILLANO = 2
        if (HeroeOVillano == 1) {
            botones[posicionX][posicionY].setText(rangos2Heroes.get(index));
            rangos2Heroes.remove(index);
            limitedelgenerador--;
        }
        if (HeroeOVillano == 2) {
            botones[posicionX][posicionY].setText(rangos2Villanos.get(index));
            rangos2Villanos.remove(index);
            limitedelgenerador--;
        }

    }
    int limitegenerador = 25;

    private void fichasSobrantesHeroes(int posicionX, int posicionY) {

        botones[posicionX][posicionY].setText(rangossobrantesH.get(index));
        rangossobrantesH.remove(index);
        limitegenerador--;

    }

    private void fichasSobrantesVillanos(int posicionX, int posicionY) {
        botones[posicionX][posicionY].setText(rangossobrantesV.get(index));
        rangossobrantesV.remove(index);
        limitegenerador--;
    }

    private void hacerMovimientoYTurnos(JButton boton, JButton botonClickeado) {

        //TURNO DE LOS HEROES
        if (turnoHeroes == true) {
            ponerTextoAlLabelDeTurno();
            //Obtener los datos del primer click
            if (vecesClickeadas == 1) {
                int x = (int) botonClickeado.getClientProperty("x");
                int y = (int) botonClickeado.getClientProperty("y");
                posicionInicialx = x;
                posicionInicialy = y;
                textoPrimeraFichaSeleccionada = botones[posicionInicialx][posicionInicialy].getText();
                ponerIdentidadYRango();
                //Validar que mueva las fichas correctas
                if (!rangos2Heroes.contains(textoPrimeraFichaSeleccionada) && !rangossobrantesH.contains(textoPrimeraFichaSeleccionada) && !textoPrimeraFichaSeleccionada.equals("") && !textoPrimeraFichaSeleccionada.equals("tierraH") && !textoPrimeraFichaSeleccionada.equals("nova-blast")) {

                    JOptionPane.showMessageDialog(null, "No puedes mover fichas del oponente");
                    vecesClickeadas = 0;
                }
                if (textoPrimeraFichaSeleccionada.equals("tierraH") || textoPrimeraFichaSeleccionada.equals("nova-blast")) {
                    JOptionPane.showMessageDialog(null, "Esa ficha no puede ser movida.");
                    vecesClickeadas = 0;
                }
            }

            //Obtener los datos del segundo click
            if (vecesClickeadas == 2) {
                System.out.println("Si entra al segundo click");
                textoSegundaFichaSeleccionada = String.valueOf(boton.getText());
                int x = (int) botonClickeado.getClientProperty("x");
                int y = (int) botonClickeado.getClientProperty("y");
                posicionFinalx = x;
                posicionFinaly = y;

                //Si le dan click a una ficha vacia (SI hace movimiento)
                if (textoSegundaFichaSeleccionada.equals("")
                        && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                    botones[posicionInicialx][posicionInicialy].setText("");
                    botones[posicionFinalx][posicionFinaly].setText(textoPrimeraFichaSeleccionada);
                    asignarColorBotones();
                    moverimagen();
                    lblrango.setText("");
                    lblidentidad.setText("");
                    cambio.setVisible(true);
                    turnoHeroes = false;
                    ponerTextoAlLabelDeTurno();
                    vecesClickeadas = 0;
                    //Si le dan click al mismo boton
                } else if (textoPrimeraFichaSeleccionada.equals(textoSegundaFichaSeleccionada)) {
                    JOptionPane.showMessageDialog(null, "No puedes moverte al mismo lugar.");
                    vecesClickeadas = 0;
                } else if (esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == false) {
                    JOptionPane.showMessageDialog(null, "Movimiento invalido.");
                }
                //Inicia pelea Heroe contra Villano
                if (textoSegundaFichaSeleccionada.endsWith("V") || textoSegundaFichaSeleccionada.equals("pumpkin-bomb") || textoSegundaFichaSeleccionada.equals("tierraV")) {
                    System.out.println("Si llega a lo de pelea");
                    pelea(textoPrimeraFichaSeleccionada, textoSegundaFichaSeleccionada);
                }
            }
            if (vecesClickeadas >= 2) {
                vecesClickeadas = 0;
            }

        }
        ponerTextoAlLabelDeTurno();

        //Turno de villanos
        if (turnoHeroes == false) {
            ponerTextoAlLabelDeTurno();

            //Obtener los datos del primer click
            if (vecesClickeadas == 1) {
                int x = (int) botonClickeado.getClientProperty("x");
                int y = (int) botonClickeado.getClientProperty("y");
                posicionInicialx = x;
                posicionInicialy = y;
                textoPrimeraFichaSeleccionada = botones[posicionInicialx][posicionInicialy].getText();
                ponerIdentidadYRango();
                //Validar que mueva las fichas correctas
                if (!rangos2Villanos.contains(textoPrimeraFichaSeleccionada) && !rangossobrantesV.contains(textoPrimeraFichaSeleccionada) && !textoPrimeraFichaSeleccionada.equals("")) {

                    JOptionPane.showMessageDialog(null, "No puedes mover fichas del oponente");
                    vecesClickeadas = 0;
                }
            }

            //Obtener los datos del segundo click
            if (vecesClickeadas == 2) {
                textoSegundaFichaSeleccionada = String.valueOf(boton.getText());
                int x = (int) botonClickeado.getClientProperty("x");
                int y = (int) botonClickeado.getClientProperty("y");
                posicionFinalx = x;
                posicionFinaly = y;
                //Si le dan click a una ficha vacia (SI hace movimiento)
                if (textoSegundaFichaSeleccionada.equals("")
                        && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                    botones[posicionInicialx][posicionInicialy].setText("");
                    botones[posicionFinalx][posicionFinaly].setText(textoPrimeraFichaSeleccionada);
                    asignarColorBotones();
                    moverimagen();
                    lblrango.setText("");
                    lblidentidad.setText("");
                    cambio.setVisible(true);
                this.dispose();
                    turnoHeroes = true;

                    ponerTextoAlLabelDeTurno();
                    vecesClickeadas = 0;
                    //Si le dan click al mismo boton
                } else if (textoPrimeraFichaSeleccionada.equals(textoSegundaFichaSeleccionada)) {
                    JOptionPane.showMessageDialog(null, "No puedes moverte al mismo lugar.");
                    vecesClickeadas = 0;
                } else if (esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == false) {
                    JOptionPane.showMessageDialog(null, "Movimiento invalido.");
                }
                //Inicia pelea Villano contra Heroe
                if (textoSegundaFichaSeleccionada.endsWith("H") || textoSegundaFichaSeleccionada.equals("nova-blast") || textoSegundaFichaSeleccionada.equals("tierraH")) {
                    System.out.println("Si llega a lo de pelea");
                    pelea(textoPrimeraFichaSeleccionada, textoSegundaFichaSeleccionada);
                    //Si el ganador es de los heroes

                }
            }
            if (vecesClickeadas >= 2) {
                vecesClickeadas = 0;
            }

        }
        //Si presionan una ficha vacia de primeras
        if (textoPrimeraFichaSeleccionada.equals("")) {
            JOptionPane.showMessageDialog(null, "Has seleccionado una ficha vacia.");
            vecesClickeadas = 0;
        }
    }

    public void pelea(String textoPrimeraFichaSeleccionada, String textoSegundaFichaSeleccionada) {
//HEROES==========================================================================================================================================        
//Para la rango 10 de los heroes
        if (textoPrimeraFichaSeleccionada.equals("Mr-FantasticH")) {
            System.out.println("Si reconoce que la ficha es la de mr fantastic");
            if (textoSegundaFichaSeleccionada.equals("Dr-DoomV") || textoSegundaFichaSeleccionada.equals("pumpkin-bomb")) {
                System.out.println("entra a lo de que no gana ninguno");
                ganador = "ninguno";
            } else {
                System.out.println("Entra al ganador es heroe");
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraV") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananHeroes = true;
            }

        }
        //Para la rango 9 de los heroes
        if (textoPrimeraFichaSeleccionada.equals("Capitan-AmericaH")) {
            if (textoSegundaFichaSeleccionada.equals("GalactusV") || textoSegundaFichaSeleccionada.equals("pumpkin-bomb")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Dr-DoomV")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraV") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananHeroes = true;
            }
        }
        //Para las rango 8 de los heroes
        if ((textoPrimeraFichaSeleccionada.equals("ProfesorXH") || textoPrimeraFichaSeleccionada.equals("Nick-FuryH"))) {
            if (textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("pumpkin-bomb")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Dr-DoomV") || textoSegundaFichaSeleccionada.equals("GalactusV")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraV") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananHeroes = true;
            }
        }
        //Para las rango 7 de los heroes
        if ((textoPrimeraFichaSeleccionada.equals("SpidermanH") || textoPrimeraFichaSeleccionada.equals("WolverineH") || textoPrimeraFichaSeleccionada.equals("NamorH"))) {
            if (textoSegundaFichaSeleccionada.equals("ApocalypseV") || textoSegundaFichaSeleccionada.equals("Green-GoblinV") || textoSegundaFichaSeleccionada.equals("VenomV") || textoSegundaFichaSeleccionada.equals("pumpkin-bomb")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Dr-DoomV") || textoSegundaFichaSeleccionada.equals("GalactusV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraV") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananHeroes = true;
            }
        }
        //Para la rango 6 de los heroes
        if ((textoPrimeraFichaSeleccionada.equals("DaredevilH") || textoPrimeraFichaSeleccionada.equals("Silver-SurferH") || textoPrimeraFichaSeleccionada.equals("HulkH") || textoPrimeraFichaSeleccionada.equals("Iron-ManH"))) {
            if (textoSegundaFichaSeleccionada.equals("BullseyeV") || textoSegundaFichaSeleccionada.equals("Omega-redV") || textoSegundaFichaSeleccionada.equals("OnslaughtV") || textoSegundaFichaSeleccionada.equals("Red-skullV") || textoSegundaFichaSeleccionada.equals("pumpkin-bomb")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Dr-DoomV") || textoSegundaFichaSeleccionada.equals("GalactusV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("ApocalypseV") || textoSegundaFichaSeleccionada.equals("Green-GoblinV") || textoSegundaFichaSeleccionada.equals("VenomV")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraV") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananHeroes = true;
            }
        }

        //Para la rango 5 de los heroes
        if ((textoPrimeraFichaSeleccionada.equals("ThorH") || textoPrimeraFichaSeleccionada.equals("Human-TorchH") || textoPrimeraFichaSeleccionada.equals("CyclopsH") || textoPrimeraFichaSeleccionada.equals("Invisible-womanH"))) {
            if (textoSegundaFichaSeleccionada.equals("BullseyeV") || textoSegundaFichaSeleccionada.equals("Omega-redV") || textoSegundaFichaSeleccionada.equals("OnslaughtV") || textoSegundaFichaSeleccionada.equals("Red-skullV") || textoSegundaFichaSeleccionada.equals("pumpkin-bomb")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Dr-DoomV") || textoSegundaFichaSeleccionada.equals("GalactusV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("ApocalypseV") || textoSegundaFichaSeleccionada.equals("Green-GoblinV") || textoSegundaFichaSeleccionada.equals("VenomV") || textoSegundaFichaSeleccionada.equals("BullseyeV") || textoSegundaFichaSeleccionada.equals("Omega-redV") || textoSegundaFichaSeleccionada.equals("OnslaughtV") || textoSegundaFichaSeleccionada.equals("Red-skullV")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraV") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananHeroes = true;
            }
        }
        //Para la rango 4 de los heroes
        if ((textoPrimeraFichaSeleccionada.equals("Ghost-riderH") || textoPrimeraFichaSeleccionada.equals("PunisherH") || textoPrimeraFichaSeleccionada.equals("BladeH") || textoPrimeraFichaSeleccionada.equals("ThingH"))) {
            if (textoSegundaFichaSeleccionada.equals("AbominationV") || textoSegundaFichaSeleccionada.equals("ThanosV") || textoSegundaFichaSeleccionada.equals("Black-CatV") || textoSegundaFichaSeleccionada.equals("SabretoothV") || textoSegundaFichaSeleccionada.equals("pumpkin-bomb")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Dr-DoomV") || textoSegundaFichaSeleccionada.equals("GalactusV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("ApocalypseV") || textoSegundaFichaSeleccionada.equals("Green-GoblinV") || textoSegundaFichaSeleccionada.equals("VenomV") || textoSegundaFichaSeleccionada.equals("BullseyeV") || textoSegundaFichaSeleccionada.equals("Omega-redV") || textoSegundaFichaSeleccionada.equals("OnslaughtV") || textoSegundaFichaSeleccionada.equals("Red-skullV") || textoSegundaFichaSeleccionada.equals("BullseyeV") || textoSegundaFichaSeleccionada.equals("Omega-redV") || textoSegundaFichaSeleccionada.equals("OnslaughtV") || textoSegundaFichaSeleccionada.equals("Red-skullV")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraV") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananHeroes = true;
            }
        }

        //Para los rango 3 de los heroes
        if ((textoPrimeraFichaSeleccionada.equals("Emma-FrostH") || textoPrimeraFichaSeleccionada.equals("She-HulkH") || textoPrimeraFichaSeleccionada.equals("Giant-ManH") || textoPrimeraFichaSeleccionada.equals("BeastH") || textoPrimeraFichaSeleccionada.equals("ColossusH"))) {
            if (textoSegundaFichaSeleccionada.equals("JuggernautV") || textoSegundaFichaSeleccionada.equals("RhinoV") || textoSegundaFichaSeleccionada.equals("CarnageV") || textoSegundaFichaSeleccionada.equals("Mole-ManV") || textoSegundaFichaSeleccionada.equals("LizardV")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Dr-DoomV") || textoSegundaFichaSeleccionada.equals("GalactusV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("ApocalypseV") || textoSegundaFichaSeleccionada.equals("Green-GoblinV") || textoSegundaFichaSeleccionada.equals("VenomV") || textoSegundaFichaSeleccionada.equals("BullseyeV") || textoSegundaFichaSeleccionada.equals("Omega-redV") || textoSegundaFichaSeleccionada.equals("OnslaughtV") || textoSegundaFichaSeleccionada.equals("Red-skullV") || textoSegundaFichaSeleccionada.equals("BullseyeV") || textoSegundaFichaSeleccionada.equals("Omega-redV") || textoSegundaFichaSeleccionada.equals("OnslaughtV") || textoSegundaFichaSeleccionada.equals("Red-skullV") || textoSegundaFichaSeleccionada.equals("AbominationV") || textoSegundaFichaSeleccionada.equals("ThanosV") || textoSegundaFichaSeleccionada.equals("Black-CatV") || textoSegundaFichaSeleccionada.equals("SabretoothV")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraV") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananHeroes = true;
            }
        }

        //Para los rango 2 de los heroes
        if (rangos2Heroes.contains(textoPrimeraFichaSeleccionada)) {
            if (rangos2Villanos.contains(textoSegundaFichaSeleccionada) || textoSegundaFichaSeleccionada.equals("pumpkin-bomb")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Dr-DoomV") || textoSegundaFichaSeleccionada.equals("GalactusV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("ApocalypseV") || textoSegundaFichaSeleccionada.equals("Green-GoblinV") || textoSegundaFichaSeleccionada.equals("VenomV") || textoSegundaFichaSeleccionada.equals("BullseyeV") || textoSegundaFichaSeleccionada.equals("Omega-redV") || textoSegundaFichaSeleccionada.equals("OnslaughtV") || textoSegundaFichaSeleccionada.equals("Red-skullV") || textoSegundaFichaSeleccionada.equals("BullseyeV") || textoSegundaFichaSeleccionada.equals("Omega-redV") || textoSegundaFichaSeleccionada.equals("OnslaughtV") || textoSegundaFichaSeleccionada.equals("Red-skullV") || textoSegundaFichaSeleccionada.equals("AbominationV") || textoSegundaFichaSeleccionada.equals("ThanosV") || textoSegundaFichaSeleccionada.equals("Black-CatV") || textoSegundaFichaSeleccionada.equals("SabretoothV") || textoSegundaFichaSeleccionada.equals("JuggernautV") || textoSegundaFichaSeleccionada.equals("RhinoV") || textoSegundaFichaSeleccionada.equals("CarnageV") || textoSegundaFichaSeleccionada.equals("Mole-ManV") || textoSegundaFichaSeleccionada.equals("LizardV")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraV") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananHeroes = true;
            }
        }
        //Para la rango 1 de los heroes
        if (textoPrimeraFichaSeleccionada.equals("BlackWidowH")) {
            if (textoSegundaFichaSeleccionada.equals("BlackWidowV") || textoSegundaFichaSeleccionada.equals("pumpkin-bomb")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("GalactusV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("KingpinV") || textoSegundaFichaSeleccionada.equals("MagnetoV") || textoSegundaFichaSeleccionada.equals("ApocalypseV") || textoSegundaFichaSeleccionada.equals("Green-GoblinV") || textoSegundaFichaSeleccionada.equals("VenomV") || textoSegundaFichaSeleccionada.equals("BullseyeV") || textoSegundaFichaSeleccionada.equals("Omega-redV") || textoSegundaFichaSeleccionada.equals("OnslaughtV") || textoSegundaFichaSeleccionada.equals("Red-skullV") || textoSegundaFichaSeleccionada.equals("BullseyeV") || textoSegundaFichaSeleccionada.equals("Omega-redV") || textoSegundaFichaSeleccionada.equals("OnslaughtV") || textoSegundaFichaSeleccionada.equals("Red-skullV") || textoSegundaFichaSeleccionada.equals("AbominationV") || textoSegundaFichaSeleccionada.equals("ThanosV") || textoSegundaFichaSeleccionada.equals("Black-CatV") || textoSegundaFichaSeleccionada.equals("SabretoothV") || textoSegundaFichaSeleccionada.equals("JuggernautV") || textoSegundaFichaSeleccionada.equals("RhinoV") || textoSegundaFichaSeleccionada.equals("CarnageV") || textoSegundaFichaSeleccionada.equals("Mole-ManV") || textoSegundaFichaSeleccionada.equals("LizardV") || rangos2Villanos.contains(textoSegundaFichaSeleccionada)) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraV") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananHeroes = true;
            }
        }

        //VILLANOS==========================================================================================================================================        
//Para la rango 10 de los villanos
        if (textoPrimeraFichaSeleccionada.equals("Dr-DoomV")) {
            if (textoSegundaFichaSeleccionada.equals("Mr-FantasticH") || textoSegundaFichaSeleccionada.equals("nova-blast")) {
                System.out.println("entra a lo de que no gana ninguno");
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraH") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananVillanos = true;
            }

        }
        //Para la rango 9 de los villanos
        if (textoPrimeraFichaSeleccionada.equals("GalactusV")) {
            if (textoSegundaFichaSeleccionada.equals("Capitan-AmericaH") || textoSegundaFichaSeleccionada.equals("nova-blast")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Mr-FantasticH")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraH")) {
                GananVillanos = true;
            }
        }
        //Para la rango 8 de los villanos
        if (textoPrimeraFichaSeleccionada.equals("KingpinV") || textoPrimeraFichaSeleccionada.equals("MagnetoV")) {
            if (textoSegundaFichaSeleccionada.equals("ProfesorXH") || textoSegundaFichaSeleccionada.equals("Nick-FuryH") || textoSegundaFichaSeleccionada.equals("nova-blast")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Mr-FantasticH") || textoSegundaFichaSeleccionada.equals("Capitan-AmericaH")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraH") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananVillanos = true;
            }
        }
        //Para la rango 7 de los villanos
        if (textoPrimeraFichaSeleccionada.equals("ApocalypseV") || textoPrimeraFichaSeleccionada.equals("Green-GoblinV") || textoPrimeraFichaSeleccionada.equals("VenomV")) {
            if (textoSegundaFichaSeleccionada.equals("SpidermanH") || textoSegundaFichaSeleccionada.equals("WolverineH") || textoSegundaFichaSeleccionada.equals("NamorH") || textoSegundaFichaSeleccionada.equals("nova-blast")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Mr-FantasticH") || textoSegundaFichaSeleccionada.equals("Capitan-AmericaH") || textoSegundaFichaSeleccionada.equals("ProfesorXH") || textoSegundaFichaSeleccionada.equals("Nick-FuryH")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraH") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananVillanos = true;
            }
        }
        //Para la rango 6 de los villanos
        if (textoPrimeraFichaSeleccionada.equals("BullseyeV") || textoPrimeraFichaSeleccionada.equals("Omega-redV") || textoPrimeraFichaSeleccionada.equals("OnslaughtV") || textoPrimeraFichaSeleccionada.equals("Red-skullV")) {
            if (textoSegundaFichaSeleccionada.equals("DaredevilH") || textoSegundaFichaSeleccionada.equals("Silver-SurferH") || textoSegundaFichaSeleccionada.equals("HulkH") || textoSegundaFichaSeleccionada.equals("Iron-ManH") || textoSegundaFichaSeleccionada.equals("nova-blast")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Mr-FantasticH") || textoSegundaFichaSeleccionada.equals("Capitan-AmericaH") || textoSegundaFichaSeleccionada.equals("ProfesorXH") || textoSegundaFichaSeleccionada.equals("Nick-FuryH") || textoSegundaFichaSeleccionada.equals("SpidermanH") || textoSegundaFichaSeleccionada.equals("WolverineH") || textoSegundaFichaSeleccionada.equals("NamorH")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraH") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananVillanos = true;
            }
        }
        //Para la rango 5 de los villanos
        if (textoPrimeraFichaSeleccionada.equals("MystiqueV") || textoPrimeraFichaSeleccionada.equals("MysterioV") || textoPrimeraFichaSeleccionada.equals("Dr-OctopusV") || textoPrimeraFichaSeleccionada.equals("DeadpoolV")) {
            if (textoSegundaFichaSeleccionada.equals("ThorH") || textoSegundaFichaSeleccionada.equals("Human-TorchH") || textoSegundaFichaSeleccionada.equals("CyclopsH") || textoSegundaFichaSeleccionada.equals("Invisible-womanH") || textoSegundaFichaSeleccionada.equals("nova-blast")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Mr-FantasticH") || textoSegundaFichaSeleccionada.equals("Capitan-AmericaH") || textoSegundaFichaSeleccionada.equals("ProfesorXH") || textoSegundaFichaSeleccionada.equals("Nick-FuryH") || textoSegundaFichaSeleccionada.equals("SpidermanH") || textoSegundaFichaSeleccionada.equals("WolverineH") || textoSegundaFichaSeleccionada.equals("NamorH") || textoSegundaFichaSeleccionada.equals("DaredevilH") || textoSegundaFichaSeleccionada.equals("Silver-SurferH") || textoSegundaFichaSeleccionada.equals("HulkH") || textoSegundaFichaSeleccionada.equals("Iron-ManH")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraH") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananVillanos = true;
            }
        }
        //Para la rango 4 de los villanos
        if (textoPrimeraFichaSeleccionada.equals("AbominationV") || textoPrimeraFichaSeleccionada.equals("ThanosV") || textoPrimeraFichaSeleccionada.equals("Black-CatV") || textoPrimeraFichaSeleccionada.equals("SabretoothV")) {
            if (textoSegundaFichaSeleccionada.equals("Ghost-riderH") || textoSegundaFichaSeleccionada.equals("PunisherH") || textoSegundaFichaSeleccionada.equals("BladeH") || textoSegundaFichaSeleccionada.equals("ThingH") || textoSegundaFichaSeleccionada.equals("nova-blast")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Mr-FantasticH") || textoSegundaFichaSeleccionada.equals("Capitan-AmericaH") || textoSegundaFichaSeleccionada.equals("ProfesorXH") || textoSegundaFichaSeleccionada.equals("Nick-FuryH") || textoSegundaFichaSeleccionada.equals("SpidermanH") || textoSegundaFichaSeleccionada.equals("WolverineH") || textoSegundaFichaSeleccionada.equals("NamorH") || textoSegundaFichaSeleccionada.equals("DaredevilH") || textoSegundaFichaSeleccionada.equals("Silver-SurferH") || textoSegundaFichaSeleccionada.equals("HulkH") || textoSegundaFichaSeleccionada.equals("Iron-ManH") || textoSegundaFichaSeleccionada.equals("ThorH") || textoSegundaFichaSeleccionada.equals("Human-TorchH") || textoSegundaFichaSeleccionada.equals("CyclopsH") || textoSegundaFichaSeleccionada.equals("Invisible-womanH")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraH") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananVillanos = true;
            }
        }
        //Para la rango 3 de los villanos
        if (textoPrimeraFichaSeleccionada.equals("JuggernautV") || textoPrimeraFichaSeleccionada.equals("RhinoV") || textoPrimeraFichaSeleccionada.equals("CarnageV") || textoPrimeraFichaSeleccionada.equals("Mole-ManV") || textoPrimeraFichaSeleccionada.equals("LizardV")) {
            if (textoSegundaFichaSeleccionada.equals("Emma-FrostH") || textoSegundaFichaSeleccionada.equals("She-HulkH") || textoSegundaFichaSeleccionada.equals("Giant-ManH") || textoSegundaFichaSeleccionada.equals("BeastH") || textoSegundaFichaSeleccionada.equals("ColosusH")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Mr-FantasticH") || textoSegundaFichaSeleccionada.equals("Capitan-AmericaH") || textoSegundaFichaSeleccionada.equals("ProfesorXH") || textoSegundaFichaSeleccionada.equals("Nick-FuryH") || textoSegundaFichaSeleccionada.equals("SpidermanH") || textoSegundaFichaSeleccionada.equals("WolverineH") || textoSegundaFichaSeleccionada.equals("NamorH") || textoSegundaFichaSeleccionada.equals("DaredevilH") || textoSegundaFichaSeleccionada.equals("Silver-SurferH") || textoSegundaFichaSeleccionada.equals("HulkH") || textoSegundaFichaSeleccionada.equals("Iron-ManH") || textoSegundaFichaSeleccionada.equals("ThorH") || textoSegundaFichaSeleccionada.equals("Human-TorchH") || textoSegundaFichaSeleccionada.equals("CyclopsH") || textoSegundaFichaSeleccionada.equals("Invisible-womanH") || textoSegundaFichaSeleccionada.equals("Ghost-riderH") || textoSegundaFichaSeleccionada.equals("PunisherH") || textoSegundaFichaSeleccionada.equals("BladeH") || textoSegundaFichaSeleccionada.equals("ThingH")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraH") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananVillanos = true;
            }
        }
        //Para los rango 2 de los villanos
        if (rangos2Villanos.contains(textoPrimeraFichaSeleccionada)) {
            if (rangos2Heroes.contains(textoSegundaFichaSeleccionada) || textoSegundaFichaSeleccionada.equals("nova-blast")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Mr-FantasticH") || textoSegundaFichaSeleccionada.equals("Capitan-AmericaH") || textoSegundaFichaSeleccionada.equals("ProfesorXH") || textoSegundaFichaSeleccionada.equals("Nick-FuryH") || textoSegundaFichaSeleccionada.equals("SpidermanH") || textoSegundaFichaSeleccionada.equals("WolverineH") || textoSegundaFichaSeleccionada.equals("NamorH") || textoSegundaFichaSeleccionada.equals("DaredevilH") || textoSegundaFichaSeleccionada.equals("Silver-SurferH") || textoSegundaFichaSeleccionada.equals("HulkH") || textoSegundaFichaSeleccionada.equals("Iron-ManH") || textoSegundaFichaSeleccionada.equals("ThorH") || textoSegundaFichaSeleccionada.equals("Human-TorchH") || textoSegundaFichaSeleccionada.equals("CyclopsH") || textoSegundaFichaSeleccionada.equals("Invisible-womanH") || textoSegundaFichaSeleccionada.equals("Ghost-riderH") || textoSegundaFichaSeleccionada.equals("PunisherH") || textoSegundaFichaSeleccionada.equals("BladeH") || textoSegundaFichaSeleccionada.equals("ThingH") || textoSegundaFichaSeleccionada.equals("Emma-FrostH") || textoSegundaFichaSeleccionada.equals("She-HulkH") || textoSegundaFichaSeleccionada.equals("Giant-ManH") || textoSegundaFichaSeleccionada.equals("BeastH") || textoSegundaFichaSeleccionada.equals("ColosusH")) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraH") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananVillanos = true;
            }
        }
        //Para los rango 1 de los villanos
        if (textoPrimeraFichaSeleccionada.equals("Black-WidowV")) {
            if (textoSegundaFichaSeleccionada.equals("BlackWidowH") || textoSegundaFichaSeleccionada.equals("nova-blast")) {
                ganador = "ninguno";
            } else {
                ganador = textoPrimeraFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("Capitan-AmericaH") || textoSegundaFichaSeleccionada.equals("ProfesorXH") || textoSegundaFichaSeleccionada.equals("Nick-FuryH") || textoSegundaFichaSeleccionada.equals("SpidermanH") || textoSegundaFichaSeleccionada.equals("WolverineH") || textoSegundaFichaSeleccionada.equals("NamorH") || textoSegundaFichaSeleccionada.equals("DaredevilH") || textoSegundaFichaSeleccionada.equals("Silver-SurferH") || textoSegundaFichaSeleccionada.equals("HulkH") || textoSegundaFichaSeleccionada.equals("Iron-ManH") || textoSegundaFichaSeleccionada.equals("ThorH") || textoSegundaFichaSeleccionada.equals("Human-TorchH") || textoSegundaFichaSeleccionada.equals("CyclopsH") || textoSegundaFichaSeleccionada.equals("Invisible-womanH") || textoSegundaFichaSeleccionada.equals("Ghost-riderH") || textoSegundaFichaSeleccionada.equals("PunisherH") || textoSegundaFichaSeleccionada.equals("BladeH") || textoSegundaFichaSeleccionada.equals("ThingH") || textoSegundaFichaSeleccionada.equals("Emma-FrostH") || textoSegundaFichaSeleccionada.equals("She-HulkH") || textoSegundaFichaSeleccionada.equals("Giant-ManH") || textoSegundaFichaSeleccionada.equals("BeastH") || textoSegundaFichaSeleccionada.equals("ColosusH") || rangos2Heroes.contains(textoSegundaFichaSeleccionada)) {
                ganador = textoSegundaFichaSeleccionada;
            }
            if (textoSegundaFichaSeleccionada.equals("tierraH") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
                GananVillanos = true;
            }
        }
        //Fichas eliminadas
        if ((rangos2Heroes.contains(textoPrimeraFichaSeleccionada) || rangossobrantesH.contains(textoPrimeraFichaSeleccionada)) && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
            if (ganador.equals(textoSegundaFichaSeleccionada)) {
                fichaseliminadasH.eliminadas(textoPrimeraFichaSeleccionada);
                String tokens = fichaseliminadasH.fichas();
                eliminadasH.setText(tokens);
                FichasRestantesHeroes--;
            } else if (ganador.equals(textoPrimeraFichaSeleccionada)) {
                fichaseliminadasV.eliminadas(textoSegundaFichaSeleccionada);
                String tokensV = fichaseliminadasV.fichas();
                eliminadasV.setText(tokensV);
                FichasRestantesVillanos--;
            } else if (ganador.equals("ninguno")) {
                if (textoSegundaFichaSeleccionada.equals("pumpkin-bomb")) {
                    fichaseliminadasV.eliminadas("pumpkin-bomb");
                    String tokensV = fichaseliminadasV.fichas();
                    eliminadasV.setText(tokensV);
                }
                if (rangos2Villanos.contains(textoSegundaFichaSeleccionada) || rangossobrantesV.contains(textoSegundaFichaSeleccionada)) {
                    fichaseliminadasV.eliminadas(textoSegundaFichaSeleccionada);
                    String tokensV = fichaseliminadasV.fichas();
                    eliminadasV.setText(tokensV);
                    FichasRestantesVillanos--;

                }
                if (rangos2Villanos.contains(textoPrimeraFichaSeleccionada) || rangossobrantesV.contains(textoPrimeraFichaSeleccionada)) {
                    fichaseliminadasV.eliminadas(textoPrimeraFichaSeleccionada);
                    String tokensV = fichaseliminadasV.fichas();
                    eliminadasV.setText(tokensV);
                    FichasRestantesVillanos--;
                }
                if (rangos2Heroes.contains(textoSegundaFichaSeleccionada) || rangossobrantesH.contains(textoSegundaFichaSeleccionada)) {
                    fichaseliminadasH.eliminadas(textoSegundaFichaSeleccionada);
                    String tokens = fichaseliminadasH.fichas();
                    eliminadasH.setText(tokens);
                    FichasRestantesHeroes--;
                }
                if (rangos2Heroes.contains(textoPrimeraFichaSeleccionada) || rangossobrantesH.contains(textoPrimeraFichaSeleccionada)) {
                    fichaseliminadasH.eliminadas(textoPrimeraFichaSeleccionada);
                    String tokens = fichaseliminadasH.fichas();
                    eliminadasH.setText(tokens);
                    FichasRestantesHeroes--;
                }

            }
        } else if ((rangos2Villanos.contains(textoPrimeraFichaSeleccionada) || rangossobrantesV.contains(textoPrimeraFichaSeleccionada)) && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
            if (ganador.equals(textoPrimeraFichaSeleccionada)) {
                fichaseliminadasH.eliminadas(textoSegundaFichaSeleccionada);
                String tokens = fichaseliminadasH.fichas();
                eliminadasH.setText(tokens);
                FichasRestantesHeroes--;
            } else if (ganador.equals(textoSegundaFichaSeleccionada)) {
                fichaseliminadasV.eliminadas(textoPrimeraFichaSeleccionada);
                String tokensV = fichaseliminadasV.fichas();
                eliminadasV.setText(tokensV);
                FichasRestantesVillanos--;
            } else if (ganador.equals("ninguno")) {
                if (textoSegundaFichaSeleccionada.equals("nova-blast")) {
                    fichaseliminadasH.eliminadas("nova-blast");
                    String tokensH = fichaseliminadasH.fichas();
                    eliminadasH.setText(tokensH);
                    FichasRestantesVillanos--;
                }
                if (rangos2Villanos.contains(textoSegundaFichaSeleccionada) || rangossobrantesV.contains(textoSegundaFichaSeleccionada)) {
                    fichaseliminadasV.eliminadas(textoSegundaFichaSeleccionada);
                    String tokensV = fichaseliminadasV.fichas();
                    eliminadasV.setText(tokensV);
                    FichasRestantesVillanos--;
                }
                if (rangos2Villanos.contains(textoPrimeraFichaSeleccionada) || rangossobrantesV.contains(textoPrimeraFichaSeleccionada)) {
                    fichaseliminadasV.eliminadas(textoPrimeraFichaSeleccionada);
                    String tokensV = fichaseliminadasV.fichas();
                    eliminadasV.setText(tokensV);
                    FichasRestantesVillanos--;
                }
                if (rangos2Heroes.contains(textoSegundaFichaSeleccionada) || rangossobrantesH.contains(textoSegundaFichaSeleccionada)) {
                    fichaseliminadasH.eliminadas(textoSegundaFichaSeleccionada);
                    String tokens = fichaseliminadasH.fichas();
                    eliminadasH.setText(tokens);
                    FichasRestantesHeroes--;
                }
                if (rangos2Heroes.contains(textoPrimeraFichaSeleccionada) || rangossobrantesH.contains(textoPrimeraFichaSeleccionada)) {
                    fichaseliminadasH.eliminadas(textoPrimeraFichaSeleccionada);
                    String tokens = fichaseliminadasH.fichas();
                    eliminadasH.setText(tokens);
                    FichasRestantesHeroes--;
                }
            }
        }

        //ACTUALIZAR EN EL TABLERO DEPENDIENDO DEL GANADOR
        //Si el ganador es de los heroes
        if (ganador.equals(textoPrimeraFichaSeleccionada) && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
            JOptionPane.showMessageDialog(null, textoPrimeraFichaSeleccionada + " vs " + textoSegundaFichaSeleccionada + "\nGana " + textoPrimeraFichaSeleccionada);
            botones[posicionInicialx][posicionInicialy].setText("");
            moverimagen();
            asignarColorBotones();
            botones[posicionFinalx][posicionFinaly].setText(textoPrimeraFichaSeleccionada);
            moverimagen();
            asignarColorBotones();
            lblrango.setText("");
                    lblidentidad.setText("");
            cambio.setVisible(true);
                this.dispose();
            turnoHeroes = !turnoHeroes;
            ponerTextoAlLabelDeTurno();
            vecesClickeadas = 0;
        }
        //Si el ganador es de los villanos
        if (ganador.equals(textoSegundaFichaSeleccionada) && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
            JOptionPane.showMessageDialog(null, textoPrimeraFichaSeleccionada + " vs " + textoSegundaFichaSeleccionada + "\nGana " + textoSegundaFichaSeleccionada);
            botones[posicionInicialx][posicionInicialy].setText("");
            botones[posicionFinalx][posicionFinaly].setText(textoSegundaFichaSeleccionada);

            asignarColorBotones();
            lblrango.setText("");
                    lblidentidad.setText("");
            cambio.setVisible(true);
                this.dispose();
            turnoHeroes = !turnoHeroes;
            ponerTextoAlLabelDeTurno();
            vecesClickeadas = 0;
        }

        //Si ambos son del mismo rango o pelea con una bomba
        if (ganador.equals("ninguno") && esMovimientoValido(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly, textoPrimeraFichaSeleccionada) == true) {
            if (textoSegundaFichaSeleccionada.equals("pumpkin-bomb")) {
                JOptionPane.showMessageDialog(null, "Te has topado con una bomba!\nTu ficha ha sido destruida.");
                botones[posicionInicialx][posicionInicialy].setText("");
                moverimagen();
                asignarColorBotones();
                botones[posicionFinalx][posicionFinaly].setText("");

                asignarColorBotones();
                lblrango.setText("");
                    lblidentidad.setText("");
                cambio.setVisible(true);
                this.dispose();
                turnoHeroes = !turnoHeroes;
            } else {
                JOptionPane.showMessageDialog(null, textoPrimeraFichaSeleccionada + " vs " + textoSegundaFichaSeleccionada + "\nAmbos son eliminados.");
                botones[posicionInicialx][posicionInicialy].setText("");
                moverimagen();
                asignarColorBotones();
                botones[posicionFinalx][posicionFinaly].setText("");
                moverimagen();
                asignarColorBotones();
                lblrango.setText("");
                    lblidentidad.setText("");
                cambio.setVisible(true);
                this.dispose();
                turnoHeroes = !turnoHeroes;

            }
        }
        System.out.println("Fichas restantes heroes: " + FichasRestantesHeroes);
        System.out.println("Fichas restantes villanos: " + FichasRestantesVillanos);
    }

    private boolean esMovimientoValido(int posicionInicialx, int posicionInicialy, int posicionFinalx, int posicionFinaly, String fichaSeleccionada) {
        // Verificar si el movimiento es en línea recta en vertical u horizontal
        if (rangos2Heroes.contains(fichaSeleccionada) || rangos2Villanos.contains(fichaSeleccionada)) {
            int deltaX = Math.abs(posicionFinalx - posicionInicialx);
            int deltaY = Math.abs(posicionFinaly - posicionInicialy);

            if (deltaX == 0 || deltaY == 0) {
                // Movimiento horizontal o vertical
                return !hayFichasEnElCamino(posicionInicialx, posicionInicialy, posicionFinalx, posicionFinaly);
            } else {
                return false;
            }
        } else {
            // Movimiento de una casilla en cualquier dirección (sin saltar fichas)
            int deltaX = Math.abs(posicionFinalx - posicionInicialx);
            int deltaY = Math.abs(posicionFinaly - posicionInicialy);

            if ((deltaX == 1 && deltaY == 0) || (deltaX == 0 && deltaY == 1)) {
                // Movimiento horizontal o vertical de una casilla
                return true;
            } else {
                return false;
            }
        }
    }

    private boolean hayFichasEnElCamino(int posicionInicialx, int posicionInicialy, int posicionFinalx, int posicionFinaly) {
        int deltaX = (int) Math.signum(posicionFinalx - posicionInicialx);
        int deltaY = (int) Math.signum(posicionFinaly - posicionInicialy);

        int x = posicionInicialx + deltaX;
        int y = posicionInicialy + deltaY;

        while (x != posicionFinalx || y != posicionFinaly) {
            if (!botones[x][y].getText().equals("")) {
                return true; // Hay una ficha en el camino
            }
            x += deltaX;
            y += deltaY;
        }

        return false; // No hay fichas en el camino
    }

    private void ponerTextoAlLabelDeTurno() {
        if (turnoHeroes == true) {
            labelTurno.setText("Turno de los heroes");
        } else {
            labelTurno.setText("Turno de los villanos");
        }
    }

}

class Ficha {

    private int x;
    private int y;

    public Ficha(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
