package thezero.pkd.ncertbooksitoxii.Model;

public class ChapterModel {
    private String name;//ChapterName
    private String url;//ChapterUrl
    public ChapterModel() {
        //empty constructor needed for firebase
    }

    public ChapterModel(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}
