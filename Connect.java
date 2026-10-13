
import javax.swing.*;
import java.awt.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Connect extends JFrame {

    private final JLabel[] timeLabels = new JLabel[4];
    private final JLabel[] dateLabels = new JLabel[4];

    private final String[] cities = {
        "India - New Delhi",
        "United Kingdom - London",
        "United States - New York",
        "Japan - Tokyo"
    };

    private final String[] zones = {
        "Asia/Kolkata",
        "Europe/London",
        "America/New_York",
        "Asia/Tokyo"
    };

    private final DateTimeFormatter timeFormat =
            DateTimeFormatter.ofPattern("hh:mm:ss a");

    private final DateTimeFormatter dateFormat =
            DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy");

    public Connect() {
        setTitle("World Clock");
        setSize(750, 440);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout(15, 15));
        mainPanel.setBackground(new Color(24, 28, 36));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel heading = new JLabel("WORLD CLOCK", SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 28));
        heading.setForeground(Color.WHITE);
        mainPanel.add(heading, BorderLayout.NORTH);

        JPanel cityPanel = new JPanel(new GridLayout(2, 2, 15, 15));
        cityPanel.setOpaque(false);

        for (int i = 0; i < cities.length; i++) {
            JPanel card = new JPanel(new GridLayout(3, 1, 5, 5));
            card.setBackground(new Color(42, 48, 60));
            card.setBorder(BorderFactory.createEmptyBorder(12, 8, 12, 8));

            JLabel cityLabel = new JLabel(cities[i], SwingConstants.CENTER);
            cityLabel.setForeground(Color.WHITE);
            cityLabel.setFont(new Font("Arial", Font.BOLD, 17));

            timeLabels[i] = new JLabel("--:--:--", SwingConstants.CENTER);
            timeLabels[i].setForeground(new Color(90, 200, 255));
            timeLabels[i].setFont(new Font("Consolas", Font.BOLD, 25));

            dateLabels[i] = new JLabel("", SwingConstants.CENTER);
            dateLabels[i].setForeground(Color.LIGHT_GRAY);
            dateLabels[i].setFont(new Font("Arial", Font.PLAIN, 12));

            card.add(cityLabel);
            card.add(timeLabels[i]);
            card.add(dateLabels[i]);

            cityPanel.add(card);
        }

        mainPanel.add(cityPanel, BorderLayout.CENTER);
        add(mainPanel);

        // Update every second
        Timer timer = new Timer(1000, e -> updateClocks());
        timer.start();

        updateClocks();
        setVisible(true);
    }

    private void updateClocks() {
        for (int i = 0; i < zones.length; i++) {
            ZonedDateTime now = ZonedDateTime.now(ZoneId.of(zones[i]));

            timeLabels[i].setText(now.format(timeFormat));
            dateLabels[i].setText(now.format(dateFormat));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Connect::new);
    }
}

