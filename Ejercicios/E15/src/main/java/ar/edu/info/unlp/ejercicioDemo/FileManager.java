package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class FileManager implements FileOO2 {
    
    private String name;
    private double extension;
    private double size;
    private LocalDate creationDate;
    private LocalDate lastModifyDate;
    private String permisos;

    public FileManager(String name, double extension, double size, LocalDate creationDate, LocalDate lastModifyDate,
            String permisos) {
        this.name = name;
        this.extension = extension;
        this.size = size;
        this.creationDate = creationDate;
        this.lastModifyDate = lastModifyDate;
        this.permisos = permisos;
    }

    public String getName() {
        return name;
    }
    public double getExtension() {
        return extension;
    }
    public double getSize() {
        return size;
    }
    public LocalDate getCreationDate() {
        return creationDate;
    }
    public LocalDate getLastModifyDate() {
        return lastModifyDate;
    }
    public String getPermisos() {
        return permisos;
    }

    public String print () {
        return "";
    }

}
