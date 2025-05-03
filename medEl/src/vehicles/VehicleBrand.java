package vehicles;

public enum VehicleBrand {
    TOYOTA("Toyota"),
    KTM("KTM"),
    HONDA("Honda");

    private final String displayName;

    VehicleBrand(String displayName){
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }



}

