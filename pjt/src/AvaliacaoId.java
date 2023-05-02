public class AvaliacaoId {
    private float id;

    public AvaliacaoId() {}

    public float getId() {
        return this.id;
    }

    public void setId(float id) {
        if (id >= 1 && id <= 4) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("O id deve ser um valor entre 1 e 4");
        }
    }
}
