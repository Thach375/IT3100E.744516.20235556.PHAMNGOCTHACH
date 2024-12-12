package hust.soict.dsai.aims.screen;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

import hust.soict.dsai.aims.media.Store;

public class StoreScreen {
    private Store store;
    
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

    JPanel creteHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("view cart");
        cart.setPreferrendSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension/(100,50));

        header.add(createMenuBar());
        header.add(createNorth());
        return header;
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
