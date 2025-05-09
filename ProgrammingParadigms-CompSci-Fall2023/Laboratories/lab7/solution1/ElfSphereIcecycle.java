package solution1;
public class ElfSphereIcecycle extends Elf {

    public ElfSphereIcecycle() {
        super("Kula");
    }

    @Override
    public void addBauble(Bauble bombka) {
        if (bombka instanceof BaubleIcecycle) {
            baublesCounter++;
            baubles.add(bombka);
            showMsg("Bombka dodana!");
            // Logika dla pełnego pudełka
            if (baublesCounter == SIZE_OF_BOX && numberOfBoxes > 0) {
                numberOfBoxes--;
                baublesCounter = 0;
                showMsg("Pudelko z kulami jest pełne! Elf rzucił je za siebie i wziął nowe!");
            } else if (baublesCounter == SIZE_OF_BOX && numberOfBoxes == 0) {
                isElfDone = true;
                showMsg("Elf nie ma już pudełek!");
            }
        } else {
            showMsg("Bombka nie pasuje do pudełka!");
        }
    }

    @Override
    public boolean doesBaubleFit(Bauble bombka) {
        return bombka instanceof BaubleIcecycle;
    }

    @Override
    public String toString(){
        return("ElfIcecycle = { rodzajPudelka = " + boxType + ", liczbaBombek = " + baublesCounter + " }");
    }
}

// Analogicznie dla ElfSopelka i ElfGrzybka
