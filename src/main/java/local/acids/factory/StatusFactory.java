package local.acids.factory;

import local.acids.model.Status;
import local.acids.util.Misc;

public class StatusFactory {
    public static Status getStatus(String name){
        return new Status.Builder()
                .id(Misc.generateId())
                .name(name)
                .build();
    }
}
