/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidade;


/**
 *
 * @author NOTE
 */
public class Moto {

    private String marca;
    private String modelo;
    private String cor;
    private Integer marcha;
    private Integer maiorMarcha;
    private Integer menorMarcha;
    private Boolean status;

    public Moto() {
    }

    public Moto(String marca, String modelo, String cor, Integer marcha, Integer maiorMarcha, Integer menorMarcha, Boolean status) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = marcha;
        this.maiorMarcha = maiorMarcha;
        this.menorMarcha = menorMarcha;
        this.status = status;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public void setMarcha(Integer marcha) {
        this.marcha = marcha;
    }

    public Integer getMaiorMarcha() {
        return maiorMarcha;
    }

    public void setMaiorMarcha(Integer maiorMarcha) {
        this.maiorMarcha = maiorMarcha;
    }

    public Integer getMenorMarcha() {
        return menorMarcha;
    }

    public void setMenorMarcha(Integer menorMarcha) {
        this.menorMarcha = menorMarcha;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}
