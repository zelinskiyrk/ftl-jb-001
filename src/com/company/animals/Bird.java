package com.company.animals;

public class Bird extends Animal implements Flight {
    protected Boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);
    }

    @Override
    public void takeOff() {
        this.flyModeActive = true;
    }

    @Override
    public void landing() {
        this.flyModeActive = false;
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
