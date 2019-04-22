package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRODUTOMARCA
 * @generated
 */
@Entity
@Table(name = "\"PRODUTOMARCA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.ProdutoMarca")
public class ProdutoMarca implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_produto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Produto produto;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_marca", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Marca marca;

  /**
   * Construtor
   * @generated
   */
  public ProdutoMarca(){
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
  public ProdutoMarca setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém produto
   * return produto
   * @generated
   */
  
  public Produto getProduto(){
    return this.produto;
  }

  /**
   * Define produto
   * @param produto produto
   * @generated
   */
  public ProdutoMarca setProduto(Produto produto){
    this.produto = produto;
    return this;
  }

  /**
   * Obtém marca
   * return marca
   * @generated
   */
  
  public Marca getMarca(){
    return this.marca;
  }

  /**
   * Define marca
   * @param marca marca
   * @generated
   */
  public ProdutoMarca setMarca(Marca marca){
    this.marca = marca;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    ProdutoMarca object = (ProdutoMarca)obj;
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
