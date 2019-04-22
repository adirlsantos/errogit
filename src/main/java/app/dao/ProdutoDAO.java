package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("ProdutoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface ProdutoDAO extends JpaRepository<Produto, java.lang.String> {

  /**
   * Obtém a instância de Produto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Produto entity WHERE entity.id = :id")
  public Produto findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Produto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Produto entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM PedidoItem entity WHERE entity.produto.id = :id")
  public Page<PedidoItem> findPedidoItem(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM ProdutoMarca entity WHERE entity.produto.id = :id")
  public Page<ProdutoMarca> findProdutoMarca(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.pedido FROM PedidoItem entity WHERE entity.produto.id = :id")
  public Page<Pedido> listPedido(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM PedidoItem entity WHERE entity.produto.id = :instanceId AND entity.pedido.id = :relationId")
  public int deletePedido(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.marca FROM ProdutoMarca entity WHERE entity.produto.id = :id")
  public Page<Marca> listMarca(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM ProdutoMarca entity WHERE entity.produto.id = :instanceId AND entity.marca.id = :relationId")
  public int deleteMarca(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
