package vo;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ALBUM")
@NamedQueries({
        @NamedQuery(name = "Album.findAllAlbums", query = "select a from Album a")
})
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "music_group")
    private String musicGroup;

    @Column(name = "nameAlbum")
    private String nameAlbum;

    @Column(name = "year")
    private String year;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Track> tracks = new HashSet<Track>();

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

    public Set<Track> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Track> tracks) {
        this.tracks = tracks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
