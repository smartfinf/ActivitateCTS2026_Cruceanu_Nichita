package acs.ase.ro.builder01;

public interface AbstractBuilder {
    Internare build();
    AbstractBuilder setNumePacient(String numePacient);
    AbstractBuilder setPatRabatabil(boolean patRabatabil);
    AbstractBuilder setMicDejun(boolean micDejun);
    AbstractBuilder setPapuciCamera(boolean papuciCamera);
    AbstractBuilder setHalatInterior(boolean halatInterior);




}
