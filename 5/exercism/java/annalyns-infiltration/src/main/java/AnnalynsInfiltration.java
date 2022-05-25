class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean canAttack;
        if(knightIsAwake == true){
            canAttack = false;
        } else {
            canAttack = true;
        }
        return canAttack;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSpy; 
        if(knightIsAwake || archerIsAwake || prisonerIsAwake == true) {
            canSpy = true;
        }else {
            canSpy = false;
        }
        return canSpy;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean canSignal;
        if(archerIsAwake == false && prisonerIsAwake == true) {
            canSignal = true;
        } else {
            canSignal = false;
        }
        return canSignal;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean canFree;
        if(petDogIsPresent == true && archerIsAwake == false) {
            canFree = true;
        } else if(petDogIsPresent == false && prisonerIsAwake == true & archerIsAwake == false && knightIsAwake == false) {
            canFree = true;
        } else {
            canFree = false;
        }
        return canFree;
    }
}
