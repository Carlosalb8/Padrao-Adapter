public class ItemAvaliacao implements IItemAvaliacao{
    public String avaliarItem(Item item) {
        if (item.getCor().equalsIgnoreCase("vermelha")) {
            return "Item raro e muito útil";
        } else if (item.getCor().equalsIgnoreCase("azul")) {
            return "Item raro e útil";
        } else if (item.getCor().equalsIgnoreCase("verde")) {
            return "Item comum e útil";
        } else {
            return "Item comum";
        }
    }
}
