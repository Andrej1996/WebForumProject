package entity;

import sun.swing.SwingUtilities2;

import java.io.Serializable;
import java.util.Date;

public class Topic implements Serializable {

    private int id;
    private User user;
    private SwingUtilities2.Section section;
    private String title;
    private String content;
    private int views;
    private boolean closed;
    private Date creationDate;
    private Date lastUpdateDate;

    /**
     * Default Constructor
     */
    public Topic() {

    }

    /**
     * Method who create lastUpdateDate and creationDate
     */
    protected void onCreate() {
        this.creationDate = new Date();
        this.lastUpdateDate = new Date();
    }


    /**
     * Method who update lastUpdateDate
     */
    protected void onUpdate() {
        this.lastUpdateDate = new Date();
    }


    /**
     * Getter and Setter
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SwingUtilities2.Section getSection() {
        return section;
    }

    public void setSection(SwingUtilities2.Section section) {
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


    /**
     * Method who checked Topic
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Topic other = (Topic) obj;
        if (closed != other.closed) {
            return false;
        }
        if (content == null) {
            if (other.content != null) {
                return false;
            }
        } else if (!content.equals(other.content)) {
            return false;
        }
        if (creationDate == null) {
            if (other.creationDate != null) {
                return false;
            }
        } else if (!creationDate.equals(other.creationDate)) {
            return false;
        }
        if (id != other.id) {
            return false;
        }
        if (lastUpdateDate == null) {
            if (other.lastUpdateDate != null) {
                return false;
            }
        } else if (!lastUpdateDate.equals(other.lastUpdateDate)) {
            return false;
        }
        if (section == null) {
            if (other.section != null) {
                return false;
            }
        } else if (!section.equals(other.section)) {
            return false;
        }
        if (title == null) {
            if (other.title != null) {
                return false;
            }
        } else if (!title.equals(other.title)) {
            return false;
        }
        if (user == null) {
            if (other.user != null) {
                return false;
            }
        } else if (!user.equals(other.user)) {
            return false;
        }
        if (views != other.views) {
            return false;
        }
        return true;
    }
}
