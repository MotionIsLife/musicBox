package rest;

import business.Calculate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vo.Track;

@RestController
@RequestMapping("/json/metallica")
public class Music {

    @Autowired
    private Calculate calculate;

    @RequestMapping(value = "/get", method = RequestMethod.GET, produces = { "application/json" })
    public Track getTrackInJSON() {

        Track track = new Track();
        track.setTitle("Enter Sandman");
        track.setSinger("Metallica");
        return track;
    }

    @GetMapping("/get/{id}")
    public @ResponseBody ResponseEntity<Track> getPersonById(@PathVariable String id){
        Track track = new Track();
        track.setTitle("Enter Sandman");
        track.setSinger("Metallica");
        return new ResponseEntity<Track>(track,HttpStatus.OK);   }
}
