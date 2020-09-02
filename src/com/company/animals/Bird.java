package com.company.animals;

public class Bird extends Animal {
    protected Boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);
    }

    public final void takeOff() {
        flyModeActive = true;
    }

    public final void landing(){
        flyModeActive = false;
    }

    public void isTheBirdFlying(){
        System.out.println(
                this.flyModeActive == true ? "Bird: flying mode - yes": "Duck: flying mode - no"
        );
    }

    public Boolean getFlyModeActive() {
        return flyModeActive;
    }

    public void setFlyModeActive(Boolean flyModeActive) {
        this.flyModeActive = flyModeActive;
    }
}
