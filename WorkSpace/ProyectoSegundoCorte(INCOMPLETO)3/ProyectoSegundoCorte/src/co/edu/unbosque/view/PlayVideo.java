package co.edu.unbosque.view;

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

	private static final long serialVersionUID = -8861769309928035L;

	private JPanel panel;

	private File file;

	private Media media;

	private MediaPlayer oracleVid;

	private final JFXPanel jfxPanel = new JFXPanel();

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

	public void createScene() {

		file = new File("src/Videos/videotuto.mp4");
		media = new Media(file.toURI().toString());
		oracleVid = new MediaPlayer(media);

		jfxPanel.setScene(new Scene(new Group(new MediaView(oracleVid))));

		oracleVid.setVolume(2);// volumen
		oracleVid.play();// play video

	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public MediaPlayer getOracleVid() {
		return oracleVid;
	}

	public void setOracleVid(MediaPlayer oracleVid) {
		this.oracleVid = oracleVid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JFXPanel getJfxPanel() {
		return jfxPanel;
	}
}
