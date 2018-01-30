package vo;


import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "ALBUM")
@NamedQueries({
        @NamedQuery(name = "Album.findAllAlbums",
                query = "select c from Album c")
        //query = "select distinct c from Album c left join fetch c.tracks t")
})
public class Album implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "music_group")
    private String musicGroup;

    @Column(name = "nameAlbum")
    private String nameAlbum;

    @Column(name = "year")
    private String year;

    @JsonIgnore
    @Column(name = "tracks_id")
    @OneToMany(mappedBy = "album", fetch = FetchType.EAGER ,cascade = {CascadeType.ALL})
    private Set<Tracks> tracks;

    public Album() { }

    public Album(String group, String nameAlbum, String year, Set<Tracks> tracks) {
        this.musicGroup = group;
        this.nameAlbum = nameAlbum;
        this.year = year;
        this.tracks = tracks;
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

    public Set<Tracks> getTracks() {
        return tracks;
    }

    public void setTracks(Set<Tracks> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", musicGroup='" + musicGroup + '\'' +
                ", nameAlbum='" + nameAlbum + '\'' +
                ", year='" + year + '\'' +
                ", tracks='" + tracks + '\'' +
                '}';
    }
}
