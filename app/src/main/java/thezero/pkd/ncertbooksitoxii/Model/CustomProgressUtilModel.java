package thezero.pkd.ncertbooksitoxii.Model;


//import org.parceler.Parcel;

//@Parcel
public class CustomProgressUtilModel {
    private String className;
    private String subjectName;
    private String bookName;
    private int percentage;
    private String name;//ChapterName
    private String url;//ChapterUrl
    private String status;

    public CustomProgressUtilModel(String className, String subjectName, String bookName, int percentage, String name, String url, String status) {
        this.className = className;
        this.subjectName = subjectName;
        this.bookName = bookName;
        this.percentage = percentage;
        this.name = name;
        this.url = url;
        this.status = status;
    }

    public String getClassName() {
        return className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPercentage() {
        return percentage;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getStatus() {
        return status;
    }
}
