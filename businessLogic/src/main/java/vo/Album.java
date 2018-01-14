package vo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Album")
public class Album implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "group")
    private String group;

    @Column(name = "nameAlbum")
    private String nameAlbum;

    @Column(name = "year")
    private String year;

    public Album() { }

    public Album(String group, String nameAlbum, String year) {
        this.group = group;
        this.nameAlbum = nameAlbum;
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", group='" + group + '\'' +
                ", nameAlbum='" + nameAlbum + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
