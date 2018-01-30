package service.impl;

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

    @Override
    public void createAlbum(Album album) {
    }

    @Override
    public Album getAlbum(long id) {
        return null;
    }

    @Transactional(readOnly=true)
    @Override
    public List<Album> finAllAlbums() {
        List<Album> albums = entityManager.createNamedQuery("Album.findAllAlbums", Album.class).getResultList();
        return albums;
    }

    @Override
    public void updateAlbum(Album album) {
    }

    @Override
    public void deleteAlbum(long id) {
    }
}
