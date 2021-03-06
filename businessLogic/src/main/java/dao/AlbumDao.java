package dao;

import vo.Album;

import java.util.List;

public interface AlbumDao {
    void createAlbum(Album album);
    Album getAlbum(long id);
    List<Album> findAllAlbums();
    void updateAlbum(Album album);
    void deleteAlbum(long id);
}
