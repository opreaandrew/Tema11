package ro.fasttrackit.exercise3;

public class File {
    private final Long byteSize;
    private final String name;

    public File(Long byteSize, String name) {
        this.byteSize = byteSize;
        this.name = name;
    }

    public Long getByteSize() {
        return byteSize;
    }

    public String getName() {
        return name;
    }
}
