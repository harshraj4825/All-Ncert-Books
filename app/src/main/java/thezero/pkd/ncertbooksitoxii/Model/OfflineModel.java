package thezero.pkd.ncertbooksitoxii.Model;

public class OfflineModel{
    //fileName is file path
    String class_name,book_name,fileName,chhapterName;

    public OfflineModel(String class_name, String book_name, String fileName, String chapterName) {
        this.class_name = class_name;
        this.book_name = book_name;
        this.fileName = fileName;
        this.chhapterName = chapterName;
    }
    public String getClass_name() {
        return class_name;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getFileName() {
        return fileName;
    }

    public String getChapterName() {
        return chhapterName;
    }
}
