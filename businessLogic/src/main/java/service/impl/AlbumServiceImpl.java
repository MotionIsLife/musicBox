package service.impl;

import dao.AlbumDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.AlbumService;
import vo.Album;

import javax.transaction.Transactional;
import java.util.List;

@Service("albumService")
@Transactional
public class AlbumServiceImpl implements AlbumService {

    @Autowired
    private AlbumDao albumDao;

    @Override
    public void createAlbum(Album album) {
        albumDao.createAlbum(album);
    }

    @Override
    public Album getAlbum(long id) {
        return albumDao.getAlbum(id);
    }

    @Override
    public List<Album> finAllAlbums() {
        return albumDao.findAllAlbums();
    }

    @Override
    public void updateAlbum(Album album) {
        albumDao.updateAlbum(album);
    }

    @Override
    public void deleteAlbum(long id) {
        albumDao.deleteAlbum(id);
    }
}
