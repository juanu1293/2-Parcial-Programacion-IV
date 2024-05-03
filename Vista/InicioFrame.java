package Vista;

import javax.swing.*;

public class InicioFrame extends JFrame {
    public InicioFrame() {
        super("Inicio de sesión - MyHotel");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();

        JMenu reservasMenu = new JMenu("Reservas");
        JMenuItem realizarReservaItem = new JMenuItem("Realizar reserva");
        JMenuItem verReservasItem = new JMenuItem("Ver reservas");
        JMenuItem historialReservasItem = new JMenuItem("Historial de reservas");

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
        JMenuItem verHabitacionItem = new JMenuItem("Ver habitación");
        JMenuItem buscarHabitacionItem = new JMenuItem("Buscar Habitación");
        
        verHabitacionItem.addActionListener(e -> {
            new VerHabitacionFrame();
        });
        
        buscarHabitacionItem.addActionListener(e -> {
            new BuscarHabitacionFrame();
        });
        
        habitacionMenu.add(verHabitacionItem);
        habitacionMenu.add(buscarHabitacionItem);
        
        JMenu usuariosMenu = new JMenu("Usuarios");
        JMenuItem verUsuarioItem = new JMenuItem("Ver usuario");

        verUsuarioItem.addActionListener(e -> {
            new VerUsuarioFrame();
        });
        
        usuariosMenu.add(verUsuarioItem);
        
        JMenuItem cerrarSesionItem = new JMenuItem("Cerrar sesión");
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