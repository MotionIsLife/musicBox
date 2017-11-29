package vo;

import org.springframework.stereotype.Service;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "Track")
public class Track {
    private String title;
    private String singer;

    @XmlElement
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @XmlElement
    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSinger() {
        return singer;
    }
}
