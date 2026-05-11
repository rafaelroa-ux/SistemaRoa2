/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

public class BeanRmrComprasProdutos {

    private int rmr_id_compra_produto;
    private int rmr_id_compra;
    private int rmr_id_produto;
    private int rmr_quantidade;
    private double rmr_preco_custo;
    private double rmr_subtotal;
    private String rmr_data_entrada;

    public int getRmr_id_compra_produto() {
        return rmr_id_compra_produto;
    }

    public void setRmr_id_compra_produto(int rmr_id_compra_produto) {
        this.rmr_id_compra_produto = rmr_id_compra_produto;
    }

    public int getRmr_id_compra() {
        return rmr_id_compra;
    }

    public void setRmr_id_compra(int rmr_id_compra) {
        this.rmr_id_compra = rmr_id_compra;
    }

    public int getRmr_id_produto() {
        return rmr_id_produto;
    }

    public void setRmr_id_produto(int rmr_id_produto) {
        this.rmr_id_produto = rmr_id_produto;
    }

    public int getRmr_quantidade() {
        return rmr_quantidade;
    }

    public void setRmr_quantidade(int rmr_quantidade) {
        this.rmr_quantidade = rmr_quantidade;
    }

    public double getRmr_preco_custo() {
        return rmr_preco_custo;
    }

    public void setRmr_preco_custo(double rmr_preco_custo) {
        this.rmr_preco_custo = rmr_preco_custo;
    }

    public double getRmr_subtotal() {
        return rmr_subtotal;
    }

    public void setRmr_subtotal(double rmr_subtotal) {
        this.rmr_subtotal = rmr_subtotal;
    }

    public String getRmr_data_entrada() {
        return rmr_data_entrada;
    }

    public void setRmr_data_entrada(String rmr_data_entrada) {
        this.rmr_data_entrada = rmr_data_entrada;
    }
}