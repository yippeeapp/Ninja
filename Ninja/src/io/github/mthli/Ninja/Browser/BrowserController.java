package io.github.mthli.Ninja.Browser;

import android.os.Message;
import android.webkit.WebView;

public interface BrowserController {
    void updateAutoComplete();

    void updateBookmarks();

    void updateInputBox(String query);

    void updateProgress(int progress);

    void showAlbum(AlbumController albumController, boolean expand, boolean capture);

    void removeAlbum(AlbumController albumController);

    void onCreateView(WebView view, Message resultMsg);

    void onLongPress(String url);
}
