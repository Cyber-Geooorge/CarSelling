import java.util.ArrayList;
import java.util.List;

public class Voiture {

    private final EVoiture type;
    private final List<EVoitureOptions> options;

    private Voiture(BuilderVoiture builder) {
        this.type = builder.type;
        this.options = builder.options;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "type=" + type +
                ", options=" + options +
                '}';
    }

    public static class BuilderVoiture implements IBuilderVoiture {
        private final EVoiture type;
        private final List<EVoitureOptions> options = new ArrayList<>();
        private boolean construit = false;

        public BuilderVoiture(EVoiture type) {
            this.type = type;
        }

        @Override
        public BuilderVoiture ajouterOptions(EVoitureOptions option) {
            options.add(option);
            return this;
        }

        @Override
        public BuilderVoiture estProduit() {
            construit = true;
            return this;
        }

        @Override
        public Voiture build() {
            return new Voiture(this);
        }
    }
}