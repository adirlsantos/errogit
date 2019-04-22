package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PEDIDOITEM
 * @generated
 */
@Entity
@Table(name = "\"PEDIDOITEM\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PedidoItem")
public class PedidoItem implements Serializable {

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
  @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double valor;

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
  @JoinColumn(name="fk_pedido", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Pedido pedido;

  /**
   * Construtor
   * @generated
   */
  public PedidoItem(){
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
  public PedidoItem setId(java.lang.String id){
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
  public PedidoItem setNumero(java.lang.String numero){
    this.numero = numero;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public java.lang.Double getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public PedidoItem setValor(java.lang.Double valor){
    this.valor = valor;
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
  public PedidoItem setProduto(Produto produto){
    this.produto = produto;
    return this;
  }

  /**
   * Obtém pedido
   * return pedido
   * @generated
   */
  
  public Pedido getPedido(){
    return this.pedido;
  }

  /**
   * Define pedido
   * @param pedido pedido
   * @generated
   */
  public PedidoItem setPedido(Pedido pedido){
    this.pedido = pedido;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PedidoItem object = (PedidoItem)obj;
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
