package vo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ALBUM")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "music_group")
    private String musicGroup;

    @Column(name = "nameAlbum")
    private String nameAlbum;

    @Column(name = "year")
    private String year;

    public Album() { }

    public Album(String group, String nameAlbum, String year) {
        this.musicGroup = group;
        this.nameAlbum = nameAlbum;
        this.year = year;
    }

    public String getMusicGroup() {
        return musicGroup;
    }

    public void setMusicGroup(String musicGroup) {
        this.musicGroup = musicGroup;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", musicGroup='" + musicGroup + '\'' +
                ", nameAlbum='" + nameAlbum + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
