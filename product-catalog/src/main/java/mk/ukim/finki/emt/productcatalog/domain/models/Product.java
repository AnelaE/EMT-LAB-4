package mk.ukim.finki.emt.productcatalog.domain.models;

import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product extends AbstractEntity<ProductId> {
}
