package dao.impl;

import com.sun.org.apache.bcel.internal.generic.ALOAD;
import dao.AbstractDao;
import dao.AlbumDao;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import vo.Album;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("albumDao")
public class AlbumDaoImpl extends AbstractDao implements AlbumDao{

/*    @PersistenceContext
    private EntityManager entityManager;*/

    @Override
    public void createAlbum(Album album) {
        persist(album);
    }

    @Override
    public Album getAlbum(long id) {
        return null;
    }

    @Override
    public List<Album> findAllAlbums() {
        Criteria criteria = getSession().createCriteria(Album.class);
        return (List<Album>) criteria.list();
    }

    @Override
    public void updateAlbum(Album album) {
        getSession().update(album);
    }

    @Override
    public void deleteAlbum(long id) {
        Query query = getSession().createSQLQuery("delete from Album where id = :id");
        query.setString("id", String.valueOf(id));
        query.executeUpdate();
    }
}
