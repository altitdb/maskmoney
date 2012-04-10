package br.com.altieres.maskmoney.controller;

import java.math.BigDecimal;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Altieres de Matos
 */
@ManagedBean
@ViewScoped
public class MaskMoneyController {
    
    private BigDecimal valor1;
    private BigDecimal valor2;
    private BigDecimal valor3;
    private BigDecimal valor4;
    private BigDecimal valor5;

    public MaskMoneyController() {
    }

    public BigDecimal getValor1() {
        return valor1;
    }

    public void setValor1(BigDecimal valor1) {
        this.valor1 = valor1;
    }

    public BigDecimal getValor2() {
        return valor2;
    }

    public void setValor2(BigDecimal valor2) {
        this.valor2 = valor2;
    }

    public BigDecimal getValor3() {
        return valor3;
    }

    public void setValor3(BigDecimal valor3) {
        this.valor3 = valor3;
    }

    public BigDecimal getValor4() {
        return valor4;
    }

    public void setValor4(BigDecimal valor4) {
        this.valor4 = valor4;
    }

    public BigDecimal getValor5() {
        return valor5;
    }

    public void setValor5(BigDecimal valor5) {
        this.valor5 = valor5;
    }
            
}
