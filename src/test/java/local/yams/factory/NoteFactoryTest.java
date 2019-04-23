package local.yams.factory;

import local.yams.model.Note;
import org.junit.Assert;
import org.junit.Test;

public class NoteFactoryTest {
    @Test
    public void testCreateNote() {
        String message = "There was some coffee spilt on this keyboard of the laptop";

        Note n = NoteFactory.getNote(message);
        System.out.println(n);
        Assert.assertEquals(n.getMessage(), message);
    }
}
