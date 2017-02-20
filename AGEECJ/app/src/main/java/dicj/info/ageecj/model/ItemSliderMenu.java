package dicj.info.ageecj.model;

/**
 * Created by utilisateur on 2017-02-06.
 */
public class ItemSliderMenu {

    private int imgId;
    private String title;

    public ItemSliderMenu(String title, int imgId) {
        this.title = title;
        this.imgId = imgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
