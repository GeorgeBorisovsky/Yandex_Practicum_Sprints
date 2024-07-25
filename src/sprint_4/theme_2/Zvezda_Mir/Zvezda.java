package sprint_4.theme_2.Zvezda_Mir;

class Zvezda extends Zarya {


    public Zvezda() { // доступ к изменению конструктора запрещён
        super();
        energyConsumption = 44;
        activateModule();
    }
    // доступ к созданию новых конструкторов запрещён

    // разрешено переопределение методов
    @Override
    public void activateModule() {
        super.turnSolarPanels();

    }


}


