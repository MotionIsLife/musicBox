package dao;

import vo.Album;

public interface AlbumDao {
    long createAlbum(Album album);
    Album getAlbum(long id);
    long updateAlbum(Album album);
    long deleteAlbum(long id);
}
