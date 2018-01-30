package rest;

import business.Calculate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;
import service.AlbumService;
import vo.Album;

import java.util.List;

@RestController
@RequestMapping("/rest/albums")
public class Music {

    @Autowired
    private Calculate calculate;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private AlbumService albumService;

    @RequestMapping(value = "/getAllAlbums")
    public @ResponseBody List<Album> getAlbums() {
        return albumService.finAllAlbums();
    }

    @RequestMapping("/getAlbumById/{id}")
    public @ResponseBody Album getAlbumById(@PathVariable String id){
        return albumService.getAlbum(Long.valueOf(id));
    }

    @RequestMapping(value = "/addAlbum", method = RequestMethod.POST)
    public @ResponseBody void addAlbum(@RequestBody Album album){
        System.out.println(album);
        albumService.createAlbum(album);
    }
}
