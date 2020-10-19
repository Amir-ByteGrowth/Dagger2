package com.example.dagger2begninner;

import javax.inject.Inject;

public class War {
    private Starks starks;

    private Boltons boltons;

//    dependency

//    public War(){
//        starks = new Starks();
//        boltons = new Boltons();
//
//        starks.prepareForWar();
//        starks.reportForWar();
//        boltons.prepareForWar();
//        starks.reportForWar();
//    }

    //    dependency injection
//DI - getting dependencies from else where via constructor

//     because war is getting objects from outside
    @Inject
    public War(Starks starks, Boltons bolton) {
        this.starks = starks;
        this.boltons = bolton;
    }

    public void prepare() {
        starks.prepareForWar();
        boltons.prepareForWar();
    }

    public void report() {
        starks.reportForWar();
        boltons.reportForWar();
    }
}
