package pl.sda.part1.computer;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 19.09.2020
 */
public class GraphicsCard {
    private Chip chip;

    public GraphicsCard(Chip chip) {
        this.chip = chip;
    }

    public Chip getChip() {
        return chip;
    }
}
