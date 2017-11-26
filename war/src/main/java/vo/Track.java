package vo;

import java.io.Serializable;

public class Track implements Serializable{
    private String title;
    private String singer;

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }
}
