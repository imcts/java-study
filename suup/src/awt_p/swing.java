package awt_p;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import java.awt.GridBagLayout;
import javax.swing.JCheckBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextPane;

public class swing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing frame = new swing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public swing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {3, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[] {0, 0, 5, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0};
		contentPane.setLayout(gbl_contentPane);
		
		JTextPane txtpnDddd = new JTextPane();
		txtpnDddd.setText("dddd");
		GridBagConstraints gbc_txtpnDddd = new GridBagConstraints();
		gbc_txtpnDddd.insets = new Insets(0, 0, 5, 5);
		gbc_txtpnDddd.fill = GridBagConstraints.BOTH;
		gbc_txtpnDddd.gridx = 2;
		gbc_txtpnDddd.gridy = 1;
		contentPane.add(txtpnDddd, gbc_txtpnDddd);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxNewCheckBox.gridx = 2;
		gbc_chckbxNewCheckBox.gridy = 5;
		contentPane.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
	}

}
