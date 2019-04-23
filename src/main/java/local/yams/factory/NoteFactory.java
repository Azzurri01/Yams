package local.yams.factory;

import local.yams.model.Note;
import local.yams.util.Misc;

public class NoteFactory {
    public static Note getNote(String message) {
        return new Note.Builder()
                .noteId(Misc.generateId())
                .message(message)
                .build();
    }
}
