package taiCS151HW4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;

public class View {
    private final int DAY_IN_WEEK = 7, WEEK_IN_MONTH = 6, DAY_HOURS = 24;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public void start() {
		frame.setVisible(true);
	}
	
	public View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		JPanel mainCalendarPanel = new JPanel();
		mainCalendarPanel.setBounds(15, 16, 400, 420);
		frame.getContentPane().add(mainCalendarPanel);
		mainCalendarPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel titlePanel = new JPanel();
		mainCalendarPanel.add(titlePanel, BorderLayout.NORTH);
		titlePanel.setLayout(new BorderLayout(0, 0));
		
		JPanel monthTitlePanel = new JPanel();
		titlePanel.add(monthTitlePanel, BorderLayout.CENTER);
		monthTitlePanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblMonth = DefaultComponentFactory.getInstance().createLabel("Month");
		lblMonth.setFont(new Font("Tahoma", Font.BOLD, 16));
		monthTitlePanel.add(lblMonth, BorderLayout.CENTER);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Tahoma", Font.BOLD, 16));
		monthTitlePanel.add(lblYear, BorderLayout.EAST);
		
		JPanel arrowPanel = new JPanel();
		titlePanel.add(arrowPanel, BorderLayout.EAST);
		
		JButton button = new JButton("<");
		arrowPanel.add(button);
		
		JButton button_1 = new JButton(">");
		arrowPanel.add(button_1);
		
		JPanel daysPanel = new JPanel();
		mainCalendarPanel.add(daysPanel, BorderLayout.CENTER);
		daysPanel.setLayout(new GridLayout(7, 7, 0, 0));
		
		JPanel mainEventPanel = new JPanel();
		mainEventPanel.setBounds(446, 16, 417, 912);
		frame.getContentPane().add(mainEventPanel);
		mainEventPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel timePanel = new JPanel();
		mainEventPanel.add(timePanel, BorderLayout.WEST);
		timePanel.setLayout(new GridLayout(24, 1, 0, 0));
		
        for (int i = 0; i < DAY_HOURS; i++) {
            timePanel.add(new JLabel(i + ":00"));
            timePanel.add(new JLabel(" "));
        }
		
		JPanel eventsPanel = new JPanel();
		mainEventPanel.add(eventsPanel, BorderLayout.CENTER);
		
		JPanel eventTitlePanel = new JPanel();
		mainEventPanel.add(eventTitlePanel, BorderLayout.NORTH);
		eventTitlePanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTime = new JLabel("Time   ");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 16));
		eventTitlePanel.add(lblTime, BorderLayout.WEST);
		
		JLabel lblEvents = new JLabel("Events");
		lblEvents.setFont(new Font("Tahoma", Font.BOLD, 16));
		eventTitlePanel.add(lblEvents, BorderLayout.CENTER);
	}
}
