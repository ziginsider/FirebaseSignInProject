package io.github.ziginsider.firebasesigninproject;

/**
 * Created by zigin on 06.12.2017.
 * Message holder
 *
 * @author zigin
 *
 */

public class FriendlyMessage {


    private String id;
    private String text;
    private String name;
    private String photoUrl;
    private String imageUrl;

    public FriendlyMessage() {
    }

    /**
     * Constructor
     * @param text - text of message
     * @param name - name user
     * @param photoUrl - user photo
     * @param imageUrl - image of message
     */
    public FriendlyMessage(String text, String name, String photoUrl, String imageUrl) {
        this.text = text;
        this.name = name;
        this.photoUrl = photoUrl;
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getText() {
        return text;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
