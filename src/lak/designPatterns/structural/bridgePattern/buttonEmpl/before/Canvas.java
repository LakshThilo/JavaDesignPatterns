package lak.designPatterns.structural.bridgePattern.buttonEmpl.before;

public class Canvas {

    public static void main(String[] args) {

        RadioButton radioButton = new LargeRadioButton();
        radioButton.draw();

        DropdownButton dropdownButton = new MediumDropdownButton();
        dropdownButton.draw();

        CheckboxButton checkboxButton = new SmallCheckboxButton();
        checkboxButton.draw();
    }
}
