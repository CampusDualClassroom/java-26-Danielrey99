package com.campusdual.classroom;

import java.text.Normalizer;

public class Contact implements ICallActions {

    private String name;
    private String surnames;
    private String phone;
    private String code;

    public Contact(String name, String surname, String phone) {
        this.name = name;
        this.surnames = surname;
        this.phone = phone;
        this.code = createCode();
    }

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getPhone() {
        return phone;
    }

    public String getCode() {
        return code;
    }

    private String createCode() {
        String allSurname = this.getSurnames();

        StringBuilder sb = new StringBuilder();
        sb.append(this.getName().toLowerCase().charAt(0));

        String[] arraySurnames = allSurname.split(" ");

        //Eliminar signos diacriticos
        for (int i = 0; i < arraySurnames.length; i++) {
            arraySurnames[i] = Normalizer.normalize(arraySurnames[i], Normalizer.Form.NFD)
                    .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        }

        for (int i = 0; i < arraySurnames.length; i++) {
            if (Character.isLowerCase(arraySurnames[i].charAt(0))) {
                sb.append(arraySurnames[i - 1].toLowerCase().charAt(0));
                sb.append(arraySurnames[i]);
                for (int j = i + 1; j < arraySurnames.length; j++) {
                    sb.append(arraySurnames[j].toLowerCase());
                }
                break;
            }

            if (i == arraySurnames.length - 1) {
                for (int j = 0; j < arraySurnames.length - 1; j++) {
                    sb.append(arraySurnames[j].toLowerCase().charAt(0));
                }
                sb.append(arraySurnames[i].toLowerCase());
            }
        }

        return sb.toString();
    }

    @Override
    public void callMyNumber() {
        System.out.println("Te estas llamando a ti mismo. Numero: " + this.getPhone() + " Nombre:" + this.getName() + " " + this.getSurnames());
    }

    @Override
    public void callOtherNumber(String number) {
        System.out.println(this.getName() + " " + this.getSurnames() + "Estas llamando al Numero: " + number);
    }

    @Override
    public void showContactDetails() {
        System.out.println("Nombre: " + this.getName() + " Apellidos: " + this.getSurnames() + " Numero: " + this.getPhone() + " Codigo: " + this.getCode());
    }
}
