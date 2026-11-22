package packege2.packege2_2.packege2_2_3;

import java.util.Objects;

public abstract class Bird implements Son {
    private String music;

    public Bird(String music){
        Objects.requireNonNull(music);
        this.music = music;
    }

    protected String getMusic(){
        return music;
    }
}
