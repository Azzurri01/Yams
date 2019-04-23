package local.yams.model;

public class Note {
    private String noteId;
    private String message;

    private Note() {
    }

    private Note(Builder builder) {
        this.noteId = builder.noteId;
        this.message = builder.message;
    }

    public String getNoteId() {
        return noteId;
    }

    public String getMessage() {
        return message;
    }

    public static class Builder{
        String noteId;
        String message;

        public Builder noteId(String noteId) {
            this.noteId = noteId;
            return this;
        }

        public Builder message(String message){
            this.message = message;
            return this;
        }

        public Note build(){
            return new Note(this);
        }
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteId='" + noteId + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
