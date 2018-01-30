package service.impl;

import dao.AlbumDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import service.AlbumService;
import vo.Album;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

@Service("albumService")
@Repository
@Transactional
public class AlbumServiceImpl implements AlbumService {

    @PersistenceContext
    private EntityManager entityManager;

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

    @Transactional(readOnly=true)
    @Override
    public List<Album> finAllAlbums() {
        List<Album> albums = entityManager.createNamedQuery("Album.findAllAlbums", Album.class).getResultList();
        return albums;
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
