package service;

import entity.Topic;
import entity.User;
import sun.swing.SwingUtilities2;
import java.util.List;
import java.util.Set;

public interface TopicService {

    List<Topic> findAll();

    Topic findOne(int id);

    Set<Topic> findRecent();

    Set<Topic> findAllByOrderByCreationDateDesc();

    Set<Topic> findBySection(SwingUtilities2.Section section);

    Set<Topic> findBySection(String sectionName);

    Topic save(Topic topic);

    Set<Topic> findBySection(int id);

    Set<Topic> findByUser(User user);

    void delete(int id);

    void delete(Topic topic);
}
