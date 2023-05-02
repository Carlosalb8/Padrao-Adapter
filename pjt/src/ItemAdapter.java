public class ItemAdapter extends AvaliacaoId {
    private IItemAvaliacao itemAvaliacao;

    public ItemAdapter(IItemAvaliacao itemAvaliacao) {
        this.itemAvaliacao = itemAvaliacao;
    }

    public String avaliarItem(Item item) {
        String avaliacao = itemAvaliacao.avaliarItem(item);
        if (avaliacao.equalsIgnoreCase("Item raro e muito útil")) {
            if (this.getId() == 4) {
                this.setId(4.0F);
            }
        } else if (avaliacao.equalsIgnoreCase("Item raro e útil")) {
            if (this.getId() == 3) {
                this.setId(3.0F);
            }
        } else if (avaliacao.equalsIgnoreCase("Item comum e útil")) {
            if (this.getId() == 2) {
                this.setId(2.0F);
            }
        } else {
            this.setId(1.0F);
        }

        return avaliacao;
    }
}
