package imagenurl;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class ImagenURL extends JFrame {

    public ImagenURL() throws IOException {

        super("ImagenURL"); //establece nombre a JFrame
        File file = new File("C:\\Users\\USER\\Desktop\\banco.jpeg");
        URL url = new URL("http://www.info-centro-24.com/documents/admin/uploads/"
                + "classifieds/img-45-30867-original.jpg");

        Image image = ImageIO.read(file);

        //Creal el JLabel y ingresa la imagen sobre el.
        JLabel label = new JLabel(new ImageIcon(image));

        //Establece las barras de desplazamiento de la imagen
        JScrollPane scroll = new JScrollPane(label);
        add(scroll);
    }

    public static void main(String[] args) throws IOException {
        ImagenURL imagen = new ImagenURL();
        imagen.setSize(900, 600);
        imagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imagen.setVisible(true);
        imagen.setLocationRelativeTo(null);
    }
}
