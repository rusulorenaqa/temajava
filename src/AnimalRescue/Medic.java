package AnimalRescue;

public class Medic extends Human {
    private String speciality;

    public void setSpeciality(String newSpeciality) {
        this.speciality = newSpeciality;
    }

    public String getSpeciality() {
        return speciality;
    }


    @Override
    public void doJob() {
        System.out.println("Medic: I'm treating animals!");
    }
}
