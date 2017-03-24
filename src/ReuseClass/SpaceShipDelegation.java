package ReuseClass;

/**
 * Created by DaWei on 2017/2/4.
 */
/*
* 7.3节  代理
*
* */
class SpaceShipControls {
    void up(int velocity) {
    }

    ;

    void back(int velocity) {
    }

    void down(int velocity) {
    }

    void forward(int velocity) {
    }

    void left(int velocity) {
    }

    void right(int velocity) {
    }

    void turboBoost(int velocity) {
    }
}

public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name) {
        this.name = name;
    }

    //delegated method
    public void back(int velocity) {
        controls.back(velocity);
    }

    public void down(int velocity) {
        controls.down(velocity);
    }

    public void forward(int velocity) {
        controls.forward(velocity);
    }

    public void left(int velocity) {
        controls.left(velocity);
    }

    public void right(int velocity) {
        controls.right(velocity);
    }

    public void turboBoost(int velocity) {
        controls.turboBoost(velocity);
    }

    public void up(int velocity) {
        controls.up(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("nsea protector");
        protector.forward(100);
    }
}
