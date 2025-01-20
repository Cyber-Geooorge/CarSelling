public class VoitureDirector {

    public static Voiture fabriquerVoitureEssence() {
        return new Voiture.BuilderVoiture(EVoiture.ESSENCE)
                .ajouterOptions(EVoitureOptions.CLIM)
                .ajouterOptions(EVoitureOptions.GPS)
                .ajouterOptions(EVoitureOptions.RETRO_ELECTRIQUE)
                .estProduit()
                .build();
    }

    public static Voiture fabriquerVoitureGazoil() {
        return new Voiture.BuilderVoiture(EVoiture.GAZOIL)
                .ajouterOptions(EVoitureOptions.SIEGES_CHAUFFANT)
                .ajouterOptions(EVoitureOptions.TOIT_OUVRANT)
                .estProduit()
                .build();
    }
}