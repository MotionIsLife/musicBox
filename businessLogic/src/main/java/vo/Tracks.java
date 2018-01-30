package vo;

import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TRACKS")
public class Tracks implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nameTrack")
    private String nameTrack;

    @Column(name = "contractor")
    private String contractor;

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    public Tracks() {}
    public Tracks(String nameTrack, String contractor) {
        this.nameTrack = nameTrack;
        this.contractor = contractor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameTrack() {
        return nameTrack;
    }

    public void setNameTrack(String nameTrack) {
        this.nameTrack = nameTrack;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Tracks{" +
                "id=" + id +
                ", nameTrack='" + nameTrack + '\'' +
                ", contractor='" + contractor + '\'' +
                '}';
    }
}
