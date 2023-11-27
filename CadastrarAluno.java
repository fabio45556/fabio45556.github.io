package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JPopupMenu;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class CadastrarAluno {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 *  location=92,399
	 */
	private final JPopupMenu popupMenu = new JPopupMenu();
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarAluno window = new CadastrarAluno();
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
	public CadastrarAluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Cadastro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 206, 223);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Nome = new JLabel("Nome:");
		Nome.setBounds(10, 46, 46, 14);
		panel.add(Nome);
		
		JLabel MatriculaBL = new JLabel("Matricula:");
		MatriculaBL.setBounds(10, 82, 57, 14);
		panel.add(MatriculaBL);
		
		textField = new JTextField();
		textField.setBounds(78, 43, 107, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(78, 79, 107, 20);
		panel.add(textField_1);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 121, 57, 14);
		panel.add(lblSexo);
		
		JRadioButton MascBL = new JRadioButton("Masculino");
		buttonGroup.add(MascBL);
		MascBL.setBounds(77, 106, 71, 23);
		panel.add(MascBL);
		
		JRadioButton FemBl = new JRadioButton("Feminino");
		buttonGroup.add(FemBl);
		FemBl.setBounds(76, 132, 109, 23);
		panel.add(FemBl);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setBounds(10, 175, 57, 14);
		panel.add(lblCurso);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"--SELECIONE--", "Administração", "Informática"}));
		comboBox.setBounds(74, 171, 111, 22);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Listagem de alunos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(218, 11, 183, 223);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
	}
}
