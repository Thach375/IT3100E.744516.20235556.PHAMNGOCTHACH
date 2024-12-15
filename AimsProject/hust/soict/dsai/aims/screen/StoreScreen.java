package hust.soict.dsai.aims.screen;

import hust.soict.dsai.aims.Store.Store;
import hust.soict.dsai.aims.media.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class StoreScreen extends JFrame {
    private Store store;
    
    public StoreScreen(Store store){
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 768);
    }
    
    JPanel createNorth(){
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createTitle());
        north.add(createStore());
        return north;
    }

    JMenuBar createMenuBar(){
        JMenu menu = new JMenu("Option");

        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View Store"));
        menu.add(new JMenuItem("View Cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
   
        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));

        header.add(createMenuBar());
        header.add(createNorth());
        return header;
    }

    JPanel createTitle() {
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Store");
        titleLabel.setFont(new Font(titleLabel.getFont().getName(), Font.PLAIN, 24));
        titlePanel.add(titleLabel);
        return titlePanel;
    }

    JPanel createStore() {
        JPanel storePanel = new JPanel();
        storePanel.setLayout(new GridLayout(0, 3, 10, 10));
        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for (Media media : mediaInStore) {
            MediaStore cell = new MediaStore(media);
            storePanel.add(cell);
        }
        return storePanel;
    }

    JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));

        ArrayList<Media> mediaINStore = store.getItemsInStore();
        for (int i=0; i<9; i++){
            MediaStore cell = new MediaStore(mediaINStore.get(i));
            center.add(cell);
        }

        return center;
    }
}
