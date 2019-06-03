package object;

import object.struct.ObjectCore;
import object.struct.ObjectInterface;

public class PlayerObject extends ObjectCore implements ObjectInterface {


    public PlayerObject() {
        this.requiredKeys.add("name");
        this.requiredKeys.add("password");
    }

    @Override
    public String getObjectString() {
        return "Players";
    }

    @Override
    public ObjectInterface getNew() {
        return new PlayerObject();
    }

}
