package service;

import vo.Album;

import java.util.List;

public interface AlbumService {
    void createAlbum(Album album);
    Album getAlbum(long id);
    List<Album> finAllAlbums();
    void updateAlbum(Album album);
    void deleteAlbum(long id);
}
