package conversion.tag;

public class NumberedListTag implements ListTag{

    private String startHtmlTypeTag = "<ol>\n";
    private String endHtmlTypeTag = "</ol>";

    private String startHtmlNestedTag = "\n<ul>\n";
    private String endHtmlNestedTag = "</ul>\n";

    private String startHtmlItemTag = "<li>";
    private String endHtmlItemTag = "</li>\n";


    @Override
    public String htmlTypeTag() {
        return startHtmlTypeTag+endHtmlTypeTag;
    }

    @Override
    public Integer nextLocationHtmlTypeTag() {
        return startHtmlTypeTag.length();
    }

    @Override
    public String htmlNestedTag() {
        return startHtmlNestedTag+endHtmlNestedTag;
    }

    @Override
    public Integer nextLocationHtmlNestedTag() {
        return startHtmlNestedTag.length();
    }

    @Override
    public String htmlItemTag() {
        return startHtmlItemTag+endHtmlItemTag;
    }

    @Override
    public Integer nextLocationHtmlItemTag() {
        return startHtmlItemTag.length();
    }
}
