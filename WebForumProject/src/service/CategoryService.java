package service;

import sun.swing.SwingUtilities2;
import java.util.List;

public interface CategoryService {


    List<SwingUtilities2.Section> findAll();

    SwingUtilities2.Section findOne(int id);

    SwingUtilities2.Section findByName(String name);

    SwingUtilities2.Section save(SwingUtilities2.Section section);

    void delete(int id);

    void delete(SwingUtilities2.Section section);
}
