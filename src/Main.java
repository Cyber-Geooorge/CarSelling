
public class Main {
    public static void main(String[] args) {
        Voiture voitureEssence = VoitureDirector.fabriquerVoitureEssence();
        Voiture voitureGazoil = VoitureDirector.fabriquerVoitureGazoil();

        Voiture customCar = new Voiture.BuilderVoiture(EVoiture.GAZOIL)
                .ajouterOptions(EVoitureOptions.GPS)
                .ajouterOptions(EVoitureOptions.RETRO_ELECTRIQUE)
                .ajouterOptions(EVoitureOptions.SIEGES_CHAUFFANT)
                .estProduit()
                .build();

        System.out.println("Voiture essence : " + voitureEssence);
        System.out.println("Voiture gasoil : " + voitureGazoil);
        System.out.println("Voiture personnalisée : " + customCar);
    }
}