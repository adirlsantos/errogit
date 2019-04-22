package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela RECURO
 * @generated
 */
@Entity
@Table(name = "\"RECURO\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"outroid" }))
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Recuro")
public class Recuro implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.Integer id;

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "outroid", nullable = true, unique = true, insertable=true, updatable=true)
  
  private java.lang.String outroid = UUID.randomUUID().toString().toUpperCase();

  /**
   * Construtor
   * @generated
   */
  public Recuro(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.Integer getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Recuro setId(java.lang.Integer id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public Recuro setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém outroid
   * return outroid
   * @generated
   */
  
  public java.lang.String getOutroid(){
    return this.outroid;
  }

  /**
   * Define outroid
   * @param outroid outroid
   * @generated
   */
  public Recuro setOutroid(java.lang.String outroid){
    this.outroid = outroid;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Recuro object = (Recuro)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
