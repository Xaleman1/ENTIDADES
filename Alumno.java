/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecagestion;

/**
 *
 * @author ALEJANDRO
 */
public class Alumno {
    private String idalumno;
    private String carrera;
    Usuario  usuario;
    Gestion gestion;
    
    public Alumno (Usuario usuario){
        this.usuario = usuario;
    }
    public Alumno(Usuario usuario , Gestion gestion){
        this.gestion=gestion;
    }

    public String getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(String idalumno) {
        this.idalumno = idalumno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
