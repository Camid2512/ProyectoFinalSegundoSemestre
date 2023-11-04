package co.edu.unbosque.view;

/**
 * Pagina de video Tutorial
 * @author Cristhian Diaz
 */
import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class PlayVideo extends JFrame {

	/**
	 * 
	 * Numero de serial del PlayVideo
	 * 
	 */
	private static final long serialVersionUID = -8861769309928035L;

	/**
	 * Atributo para panel
	 * 
	 * @author Cristhian Diaz
	 */
	private JPanel panel;
	/**
	 * Atributo de archivo
	 * 
	 * @author Cristhian Diaz
	 */
	private File file;
	/**
	 * Atributo de clase Media
	 * 
	 * @author Cristhian Diaz
	 */
	private Media media;
	/**
	 * Atributo de clase MediaPlayer
	 * 
	 * @author Cristhian Diaz
	 */
	private MediaPlayer oracleVid;
	/**
	 * Atributo constante de clase JFXPanel
	 * 
	 * @author Cristhian Diaz
	 */
	private final JFXPanel jfxPanel = new JFXPanel();

	/**
	 * Constructor de PlayVideo
	 * 
	 * @author Cristhian Diaz
	 */
	public PlayVideo() {

		setSize(1280, 740);
		setTitle("VIDEO TUTORIAL");
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(false);
		setFocusableWindowState(false);
		setDefaultCloseOperation(HIDE_ON_CLOSE);

		panel = new JPanel();
		panel.setSize(1280, 720);
		panel.setLayout(new BorderLayout());

		panel.add(jfxPanel, BorderLayout.CENTER);

		createScene();
		add(panel);

	}

	/**
	 * Funcion para crear una escena en el JFx
	 * 
	 * @author Cristhian Diaz
	 */
	public void createScene() {

		file = new File("src/Videos/videotuto.mp4");
		media = new Media(file.toURI().toString());
		oracleVid = new MediaPlayer(media);

		jfxPanel.setScene(new Scene(new Group(new MediaView(oracleVid))));

		oracleVid.setVolume(0.7);// volumen
		oracleVid.play();// play video

	}

	/**
	 * Get de panel
	 * 
	 * @author Cristhian Diaz
	 */
	public JPanel getPanel() {
		return panel;
	}

	/**
	 * Set de panel
	 * 
	 * @author Cristhian Diaz
	 */
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	/**
	 * Get de file
	 * 
	 * @author Cristhian Diaz
	 */
	public File getFile() {
		return file;
	}

	/**
	 * Set de file
	 * 
	 * @author Cristhian Diaz
	 */
	public void setFile(File file) {
		this.file = file;
	}

	/**
	 * Get de media
	 * 
	 * @author Cristhian Diaz
	 */
	public Media getMedia() {
		return media;
	}

	/**
	 * Set de Media
	 * 
	 * @author Cristhian Diaz
	 */
	public void setMedia(Media media) {
		this.media = media;
	}

	/**
	 * Get de MediaPlayer
	 * 
	 * @author Cristhian Diaz
	 */
	public MediaPlayer getOracleVid() {
		return oracleVid;
	}

	/**
	 * Set de MediaPlayer llamado Oraclevid
	 * 
	 * @author Cristhian Diaz
	 */
	public void setOracleVid(MediaPlayer oracleVid) {
		this.oracleVid = oracleVid;
	}

	/**
	 * Get de Serial
	 * 
	 * @author Cristhian Diaz
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * Get de JFXPanel
	 * 
	 * @author Cristhian Diaz
	 */
	public JFXPanel getJfxPanel() {
		return jfxPanel;
	}
}
