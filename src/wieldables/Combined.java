package wieldables;

import gameplay.Wieldable;

public final class Combined extends Wieldable {
    public Combined(Wieldable one, Wieldable two) {
        super(one.getDescription() + "-" + two.getDescription(), one.getLow() + two.getLow(), one.getHigh() + two.getHigh());
    }
}
