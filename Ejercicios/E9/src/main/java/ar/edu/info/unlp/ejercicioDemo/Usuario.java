package ar.edu.info.unlp.ejercicioDemo;

public class Usuario {
    private String name;
    private String surname;
    private String email;

    public Usuario(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

}
