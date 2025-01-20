public interface IBuilderVoiture {
    Voiture.BuilderVoiture ajouterOptions(EVoitureOptions item);

    Voiture.BuilderVoiture estProduit();

    Voiture build();
}


