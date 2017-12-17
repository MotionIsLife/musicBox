package dao.impl;

import dao.AlbumDao;
import org.springframework.stereotype.Repository;
import vo.Album;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AlbumDaoImpl implements AlbumDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public long createAlbum(Album album) {
        return 0;
    }

    @Override
    public Album getAlbum(long id) {
        return null;
    }

    @Override
    public long updateAlbum(Album album) {
        return 0;
    }

    @Override
    public long deleteAlbum(long id) {
        return 0;
    }
}
