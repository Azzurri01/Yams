package local.yams.factory;

import local.yams.model.Status;
import local.yams.util.Misc;

public class StatusFactory {
    public static Status getStatus(String name){
        return new Status.Builder()
                .id(Misc.generateId())
                .name(name)
                .build();
    }
}
