package com.campusdual.classroom;


public class Exercise26 {
    public static void main(String[] args) {
        // Crear objetos Contact
        Contact contact1 = new Contact("Javier", "López", "1234567890");
        Contact contact2 = new Contact("Carlos", "Fernández-Simón", "9876543210");
        Contact contact3 = new Contact("Jose Manuel", "Soria", "5555555555");
        Contact contact4 = new Contact("Santiago", "Fernández Rocha", "1111111111"); // Nota: Un solo apellido compuesto
        Contact contact5 = new Contact("Esteban", "Serrano del Río", "2222222222"); // Nota: Apellidos compuestos
        Contact contact6 = new Contact("Fernando Miguel", "Juan de los Santos Requejo León", "3333333333"); // Nota: Múltiples apellidos compuestos

        // Imprimir los objetos (opcional, para verificar la creación)
        System.out.println(contact1.getCode());
        System.out.println(contact2.getCode());
        System.out.println(contact3.getCode());
        System.out.println(contact4.getCode());
        System.out.println(contact5.getCode());
        System.out.println(contact6.getCode());

        //Otros
        contact1.callMyNumber();
        contact1.callOtherNumber("9876543210");
        contact1.showContactDetails();
    }
}
