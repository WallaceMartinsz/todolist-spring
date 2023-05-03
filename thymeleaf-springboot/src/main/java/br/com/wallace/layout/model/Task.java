package br.com.wallace.layout.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Task {

  private Long id;
  private String name;

  @DateTimeFormat(pattern = "dd/MM/yyyy")
  private Date data = new Date();
  @DateTimeFormat(pattern = "dd/MM/yyyy")
  private Date dataEntrega;

  public Task(Long id, String name, Date date,Date dataEntrega) {
    this.id = id;
    this.name = name;
    this.data = date;
    this.dataEntrega = dataEntrega;
  }

  public Task() {
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public Date getDataEntrega() {
    return dataEntrega;
  }

  public void setDataEntrega(Date dataEntrega) {
    this.dataEntrega = dataEntrega;
  }
}
