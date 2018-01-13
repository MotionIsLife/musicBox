package rest;

import business.Calculate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.web.bind.annotation.*;
import service.AlbumService;
import service.impl.AlbumServiceImpl;
import vo.Album;
import vo.Track;

@RestController
@RequestMapping("/json/metallica")
public class Music {

    @Autowired
    private Calculate calculate;

    @Autowired
    ApplicationContext applicationContext;

    @Autowired
    private AlbumService albumService;

    @RequestMapping(value = "/get")
    public @ResponseBody Album getTrackInJSON() {
        Album album = new Album();
        album.setAge("10");
        album.setName("Album 1");
        albumService.finAllAlbums().stream().forEach(System.out::println);
        return album;
    }

    @GetMapping("/get/{id}")
    public @ResponseBody ResponseEntity<Track> getPersonById(@PathVariable String id){
        Track track = new Track();
        track.setTitle("Enter Sandman");
        track.setSinger("Metallica");
        return new ResponseEntity<Track>(track,HttpStatus.OK);   }
}
