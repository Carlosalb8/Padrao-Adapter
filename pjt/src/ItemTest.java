import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemTest {
    @Test
    public void testAvaliarItemVermelho() {
        ItemAvaliacao itemAvaliacao = new ItemAvaliacao();
        Item item = new Item("Erva", "Pode ser combinado com outras ervas para criar itens de cura mais potentes", "vermelha");
        String avaliacao = itemAvaliacao.avaliarItem(item);
        assertEquals("Item raro e muito útil", avaliacao);
    }

    @Test
    public void testAvaliarItemAzul() {
        ItemAvaliacao itemAvaliacao = new ItemAvaliacao();
        Item item = new Item("Erva", "Pode ser usado para curar o envenenamento do personagem", "azul");
        String avaliacao = itemAvaliacao.avaliarItem(item);
        assertEquals("Item raro e útil", avaliacao);
    }

    @Test
    public void testAvaliarItemVerde() {
        ItemAvaliacao itemAvaliacao = new ItemAvaliacao();
        Item item = new Item("Erva", "Restaura uma pequena quantidade de saúde do personagem", "verde");
        String avaliacao = itemAvaliacao.avaliarItem(item);
        assertEquals("Item comum e útil", avaliacao);
    }

    @Test
    public void testAvaliarItemOutraCor() {
        ItemAvaliacao itemAvaliacao = new ItemAvaliacao();
        Item item = new Item("Mapa", "Mostra ao personagem o layout da área em que ele se encontra", "outra cor");
        String avaliacao = itemAvaliacao.avaliarItem(item);
        assertEquals("Item comum", avaliacao);
    }

    @Test
    public void testAvaliarIdItemVermelho() {
        ItemAvaliacao itemAvaliacao = new ItemAvaliacao();
        ItemAdapter itemAdapter = new ItemAdapter(itemAvaliacao);
        itemAdapter.setId(4);
        Item item = new Item("Erva", "Pode ser combinado com outras ervas para criar itens de cura mais potentes", "vermelha");
        String avaliacao = itemAdapter.avaliarItem(item);
        assertEquals("Item raro e muito útil", avaliacao);
        assertEquals(4.0f, itemAdapter.getId());
    }

    @Test
    public void testAvaliarIdItemAzul() {
        ItemAvaliacao itemAvaliacao = new ItemAvaliacao();
        ItemAdapter itemAdapter = new ItemAdapter(itemAvaliacao);
        itemAdapter.setId(3);
        Item item = new Item("Erva", "Pode ser usado para curar o envenenamento do personagem", "azul");
        String avaliacao = itemAdapter.avaliarItem(item);
        assertEquals("Item raro e útil", avaliacao);
        assertEquals(3.0f, itemAdapter.getId());
    }

    @Test
    public void testAvaliarIdItemVerde() {
        ItemAvaliacao itemAvaliacao = new ItemAvaliacao();
        ItemAdapter itemAdapter = new ItemAdapter(itemAvaliacao);
        itemAdapter.setId(2);
        Item item = new Item("Erva", "Restaura uma pequena quantidade de saúde do personagem", "verde");
        String avaliacao = itemAdapter.avaliarItem(item);
        assertEquals("Item comum e útil", avaliacao);
        assertEquals(2.0f, itemAdapter.getId());
    }

    @Test
    public void testAvaliarIdItemOutraCor() {
        ItemAvaliacao itemAvaliacao = new ItemAvaliacao();
        ItemAdapter itemAdapter = new ItemAdapter(itemAvaliacao);
        itemAdapter.setId(1);
        Item item = new Item("Mapa", "Mostra ao personagem o layout da área em que ele se encontra", "outra cor");
        String avaliacao = itemAdapter.avaliarItem(item);
        assertEquals("Item comum", avaliacao);
        assertEquals(1.0f, itemAdapter.getId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIdInvalido() {
        ItemAdapter itemAdapter = new ItemAdapter(new ItemAvaliacao());
        itemAdapter.setId(0);
    }

}
