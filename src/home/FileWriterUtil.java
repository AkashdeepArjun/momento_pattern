package src.home;

public class FileWriterUtil {

    private String file_name;
    private StringBuilder content;

    public FileWriterUtil(String file_name){
        this.file_name=file_name;
        this.content=new StringBuilder();
    }

    @Override
    public String toString() {
     
        return this.content.toString();
    }

    public void write(String data){
        this.content.append(data);
    }

    public Momento save(){
        return new Momento(this.file_name, this.content);
    }

    public void loadLastSave(Object obj){
        Momento momento = (Momento) obj;
        this.file_name=momento.file_name;
        this.content=momento.content;
    }
    
 
    
    private class Momento{

        private String file_name;
        private StringBuilder content;

        public Momento(String f_name,StringBuilder c){
            this.file_name=f_name;
            this.content=new StringBuilder(c);
        }


    }


}
