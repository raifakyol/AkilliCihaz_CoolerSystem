package proje21;

public class Builder {
    private String author, date,version;

    private Builder(ClassBuilder builder) {
        this.author = builder.author;
        this.date = builder.date;
        this.version = builder.version;
    }
    public String getAuthor() {
        return author;
    }
    public String getDate() {
        return date;
    }
    public String getVersion() {
        return version;
    }
    @Override
    public String toString() {
        return "-------------------------"+
                "\nAuthor =" + author +"\n"+
                "Date =" + date +"\n"+
                "Version =" + version +"\n"+
                "-------------------------";
    }
    public static class ClassBuilder
    {
        private String author, date,version;
        public ClassBuilder author (String author) {
            this.author = author;
            return this;
        }
        public ClassBuilder date (String date) {
            this.date = date;
            return this;
        }
        public ClassBuilder version (String version) {
            this.version = version;
            return this;
        }
        public Builder build() {
            return new Builder(this);
        }
    }
}
