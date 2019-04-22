package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PEDIDO
 * @generated
 */
@Entity
@Table(name = "\"PEDIDO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pedido")
public class Pedido implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String numero;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "emissao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date emissao;

  /**
   * Construtor
   * @generated
   */
  public Pedido(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Pedido setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém numero
   * return numero
   * @generated
   */
  
  public java.lang.String getNumero(){
    return this.numero;
  }

  /**
   * Define numero
   * @param numero numero
   * @generated
   */
  public Pedido setNumero(java.lang.String numero){
    this.numero = numero;
    return this;
  }

  /**
   * Obtém emissao
   * return emissao
   * @generated
   */
  
  public java.util.Date getEmissao(){
    return this.emissao;
  }

  /**
   * Define emissao
   * @param emissao emissao
   * @generated
   */
  public Pedido setEmissao(java.util.Date emissao){
    this.emissao = emissao;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Pedido object = (Pedido)obj;
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
