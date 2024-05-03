package Vista;

import javax.swing.*;

public class InicioFrame extends JFrame {
    public InicioFrame() {
        super("Inicio de Sesion - MyHotel");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu reservasMenu = new JMenu("Reservas");
        JMenuItem realizarReservaItem = new JMenuItem("Realizar Reserva");
        JMenuItem verReservasItem = new JMenuItem("Ver Reservas");
        JMenuItem historialReservasItem = new JMenuItem("Historial de Reservas");

        realizarReservaItem.addActionListener(e -> {
            new RealizarReservaFrame();
        });

        verReservasItem.addActionListener(e -> {
            new VerReservasFrame();
        });

        historialReservasItem.addActionListener(e -> {
            new HistorialReservasFrame();
        });

        reservasMenu.add(realizarReservaItem);
        reservasMenu.add(verReservasItem);
        reservasMenu.add(historialReservasItem);

        JMenu habitacionMenu = new JMenu("Habitaciones");

        JMenu usuariosMenu = new JMenu("Usuarios");

        JMenuItem cerrarSesionItem = new JMenuItem("Cerrar Sesión");
        cerrarSesionItem.addActionListener(e -> {
            dispose();
            new LoginFrame();
        });

        
        menuBar.add(reservasMenu);
        menuBar.add(habitacionMenu);
        menuBar.add(usuariosMenu);
        menuBar.add(cerrarSesionItem);

        
        setJMenuBar(menuBar);

        setVisible(true);
    }
}