package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Egg6 {
    private final Needle7 needle7;

    public Egg6(Needle7 needle7) {
        this.needle7 = needle7;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + needle7.toString();
    }
}
