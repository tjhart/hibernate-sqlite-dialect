package com.hartware.test.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "test_entity")
public class TestEntity {

    @Id
    @GenericGenerator(name="testEntityIdGenerator", strategy = "increment")
    @GeneratedValue(generator = "testEntityIdGenerator")
    private Long id;
    @Column(name="a_short")
    private Short aShort;
    @Column(name="an_int")
    private Integer anInt;
    @Column(name="big_int")
    private BigInteger bigInteger;
    @Column(name="a_float")
    private Float aFloat;
    @Column(name="a_double")
    private Double aDouble;
    @Column(name="a_bigdecimal")
    private BigDecimal aBigDecimal;

    public Short getaShort() { return aShort; }

    public void setaShort(Short aShort) { this.aShort = aShort; }

    public Integer getAnInt() { return anInt; }

    public void setAnInt(Integer anInt) { this.anInt = anInt; }

    public BigInteger getBigInteger() { return bigInteger; }

    public void setBigInteger(BigInteger bigInteger) { this.bigInteger = bigInteger; }

    public Float getaFloat() { return aFloat; }

    public void setaFloat(Float aFloat) { this.aFloat = aFloat; }

    public Double getaDouble() { return aDouble; }

    public void setaDouble(Double aDouble) { this.aDouble = aDouble; }

    public BigDecimal getaBigDecimal() { return aBigDecimal; }

    public void setaBigDecimal(BigDecimal aBigDecimal) { this.aBigDecimal = aBigDecimal; }
}
