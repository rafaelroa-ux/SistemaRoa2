/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

public class BeanRmrVendas {

    private int rmr_id_venda;
    private int rmr_id_cliente;
    private String rmr_data_venda;
    private double rmr_valor_total;
    private String rmr_forma_pagamento;
    private String rmr_status_venda;
    private String rmr_observacao;

    public int getRmr_id_venda() {
        return rmr_id_venda;
    }

    public void setRmr_id_venda(int rmr_id_venda) {
        this.rmr_id_venda = rmr_id_venda;
    }

    public int getRmr_id_cliente() {
        return rmr_id_cliente;
    }

    public void setRmr_id_cliente(int rmr_id_cliente) {
        this.rmr_id_cliente = rmr_id_cliente;
    }

    public String getRmr_data_venda() {
        return rmr_data_venda;
    }

    public void setRmr_data_venda(String rmr_data_venda) {
        this.rmr_data_venda = rmr_data_venda;
    }

    public double getRmr_valor_total() {
        return rmr_valor_total;
    }

    public void setRmr_valor_total(double rmr_valor_total) {
        this.rmr_valor_total = rmr_valor_total;
    }

    public String getRmr_forma_pagamento() {
        return rmr_forma_pagamento;
    }

    public void setRmr_forma_pagamento(String rmr_forma_pagamento) {
        this.rmr_forma_pagamento = rmr_forma_pagamento;
    }

    public String getRmr_status_venda() {
        return rmr_status_venda;
    }

    public void setRmr_status_venda(String rmr_status_venda) {
        this.rmr_status_venda = rmr_status_venda;
    }

    public String getRmr_observacao() {
        return rmr_observacao;
    }

    public void setRmr_observacao(String rmr_observacao) {
        this.rmr_observacao = rmr_observacao;
    }
}
