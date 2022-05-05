package src.home;

public class FileWriterHelper {
    private Object object;

    public void save(FileWriterUtil fileWriterUtil){
        this.object=fileWriterUtil.save();
    }

    public void loadLastSaved(FileWriterUtil fileWriterUtil){
        fileWriterUtil.loadLastSave(object);
    }

    public Object getObject() {
        return this.object;
    }
}
