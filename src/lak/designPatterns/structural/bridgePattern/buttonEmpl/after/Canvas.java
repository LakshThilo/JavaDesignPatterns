package lak.designPatterns.structural.bridgePattern.buttonEmpl.after;


public class Canvas {

    public static void main(String[] args) {

        CheckboxButton checkboxButton = new CheckboxButton(new SmallButtonSize());
        checkboxButton.draw();

        RadioButton radioButton = new RadioButton(new MediumButtonSize());
        radioButton.draw();

        DropdownButton dropdownButton = new DropdownButton(new LargeButtonSize());
        dropdownButton.draw();
    }
}
