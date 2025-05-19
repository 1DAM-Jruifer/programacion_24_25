package U8;

public class post {

    private String title;
    private String link;
    private String descripcion;
    private String pubdate;
    private String guid;

    public post(String title, String link, String descripcion, String pubdate, String guid) {
        this.title = title;
        this.link = link;
        this.descripcion = descripcion;
        this.pubdate = pubdate;
        this.guid = guid;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPubdate() {
        return pubdate;
    }

    public String getGuid() {
        return guid;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }
}

