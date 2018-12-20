package test1;

public interface Run {
     default int getSpeed() {
        return 10;
    }
    static int getJumpHeight() {
        return 8;
    }
}
