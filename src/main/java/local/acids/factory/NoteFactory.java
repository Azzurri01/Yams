package local.acids.factory;

import local.acids.model.Note;
import local.acids.util.Misc;

public class NoteFactory {
    public static Note getNote(String message) {
        return new Note.Builder()
                .noteId(Misc.generateId())
                .message(message)
                .build();
    }
}
