
import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AlarmClock extends JFrame {

    private JLabel clockLabel;
    private JLabel statusLabel;
    private JTextField alarmInput;

    private LocalTime alarmTime;
    private boolean alarmActive = false;

    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("HH:mm:ss");

    public AlarmClock() {

        setTitle("Java Alarm Clock");
        setSize(420, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(0, 1, 10, 10));
        panel.setBorder(
                BorderFactory.createEmptyBorder(20, 30, 20, 30)
        );
        panel.setBackground(new Color(25, 30, 40));

        JLabel heading = new JLabel(
                "ALARM CLOCK", SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 25));
        heading.setForeground(Color.WHITE);

        clockLabel = new JLabel(
                "--:--:--", SwingConstants.CENTER);
        clockLabel.setFont(new Font("Consolas", Font.BOLD, 35));
        clockLabel.setForeground(new Color(80, 200, 255));

        JLabel instruction = new JLabel(
                "Enter alarm time (HH:mm:ss)", SwingConstants.CENTER);
        instruction.setForeground(Color.WHITE);

        alarmInput = new JTextField("07:00:00");
        alarmInput.setHorizontalAlignment(JTextField.CENTER);
        alarmInput.setFont(new Font("Arial", Font.PLAIN, 18));

        JButton setButton = new JButton("Set Alarm");
        JButton cancelButton = new JButton("Cancel Alarm");

        statusLabel = new JLabel(
                "No alarm set", SwingConstants.CENTER);
        statusLabel.setForeground(Color.LIGHT_GRAY);

        setButton.addActionListener(e -> setAlarm());
        cancelButton.addActionListener(e -> cancelAlarm());

        panel.add(heading);
        panel.add(clockLabel);
        panel.add(instruction);
        panel.add(alarmInput);
        panel.add(setButton);
        panel.add(cancelButton);
        panel.add(statusLabel);

        add(panel);

        Timer timer = new Timer(250, e -> checkAlarm());
        timer.start();

        updateClock();
        setVisible(true);
    }

    private void updateClock() {
        clockLabel.setText(LocalTime.now().format(formatter));
    }

    private void setAlarm() {
        try {
            alarmTime = LocalTime.parse(
                    alarmInput.getText().trim(), formatter);

            alarmActive = true;
            statusLabel.setText(
                    "Alarm set: " + alarmTime.format(formatter));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Enter time in HH:mm:ss format.\nExample: 22:45:00",
                    "Invalid Time",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cancelAlarm() {
        alarmActive = false;
        alarmTime = null;
        statusLabel.setText("Alarm cancelled");
    }

    private void checkAlarm() {
        updateClock();

        LocalTime now = LocalTime.now();

        if (alarmActive && !now.isBefore(alarmTime)) {
            alarmActive = false;
            statusLabel.setText("Alarm ringing!");

            Toolkit.getDefaultToolkit().beep();

            JOptionPane.showMessageDialog(
                    this,
                    "Your alarm time has arrived!",
                    "ALARM",
                    JOptionPane.INFORMATION_MESSAGE);

            statusLabel.setText("Alarm finished");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AlarmClock::new);
    }
}
