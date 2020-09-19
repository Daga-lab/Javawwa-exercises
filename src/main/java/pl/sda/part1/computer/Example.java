package pl.sda.part1.computer;

import java.util.Optional;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 19.09.2020
 */
final class Example {
    public static void main(String[] args) {

        Computer fullComputer = new Computer(new GraphicsCard(new Chip("sth")));
        Computer withoutGC = new Computer(null);
        Computer fake = null;

//        printChipVendorNaive(fullComputer);
//        printChipVendorNaive(withoutGC);
//        printChipVendorNaive(fake);

        printChipVendorSafeWay(fullComputer);
        printChipVendorSafeWay(withoutGC);
        printChipVendorSafeWay(fake);
    }

    static void printChipVendorNaive (Computer computer){
        System.out.println("Vendor: " + computer.getGraphicsCard().getChip().getVendor());
    }

    static void printChipVendorSafeWay (Computer computer){
        if (computer!=null){
            GraphicsCard graphicsCard = computer.getGraphicsCard();
            if (graphicsCard!=null){
                Chip chip = graphicsCard.getChip();
                if (chip!=null){
                    System.out.println("Graphics and vendor(safe way): " + computer.getGraphicsCard().getChip().getVendor());
                }
            }
        }
    }

    static void printChipVendorOptionalWay(Computer computer){
        Optional.ofNullable(computer)
                .map(Computer::getGraphicsCard)
                .map(GraphicsCard::getChip)
                .map(Chip::getVendor)
                .ifPresent(System.out::println);
    }
}
